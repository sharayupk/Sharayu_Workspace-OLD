package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DatePicker 
{
@Test
public void handleDatePicker()
{
	System.setProperty("webdriver.firefox.marionette","D:\\Sharayu_Workspace\\MavenProject\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://jqueryui.com/datepicker/");
	
	driver.switchTo().frame(0);
	
	//Click on Calender Icon
	driver.findElement(By.id("datepicker")).click();
	
	for(int i=5;i>=1;i--)
	{
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
		
		String m=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
		
		if(m.equals("Aril 2020"))
		{
			driver.findElement(By.linkText("3")).click();
			break;
		}
	}
	
	System.out.println("Test Case Passed");

}
}
