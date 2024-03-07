package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableRowsNCols 
{
	@Test
	public void sortDrpDown() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Getting No. Of Rows
		int rows=driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr")).size();
		System.out.println("No. Of Rows----->"+rows);

		//Getting No. Of Columns
		int cols=driver.findElements(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr[1]/th")).size();
		System.out.println("No. Of Columns----->"+cols);
		
		System.out.println("BookName           "+"Author      "+"Subject      "+"Price    ");
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//*[@id='HTML1']/div[1]/table/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(value+"    ");
			}
			System.out.println();
		}
	}
}
