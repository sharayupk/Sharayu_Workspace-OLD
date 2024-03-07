package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertExample 
{
	@Test
	public void alertExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Click on Alert Popup
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		//Switch To alert
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);

		String text=alert.getText();
		System.out.println("OK Alert Text---->"+text);

		//Click on OK
		alert.accept();
		String OKText=driver.findElement(By.id("result")).getText();
		System.out.println("After Clicking OK Button Text---->"+OKText);
		Thread.sleep(2000);
		
		//Click on Alert Popup
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		//Switch To alert
		alert=driver.switchTo().alert();
		Thread.sleep(3000);

		text=alert.getText();
		System.out.println("Cancel Alert Text---->"+text);

		//Click on Cancel
		alert.dismiss();
		String CancelText=driver.findElement(By.id("result")).getText();
		System.out.println("After Clicking Cancel Button Text---->"+CancelText);


	}
}
