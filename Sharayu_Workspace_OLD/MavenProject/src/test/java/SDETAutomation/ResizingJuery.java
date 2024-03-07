package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizingJuery
{   
	@Test
	public void resizeExample() throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Switch To Frame
		driver.switchTo().frame(0);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(ele).dragAndDropBy(ele, 50,50).build().perform();
		act.clickAndHold(ele).moveByOffset(50,50).release().build().perform();
		
	}
}
