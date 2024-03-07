package NaveenAutomation;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadingRowsWithPagination 
{
	private WebDriver driver;

	private String baseUrl="http://www.espncricinfo.com/";

	@BeforeTest
	public void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(baseUrl);
	}

	//Test to display how to read html table using webdriver on cricinfo.com.  
	@Test
	public void printFacebookFriendList() throws Exception {

		//Get all the links for Scorecard. 
		WebElement box = driver.findElement(By.cssSelector("div.ciHomeTopHeadlines"));

		List <WebElement> scorecard = box.findElements(By.linkText("Scorecard"));

		//Click on the first scorecard link from News Section
		(scorecard.get(0)).click();

		//Get all the data of the table

		WebElement table =driver.findElement(By.id("inningsBat1"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		Iterator<WebElement> i = rows.iterator();

		//Print the table. 

		while(i.hasNext()) {

			WebElement row = i.next();

			List<WebElement> columns = row.findElements(By.tagName("td"));

			Iterator<WebElement> j = columns.iterator();

			while(j.hasNext()) {

				WebElement column = j.next();

				//Removing blank columns data and add a separator while displaying data.

				if (!column.getText().trim().equals("")){

					System.out.print(column.getText());
					System.out.print(" | ");

				}
			}

			System.out.println("");

			System.out.println("-----------------------------------------------");


		} 


	}




}
