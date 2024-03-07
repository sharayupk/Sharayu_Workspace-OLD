package TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowser 
{ 
	WebDriver driver=null;
	@Parameters({"browserName"})
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("Browser Name :"+browserName);
		System.out.println("Thread ID :"+Thread.currentThread().getId());

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	}
	
	@Test
	public void test1()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("Test Completed Successfully....");
	}
	
	
	
}
