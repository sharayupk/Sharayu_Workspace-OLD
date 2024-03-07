package PracticeSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestPracticeDropDownSort {
	@Test

	public void sortDropDown() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");

		List originalList = new ArrayList<>();
		List tempList = new ArrayList<>();

		Select sc = new Select(driver.findElement(By.id("products")));
		List<WebElement> drpdown = sc.getOptions();
		System.out.println("Size of Drop Down List---" + drpdown.size());

		for (WebElement ele : drpdown) {
			originalList.add(ele.getText());
			tempList.add(ele.getText());
		}

		System.out.println("Before Sorting Original List----" + originalList);
		System.out.println("Before Sorting Temp List----" + tempList);

		Collections.sort(tempList);

		System.out.println("After Sorting Original List----" + originalList);
		System.out.println("After Sorting Temp List----" + tempList);

		if (originalList == tempList) {
			System.out.println("Drop Not Down Sorted");
		} else {
			System.out.println("Drop Down Sorted");
		}

	}

}
