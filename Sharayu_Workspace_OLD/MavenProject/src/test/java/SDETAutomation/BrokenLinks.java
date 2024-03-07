package SDETAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrokenLinks 
{
@Test
public void getLinks() throws IOException, InterruptedException
{
	System.setProperty("webdriver.firefox.marionette","D:\\Sharayu_Workspace\\MavenProject\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://demo.guru99.com/test/newtours/");
	
	//get no of links
	List<WebElement>links=driver.findElements(By.tagName("a"));
	int linkSize=links.size();
	System.out.println("Total no. of Links---->"+linkSize);
	
	for(int i=0;i<linkSize;i++)
	{
		WebElement ele=links.get(i);
		String url=ele.getAttribute("href");
		
		URL u=new URL(url);
		
		//Create connection using URL object 'u'
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		
		Thread.sleep(2000);
		//Establish connection
		con.connect();
		
		int rescode=con.getResponseCode();
		
		if(rescode>=400)
		{
			System.out.println(url + " - " + "is broken link");
		}
		else
		{
			System.out.println(url + " - " + "is valid link");
		}
	}
	
}
}
