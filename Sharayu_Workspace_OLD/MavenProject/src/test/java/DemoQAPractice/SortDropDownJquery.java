package DemoQAPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SortDropDownJquery 
{
	@Test
	public void sortDropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ele);
		
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		
		Select sc=new Select(driver.findElement(By.id("speed")));
		List<WebElement>options=sc.getOptions();
		for(WebElement list:options)
		{
			String data=list.getText();
			originalList.add(data);
			tempList.add(data);
		}
		
		System.out.println("Before Sorting originalList--->"+originalList);
		System.out.println("Before Sorting tempList--->"+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After Sorting originalList--->"+originalList);
		System.out.println("After Sorting tempList--->"+tempList);
		
		if(originalList==tempList)
		{
			System.out.println("Drop Down Not Sorted");
		}
		else
		{
			System.out.println("Drop Down Sorted");
		}
	}
}
