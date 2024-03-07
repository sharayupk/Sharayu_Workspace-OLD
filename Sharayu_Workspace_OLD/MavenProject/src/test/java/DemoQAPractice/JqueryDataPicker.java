package DemoQAPractice;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JqueryDataPicker 
{   
	static WebDriver driver;
	static String month="June 2000";
	static String day="10";
	@Test
	public void datePicker() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Switch to Frame
		WebElement ele=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(ele);

		//Click on Calender Icon
		driver.findElement(By.id("datepicker")).click();

		//currentDate();
		//futureDate();
		previousDate();
	}

	/*	public static void currentDate()
	{
		Calendar cal=Calendar.getInstance();
	    int date=cal.get(Calendar.DATE);
		String d=String.valueOf(date);
		driver.findElement(By.linkText(d)).click();
	}

	public static void futureDate()
	{
		while(true)
		{
			String mon=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println(mon);

			if(month.equals(mon))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();    //next button
			}
		}
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}*/

	public static void previousDate()
	{
		while(true)
		{
			String mon=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println(mon);

			if(month.equals(mon))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();   //previous button
			}
		}
		//driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
		driver.findElement(By.linkText(day)).click();
	}
}
