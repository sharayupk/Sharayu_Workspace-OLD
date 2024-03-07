package HybridDrivenFramework;

import java.io.IOException;
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
	
	public static void enterfirstname() throws IOException
	{   
		String fn=PTEPracticeExcel.InputData(3, 0);
		driver.findElement(By.id("firstname")).sendKeys(fn);
	}
	
	public static void enterlastname() throws IOException
	{   
		String ln=PTEPracticeExcel.InputData(4, 0);
		driver.findElement(By.id("lastname")).sendKeys(ln);
	}
	
	public static void enteremail() throws IOException
	{   
		String em=PTEPracticeExcel.InputData(5, 0);
		driver.findElement(By.id("email")).sendKeys(em);
	}
	
	public static void enterconemail() throws IOException
	{   
		String conem=PTEPracticeExcel.InputData(6, 0);
		driver.findElement(By.id("confirmemail")).sendKeys(conem);
	}
	
	public static void enterpassword() throws IOException
	{   
		String pwd=PTEPracticeExcel.InputData(7, 0);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	public static void enterconpassword() throws IOException
	{   
		String conpwd=PTEPracticeExcel.InputData(8, 0);
		driver.findElement(By.id("confirmpassword")).sendKeys(conpwd);
	}
	
	public static void enteraddr() throws IOException
	{   
		String addr=PTEPracticeExcel.InputData(9, 0);
		driver.findElement(By.name("user.address1")).sendKeys(addr);
	}
	
	public static void entercity() throws IOException
	{
		//Scroll down the Page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,600)");
		String city=PTEPracticeExcel.InputData(10, 0);
		driver.findElement(By.name("user.city")).sendKeys(city);
	}
	
	public static void selectcountry() throws IOException
	{   
		String con=PTEPracticeExcel.InputData(11, 0);
		Select countrydrp=new Select(driver.findElement(By.name("user.country")));
		countrydrp.selectByVisibleText(con);
	}
	
	public static void selectday() throws IOException
	{   
		String day=PTEPracticeExcel.InputData(12, 0);
		Select daydrp=new Select(driver.findElement(By.name("user.DoBday")));
		daydrp.selectByVisibleText(String.valueOf(day));
	}
	
	public static void selectmonth() throws IOException
	{   
		String month=PTEPracticeExcel.InputData(13, 0);
		Select monthdrp=new Select(driver.findElement(By.name("user.DoBmonth")));
		monthdrp.selectByVisibleText(String.valueOf(month));
	}
	
	public static void selectyear() throws IOException
	{   
		String year=PTEPracticeExcel.InputData(14, 0);
		Select yeardrp=new Select(driver.findElement(By.name("user.DoByear")));
		yeardrp.selectByVisibleText(String.valueOf(year));
	}
	
	public static void selectdegree() throws IOException
	{   
		String degree=PTEPracticeExcel.InputData(15, 0);
		Select degreedrp=new Select(driver.findElement(By.name("user.studyLevel")));
		degreedrp.selectByVisibleText(degree);
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
