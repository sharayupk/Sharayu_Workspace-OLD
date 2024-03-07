package PracticeSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyDropDownData {
	@Test

	public void verifyDrpDownData() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		String exp[] = { "Slower", "Slow", "Medium", "Fast", "Faster" };
		Select sc = new Select(driver.findElement(By.id("speed")));
		List<WebElement> options = sc.getOptions();
		System.out.println("Size of Drop Down List-----" + options.size());

		for (WebElement ele : options) {
			boolean flag = false;

			for (int i = 0; i < exp.length; i++) {
				if (ele.getText().equals(exp[i])) {
					flag = true;
				}
			}

			System.out.println("Text of Drop Down----" + ele.getText());
			Assert.assertTrue(flag, ele.getText());
		}

	}
}
