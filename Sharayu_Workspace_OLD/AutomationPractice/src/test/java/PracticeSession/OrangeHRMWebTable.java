package PracticeSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMWebTable {
	@Test
	public void handleWebTable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// Enter Login Credentials
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		// Click on Admin Tab
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();

		// Scroll Down the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,200)");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		System.out.println("Size of Rows---->" + rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td"));
		System.out.println("Size of Cols---->" + cols.size());

		for (int i = 1; i <= rows.size(); i++) {
			String eName = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[4]")).getText();
			System.out.println("Employee name--->" + eName);

			if (eName.equals("Dominic Chase")) {
				driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[" + i + "]/td[1]/input")).click();
				break;
			}
		}

	}
}
