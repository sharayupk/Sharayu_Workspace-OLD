package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    
	private WebDriver driver;
	@FindBy(linkText="Apply as a Freelancer")
	WebElement applyButton;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnApplyButton()
	{
		applyButton.click();
	}
	
	public String homePageTitle()
	{
		return driver.getTitle();
		
	}
}
