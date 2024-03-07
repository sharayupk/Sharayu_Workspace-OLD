package PracticeSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSortBlogspot {
	@Test
	public void sortDropDownExample() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2019/");
		driver.manage().window().maximize();

		// Scroll Down the Page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,800)");

		List originalList = new ArrayList<>();
		List tempList = new ArrayList<>();

		Select sc = new Select(driver.findElement(By.id("tools1")));
		List<WebElement> options = sc.getOptions();
		System.out.println("Size of Drop Down List---->" + options.size());

		for (WebElement ele : options) {
			originalList.add(ele.getText());
			tempList.add(ele.getText());
		}

		System.out.println("Before Sorting Original List--->" + originalList);
		System.out.println("Before Sorting Temp List--->" + tempList);

		Collections.sort(tempList);

		System.out.println("After Sorting Original List--->" + originalList);
		System.out.println("After Sorting Temp List--->" + tempList);

		if (originalList == tempList) {
			System.out.println("Drop Down Not Sorted");
		} else {
			System.out.println("Drop Down Sorted");
		}

	}

}
