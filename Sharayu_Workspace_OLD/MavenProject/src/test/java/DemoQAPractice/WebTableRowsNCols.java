package DemoQAPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableRowsNCols 
{
	WebDriver driver;
	@Test
	public void webtableRowsColsCount() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,250)");

		int rows=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr")).size();
		System.out.println("Total No. Of Rows----->"+rows);

		int cols=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th")).size();
		System.out.println("Total No. Of Cols----->"+cols);
		
		System.out.println(" Company           |"+          "  Contact           |"+       "  Country     |");
		
		for(int i=2;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{   
				Thread.sleep(2000);
				String text=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text+      "   |   ");
				
			}
			System.out.println();
		}
	}
}
