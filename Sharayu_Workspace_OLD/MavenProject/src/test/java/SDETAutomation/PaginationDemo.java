package SDETAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PaginationDemo 
{
	@Test
	public void paginationExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://wet-boew.github.io/v4.0-ci/demos/tables/tables-en.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		WebElement paging_element=driver.findElement(By.xpath("//*[@id='wb-auto-1_paginate']/ol"));

		List<WebElement>links=paging_element.findElements(By.tagName("a"));
		System.out.println("Total No. Of Links---->"+links.size());

		if(links.size()>0)
		{
			System.out.println("Links are present");

			for(int i=1;i<links.size()-1;i++)
			{
				WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
				link.click();

				int rows=driver.findElements(By.xpath("//*[@id='wb-auto-1']/tbody/tr")).size();
				System.out.println("Total No Of Rows---->"+rows);

				for(int r=1;r<=rows;r++)
				{
					String col1=driver.findElement(By.xpath("//*[@id='wb-auto-1']/tbody/tr["+r+"]/td[1]")).getText();
					String col2=driver.findElement(By.xpath("//*[@id='wb-auto-1']/tbody/tr["+r+"]/td[2]")).getText();
					String col3=driver.findElement(By.xpath("//*[@id='wb-auto-1']/tbody/tr["+r+"]/td[3]")).getText();
					String col4=driver.findElement(By.xpath("//*[@id='wb-auto-1']/tbody/tr["+r+"]/td[4]")).getText();
					String col5=driver.findElement(By.xpath("//*[@id='wb-auto-1']/tbody/tr["+r+"]/td[5]")).getText();
				}
			}

		}
		else 
		{
			System.out.println("Links are not present");
		}

	}
}
