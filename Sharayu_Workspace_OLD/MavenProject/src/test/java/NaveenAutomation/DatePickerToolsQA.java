package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerToolsQA 
{
	@Test
	public void datepickerExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Click on Calender Icon
		driver.findElement(By.id("datepicker")).click();
		
		String month="April 2015";
		String day="16";
		
		while(true)
		{
			String monthText=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println(monthText);
			
			if(month.equals(monthText))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
}
