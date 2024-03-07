package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.TSRTCBase;
import Pages.TSRTCResultsPage;
import Pages.TSRTCSearchPage;

public class TSRTCResultsPageTest extends TSRTCBase
{

	TSRTCSearchPage searchpage;
	TSRTCResultsPage resultspage;
	
	public TSRTCResultsPageTest() throws IOException 
	{
		super();
    }
	
	@BeforeTest
	public void Init() throws IOException, InterruptedException
	{
		Initialization();
		
		searchpage=new TSRTCSearchPage();
		resultspage=new TSRTCResultsPage();
		
	    Thread.sleep(1000);
		searchpage.verifyFromLocation(prop.getProperty("fromLocation"), prop.getProperty("actFromLocation"));
		
		Thread.sleep(2000);
		searchpage.verifyToLocation(prop.getProperty("toLocation"), prop.getProperty("actToLocation"));
		
		Thread.sleep(2000);
		searchpage.clickOnDate();
		
		Thread.sleep(2000);
		searchpage.clickOnSearchBtn();
	}
	
	@Test
	public void validateResultsPage() throws InterruptedException
	{
		resultspage.displayBuses();
		
		Thread.sleep(2000);
		boolean flag;
		flag=resultspage.getServices("1010");
		if(flag==true)
		{
		    Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	

}
