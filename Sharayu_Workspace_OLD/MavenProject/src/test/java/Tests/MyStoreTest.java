package Tests;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseTest.MyStoreBase;
import Pages.MyStoreBuyProductPage;
import Pages.MyStoreRegisterPage;
import Pages.MyStoreSearchProdPage;

public class MyStoreTest extends MyStoreBase
{   
	MyStoreRegisterPage reg;
	MyStoreSearchProdPage search;
	MyStoreBuyProductPage buy;

	public MyStoreTest() throws IOException 
	{
		super();
	}

	@BeforeTest
	public void Init()
	{
		SetUp();
	}

	@Test
	public void test1() throws InterruptedException, IOException, NumberFormatException
	{
		//Create Object of MyStoreRegisterPage
		reg=new MyStoreRegisterPage();

		reg.clickOnSigin();
		//Scroll Down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,30)");
		Thread.sleep(1000);

		reg.enterEmail(prop.getProperty("email"));
		reg.clickOnSubmit();

		Thread.sleep(1000);
		reg.clickOnRadioBtn();
		reg.enterFirstname(prop.getProperty("firstname"));

		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);

		reg.enterLastname(prop.getProperty("lastname"));
		reg.enterPassword(prop.getProperty("password"));
		reg.selectDay(prop.getProperty("day"));
		reg.selectMonth(prop.getProperty("month"));
		reg.selectYear(prop.getProperty("year"));
		reg.enterAddress(prop.getProperty("address"));

		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);

		reg.enterCity(prop.getProperty("city"));
		reg.selectState(prop.getProperty("state"));
		reg.enterZipcode(prop.getProperty("zipcode"));
		reg.selectCountry(prop.getProperty("country"));
		reg.enterPhone(prop.getProperty("phone"));
		reg.clickOnRegister();
		Thread.sleep(2000);

		//Create Object of MyStoreSearchProdPage
		search=new MyStoreSearchProdPage();

		//Scroll Down the page
		js.executeScript("scroll(0,-250)");
		Thread.sleep(1000);
		search.mouseHoverOnWomenLink();
		Thread.sleep(1000);
		search.clickOnTshirtsLink();

		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);

		String actTshirtText=search.getTextOfTshirts();
		Assert.assertEquals(actTshirtText,"Faded Short Sleeve T-shirts");

		//Scroll Up the page
		js.executeScript("scroll(0,-100)");
		Thread.sleep(1000);

		search.enterTextInSearchBox(prop.getProperty("searchText"));
		search.clickOnsearchbtn();
		Thread.sleep(1000);

		//Create Object of MyStoreBuyProductPage
		buy=new MyStoreBuyProductPage();

		buy.clickOnAddBtn();
		buy.selectSize(prop.getProperty("size"));
		buy.clickOnColorBtn();
		buy.clickOnAddToCartBtn();
		buy.clickOnCheckOutBtn();

		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);

		buy.clickOnCheckOutSummaryBtn();
		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);
		buy.clickOnCheckOutAddrBtn();
		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);
		buy.clickOnAgreeBtn();
		Thread.sleep(1000);
		buy.clickOnCheckOutShippingBtn();
		Thread.sleep(1000);

		//Scroll Down the page
		js.executeScript("scroll(0,100)");
		Thread.sleep(1000);		
		String actPrice=buy.validateTotalPrice();

		Assert.assertEquals(Double.parseDouble(actPrice),"$35.02");
		Thread.sleep(1000);



	}


}
