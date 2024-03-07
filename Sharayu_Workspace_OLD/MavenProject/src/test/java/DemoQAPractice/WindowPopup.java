package DemoQAPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindowPopup 
{
	 WebDriver driver;
     @Test
     public void executeWindowPopup() throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
    	 driver=new ChromeDriver();
    	 
    	 driver.get("https://demoqa.com/automation-practice-switch-windows-2/");
    	 driver.manage().window().maximize();
    	 driver.manage().deleteAllCookies();
    	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	 
    	 driver.findElement(By.id("button1")).click();
    	 
    	 String parent=driver.getWindowHandle();
    	 System.out.println("Parent Window ID---->"+parent);
    	 
    	 Set<String>handles=driver.getWindowHandles();
    	 System.out.println("Size of all Window ---->"+handles.size());
    	 
    	 Iterator<String>it=handles.iterator();
    	 while(it.hasNext())
    	 {
    		String child= it.next();
    		driver.switchTo().window(child);
    		
    		String actualTitle=driver.getTitle();
    		System.out.println("Actual Title of Child Window---->"+actualTitle);
    		Assert.assertEquals("Automation Practice Switch Windows – ToolsQA – Demo Website to Practice Automation", actualTitle);
    		
    		Thread.sleep(3000);
    		driver.findElement(By.xpath("//*[@id='page']/div[1]/div[2]/div[1]/a")).click();
    		
    		Thread.sleep(2000);
    		//Click on + sign of Tutorials
    		driver.findElement(By.xpath("//*[@id='mobile-menu']/li[2]/i")).click();
    		
    		Thread.sleep(2000);
    		//Click on Software Testing Tutorial
    		driver.findElement(By.xpath("span[text()='Software Testing Tutorial']")).click();
    		
    		String actualUrl=driver.getCurrentUrl();
    		System.out.println("Child Url--->"+actualUrl);
    		Assert.assertEquals("https://www.toolsqa.com/software-testing-tutorial/", actualUrl);
    		
    		driver.close();
    	 }
    	 
    	 //Switch To Parent Window
    	 driver.switchTo().window(parent);
}
}
