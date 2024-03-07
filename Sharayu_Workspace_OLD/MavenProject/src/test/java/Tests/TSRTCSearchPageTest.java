package Tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.TSRTCBase;
import Pages.TSRTCResultsPage;
import Pages.TSRTCSearchPage;
import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class TSRTCSearchPageTest extends TSRTCBase{
    
	TSRTCSearchPage searchpage;
	TSRTCResultsPage resultspage;
	
	public TSRTCSearchPageTest() throws IOException 
	{
		super();
    }
	
	@BeforeTest
	public void Init() throws IOException
	{
		Initialization();
		
		searchpage=new TSRTCSearchPage();
	}
	
	@Test
	public void validateSearchPage() throws InterruptedException, IOException
	{   
		Thread.sleep(1000);
		searchpage.verifyFromLocation(prop.getProperty("fromLocation"), prop.getProperty("actFromLocation"));
		
		Thread.sleep(2000);
		searchpage.verifyToLocation(prop.getProperty("toLocation"), prop.getProperty("actToLocation"));
		
		Thread.sleep(2000);
		searchpage.clickOnDate();
		
		Thread.sleep(2000);
		resultspage=searchpage.clickOnSearchBtn();
	}
	
	

}
