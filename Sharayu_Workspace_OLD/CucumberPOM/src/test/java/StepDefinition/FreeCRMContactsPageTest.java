package StepDefinition;

import java.io.IOException;


import Pages.FreeCRMContactsPage;
import Pages.FreeCRMHomePage;
import Pages.FreeCRMLoginPage;
import TestBase.FreeCRMBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FreeCRMContactsPageTest extends FreeCRMBase
{
	public FreeCRMContactsPageTest() throws IOException
	{
		super();
	}

	FreeCRMLoginPage loginpage;
	FreeCRMHomePage homepage;
	FreeCRMContactsPage contactspage;

	@Given("^browser is launched$")
	public void browser_is_launched() 
	{
		FreeCRMBase.Initialization();
	}

	@Given("^user validates login page title$")
	public void user_validates_login_page_title() throws IOException  
	{
		loginpage=new FreeCRMLoginPage();
		String loginPageTitle=loginpage.loginPageTitle();
		System.out.println("Login Page Title--->"+loginPageTitle);
		Assert.assertEquals("Cogmento CRM", loginPageTitle);
	}


	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws IOException 
	{
		homepage=loginpage.login(username, password);
		homepage=new FreeCRMHomePage();
		
	}
	
	@Then("^user clicked on contacts link$")
	public void user_clicked_on_contacts_link() throws IOException, InterruptedException  
	{   
		Thread.sleep(2000);
	    contactspage=homepage.clickOnContactsLink();
	    
	}

    @Then("^clicks on new button$")
	public void clicks_on_new_button() throws InterruptedException, IOException  
	{    
    	 contactspage=new FreeCRMContactsPage();
    	 Thread.sleep(5000);
         contactspage.clickOnNewBtn();
	}

	@Then("^enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enters_firstname_and_lastname(String fn, String ln) throws InterruptedException 
	{    
		 Thread.sleep(2000);
         contactspage.setFirstLastName(fn, ln);
	}

	@Then("^\"([^\"]*)\" is entered$")
	public void email_is_entered(String em) throws InterruptedException 
	{    
		 Thread.sleep(2000);
         contactspage.setEmail(em);;
	}
	
	@Then("^clicks on save button$")
	public void clicks_on_save_button() throws InterruptedException  
	{    
		 Thread.sleep(2000);
         contactspage.clickOnSaveBtn();
	}
}
