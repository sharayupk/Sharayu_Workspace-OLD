package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{

    public static Properties prop;
	public static WebDriver driver;
	
	public TestBase() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Configuration\\config.properties");
		prop.load(fis);
	}
	
	public static void SetUp()
	{
		String br=prop.getProperty("browser");
		String url=prop.getProperty("URL");
		String path=prop.getProperty("chromepath");
		Long implicit=Long.parseLong(prop.getProperty("IMPLICIT_WAIT"));
		Long pageload=Long.parseLong(prop.getProperty("PAGE_LOAD_TIME_OUT"));
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(pageload, TimeUnit.SECONDS);
		
		
	}
	
	
	
}
