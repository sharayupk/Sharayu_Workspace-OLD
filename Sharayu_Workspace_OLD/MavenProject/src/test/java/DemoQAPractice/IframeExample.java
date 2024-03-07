package DemoQAPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeExample 
{   WebDriver driver;
	@Test
    public void executeWindowPopup() throws InterruptedException
    {
   	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
   	 driver=new ChromeDriver();
   	 
   	 driver.get("https://demoqa.com/iframe-practice-page/");
   	 driver.manage().window().maximize();
   	 driver.manage().deleteAllCookies();
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
   	 
   	 //Scroll down the Page
   	 JavascriptExecutor js=(JavascriptExecutor)driver;
   	 js.executeScript("scroll(0,1000)");
   	 
   	 //Switch to Frame
   	 driver.switchTo().frame("IF2");
   	 
   	 Thread.sleep(2000);
   	 
   	 //Click on Sortable
   	 driver.findElement(By.linkText("Sortable")).click();
   	 
   	 //Switch to Parent Window
   	 driver.switchTo().defaultContent();
   	 
     //Scroll up the Page
   	 JavascriptExecutor jse=(JavascriptExecutor)driver;
   	 jse.executeScript("scroll(0,-40)");
   	 
   	 //Switch to Frame
   	 driver.switchTo().frame("IF1");
   	 
   	 Thread.sleep(2000);
   	 
   	 //Click on Sortable
   	 driver.findElement(By.linkText("Skip to content")).click();
   	 
   	 
   	 
    }
}
