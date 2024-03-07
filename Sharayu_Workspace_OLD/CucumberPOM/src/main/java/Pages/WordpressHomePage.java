package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WordpressBase;

public class WordpressHomePage extends WordpressBase
{
	@FindBy(xpath="//*[@id='wp-admin-bar-my-account']/a")
	WebElement userLoggedIn;
	
	public WordpressHomePage() throws IOException 
	{
		PageFactory.initElements(driver,this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public WordpressCategoryPage verifyUserLoggedIn() throws IOException 	
	{
		boolean flag=userLoggedIn.isDisplayed();
		return new WordpressCategoryPage();
	}

}
