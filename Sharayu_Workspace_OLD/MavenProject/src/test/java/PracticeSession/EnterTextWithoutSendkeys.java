package PracticeSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextWithoutSendkeys 
{
	@Test
	public void enterText()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".//dri//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		//Enter text in text box without using sendkeys
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementByName('q').value='Selenium Automation'");
		
		WebElement name=driver.findElement(By.name("q"));
		js.executeAsyncScript("arguments[0].value='admin'",name); 


	}
}
