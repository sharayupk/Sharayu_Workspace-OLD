package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertExample {
	@Test
	public void handleAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on Click for JS Alert
		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[1]/button")).click();

		// Handle Alert Popup
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("Alert text--->" + alertText);

		Assert.assertEquals(alertText, "I am a JS Alert", "Text does not match");
		Thread.sleep(2000);
		alert.accept();// click on OK button

		String resultText = driver.findElement(By.xpath("//*[@id='result']")).getText();
		System.out.println("Result Text---->" + resultText);
		if (resultText.equals("You successfully clicked an alert")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}
}
