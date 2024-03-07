package DemoQAPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMWebTable 
{
	@Test
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Enter Login Credentials
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Click on Admin Tab
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total No. Of Rows----->"+rows);
		
		int cols=driver.findElements(By.xpath("//*[@id='resultTable']/thead/tr[1]/th")).size();
		System.out.println("Total No. Of Cols----->"+cols);
		
		for(int r=2;r<=rows;r++)
		{
			String username=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[2]")).getText();
			System.out.println(username);
			
			if(username.equals("fiona.grace"))
			{   
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+r+"]/td[1]")).click();
						
			}
		}
	}
}
