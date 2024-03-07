package AutomationPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataTablesPagination 
{
	public WebDriver driver;
	@Test
    
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Scroll Down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,400)");
		
		WebElement pagination_ele=driver.findElement(By.id("example_paginate"));
		List<WebElement>sub_links=pagination_ele.findElements(By.tagName("a"));
		System.out.println("List of Sublinks---->"+sub_links.size());
		
		if(sub_links.size()>0)
		{	
			System.out.println("Links are Present");
			
			for(int i=1;i<sub_links.size()-1;i++)
			{   
				Thread.sleep(1000);
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				link.click();
				
				int rows=driver.findElements(By.tagName("tr")).size();
				System.out.println("Total No. Of rows--->"+rows);
				
				for(int r=1;r<=rows;r++)
				{
					String col1=driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+r+"]/td[1]")).getText();
					String col2=driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+r+"]/td[2]")).getText();
					String col3=driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+r+"]/td[3]")).getText();
					String col4=driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+r+"]/td[4]")).getText();
					String col5=driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+r+"]/td[5]")).getText();
					String col6=driver.findElement(By.xpath("//*[@id='example']/tbody/tr["+r+"]/td[6]")).getText();
				}
			}
		}
		else
		{
			System.out.println("Links not Present");
		}
	}
}
