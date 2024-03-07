package AutomationPractice;

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

public class TestATPracticeDropDownSorting 
{
	@Test
	public void drpDownSorting()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List originalList=new ArrayList();
		List tempList=new ArrayList();
		
		//driver.switchTo().frame(0);
		
		Select sc=new Select(driver.findElement(By.id("animals")));
		List<WebElement>list=sc.getOptions();
		for(WebElement ele:list)
		{
			originalList.add(ele.getText());
			tempList.add(ele.getText());
		}
		
		System.out.println("Before Sorting Original List---->"+originalList);
		System.out.println("Before Sorting tempList List---->"+tempList);
		
		Collections.sort(tempList);
		
		System.out.println("After Sorting Original List---->"+originalList);
		System.out.println("After Sorting tempList List---->"+tempList);
		
		if(originalList==tempList)
		{
			System.out.println("Drop Down Sorted");
		}
		else 
		{
			System.out.println("Drop Down Not Sorted");
		}

	}
}
