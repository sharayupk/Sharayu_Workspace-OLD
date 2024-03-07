package NaveenAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OpenMRSExample 
{
	@Test
	public void handleAlert() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		//Login with valid Credentials
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//Click on Register a Patient
		driver.findElement(By.xpath("//*[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")).click();
		
		//Enter Name
		driver.findElement(By.name("givenName")).sendKeys("Dhruv");
		driver.findElement(By.name("middleName")).sendKeys("Sanjay");
		driver.findElement(By.name("familyName")).sendKeys("Sharma");
		
		//click on Gender
		driver.findElement(By.id("genderLabel")).click();
		//Select Male as Gender
		Select gendrp=new Select(driver.findElement(By.id("gender-field")));
		gendrp.selectByVisibleText("Male");
		
		//Click on Birthdate
		driver.findElement(By.xpath("//*[@id='formBreadcrumb']/li[1]/ul/li[3]")).click();
		
		driver.findElement(By.name("birthdateDay")).sendKeys("16");
		Select birthdrp=new Select(driver.findElement(By.id("birthdateMonth-field")));
		birthdrp.selectByVisibleText("April");
		driver.findElement(By.name("birthdateYear")).sendKeys("1990");
		
		//Enter Address
		driver.findElement(By.xpath("//*[@id='formBreadcrumb']/li[2]/ul/li[1]/span")).click();
		Thread.sleep(1000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('address1').value='Pune';");
		
		//Enter Phone No.
		driver.findElement(By.xpath("//*[@id='formBreadcrumb']/li[2]/ul/li[2]/span")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("7685765487");
		
		//Select Relation
		driver.findElement(By.xpath("//*[@id='formBreadcrumb']/li[3]/ul/li/span")).click();
		Select reldrp=new Select(driver.findElement(By.id("relationship_type")));
		reldrp.selectByVisibleText("Patient");
		
		driver.findElement(By.xpath("//input[@ng-model='relationship.name']")).sendKeys("Dhruv");
		
		//Click on Confirm 
		driver.findElement(By.id("confirmation_label")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		
		//Click on Home Button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='breadcrumbs']/li[1]/a/i")).click();
		
		//Click on Find Patient Record 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']/i")).click();
		
		driver.findElement(By.id("patient-search")).sendKeys("dhruv");
		driver.findElement(By.id("patient-search")).sendKeys(Keys.ENTER);
		
		
	
		
		
		
	}
}
