package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class S2Parameterization 
{   
	@Parameters({"username","password"})
	@Test
	public void loginpage(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/inventory/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pwd")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/form/button[1]")).click();
	}
}
