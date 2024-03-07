package NaveenAutomation;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowPopUpArrayList {
	
	@Test
	public void windowPopup() throws InterruptedException
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
		
		ArrayList<String>tabs=new ArrayList<>(handler);
		
		driver.switchTo().window(tabs.get(0));  //Parent Window
		
		String parentTitle=driver.getTitle();
		System.out.println("Parent Window Title---->"+parentTitle);
		
		String parentUrl=driver.getCurrentUrl();
		System.out.println("Parent Window URL---->"+parentUrl);
		
		driver.switchTo().window(tabs.get(1));  //Child Window
		
		String childTitle=driver.getTitle();
		System.out.println("Child Window Title---->"+childTitle);
		
		String childUrl=driver.getCurrentUrl();
		System.out.println("Child Window URL---->"+childUrl);
		
		
		
		
		
		

}
}
