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

public class DropDownSorting 
{
	WebDriver driver;
	@Test
	public void sortDropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Select sc=new Select(driver.findElement(By.id("select-demo")));
		List<WebElement>options=sc.getOptions();
		System.out.println("Size of Drop Down List----->"+options.size());
		
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		
		for(WebElement ele:options)
		{
			String data=ele.getText();
			originalList.add(data);
			tempList.add(data);
		}
		
		System.out.println("Before Sorting Original List---->"+originalList);
		System.out.println("Before Sorting Temp List---->"+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After Sorting Original List---->"+originalList);
		System.out.println("After Sorting Temp List---->"+tempList);
		
		if(originalList==tempList)
		{
			System.out.println("Drop Down Not sorted");
		}
		else
		{
			System.out.println("Drop Down sorted");
		}
		
	}
}
