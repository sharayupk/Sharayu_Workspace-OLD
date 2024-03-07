package PracticeSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadHTMLCom 
{
	@Test
	public void fileUploadExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",".\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		
		//Scroll Down The Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,700)");
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\User\\Downloads\\User Details.xlsx");
	}
}
