package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePickerDemoAutomation 
{   
	public WebDriver driver;
	@Test
    
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		
		String month="June 2017";
		String day="14";
		
		while(true)
		{
			String monthText=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			System.out.println(monthText);
			
			if(monthText.equals(month))
			{
				break;
			}
			else 
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
		}
		
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();

}
}
