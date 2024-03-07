package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.OrangeHRMBase;

public class OrangeHRMHomePage extends OrangeHRMBase
{
	@FindBy(xpath="//a[text()='Welcome Admin']")
    WebElement adminText;
    
    @FindBy(id="menu_admin_viewAdminModule")
    WebElement adminLink;
    
    @FindBy(id="menu_admin_UserManagement")
    WebElement userMgmtLink;
    
    @FindBy(id="menu_admin_viewSystemUsers")
    WebElement usersLink;
    
    @FindBy(name="btnAdd")
    WebElement addBtn;
    
	public OrangeHRMHomePage() throws IOException 
	{
        PageFactory.initElements(driver, this);
    }
	
	public String getAdminText()
    {
    	return adminText.getText();
	}
    
    public String getURLOfHomePage()
    {
    	return driver.getCurrentUrl();
    }
     
    public void HoverOnAdminLink()
    {   
    	Actions action =new Actions(driver);
    	action.moveToElement(adminLink).build().perform();
    }
    
    public void HoverOnUserMgmtLink()
    {   
    	Actions action =new Actions(driver);
    	action.moveToElement(userMgmtLink).build().perform();
    }
    
    public void clickOnUsersLink()
    {
    	usersLink.click();
    }
    
    public OrangeHRMUserPage clickOnAddBtn() throws IOException
    {
    	addBtn.click();
    	
    	return new OrangeHRMUserPage();
    }
    
    


}
