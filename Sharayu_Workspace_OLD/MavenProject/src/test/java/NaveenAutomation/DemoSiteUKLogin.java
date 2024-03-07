package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoSiteUKLogin 
{
	@Test
	public void handleAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://thedemosite.co.uk/login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Add User
		driver.findElement(By.linkText("3. Add a User")).click();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("demo12");
		driver.findElement(By.name("FormsButton2")).click();
		Thread.sleep(2000);
		
		String userText=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/blockquote/blockquote[2]/blockquote")).getText();
		System.out.println("Username and Password--->"+userText);
		//Login with the valid credentials
		driver.findElement(By.linkText("4. Login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("demo12");
		driver.findElement(By.name("FormsButton2")).click();
		Thread.sleep(2000);
		
		String loginText=driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")).getText();
		System.out.println("Username and Password--->"+loginText);
		
	}
}
