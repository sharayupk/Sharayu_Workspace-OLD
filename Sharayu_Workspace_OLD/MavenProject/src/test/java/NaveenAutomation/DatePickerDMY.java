package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerDMY 
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
		
		//Click on Calender Icon
		driver.findElement(By.id("datepicker2")).click();
		
		String date="18-April-2018";
		String dateArr[]=date.split("-");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];
		
		Select monthdrp=new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[1]")));
		monthdrp.selectByVisibleText(month);
		
		Select yeardrp=new Select(driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]")));
		yeardrp.selectByVisibleText(year);
		
	//	/html/body/div[2]/div/div[2]/div/table/tbody/tr[1]/td[4]/a
	//	/html/body/div[2]/div/div[2]/div/table/tbody/tr[4]/td[4]/a
	//	/html/body/div[2]/div/div[2]/div/table/tbody/tr[4]/td[5]/a
		
		String beforeXpath="/html/body/div[2]/div/div[2]/div/table/tbody/tr[";
		String afterXpath="]/td[";
		
		boolean flag=false;
		int totalWeekDays=7;
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=totalWeekDays;cols++)
			{
				String dayval=driver.findElement(By.xpath(beforeXpath+rows+afterXpath+cols+"]/a")).getText();
				System.out.println(dayval);
				
				if(dayval.equals(day))
				{
					driver.findElement(By.xpath(beforeXpath+rows+afterXpath+cols+"]/a")).click();
					flag=true;
					break;
				}
			}
			if(flag)
			{
				break;
			}
		}
}
}
