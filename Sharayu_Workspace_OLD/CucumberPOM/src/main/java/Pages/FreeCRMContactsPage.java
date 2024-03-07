package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.FreeCRMBase;

public class FreeCRMContactsPage extends FreeCRMBase
{

	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/a/button")
    WebElement addNewBtn;
    
	@FindBy(name="first_name")
    WebElement firstname;
    
	@FindBy(name="last_name")
    WebElement lastname;
	
	@FindBy(name="value")
    WebElement email;
	
	@FindBy(xpath="//*[@id='dashboard-toolbar']/div[2]/div/button[2]/i")
    WebElement saveBtn;
	
	public FreeCRMContactsPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnNewBtn()
	{
		addNewBtn.click();
	}
	
	public void setFirstLastName(String fn,String ln)
	{
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void clickOnSaveBtn()
	{
		saveBtn.click();
	}
	
}
