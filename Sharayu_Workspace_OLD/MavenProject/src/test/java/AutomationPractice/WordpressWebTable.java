package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WordpressWebTable 
{
	@Test
	public void webtableExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Login with valid Credentials
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("demo123");
		driver.findElement(By.id("wp-submit")).click();
		
		Thread.sleep(2000);
		
		//Mouse Hover on Posts Tab
		WebElement ele=driver.findElement(By.xpath("//div[text()='Posts']"));
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
		
		//Click on All Posts Link
		driver.findElement(By.xpath("//a[text()='All Posts']")).click();
		
		//*[@id="post-38"]/td[1]/strong/a
		//*[@id="post-40"]/td[1]/strong/a
		//*[@id="post-31"]/td[1]/strong/a
		//Getting Total No. of Rows
		int rows=driver.findElements(By.tagName("tr")).size();
		System.out.println("Total No. of Rows---->"+rows);
	}

}
