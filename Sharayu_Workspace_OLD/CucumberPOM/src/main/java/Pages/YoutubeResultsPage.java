package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.YoutubeBase;

public class YoutubeResultsPage extends YoutubeBase
{
    WebDriver driver;
    
    @FindBy(id="text")
    public WebElement textLink;
    
    public YoutubeResultsPage(WebDriver driver) throws IOException
    {
  	  this.driver=driver;
  	  PageFactory.initElements(driver,this);
    }
    
    public void clickOnTextLink()
    {
    	textLink.click();
    }
}
