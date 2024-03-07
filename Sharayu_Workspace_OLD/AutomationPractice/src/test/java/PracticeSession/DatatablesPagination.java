package PracticeSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatatablesPagination {

	@Test

	public void handleWebTable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		// Scroll Down the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,400)");

		WebElement paging_element = driver.findElement(By.xpath("//*[@id='example_paginate']"));
		List<WebElement> list = paging_element.findElements(By.tagName("a"));
		System.out.println("Size of Sub Links---->" + list.size());

		if (list.size() > 0) {
			System.out.println("Links are Present");

			for (int i = 1; i < list.size() - 1; i++) {
				Thread.sleep(1000);

				driver.findElement(By.xpath("//a[text()='" + i + "']")).click();
			}

			int rows = driver.findElements(By.xpath("//*[@id='example']/tbody/tr")).size();
			System.out.println("size of Rows---->" + rows);

			for (int r = 1; r <= rows; r++) {
				String col1 = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + r + "]/td[1]")).getText();
				String col2 = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + r + "]/td[2]")).getText();
				String col3 = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + r + "]/td[3]")).getText();
				String col4 = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + r + "]/td[4]")).getText();
				String col5 = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + r + "]/td[5]")).getText();
				String col6 = driver.findElement(By.xpath("//*[@id='example']/tbody/tr[" + r + "]/td[6]")).getText();

				System.out
						.println(col1 + "    " + col2 + "    " + col3 + "    " + col4 + "    " + col5 + "    " + col6);
			}
		}

		else {
			System.out.println("Links not Present");
		}
		driver.close();

	}

}
