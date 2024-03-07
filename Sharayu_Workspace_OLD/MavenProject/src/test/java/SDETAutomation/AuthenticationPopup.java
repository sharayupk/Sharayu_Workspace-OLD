package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthenticationPopup 
{
	@Test
	public void authenticationPopup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		String expText="Digest Auth Congratulations! You must have the proper credentials.";
				
		String actText=driver.findElement(By.xpath("//*[@id='content']")).getText();
		System.out.println(actText);
		Assert.assertEquals(expText, actText);
	}
}
