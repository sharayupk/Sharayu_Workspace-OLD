package SDETAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NoOfRowsAndCols 
{
	@Test
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		int rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		System.out.println("Total No. Of Rows---->"+rows);
		
		int cols=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		System.out.println("Total No. Of Cols---->"+cols);
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String text=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
			    System.out.print(text);
			}
			
			System.out.println();
		}
		
		
}
}
