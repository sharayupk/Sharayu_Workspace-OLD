package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BaseTest.MyStoreBase;

public class MyStoreSearchProdPage extends MyStoreBase
{
     public MyStoreSearchProdPage() throws IOException 
     {
    	 PageFactory.initElements(driver,this);
     }
     
     @FindBy(how=How.LINK_TEXT,using="Women")
     WebElement linkWomen;
     @FindBy(how=How.LINK_TEXT,using="T-shirts")
     WebElement linkTshirts;
     @FindBy(how=How.LINK_TEXT,using="Faded Short Sleeve T-shirts")
     WebElement linkTshirtsText;
     @FindBy(id="search_query_top")
     WebElement searchBox;
     @FindBy(name="submit_search")
     WebElement btnSearch;
     
     public void mouseHoverOnWomenLink()
     {
    	 Actions act=new Actions(driver);
    	 act.moveToElement(linkWomen).build().perform();
     }
     public void clickOnTshirtsLink()
     {
    	 linkTshirts.click();
     }
     public String getTextOfTshirts()
     {
    	 return linkTshirtsText.getText();
     }
     public void enterTextInSearchBox(String txt)
     {
    	 searchBox.sendKeys(txt);
     }
     public MyStoreBuyProductPage clickOnsearchbtn() throws IOException
     {
    	 btnSearch.click();
    	 return new MyStoreBuyProductPage();
     }
     
     
}
