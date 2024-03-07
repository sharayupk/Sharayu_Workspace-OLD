package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalenderDropDown {
	@Test
	public void handleCalender() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// Click on DatePicker
		driver.findElement(By.id("datepicker")).click();

		// Select Month From Drop Down
		Select monthdrp = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")));
		monthdrp.selectByVisibleText("May");

		// Select Year From Drop Down
		Select yeardrp = new Select(driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")));
		yeardrp.selectByVisibleText("2020");

		int rows = driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr")).size();
		System.out.println("Size of Rows---->" + rows);

		for (int i = 1; i <= rows; i++) {
			i = 20;
			for (int j = 1; j <= 7; j++) {
				driver.findElement(By.xpath("//a[text()='" + i + "']")).click();
			}
		}

	}

}
