package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.BookUKBase;

public class BookUKChapter1Page extends BookUKBase
{

	@FindBy(id="radiobutton")
	WebElement radioBtn;
	
	@FindBy(id="selecttype")
	WebElement dropDown;
	
	@FindBy(id="secondajaxbutton")
	WebElement ajaxBtn;
	
	@FindBy(id="html5div")
	WebElement verifyAjaxText;
	
	@FindBy(linkText="Home Page")
    WebElement homePageLink;
    
	
	public BookUKChapter1Page() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnRadioBtn()
	{
		radioBtn.click();
	}
	
	public boolean verifyRadioBtn() 
	{
		return radioBtn.isSelected();
	}
	
	public void selectValueFromDrpDown()
	{
		Select sc=new Select(dropDown);
		sc.selectByIndex(1);
	}
	
	public void clickOnAjaxBtn()
	{
		ajaxBtn.click();
	}
	
	public String verifyAjaxText()
	{
		return verifyAjaxText.getText();
	}
	
	public BookUKHomePage clickOnHomePageLink() throws IOException
	{
		homePageLink.click();
		
		return new BookUKHomePage();
	}

	
}
