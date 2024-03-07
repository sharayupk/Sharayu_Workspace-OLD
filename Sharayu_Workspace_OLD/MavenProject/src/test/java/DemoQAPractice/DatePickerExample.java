package DemoQAPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerExample 
{
	WebDriver driver;
	@Test
    public void executeWindowPopup() throws InterruptedException
    {
   	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 
   	 driver.get("https://demoqa.com/datepicker/");
   	 driver.manage().window().maximize();
   	 driver.manage().deleteAllCookies();
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
   	 
   	 driver.findElement(By.id("datepicker")).click();
   	 
   	 String month="April 2016";
   	 String day="14";
   	 
   	 while(true)
   	 {
   		String text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
   		System.out.println(text);
   		
   		if(text.equals(month))
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
