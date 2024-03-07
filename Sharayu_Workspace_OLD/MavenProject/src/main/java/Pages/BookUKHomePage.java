package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BookUKBase;

public class BookUKHomePage extends BookUKBase
{
	@FindBy(linkText="Chapter1")
	WebElement chap1Link;

	@FindBy(linkText="Chapter4")
	WebElement chap4Link;

	@FindBy(linkText="Home Page")
	WebElement homePageLink;

	public BookUKHomePage() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}

	public String homePageTitle()
	{
		return driver.getTitle();
	}

	public BookUKChapter1Page clickOnChap1Link() 
	{ 	
		try 
		{
			chap1Link.click();
			return new BookUKChapter1Page();
		}
		catch (Exception e) 
		{
            e.printStackTrace();
		}
		return null;
	}

	public void clickOnHomePageLink()
	{
		homePageLink.click();
	}

	public BookUKChapter4Page clickOnChap4Link() throws IOException
	{
		chap4Link.click();
		return new BookUKChapter4Page();
	}

}
