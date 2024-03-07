package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadPopup {
	@Test
	public void fileUploadExample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click on Choose File Button and enter path of the file
		driver.findElement(By.id("file-upload"))
				.sendKeys(System.getProperty("user.dir") + "\\TestData\\LoginData.xlsx");

		// Click on Upload button
		driver.findElement(By.id("file-submit")).click();

		String fileText = driver.findElement(By.id("uploaded-files")).getText();
		System.out.println("Name of the Uploaded File is----" + fileText);

		String actualText = driver.findElement(By.xpath("//*[@id='content']/div/h3")).getText();
		System.out.println("Actual text after file upload ----" + actualText);

		String expectedText = "File Uploaded!";
		Assert.assertEquals(actualText, expectedText, "Text does not match");

		driver.close();

	}
}
