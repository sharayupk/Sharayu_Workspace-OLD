package PracticeSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelect {

	@Test
	public void executeWindowPopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		Select sc = new Select(driver.findElement(By.id("fruits")));
		sc.selectByIndex(0); // Banana
		Thread.sleep(1000);

		List<WebElement> options = sc.getOptions();
		System.out.println("Size of Drop Down List---->" + options.size());

		sc.selectByValue("orange"); // Orange

		Thread.sleep(1000);

		sc.selectByVisibleText("Grape"); // Grape

	}
}
