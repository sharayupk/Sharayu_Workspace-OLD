package DemoQAPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumEasyPagination
{
	@Test
	public void WebTablePagination() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,250)");

		WebElement pagination_ele=driver.findElement(By.id("myPager"));

		int sub_links=pagination_ele.findElements(By.tagName("a")).size();
		System.out.println("Size of SubLinks--->"+sub_links);

		if(sub_links>0)
		{
			System.out.println("Links are Present");


			for(int i=1;i<sub_links-1;i++)
			{
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				link.click();

				int rows=driver.findElements(By.xpath("//*[@id='myTable']/tr")).size();
				System.out.println("Total No Of Rows---->"+rows);

				for(int r=2;r<=rows;r++)
				{
					String col1=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[1]")).getText();
					String col2=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[2]")).getText();
					String col3=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[3]")).getText();
					String col4=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[4]")).getText();
					String col5=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[5]")).getText();
					String col6=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[6]")).getText();
					String col7=driver.findElement(By.xpath("//*[@id='myTable']/tr["+r+"]/td[7]")).getText();
				}
			}
		}

		else
		{
			System.out.println("Links are not  Present");
		}
	}
}

