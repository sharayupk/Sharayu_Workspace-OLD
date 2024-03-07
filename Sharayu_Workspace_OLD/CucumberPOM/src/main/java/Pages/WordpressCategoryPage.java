package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.WordpressBase;

public class WordpressCategoryPage extends WordpressBase
{
    
	@FindBy(id="//div[text()='Posts']")
	WebElement postsTab;
	@FindBy(id="//a[text()='Categories']")
	WebElement categoryLink;
	@FindBy(id="tag-name")
	WebElement txtName;
	@FindBy(id="parent")
	WebElement drpCategory;
	@FindBy(id="tag-description")
	WebElement txtDescription;
	@FindBy(id="submit")
	WebElement submitBtn;
	
	public WordpressCategoryPage() throws IOException
	{
		PageFactory.initElements(driver,this);
	}
	
	public void mouseHoverOnPostsTab()
	{
		Actions action=new Actions(driver);
		action.moveToElement(postsTab).build().perform();
	}
	
	public void clickOnCategoryLink()
	{
		categoryLink.click();
	}
	
	public void setName(String name)
	{
		txtName.sendKeys(name);
	}
	
	public void selectCategory(String cat) 
	{
		Select sc=new Select(drpCategory);
		sc.selectByVisibleText(cat);
	}
	
	public void setDescription(String desc)
	{
		txtDescription.sendKeys(desc);
	}
	
	public void clickOnSubmitBtn()
	{
		submitBtn.click();
	}

}
