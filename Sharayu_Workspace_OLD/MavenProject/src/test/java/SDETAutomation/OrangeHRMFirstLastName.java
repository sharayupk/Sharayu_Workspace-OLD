package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMFirstLastName 
{
	@Test
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Enter Login Credentials
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//Click on PIM Tab
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		int rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
		System.out.println("Total No. Of Rows---->"+rows);
		
		String beforeXpath="//*[@id='resultTable']/tbody/tr[";
		String afterXpath="//*[@id='resultTable']/tbody/tr[";
		
		for(int i=1;i<=rows;i++)
		{
			//String firstname=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[3]")).getText();
			//System.out.println("First Name---->"+firstname);
			//String lastname=driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[4]")).getText();
			//System.out.println("Last Name---->"+lastname);
			
			String text=driver.findElement(By.xpath(beforeXpath+i+"]/td[3]"+afterXpath+i+"]/td[4]")).getText();
			System.out.println(text);
			
			
		}
		
}
}
