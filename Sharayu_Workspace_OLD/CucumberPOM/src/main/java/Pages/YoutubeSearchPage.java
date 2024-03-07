package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.YoutubeBase;

public class YoutubeSearchPage extends YoutubeBase
{
      WebDriver driver;
      
      @FindBy(id="search")
      public WebElement txtSearch;
      
      @FindBy(id="search-icon-legacy")
      public WebElement btnSearch;
      
      public YoutubeSearchPage(WebDriver driver) throws IOException
      {
    	  this.driver=driver;
    	  PageFactory.initElements(driver,this);
      }
      
      public void navigateToResultsPage(String srchtxt) throws InterruptedException
      {   
    	  Thread.sleep(2000);
    	  txtSearch.sendKeys(srchtxt);
    	  btnSearch.click();
      }
}
