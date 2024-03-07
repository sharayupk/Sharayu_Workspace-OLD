package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsExample 
{
	public WebDriver driver;
	@Test(groups="smoke")
	public void LaunchURL() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("http://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	}
	
	@Test(groups="smoke")
	public void VerifyLaunchPage()
	{
		boolean heading=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img")).isDisplayed();
		System.out.println(heading);
		
		Assert.assertTrue(heading, "Heading is not Displayed Properly");
	}
	
	@Test(groups="sanity")
	public void LoginWithValidCredentials()
	{
		driver.findElement(By.name("uid")).sendKeys("mngr253705");
		driver.findElement(By.name("password")).sendKeys("EpAdUdE");
		driver.findElement(By.name("btnLogin")).click();
	}
	
	@Test(groups= {"smoke","sanity"})
	public void VerifyManagerID()
	{
		boolean managerID=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).isDisplayed();
		System.out.println(managerID);
		
		Assert.assertTrue(managerID, "Manager ID is not Displayed Properly");
	}
	
	@Test(groups="sanity")
	public void VerifyNewCustomerLink()
	{
		boolean newCustLink=driver.findElement(By.xpath("//a[text()='New Customer']")).isDisplayed();
		System.out.println(newCustLink);
		
		Assert.assertTrue(newCustLink, "New Customer Link is not Displayed Properly");
	}
	}

