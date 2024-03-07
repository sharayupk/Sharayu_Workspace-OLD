package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseTest.MyStoreBase;

public class MyStoreBuyProductPage extends MyStoreBase
{
      public MyStoreBuyProductPage() throws IOException 
      {
    	  PageFactory.initElements(driver,this);
      }
      
      @FindBy(linkText="More")
      WebElement btnMore;
      @FindBy(xpath="//*[@id='quantity_wanted_p']/a[2]/span/i")
      WebElement btnAdd;
      @FindBy(id="group_1")
      WebElement drpSize;
      @FindBy(id="color_14")
      WebElement btnColor;
      @FindBy(xpath="//*[@id='add_to_cart']/button/span")
      WebElement btnAddToCart;
      @FindBy(xpath="//*[@id='layer_cart']/div[1]/div[2]/div[4]/a/span")
      WebElement btnCheckOut;
      @FindBy(xpath="//*[@id='center_column']/p[2]/a[1]/span")
      WebElement btnCheckOutSummary;
      @FindBy(xpath="//*[@id='center_column']/form/p/button/span")
      WebElement btnCheckOutAddr;
      @FindBy(id="cgv")
      WebElement btnAgree;
      @FindBy(xpath="//*[@id='form']/p/button/span")
      WebElement btnCheckOutShipping;
      @FindBy(id="total_price")
      WebElement totalPrice;
      
      public void clickOnMoreBtn()
      {
    	  btnMore.click();
      }
      public void clickOnAddBtn()
      {
    	  btnAdd.click();      
      }
      public void selectSize(String size)
      {
    	  Select sc=new Select(drpSize);
    	  sc.selectByVisibleText(size);
      }
      public void clickOnColorBtn()
      {
    	  btnColor.click();
      }
      public void clickOnAddToCartBtn()
      {
    	  btnAddToCart.click();
      }
      public void clickOnCheckOutBtn()
      {
    	  btnCheckOut.click();
      }
      public void clickOnCheckOutSummaryBtn()
      {
    	  btnCheckOutSummary.click();
      }
      public void clickOnCheckOutAddrBtn()
      {
    	  btnCheckOutAddr.click();
      }
      public void clickOnAgreeBtn()
      {
    	  btnAgree.click();
      }
      public void clickOnCheckOutShippingBtn()
      {
    	  btnCheckOutShipping.click();
      }
      public String validateTotalPrice()
      {
    	  return totalPrice.getText();
      }
}

