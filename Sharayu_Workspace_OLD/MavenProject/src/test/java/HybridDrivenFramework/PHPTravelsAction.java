package HybridDrivenFramework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PHPTravelsAction 
{

	public static WebDriver driver;
	 
	 public static void openbrowser()
	 {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }
	 
	 public static void navigate()
	 {
		 driver.get("https://phptravels.org/register.php");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	 }
	 
	 public static void enterfirstname() throws IOException
	 {
		 String fn=PHPTravelsExcel.InputData(3, 1);
		 driver.findElement(By.id("inputFirstName")).sendKeys(fn);
	 }
	 
	 public static void enterlastname() throws IOException
	 {   
		 String ln=PHPTravelsExcel.InputData(4, 1);
		 driver.findElement(By.id("inputLastName")).sendKeys(ln);
     }
	 
	 public static void enteremail() throws IOException
	 {
		 String email=PHPTravelsExcel.InputData(5, 1);
		 driver.findElement(By.id("inputEmail")).sendKeys(email);
	 }
	 
	 public static void selectphone() throws IOException, InterruptedException
	 {
		 driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
		 Thread.sleep(1000);
		 String phdrp=PHPTravelsExcel.InputData(6, 1);
		 driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys(phdrp);
		 driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys(Keys.ENTER); 
	 }
	 
	 public static void enterphone() throws IOException
	 {
		 String ph=PHPTravelsExcel.InputData(7, 1);
		 driver.findElement(By.id("inputPhone")).sendKeys(ph);
	 }
	 
	 public static void enterstreet() throws IOException
	 {
		 String street=PHPTravelsExcel.InputData(8, 1);
		 driver.findElement(By.id("inputAddress1")).sendKeys(street);
	 }
	 
	 public static void entercity() throws IOException
	 {
		 String city=PHPTravelsExcel.InputData(9, 1);
		 driver.findElement(By.id("inputCity")).sendKeys(city);
	 }
	 
	 public static void enterstate() throws IOException
	 {
		 String state=PHPTravelsExcel.InputData(10, 1);
		 driver.findElement(By.id("stateinput")).sendKeys(state);
	 }
	 
	 public static void enterpincode() throws InterruptedException, IOException
	 {
		 String pincode=PHPTravelsExcel.InputData(11, 1);
		 driver.findElement(By.id("inputPostcode")).sendKeys(pincode);
		 Thread.sleep(2000);
		 //Scroll Down the Page
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("scroll(0,400)");
	 }
	 
	 public static void selectcountry() throws IOException
	 {
		 Select countrydrp=new Select(driver.findElement(By.id("inputCountry")));
		 String country=PHPTravelsExcel.InputData(12, 1);
		 countrydrp.selectByVisibleText(country);
		 
	 }
	 
	 public static void selectfindus() throws InterruptedException, IOException
	 {
		 Select findusdrp=new Select(driver.findElement(By.id("customfield1")));
		 String findus=PHPTravelsExcel.InputData(13, 1);
		 findusdrp.selectByVisibleText(findus);
		 Thread.sleep(2000);
	 }
	 
	 public static void entermobile() throws IOException
	 {
		 String mobile=PHPTravelsExcel.InputData(14, 1);
		 driver.findElement(By.id("customfield2")).sendKeys(mobile);
	 }
	 
	 public static void clickgeneratepassword() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 //Click on Generate Password
		 driver.findElement(By.xpath("//*[@id='containerPassword']/div[4]/button")).click();
	 }
	 
	 public static void enterpasswordlen() throws InterruptedException, IOException
	 {
		 Thread.sleep(2000);
		 driver.findElement(By.id("inputGeneratePasswordLength")).clear();
		 String pass=PHPTravelsExcel.InputData(16, 1);
		 driver.findElement(By.id("inputGeneratePasswordLength")).sendKeys(pass);
		 driver.findElement(By.xpath("//*[@id='modalGeneratePassword']/div/div/div[2]/div[4]/div/button[1]")).click();
		 driver.findElement(By.xpath("//*[@id='btnGeneratePasswordInsert']")).click();
			
	 }
	 }


