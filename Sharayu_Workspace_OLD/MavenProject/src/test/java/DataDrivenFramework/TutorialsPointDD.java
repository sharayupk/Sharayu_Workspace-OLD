package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TutorialsPointDD 
{
	@Test
	public void getExcel() throws IOException, InterruptedException
	{   
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		FileInputStream fis=new FileInputStream("D:\\Sharayu_Workspace\\MavenProject\\Excel Sheet\\tutorialspointDD.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println("Total No. Of Rows----->"+sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			XSSFRow row=sh.getRow(i);
			
			String Firstname=row.getCell(0).getStringCellValue();
			String Lastname=row.getCell(1).getStringCellValue();
			String Date=row.getCell(2).toString();
			String Continent=row.getCell(3).getStringCellValue();
			String SeleniumCmd=row.getCell(4).getStringCellValue();
			String SrchText=row.getCell(5).getStringCellValue();
			
			//Fill details
			
			driver.findElement(By.name("firstname")).sendKeys(Firstname);
			Thread.sleep(1000);
			
			driver.findElement(By.name("lastname")).sendKeys(Lastname);
			Thread.sleep(1000);
			
			WebElement radioBtn=driver.findElement(By.xpath("//input[@name='sex'][@value='Female']"));
			System.out.println("Radio Button is Displayed---->"+radioBtn.isDisplayed()); //true
			
			System.out.println("Before Selecting Radio Button---->"+radioBtn.isSelected());  //false
			radioBtn.click();
			System.out.println("After Selecting Radio Button---->"+radioBtn.isSelected()); //true
			Thread.sleep(1000);
			
			//Scroll Down the page
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("scroll(0,300)");
			
			driver.findElement(By.xpath("//input[@name='exp'][@value='2']")).click();  //Select 2 Years Exp
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[5]/td[2]/input")).sendKeys(Date);
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='profession'][@value='Automation Tester']")).click(); //Select Automation Tester
			Thread.sleep(1000);
			
			driver.findElement(By.name("photo")).sendKeys("C:\\Users\\User\\Downloads\\FacilityName.xls");
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@name='tool'][@value='Selenium Webdriver']")).click();  //Select Selenium Webdriver
			Thread.sleep(1000);
			
			Select condrp=new Select(driver.findElement(By.name("continents")));
			condrp.selectByVisibleText(Continent);   //Select Europe
			Thread.sleep(1000);
			
			Select selcmdrp=new Select(driver.findElement(By.name("selenium_commands")));
			selcmdrp.selectByVisibleText(SeleniumCmd);   //Select Navigation Commands
			Thread.sleep(1000);
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(1000);
			
			//Switch to Alert
			Alert alert=driver.switchTo().alert();
			System.out.println("Alert Text---->"+alert.getText());
			Thread.sleep(1000);
			alert.accept();   //Click on OK button
			
			Thread.sleep(1000);
			
			String parent=driver.getWindowHandle();
			System.out.println("Parent Window ID----->"+parent);
			
			Set<String>handles=driver.getWindowHandles();
			System.out.println("Size of All Window Handles--->"+handles.size());
			Iterator<String>it=handles.iterator();
			while(it.hasNext())
			{
				String child=it.next();
				if(!parent.equals(child))
				{
					driver.switchTo().window(child);
					
					driver.findElement(By.id("gsc-i-id1")).sendKeys(SrchText);
					
					driver.close();
					
				}
			}
			
			driver.switchTo().window(parent);
			String actURL=driver.getCurrentUrl();
			Assert.assertEquals(actURL, "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
			Thread.sleep(1000);
			
			
			
			
			
		}
	}
}
