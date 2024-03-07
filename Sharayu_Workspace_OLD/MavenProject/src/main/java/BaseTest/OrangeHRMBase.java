package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import TestUtils.OrangeHRMUtils;

public class OrangeHRMBase 
{
    public static Properties prop;
    public static WebDriver driver;
    
    public OrangeHRMBase() throws IOException
    {
    	prop=new Properties();
    	FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Configuration\\orangehrm.properties");
    	prop.load(fis);
    }
    
    public static void Initialization()
    {
    	String url=prop.getProperty("URL");
    	String br=prop.getProperty("browser");
    	String driverpath=prop.getProperty("path");
    	
    	if(br.equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", driverpath);
    		driver=new ChromeDriver();
    		
    	}
    	else if(br.equals("firefox"))
    	{
    		System.setProperty("webdriver.firefox.marionette", driverpath);
    		driver=new FirefoxDriver();
    	}
    	
    	driver.get(url);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(OrangeHRMUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(OrangeHRMUtils.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
    	
    }

}
