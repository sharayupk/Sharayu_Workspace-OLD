package NaveenAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationSeleniumEasy 
{
	@Test
	public void handlePagination() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Scroll down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,800)");
		
		List<WebElement>pagination=driver.findElements(By.xpath("//*[@id='myPager']/li/a"));
		System.out.println("Pagination Links--->"+pagination.size());
		
		//Check if pagination link exists
		if(pagination.size()>0)
		{
			System.out.println("Pagination Exists");
		
		for(int i=0;i<pagination.size();i++)
		{
			pagination.get(i).click();
	    }
	    }
		else
		{
			System.out.println("Pagination Not Exists");
		}
		
		
}
}
