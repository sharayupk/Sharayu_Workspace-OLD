package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PhpTravelsDD {
	
	@Test
	
	public void executeDD() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		File src=new File("D:\\Excel Sheet\\phptravelsDD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getLastRowNum());
        
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row=sh.getRow(i);
			
			
			String FirstName=row.getCell(0).getStringCellValue();
			String LastName=row.getCell(1).getStringCellValue();
			String Email=row.getCell(2).getStringCellValue();
			String Phonedrp=row.getCell(3).getStringCellValue();
			String Phone=row.getCell(4).toString();
			String Street=row.getCell(5).getStringCellValue();
			String City=row.getCell(6).getStringCellValue();
			String State=row.getCell(7).getStringCellValue();
			String Postcode=row.getCell(8).toString();
			String Country=row.getCell(9).getStringCellValue();
			String FindUs=row.getCell(10).getStringCellValue();
			String Mobile=row.getCell(11).toString();
			String PasswordLen=row.getCell(12).toString();
			
			//Fill Details
			driver.findElement(By.id("inputFirstName")).sendKeys(FirstName);
			driver.findElement(By.id("inputLastName")).sendKeys(LastName);
			driver.findElement(By.id("inputEmail")).sendKeys(Email);
			driver.findElement(By.xpath("//div[@class='selected-flag']")).click();
			driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys(Phonedrp);
			driver.findElement(By.xpath("//div[@class='selected-flag']")).sendKeys(Keys.ENTER);
			driver.findElement(By.id("inputPhone")).sendKeys(Phone);
			driver.findElement(By.id("inputAddress1")).sendKeys(Street);
			driver.findElement(By.id("inputCity")).sendKeys(City);
			driver.findElement(By.id("stateinput")).sendKeys(State);
			driver.findElement(By.id("inputPostcode")).sendKeys(Postcode);
			Thread.sleep(2000);
			//Scroll Down the Page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,1200)");
			
			Select countrydrp=new Select(driver.findElement(By.id("inputCountry")));
			countrydrp.selectByVisibleText(Country);
			
			Select findusdrp=new Select(driver.findElement(By.id("customfield1")));
			findusdrp.selectByVisibleText(FindUs);
			Thread.sleep(2000);
			driver.findElement(By.id("customfield2")).sendKeys(Mobile);
			
			Thread.sleep(1000);
			//Click on Generate Password
			driver.findElement(By.xpath("//*[@id='containerPassword']/div[4]/button")).click();
			
            Thread.sleep(2000);
			driver.findElement(By.id("inputGeneratePasswordLength")).clear();
			driver.findElement(By.id("inputGeneratePasswordLength")).sendKeys(PasswordLen);
			driver.findElement(By.xpath("//*[@id='modalGeneratePassword']/div/div/div[2]/div[4]/div/button[1]")).click();
			driver.findElement(By.xpath("//*[@id='btnGeneratePasswordInsert']")).click();
			
			//Scroll Down the Page
	        JavascriptExecutor jse=(JavascriptExecutor)driver;
		    jse.executeScript("scroll(0,1000)");
			Thread.sleep(1000);
			
			//Switch to Frame
			WebElement frame=driver.findElement(By.xpath("//*[@id='divDynasmicRecaptcha']/div/div/iframe"));
			driver.switchTo().frame(frame);
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='recaptcha-anchor']/div[1]")).click();
			
			Thread.sleep(2000);
			//Click on Register Button
			driver.findElement(By.xpath("//input[@value='Register']")).click();
			
			
			
			
            
            
			
			
			
			
			
			
			
			
		}
	}

}
