package PracticeSession;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowPopupArraylist {
	@Test
	public void windowPopupArraylistExample() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(By.id("openwindow")).click();

		String parent = driver.getWindowHandle();
		System.out.println("Parent Window ID---->" + parent);

		Set<String> handles = driver.getWindowHandles();
		System.out.println("All Window ID---->" + handles);

		ArrayList<String> tabs = new ArrayList<>();
		//System.out.println("Size of All window ID's---->" + tabs.size());

		driver.switchTo().window(tabs.get(0)); // Switch to Parent Window
		String actParentTitle = driver.getTitle();
		System.out.println("Parent Window Title--->" + actParentTitle);
		String expParentTitle = "Practice Page";
		Assert.assertEquals(actParentTitle, expParentTitle);

		driver.switchTo().window(tabs.get(1)); // Switch to Child Window
		Thread.sleep(2000);

		// Click on all Courses Link
		driver.findElement(By.xpath("//*[@id='navbar-inverse-collapse']/ul/li[2]/a")).click();

		// Handle Drop Down List
		Select sc = new Select(driver.findElement(By.name("categories")));
		List<WebElement> options = sc.getOptions();
		System.out.println("size of Drop Down List---->" + options.size());

		for (WebElement ele : options) {
			String text = ele.getText();
			System.out.println("Text of Drop Down List--->" + text);

			if (text.equals("Software Testing")) {
				ele.click();
				break;
			}
		}

		driver.close();

		// Switch to Parent Window
		driver.switchTo().window(tabs.get(0));
		String actParentURL = driver.getCurrentUrl();
		System.out.println("Actual Parent URL--->" + actParentURL);
		String expParentURL = "https://courses.letskodeit.com/practice";
		Assert.assertEquals(actParentURL, expParentURL);

	}
}
