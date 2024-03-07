package KeywordDrivenFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PTEPracticeAction 
{   
	public static WebDriver driver;

	public static void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public static void navigate()
	{
		driver.get("https://www.ptepractice.com/register/product/free-sample");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	
	public static void enterfirstname()
	{
		driver.findElement(By.id("firstname")).sendKeys("Sharmishtha");
	}
	
	public static void enterlastname()
	{
		driver.findElement(By.id("lastname")).sendKeys("Shah");
	}
	
	public static void enteremail()
	{
		driver.findElement(By.id("email")).sendKeys("sharmishtha@gmail.com");
	}
	
	public static void enterconemail()
	{
		driver.findElement(By.id("confirmemail")).sendKeys("sharmishtha@gmail.com");
	}
	
	public static void enterpassword()
	{
		driver.findElement(By.id("password")).sendKeys("sharmishtha@12");
	}
	
	public static void enterconpassword()
	{
		driver.findElement(By.id("confirmpassword")).sendKeys("sharmishtha@12");
	}
	
	public static void enteraddr()
	{
		driver.findElement(By.name("user.address1")).sendKeys("Pune");
	}
	
	public static void entercity()
	{
		//Scroll down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)");
		driver.findElement(By.name("user.city")).sendKeys("Pune");
	}
	
	public static void selectcountry()
	{
		Select countrydrp=new Select(driver.findElement(By.name("user.country")));
		countrydrp.selectByVisibleText("India");
	}
	
	public static void selectday()
	{
		Select daydrp=new Select(driver.findElement(By.name("user.DoBday")));
		daydrp.selectByVisibleText(String.valueOf("14"));
	}
	
	public static void selectmonth()
	{
		Select monthdrp=new Select(driver.findElement(By.name("user.DoBmonth")));
		monthdrp.selectByVisibleText(String.valueOf("5"));
	}
	
	public static void selectyear()
	{
		Select yeardrp=new Select(driver.findElement(By.name("user.DoByear")));
		yeardrp.selectByVisibleText(String.valueOf("1992"));
	}
	
	public static void selectdegree()
	{
		Select degreedrp=new Select(driver.findElement(By.name("user.studyLevel")));
		degreedrp.selectByVisibleText(String.valueOf("Below degree"));
	}
	
	public static void clickonterms() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
	}
	
	public static void clickoncaptcha() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement frame=driver.findElement(By.xpath("//*[@id='register']/div[4]/div/div/div/div/iframe"));
		driver.switchTo().frame(frame);
		
		Thread.sleep(2000);
		driver.findElement(By.id("recaptcha-anchor")).click();
	}
	
}
