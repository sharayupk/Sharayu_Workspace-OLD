package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopUp {
	
	@Test
	public void handleFileUpload() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Click on Browse Button and Upload document
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\User\\Documents\\MEDICENE LIST.docx");
		System.out.println("File Uploaded Successfully....");
		
		driver.close();
		

}
}
