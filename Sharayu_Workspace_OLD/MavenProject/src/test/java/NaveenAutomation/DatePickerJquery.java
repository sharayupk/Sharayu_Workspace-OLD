package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerJquery {
	
	@Test
	public void datepickerExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Switch to Frame
		WebElement ele=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(ele);
		
		//Click on Calender icon
		driver.findElement(By.id("datepicker")).click();
		
		String month="April 2018";
		String day="20";
		
		while(true)
		{
			String text=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
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
