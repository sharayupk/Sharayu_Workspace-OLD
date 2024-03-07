package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.TestBase;
import Pages.ApplyPage;
import Pages.HomePage;

public class ApplyTest extends TestBase
{
	HomePage homepage;
    ApplyPage applypage;
    
	public ApplyTest() throws IOException
    {
		super();
    }

	@BeforeTest
	   public void Init()
	{
		SetUp();
		
		
	}
	
	
	@Test
	public void applyAsDeveloper() throws InterruptedException
	{   
		//Create object of HomePage
		homepage=new HomePage(driver);
		
		//Validate Homepage Title
		String title=homepage.homePageTitle();
		Assert.assertTrue(true,title);
		
		//Click on "Apply As Freelancer Link"
		homepage.clickOnApplyButton();
		
		//Create object of ApplyPage
		applypage=new ApplyPage(driver);
		
		//Select "Developer" as Option
		applypage.selectApplyPosition(prop.getProperty("applyPosition"));
		Thread.sleep(1000);
		
		//Enter Email
		applypage.enterEmail(prop.getProperty("email"));
		Thread.sleep(1000);
		
		//Enter Password
		applypage.enterPassword(prop.getProperty("password"));
		Thread.sleep(1000);
		
		//Enter Confirm Password
		applypage.enterConPassword("conpassword");
		Thread.sleep(1000);
		
		//Enter Full Name
		applypage.enterFullName(prop.getProperty("name"));
		Thread.sleep(1000);
		
		//Click on Accept Box
		applypage.clickOnAccept();
		Thread.sleep(1000);
		
		//Click on Jion Toptal Button
		applypage.clickOnJoinToptalBtn();
		
		
		
		
	}
	
	}
	       

