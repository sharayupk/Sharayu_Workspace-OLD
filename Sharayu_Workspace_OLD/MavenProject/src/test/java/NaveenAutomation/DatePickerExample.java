package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerExample 
{
	@Test
	public void handleDatePicker() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3.org/TR/wai-aria-practices/examples/dialog-modal/datepicker-dialog.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		//Click on Calender Icon
		driver.findElement(By.xpath("//*[@id='myDatepicker']/div[1]/button/span")).click();
		
		String month="March 2018";
		String day="15";
		
				
		while(true)
		{
			String monthText=driver.findElement(By.xpath("//h2[@id='id-dialog-label']")).getText();
			System.out.println(monthText);

			
			if(month.equals(monthText))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@id='id-datepicker-1']/div[1]/button[1]/span")).click();
			}
		}
		driver.findElement(By.xpath("//table[@id='myDatepickerGrid']/tbody/tr/td/button[text()='"+day+"']")).click();
		
}
}
