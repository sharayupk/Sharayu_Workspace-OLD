package LetsCodeITPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableExample 
{
	@Test
	public void webTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://letskodeit.teachable.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Scroll down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)");
		
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id='product']/tbody/tr"));
		System.out.println("Total No. of Rows---->"+rows.size());
		System.out.println("Author        "+"Course                       "+"Price   ");
		
		for(int i=1;i<rows.size();i++)
		{
			WebElement ele=rows.get(i);
			String text=ele.getText();
			System.out.println(text);
		}
	}
		
}
