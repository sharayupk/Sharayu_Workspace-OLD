package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.FreeCRMBase;

public class FreeCRMHomePage extends FreeCRMBase
{
    @FindBy(xpath="//span[contains(text(),'Sudipa Das')]")
    WebElement loggedUserName;
    @FindBy(xpath="//*[@id=\"main-nav\"]/a[3]")
    WebElement contactsLink;
    
	public FreeCRMHomePage() throws IOException 
	{
		PageFactory.initElements(driver,this);
	}
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateUserLoggedIn()
	{
		return loggedUserName.isDisplayed();
	}
	
	public FreeCRMContactsPage clickOnContactsLink() throws IOException
	{
		contactsLink.click();
		
		return new FreeCRMContactsPage();
	}
	 
	

}
