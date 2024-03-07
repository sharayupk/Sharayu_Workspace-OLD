package KeywordDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
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
 
 public static void enterfirstname()
 {
	 driver.findElement(By.id("inputFirstName")).sendKeys("Suhani");
 }
 
 public static void enterlastname()
 {
	 driver.findElement(By.id("inputLastName")).sendKeys("Shah");
 }
 
 public static void enteremail()
 {
	 driver.findElement(By.id("inputEmail")).sendKeys("shani@gmail.com");
 }
 
 public static void selectphone()
 {
	 driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
	 driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys("India (भारत)");
	 driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys(Keys.ENTER); 
 }
 
 public static void enterphone()
 {
	 driver.findElement(By.id("inputPhone")).sendKeys("7654328976");
 }
 
 public static void enterstreet()
 {
	 driver.findElement(By.id("inputAddress1")).sendKeys("Pune");
 }
 
 public static void entercity()
 {
	 driver.findElement(By.id("inputCity")).sendKeys("Pune");
 }
 
 public static void enterstate()
 {
	 driver.findElement(By.id("stateinput")).sendKeys("Maharashtra");
 }
 
 public static void enterpincode() throws InterruptedException
 {
	 driver.findElement(By.id("inputPostcode")).sendKeys("456345");
	 Thread.sleep(2000);
	 //Scroll Down the Page
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("scroll(0,1200)");
 }
 
 public static void selectcountry()
 {
	 Select countrydrp=new Select(driver.findElement(By.id("inputCountry")));
	 countrydrp.selectByVisibleText("India");
 }
 
 public static void selectfindus() throws InterruptedException
 {
	 Select findusdrp=new Select(driver.findElement(By.id("customfield1")));
	 findusdrp.selectByVisibleText("Google");
	 Thread.sleep(2000);
 }
 
 public static void entermobile()
 {
	 driver.findElement(By.id("customfield2")).sendKeys("7654328976");
 }
 
 public static void clickgeneratepassword() throws InterruptedException
 {
	 Thread.sleep(1000);
	 //Click on Generate Password
	 driver.findElement(By.xpath("//*[@id='containerPassword']/div[4]/button")).click();
 }
 
 public static void enterpasswordlen() throws InterruptedException
 {
	 Thread.sleep(2000);
	 driver.findElement(By.id("inputGeneratePasswordLength")).clear();
	 driver.findElement(By.id("inputGeneratePasswordLength")).sendKeys("8");
	 driver.findElement(By.xpath("//*[@id='modalGeneratePassword']/div/div/div[2]/div[4]/div/button[1]")).click();
	 driver.findElement(By.xpath("//*[@id='btnGeneratePasswordInsert']")).click();
		
 }
 

 
 }
