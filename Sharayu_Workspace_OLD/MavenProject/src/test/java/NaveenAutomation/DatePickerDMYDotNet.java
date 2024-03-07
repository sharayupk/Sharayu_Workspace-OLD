package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DatePickerDMYDotNet 
{
	public WebDriver driver;
	@Test
    
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://dotnetlearners.com/blogs/show-month-and-year-dropdown-in-jquery-datepicker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Click on Calender Icon
		driver.findElement(By.id("txtdate")).click();
		
		Thread.sleep(1000);
		
		String date="20-February-2000";
        String dateArr[]=date.split("-");
        String day=dateArr[0];
        String month=dateArr[1];
        String year=dateArr[2];
        
        Select monthdrp=new Select(driver.findElement(By.xpath("(//select[@class='ui-datepicker-month'])[1]")));
        monthdrp.selectByVisibleText(month);
        
        Select yeardrp=new Select(driver.findElement(By.xpath("(//select[@class='ui-datepicker-month'])[2]")));
        yeardrp.selectByVisibleText(year);
        
        //*[@id="ui-datepicker-div"]/table/tbody/tr[2]/td[2]/a
		//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[3]/a
        
        boolean flag=false;
        int totalWeekDays=7;
        String beforeXapth="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[";
        String afterXpath="]/td[";
        
        for(int rows=1;rows<=5;rows++)
        {
        	for(int cols=1;cols<=totalWeekDays;cols++)
        	{
        		String dayval=driver.findElement(By.xpath(beforeXapth+rows+afterXpath+cols+"]/a")).getText();
        		System.out.println(dayval);
        		
        		if(dayval.equals(day))
        		{
        			driver.findElement(By.xpath(beforeXapth+rows+afterXpath+cols+"]/a")).click();
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
