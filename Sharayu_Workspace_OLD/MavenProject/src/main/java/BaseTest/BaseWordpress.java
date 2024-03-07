package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseWordpress
{
    public static WebDriver driver;
    public static Properties prop;
	public BaseWordpress() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream(".\\src\\main\\java\\Configuration\\confwordpress.properties");
		prop.load(fis);
	}
	
	public void SetUp()
	{
		String url=prop.getProperty("URL");
		String browser=prop.getProperty("browsername");
		Long implicit=Long.parseLong(prop.getProperty("IMPLICIT_WAIT"));
		Long pageload=Long.parseLong(prop.getProperty("PAGE_LOAD_TIMEOUT"));
		String path=prop.getProperty("chromepath");
		
		if(browser.equals("chrome"))
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
