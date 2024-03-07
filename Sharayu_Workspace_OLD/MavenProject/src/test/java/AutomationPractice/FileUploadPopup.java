package AutomationPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadPopup 
{
	@Test
	public void fileUploadExample() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

		//Click on Browse Button
		driver.findElement(By.id("file-upload")).sendKeys("D:\\Excel Sheet\\phptravelsDD.xlsx");
		Thread.sleep(2000);

		//Click on Upload Button
		driver.findElement(By.id("file-submit")).click();
		String expText="File Uploaded!";
		String uploadedText=driver.findElement(By.xpath("//h3[text()='File Uploaded!']")).getText();
		System.out.println("After Uploading Text----->"+uploadedText);
		Assert.assertEquals(expText, uploadedText);

		Thread.sleep(1000);
		String expFileName="stock-import-format .xlsx";
		String uploadedFileName=driver.findElement(By.id("uploaded-files")).getText();
		System.out.println("After Uploading File Name----->"+uploadedFileName);
		Assert.assertEquals(expText, uploadedText);




	}
}
