package PracticeSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertRediffMail 
{
	@Test
	public void alertExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();

		//Click on Sign In Button
		driver.findElement(By.name("proceed")).click();

		//Switch To Alert
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println("Alert Text=====>"+alertText);

		Thread.sleep(1000);

		//Click on OK Button
		alert.accept();


	}
}
