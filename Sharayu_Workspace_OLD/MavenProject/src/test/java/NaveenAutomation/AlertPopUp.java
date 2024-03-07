package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUp {
	
	@Test
	public void handleAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Click on Sign In Button
		driver.findElement(By.name("proceed")).click();
		
		//Handle Alert PopUp
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("Text of Alert PopUp===>"+text);
		
		Thread.sleep(2000);
	
		//Click on OK Button
		alert.accept(); 
		
	}

}
