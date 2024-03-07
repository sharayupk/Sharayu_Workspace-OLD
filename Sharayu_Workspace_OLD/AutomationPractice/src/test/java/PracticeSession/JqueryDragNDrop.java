package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class JqueryDragNDrop {
	@Test
	public void dragNDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Scroll Down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// Handle Frame
		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		
		String beforeColor = driver.findElement(By.id("droppable")).getCssValue("background-color");
		System.out.println("Before Dragging Element Color Of Target Element----->"+beforeColor);
		
		//action.dragAndDrop(src, target).build().perform();
		//action.clickAndHold(src).moveToElement(target).release().build().perform();
		action.clickAndHold(src).moveByOffset(150,0).release().build().perform();

		String afterColor = driver.findElement(By.id("droppable")).getCssValue("background-color");
		System.out.println("After Dragging Element Color Of Target Element----->"+afterColor);

		if (afterColor.equals("rgba(255, 250, 144, 1)")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");

		}

	}
}
