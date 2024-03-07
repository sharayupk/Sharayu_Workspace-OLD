package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDynamicWebtable {
	@Test
	public void dynamicTable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://examples.bootstrap-table.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		// Scroll Down the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,300)");
		
		//Handle Frame
		driver.switchTo().frame(0);

		int rows = driver.findElements(By.xpath("//*[@id='table']/tbody/tr")).size();
		System.out.println("Size of Rows---->" + rows);

		for (int i = 1; i <= rows; i++) {
			String itemId = driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[3]")).getText();
			System.out.println("Text of Column 3---->" + itemId);

			if (itemId.equals("2")) {
				driver.findElement(By.xpath("//*[@id='table']/tbody/tr[" + i + "]/td[2]/label/input")).click();
				break;
			}
		}

	}
}
