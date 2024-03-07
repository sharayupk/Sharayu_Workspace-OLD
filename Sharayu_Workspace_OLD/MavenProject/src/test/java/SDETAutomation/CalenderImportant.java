package SDETAutomation;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderImportant 
{   
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Click on DatePicker
		driver.findElement(By.id("datepicker")).click();

		String date="20";
		String month="June 2019";

		//selectCurrentDate();
		//selectFutureDate(date,month);
		selectPreviousDate(date,month);
	}

	/*static void selectCurrentDate()
	{
		Calendar cal=Calendar.getInstance();
		int d=cal.get(Calendar.DATE); //returns int value
		String date=String.valueOf(d);
		driver.findElement(By.linkText(date)).click();

	}

	static void selectFutureDate(String d,String mon)
	{
		while(true)
		{
			String m=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println("Month is :"+m);

			if(mon.equals(m))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
		}

		driver.findElement(By.xpath("//a[text()='"+d+"']")).click();

	}*/

	
	static void selectPreviousDate(String d,String mon)
	{
		while(true)
		{
			String m=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println("Month is :"+m);
			
			if(mon.equals(m))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		
		driver.findElement(By.xpath("//a[text()='"+d+"']")).click();
	}
}
