package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTableOrangeHRM 
{
	@Test
	public void dynamicWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Enter Login Credentials
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Admin---->User Mgmt---->Users
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		//Getting No. Of Rows
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println("No. Of Rows---->"+rows);
		int count=0;
		
		for(int r=1;r<=rows;r++)
		{
			String status=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[5]")).getText();
			
			if(status.equals("Enabled"))
			{
				count++;
			}
			
		}
		
		System.out.println("No. Of Enabled Employees---->"+count);
		System.out.println("No. Of Disabled Employees---->"+(rows-count));
	}
}
