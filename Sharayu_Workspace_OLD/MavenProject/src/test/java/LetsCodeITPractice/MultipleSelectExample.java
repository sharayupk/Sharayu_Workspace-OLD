package LetsCodeITPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelectExample 
{
	@Test
	public void multipledropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		Select sc=new Select(driver.findElement(By.id("multiple-select-example")));
		sc.selectByIndex(1); //Orange
		
		Thread.sleep(1000);
		sc.selectByVisibleText("Peach"); //Peach
		
		Thread.sleep(1000);
		sc.selectByValue("apple");  //Apple
		
		Thread.sleep(1000);
	}
		
}
