package SDETAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTablePagination 
{
	@Test
	public void paginationExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,100)");

		WebElement paging_element=driver.findElement(By.id("myPager"));

		List<WebElement>links=paging_element.findElements(By.tagName("a"));
		System.out.println("Total No. Of Links in Pagination--->"+links.size());

		if(links.size()>0)
		{   
			System.out.println("Links are Present");
			
			for(int i=1;i<links.size()-1;i++)
			{
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				link.click();
				Thread.sleep(2000);
			}
			
			int rows=driver.findElements(By.xpath("//*[@id='myTable']/tr")).size();
			System.out.println("Total No. Of Rows--->"+rows);
			
			for(int r=1;r<=rows;r++)
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
		else
		{
			System.out.println("Links are not Present");
		}
	}
}
