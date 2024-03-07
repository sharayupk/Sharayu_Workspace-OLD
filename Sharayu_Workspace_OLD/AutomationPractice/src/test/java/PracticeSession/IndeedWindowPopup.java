package PracticeSession;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IndeedWindowPopup {

	@Test
	public void executeWindowPopup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://secure.indeed.com/account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// Click on Signin with Google Link
		driver.findElement(By.xpath("//*[@id='login-google-button']")).click();

		String parent = driver.getWindowHandle();
		System.out.println("Parent Window ID---->" + parent);

		Set<String> handles = driver.getWindowHandles();
		System.out.println("All Window ID's---->" + handles);
		System.out.println("Size of All Window ID's---->" + handles.size());

		Iterator<String> it = handles.iterator();
		while (it.hasNext()) {
			String child = it.next();
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				String childTitle = driver.getTitle();
				System.out.println("Child Window Title---->" + childTitle);
				Assert.assertEquals(childTitle, "Sign in – Google accounts");
				driver.close();
			}

		}
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		String parentTitle = driver.getTitle();
		System.out.println("Parent Window Title---->" + parentTitle);
		String googleText = driver.findElement(By.id("undefined-error")).getText();

		if (googleText.equals("Google pop up closed.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		Assert.assertEquals(parentTitle, "Sign In | Indeed Accounts");

	}
}