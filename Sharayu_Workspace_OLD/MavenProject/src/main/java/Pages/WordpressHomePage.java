package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WordpressHomePage 

{

private WebDriver driver;
	
	public WordpressHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Users']")
	WebElement usersTab;
	
	@FindBy(xpath="//*[@id='menu-users']/ul/li[3]/a")
	WebElement usersLink;
	
	public String homePageTitle()
	{
		return driver.getTitle();
	}
	
	public void mouseHoverOnUsers()
	{
		Actions action=new Actions(driver);
		action.moveToElement(usersTab).build().perform();
	}
	
	public void clickOnUserLink()
	{
		usersLink.click();
	}
	
	
	
}
