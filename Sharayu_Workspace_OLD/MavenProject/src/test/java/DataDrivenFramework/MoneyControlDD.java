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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MoneyControlDD 
{
	@Test
	public void getExcel() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		File src=new File("D:\\Excel Sheet\\moneycontrolDD.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getLastRowNum());

		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row=sh.getRow(i);

			String Principal=row.getCell(0).toString();
			String Rate=row.getCell(1).toString();
			String Period=row.getCell(2).toString();
			String Days=row.getCell(3).getStringCellValue();
			String Frequency=row.getCell(4).getStringCellValue();
			int Maturity=(int) row.getCell(5).getNumericCellValue();

			//Enter Details
			
            JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,400)");

			driver.findElement(By.id("principal")).sendKeys(Principal);
			driver.findElement(By.id("interest")).sendKeys(Rate);
			driver.findElement(By.id("tenure")).sendKeys(Period);

			Select daydrp=new Select(driver.findElement(By.id("tenurePeriod")));
			daydrp.selectByVisibleText(Days);

			Select freqdrp=new Select(driver.findElement(By.id("frequency")));
			freqdrp.selectByVisibleText(Frequency);

			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[1]/img")).click();
			
			String actual_maturity=driver.findElement(By.xpath("//*[@id='resp_matval']/strong")).getText();
			System.out.println("Actual Maturity Value---->"+actual_maturity);
			
			if(Double.parseDouble(actual_maturity)==Maturity)
			{
				System.out.println("Test Case Passed");
			}
			else
			{
				System.out.println("Test Case Failed");
			}
		
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id='fdMatVal']/div[2]/a[2]/img")).click();


		}

	}
}

