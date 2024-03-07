package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragNDropExample 
{
	@Test
	public void dragNDrop() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		String beforeColor=driver.findElement(By.id("droppable")).getCssValue("background-color");
		System.out.println("Before Dragging Element Color Of Target Element----->"+beforeColor);
		
		Actions action=new Actions(driver);
		//action.dragAndDrop(src, target).build().perform();
		action.clickAndHold(src).moveToElement(target).release().build().perform();
		
		String afterColor=driver.findElement(By.id("droppable")).getCssValue("background-color");
		System.out.println("After Dragging Element Color Of Target Element----->"+afterColor);
		
	}
}
