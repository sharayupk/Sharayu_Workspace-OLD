package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WordpressAddUserPage 
{

private WebDriver driver;
	
	public WordpressAddUserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	WebElement unName;
	
	@FindBy(id="user_login")
	WebElement email;
	
	@FindBy(id="user_login")
	WebElement fName;
	
	@FindBy(id="user_login")
	WebElement lName;
	
	@FindBy(id="user_login")
	WebElement website;
	
	@FindBy(id="user_login")
	WebElement pass;
	
	@FindBy(id="pass1-text")
	WebElement passText;
	
	@FindBy(xpath="//*[@id='createuser']/table/tbody/tr[6]/td/div/button[1]/span[2]")
	WebElement showHideBtn;
	
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement cancelBtn;
	
	@FindBy(id="role")
	WebElement role;
	
	@FindBy(id="createusersub")
	WebElement addNewUserBtn;
	
	public String userPageTitle()
	{
		return driver.getTitle();
	}
	
	public void setUnName(String un)
	{
		unName.sendKeys(un);
		unName.sendKeys(Keys.CONTROL+"t");
	}
	
	public void setEmail(String emailid)
	{
		email.sendKeys(emailid);
		email.sendKeys(Keys.CONTROL+"t");
	}
	
	public void setFirstName(String fn)
	{
		fName.sendKeys(fn);
		fName.sendKeys(Keys.CONTROL+"t");
	}
	
	public void setLastName(String ln)
	{
		lName.sendKeys(ln);
		lName.sendKeys(Keys.CONTROL+"t");
	}
	
	public void setWebsite(String web)
	{
		website.sendKeys(web);
		website.sendKeys(Keys.CONTROL+"t");
	}

	public void clickOnPasswordBtn()
	{
		pass.click();
	}
	
	public void setPasswordText(String pstext)
	{
		passText.clear();
		passText.sendKeys(pstext);
	}
	
	public void clickOnShowHideBtn()
	{
		showHideBtn.click();
	}
	
	public void clickOnCancelBtn()
	{
		cancelBtn.click();
	}
	
	public void selectRole(String roledrp)
	{
		Select sc=new Select(role);
	    sc.selectByVisibleText(roledrp);
	}
	
	public void clickOnAddNewUserBtn()
	{
		addNewUserBtn.click();
	}
	
}
