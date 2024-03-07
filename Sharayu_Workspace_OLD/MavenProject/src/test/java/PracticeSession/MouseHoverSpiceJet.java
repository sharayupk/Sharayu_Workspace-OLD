package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverSpiceJet 
{
	@Test
	public void mouseHoverExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		WebElement ele=driver.findElement(By.id("ctl00_HyperLinkLogin"));
		Actions action=new Actions(driver);
		
		action.moveToElement(ele).build().perform();  //Mouse Hover on Login / Signup
		
		Thread.sleep(1000);
		
		ele=driver.findElement(By.linkText("SpiceClub Members"));
		action.moveToElement(ele).build().perform();  //Mouse Hover on SpiceClub Members
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign up")).click();
	}
}
