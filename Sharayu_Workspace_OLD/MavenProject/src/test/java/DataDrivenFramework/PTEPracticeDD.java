package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PTEPracticeDD 
{   
	WebDriver driver;
	@Test
	public void executeDD() throws IOException, InterruptedException
	{
		File src=new File("D:\\Excel Sheet\\ptepracticeDD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getLastRowNum());

		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row=sh.getRow(i);

			String Firstname=row.getCell(0).getStringCellValue();
			String Lastname=row.getCell(1).getStringCellValue();
			String Email=row.getCell(2).getStringCellValue();
			String ConEmail=row.getCell(3).getStringCellValue();
			String Password=row.getCell(4).getStringCellValue();
			String ConPassword=row.getCell(5).getStringCellValue();
			String Address=row.getCell(6).getStringCellValue();
			String City=row.getCell(7).getStringCellValue();
			String Country=row.getCell(8).getStringCellValue();
			String Day=row.getCell(9).toString();
			String Month=row.getCell(10).toString();
			String Year=row.getCell(11).toString();
			String Degree=row.getCell(12).getStringCellValue();

			//Fill the Details
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get("https://www.ptepractice.com/register/product/free-sample");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
			driver.findElement(By.id("firstname")).sendKeys(Firstname);
			driver.findElement(By.id("lastname")).sendKeys(Lastname);
			driver.findElement(By.id("email")).sendKeys(Email);
			driver.findElement(By.id("confirmemail")).sendKeys(ConEmail);
			driver.findElement(By.id("password")).sendKeys(Password);
			driver.findElement(By.id("confirmpassword")).sendKeys(ConPassword);
			driver.findElement(By.name("user.address1")).sendKeys(Address);
			
			//Scroll down the Page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,600)");
			driver.findElement(By.name("user.city")).sendKeys(City);
			
			Select countrydrp=new Select(driver.findElement(By.name("user.country")));
			countrydrp.selectByVisibleText(Country);
			
			Select daydrp=new Select(driver.findElement(By.name("user.DoBday")));
			daydrp.selectByVisibleText(String.valueOf(Day));
			Select monthdrp=new Select(driver.findElement(By.name("user.DoBmonth")));
			monthdrp.selectByVisibleText(String.valueOf(Month));
			Select yeardrp=new Select(driver.findElement(By.name("user.DoByear")));
			yeardrp.selectByVisibleText(String.valueOf(Year));
			
			Select degreedrp=new Select(driver.findElement(By.name("user.studyLevel")));
			degreedrp.selectByVisibleText(String.valueOf(Degree));
			
			Thread.sleep(2000);
			driver.findElement(By.id("terms")).click();
			
			Thread.sleep(2000);
			WebElement frame=driver.findElement(By.xpath("//*[@id='register']/div[4]/div/div/div/div/iframe"));
			driver.switchTo().frame(frame);
			
			Thread.sleep(2000);
			driver.findElement(By.id("recaptcha-anchor")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
			
		}

	}
}
