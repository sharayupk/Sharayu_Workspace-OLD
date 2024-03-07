package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.FreeCRMBase;

public class FreeCRMHomePage extends FreeCRMBase
{
    @FindBy(xpath="//span[text()='Sudipa Das']")
    WebElement usernameLabel;
    
    @FindBy(xpath="//span[text()='Contacts']")
    WebElement contactsLink;
    
    @FindBy(xpath="//span[text()='Deals']")
    WebElement dealsLink;
    
    public FreeCRMHomePage() throws IOException
    {
    	PageFactory.initElements(driver, this);
    }
    
    public String homePageTitle()
    {
    	return driver.getTitle();
    }
    
    public boolean verifyUsernameLabel()
    {
    	return usernameLabel.isDisplayed();
    }
    
    public FreeCRMContactsPage clickOnContactsLink() throws IOException
    {
    	contactsLink.click();
		return new FreeCRMContactsPage();
		
    }
    
//    public void clickOnDealsLink()
//    {
//    	dealsLink.click();
//    }

	
}
