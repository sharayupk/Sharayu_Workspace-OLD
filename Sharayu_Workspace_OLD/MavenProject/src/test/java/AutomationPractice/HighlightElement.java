package AutomationPractice;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighlightElement 
{
	@Test
	public void highlight() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Enter Login Credentials
		WebElement username=driver.findElement(By.id("txtUsername"));
		highLightElement(driver,username);
		username.sendKeys("Admin");

		WebElement password=driver.findElement(By.id("txtPassword"));
		highLightElement(driver,password);
		password.sendKeys("admin123");

		WebElement loginBtn=driver.findElement(By.id("btnLogin"));
		highLightElement(driver,loginBtn);
		loginBtn.click();


	}
	// Element highlighter code
	public static void highLightElement(WebDriver driver, WebElement element) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
		Thread.sleep(1000);

	}

}


