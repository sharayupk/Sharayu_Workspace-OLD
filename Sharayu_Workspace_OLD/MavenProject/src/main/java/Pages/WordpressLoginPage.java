package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WordpressLoginPage 
{

	private WebDriver driver;
	
	public WordpressLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(id="user_pass")
	WebElement password;
	
	@FindBy(id="wp-submit")
	WebElement loginBtn;
	
	public void setUsername(String userid)
	{
		username.sendKeys(userid);
	}

	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}

	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}

	
	
	
}
