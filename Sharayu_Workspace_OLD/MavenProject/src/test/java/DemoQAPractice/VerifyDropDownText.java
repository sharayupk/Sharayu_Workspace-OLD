package DemoQAPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class VerifyDropDownText 
{
	WebDriver driver;
	@Test
	public void sortDropDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        
		
		String exp[]= {"Please select","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		Select sc=new Select(driver.findElement(By.id("select-demo")));
		List<WebElement>options=sc.getOptions();
		System.out.println("Size of Drop Down List----->"+options.size());

	}}
