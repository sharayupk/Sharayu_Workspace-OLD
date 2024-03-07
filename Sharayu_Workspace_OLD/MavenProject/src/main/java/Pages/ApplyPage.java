package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplyPage 
{
	
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class='input has-default_value']")
	WebElement applyDropDown;
	
	@FindBy(id="talent_create_applicant_email")
	WebElement email;
	
	@FindBy(id="talent_create_applicant_password")
	WebElement password;
	
	@FindBy(id="talent_create_applicant_password_confirmation")
	WebElement conpassword;
	
	@FindBy(name="talent_create_applicant[full_name]")
	WebElement fullname;
	
	@FindBy(xpath="//*[@id='new_talent_create_applicant']/section/div/div[1]/fieldset/div[7]/label/span")
	WebElement acceptBox;
	
	@FindBy(name="commit")
	WebElement joinToptalBtn;
	
	public ApplyPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
    public void selectApplyPosition(String position)
	{
		applyDropDown.click();
		applyDropDown.sendKeys(position);
		applyDropDown.sendKeys(Keys.ENTER);
	}
	
	public void enterEmail(String emailid)
	{
		email.sendKeys(emailid);
	}
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void enterConPassword(String conpass)
	{
		conpassword.sendKeys(conpass);
	}
	
	public void enterFullName(String fn)
	{
		fullname.sendKeys(fn);
	}
	
	public void clickOnAccept()
	{
		acceptBox.click();
	}
	
	public void clickOnJoinToptalBtn()
	{
		joinToptalBtn.click();
	}
	
	
	
	
	

}
