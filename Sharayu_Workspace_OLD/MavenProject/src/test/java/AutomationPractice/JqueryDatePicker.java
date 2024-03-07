package AutomationPractice;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JqueryDatePicker 
{   
	public static WebDriver driver;
	static String day="20";
	static String month="June 2025";

	public static void main(String[] args) 
    {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebElement ele=driver.findElement(By.xpath("//*[@id='content']/iframe"));
		driver.switchTo().frame(ele);

		driver.findElement(By.id("datepicker")).click();
        
		
		//CurrentDate();
		//PreviousDate();
		FutureDate();
	}

	public static void CurrentDate()
	{
		Calendar cal=Calendar.getInstance();
		int date=cal.get(Calendar.DATE);
		String d=String.valueOf(date);
		driver.findElement(By.linkText(d)).click();
	}
	
	public static void PreviousDate() 
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
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
	public static void FutureDate() 
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
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
		}
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
	
}
