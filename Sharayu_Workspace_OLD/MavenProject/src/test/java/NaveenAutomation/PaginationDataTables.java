package NaveenAutomation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaginationDataTables 
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
		
		//*[@id="example"]/tbody/tr[4]/td[1]
		List<WebElement>nameElements=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
		List<String>names=new ArrayList<>();
		
		for(WebElement nameElement:nameElements)
		{
			names.add(nameElement.getText());
		}
		
		String nextBtnClassName=driver.findElement(By.id("example_next")).getAttribute("class");
		while(!nextBtnClassName.contains("disabled"))
		{
			driver.findElement(By.id("example_next")).click();
			
			nameElements=driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
			
			for(WebElement nameElement:nameElements)
			{
				names.add(nameElement.getText());
			}
			
			nextBtnClassName=driver.findElement(By.id("example_next")).getAttribute("class");
			for(String name:names)
			{
				System.out.println(name);
			}
			
			int totalNames=names.size();
			System.out.println("Total No. of Names:"+totalNames);
			
			String displayedCount=driver.findElement(By.id("example_info")).getText().split(" ")[5];
			System.out.println("Total No. of Names Count:"+displayedCount);
			Assert.assertEquals(displayedCount, String.valueOf(totalNames));
			
		}
		
}
}
