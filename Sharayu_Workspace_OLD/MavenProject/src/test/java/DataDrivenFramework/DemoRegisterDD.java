package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoRegisterDD 
{
	@Test
	public void registerDD() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\dri\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		File src=new File(".\\Excel Sheet\\demoregisterDD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row=sh.getRow(i);
			
			String Firstname=row.getCell(0).getStringCellValue();
			String Lastname=row.getCell(1).getStringCellValue();
            String Address=row.getCell(2).getStringCellValue();
            String Email=row.getCell(3).getStringCellValue();
            String Phone=row.getCell(4).toString();
            String Language=row.getCell(5).getStringCellValue();
            String Skills=row.getCell(6).getStringCellValue();
            String Country=row.getCell(7).getStringCellValue();
            String SelectCountry=row.getCell(8).getStringCellValue();
            String Year=row.getCell(9).toString();
            String Month=row.getCell(10).getStringCellValue();
            String Day=row.getCell(11).toString();
            String Password=row.getCell(12).getStringCellValue();
            String ConPassword=row.getCell(13).getStringCellValue();
            
            //Fill Details
            driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(Firstname);
            driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(Lastname);
            driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
            driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(Email);
            driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(Phone);
            driver.findElement(By.xpath("//input[@value='FeMale']")).click();
            driver.findElement(By.id("checkbox1")).click();
            
            Thread.sleep(1000);
            driver.findElement(By.id("msdd")).click();
            
            List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete ui-front ui-menu')]//li//a"));
            for(WebElement ele:options)
            {
            	String lang=ele.getText();
            	System.out.println("Languages---->"+lang);     //Select English
            	
            	if(lang.equals(Language))
            	{
            		ele.click();
            		break;
            	}
            }
            
            Thread.sleep(1000);
            
            //Scroll Down the Page
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("scroll(0,300)");
            
            Select skillsdrp=new Select(driver.findElement(By.id("Skills")));
            skillsdrp.selectByVisibleText(Skills);    //Select C
            
            Select countrydrp=new Select(driver.findElement(By.id("countries")));
            countrydrp.selectByVisibleText(Country);   //Select India
            

            driver.findElement(By.xpath("//span[@role='combobox']")).click();
            driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(SelectCountry);  //Select India
            driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys(Keys.ENTER);
            
            Thread.sleep(1000);

            Select yeardrp=new Select(driver.findElement(By.id("yearbox")));
            yeardrp.selectByVisibleText(Year);    //Select 1992

            Select monthdrp=new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
            monthdrp.selectByVisibleText(Month);    //Select May

            Select daydrp=new Select(driver.findElement(By.id("daybox")));
            daydrp.selectByVisibleText(Day);    //Select 10
            
            driver.findElement(By.id("firstpassword")).sendKeys(Password);
            driver.findElement(By.id("secondpassword")).sendKeys(ConPassword);
            
            driver.findElement(By.id("submitbtn")).click();


            
            

		}
		
		
	}
}
