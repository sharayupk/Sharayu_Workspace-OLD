package NaveenAutomation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowPopUpIterator {
	
	@Test
	public void handleWindowPopUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Click on PopUp Link
		driver.findElement(By.linkText("Good PopUp #3")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID---->"+parent);
		
		Set<String>handler=driver.getWindowHandles();
		
		Iterator<String>it=handler.iterator();
		while(it.hasNext())
		{
			String child=it.next();
			
			if(!parent.equals(child))
			{   
				//Switch To Child window
				driver.switchTo().window(child);
				Thread.sleep(2000);
				String childTitle=driver.getTitle();
				System.out.println("Child Window Title---->"+childTitle);
				
				String childUrl=driver.getCurrentUrl();
				System.out.println("Child Window URL---->"+childUrl);
				
			}
		}
		
		Thread.sleep(2000);
		//Switch To Parent Window
		driver.switchTo().window(parent);
		
		String parentTitle=driver.getTitle();
		System.out.println("Parent Window Title---->"+parentTitle);
		
		String parentUrl=driver.getCurrentUrl();
		System.out.println("Parent Window URL---->"+parentUrl);
		
		
		
		
	}
}
