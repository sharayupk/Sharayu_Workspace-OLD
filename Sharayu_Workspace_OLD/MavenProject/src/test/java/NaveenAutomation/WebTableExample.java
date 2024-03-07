package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableExample {
	
	@Test
	public void handleWebTable() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/webtable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		int rows=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
		System.out.println("Total No. of Rows---->"+rows);
		
		int cols=driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td")).size();
		System.out.println("Total No. of Columns---->"+cols);
				
		
}
}
