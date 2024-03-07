package LetsCodeITPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import gherkin.lexer.No;

public class DropDownExample 
{
	@Test
	public void dropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		Select sc=new Select(driver.findElement(By.id("carselect")));
		
		List<WebElement>list=sc.getOptions();
		System.out.println("No. of Cars--->"+list.size());
		for(int i=0;i<=list.size();i++)
		{
			WebElement ele=list.get(i);
			String text=ele.getText();
			System.out.println(text);
			
			if(text.equals("Honda"))
			{
				ele.click();
				break;
			}
		}
}
}
