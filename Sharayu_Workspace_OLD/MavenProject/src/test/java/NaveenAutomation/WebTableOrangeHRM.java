package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WebTableOrangeHRM 
{
	@Test
	public void handleWebtable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Login with valid credentials
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Mouse Hover on Admin Link
		WebElement ele=driver.findElement(By.id("menu_admin_viewAdminModule"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		//Mouse Hover on User Mgmt Link
		ele=driver.findElement(By.id("menu_admin_UserManagement"));
		action.moveToElement(ele).build().perform();
		
		//Click on User Link
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		//Scroll down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		//Get Total no. of Rows
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total no. of Rows---->"+rows);
		
		//*[@id="resultTable"]/tbody/tr[2]/td[2]/a
		//*[@id="resultTable"]/tbody/tr[3]/td[2]/a
		String beforeXpath="//*[@id='resultTable']/tbody/tr[";
		String afterXpath="]/td[2]/a";
		
		for(int i=1;i<=rows;i++)
		{
			String name=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(name);
			
			if(name.equals("jasmine.morgan"))
			{
				driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[1]/input")).click();
				break;
			}
		}
		
		
}
}
