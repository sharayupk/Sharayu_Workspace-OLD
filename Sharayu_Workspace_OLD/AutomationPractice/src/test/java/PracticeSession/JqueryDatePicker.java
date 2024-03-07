package PracticeSession;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JqueryDatePicker {

	public static WebDriver driver;
	public static String day = "20";
	public static String month = "September 2020";

	@Test
	public void datePicker() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Switch to Frame
		driver.switchTo().frame(0);

		driver.findElement(By.id("datepicker")).click();

		// Scroll Down the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,150)");

		// currentDate();
		// futureDate();
		previousDate();

	}

	public static void currentDate() {
		Calendar cal = Calendar.getInstance();
		int date = cal.get(Calendar.DATE);
		String d = String.valueOf(date);
		driver.findElement(By.linkText(d)).click();
	}

	public static void futureDate() {
		while (true) {
			String mon = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println("Current Month --->" + mon);

			if (month.equals(mon)) {
				break;
			} else {
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			}
		}

		driver.findElement(By.linkText(day)).click();
	}

	public static void previousDate() {
		while (true) {
			String mon = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
			System.out.println("Current Month --->" + mon);

			if (month.equals(mon)) {
				break;
			} else {
				driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[1]/span")).click();
			}
		}

		driver.findElement(By.linkText(day)).click();
	}
}
