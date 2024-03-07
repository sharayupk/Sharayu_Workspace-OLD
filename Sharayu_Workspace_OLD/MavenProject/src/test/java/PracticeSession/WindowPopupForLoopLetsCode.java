package PracticeSession;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowPopupForLoopLetsCode
{
	@Test
	public void windowPopupForloopExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		driver.findElement(By.id("openwindow")).click();

		String parent=driver.getWindowHandle();
		System.out.println("Parent Window ID---->"+parent);

		Set<String>handles=driver.getWindowHandles();
		System.out.println("All Window ID---->"+handles);
		
		for(String han:handles)
		{   
			System.out.println("Switching To---->"+han);
			driver.switchTo().window(han);    //Parent Window
		}
		
		System.out.println("Current URL---->"+driver.getCurrentUrl());
	}
}
