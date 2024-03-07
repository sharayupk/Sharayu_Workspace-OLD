package TestUtils;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.BookUKBase;
import Pages.BookUKChapter1Page;
import Pages.BookUKChapter4Page;
import Pages.BookUKHomePage;

public class BookUKTest extends BookUKBase{
    
	BookUKHomePage homepage;
	BookUKChapter1Page chap1page;
	BookUKChapter4Page chap4page;
	
	@BeforeTest
	public void Init() throws IOException
	{
		Initialization();
		
		homepage=new BookUKHomePage();
		chap1page=new BookUKChapter1Page();
		chap4page=new BookUKChapter4Page();
	}
	
	@Test
	public void verifyHomePageTest() throws InterruptedException, IOException
	{   
		//HomePage Test
		String title=homepage.homePageTitle();
		System.out.println("Home Page Title--->"+title);
		Assert.assertEquals("Selenium: Beginners Guide", title);
		
		//Chapter 1 Text
		chap1page=homepage.clickOnChap1Link();
		
		chap1page.clickOnRadioBtn();
		
		boolean radio=chap1page.verifyRadioBtn();
		Assert.assertTrue(radio, "Radio Button not Selected");
		
		chap1page.selectValueFromDrpDown();
		Thread.sleep(1000);
		
		chap1page.clickOnAjaxBtn();
		String text=chap1page.verifyAjaxText();
		System.out.println("Ajax Text--->"+text);
		Thread.sleep(2000);
		
        homepage.clickOnHomePageLink();
		Thread.sleep(2000);
		
		//Chapter 4 Test
		chap4page=homepage.clickOnChap4Link();
		
		chap4page.enterText(prop.getProperty("text"));
		
		chap4page.enterTextInAlertInput(prop.getProperty("alerttxt"));
		
		chap4page.clickOnLoadBtn();
		
		chap4page.verifyMouseHover();
		
		
	}
	
	public BookUKTest() throws IOException 
	{
		super();
	}

}
