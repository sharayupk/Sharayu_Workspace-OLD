package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover {
	
	@Test
	public void handleFileUpload() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demoqa.com/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Mouse Hover on Music Option
		Actions action=new Actions(driver);
		
		WebElement ele=driver.findElement(By.id("ui-id-9"));
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		//Mouse Hover on Jazz
		ele=driver.findElement(By.id("ui-id-13"));
		action.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		//Click on Big Band
		driver.findElement(By.id("ui-id-15")).click();
		
		driver.close();
				
		
		
		
		

}
}
