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

public class FreeCRMHomePageTest extends FreeCRMBase
{  
	public FreeCRMHomePageTest() throws IOException 
	{
		super();
		
	}

	FreeCRMLoginPage loginpage;
	FreeCRMHomePage homepage;
	FreeCRMContactsPage contactspage;

	@Given("^user launches browser$")
	public void user_launches_browser() 
	{
		FreeCRMBase.Initialization();
	}

	@Given("^validates login page title$")
	public void validates_login_page_title() throws IOException  
	{
	    loginpage=new FreeCRMLoginPage();
	    String loginPageTitle=loginpage.loginPageTitle();
	    System.out.println("Login Page Title--->"+loginPageTitle);
	    Assert.assertEquals("Cogmento CRM", loginPageTitle);
	}

	@When("^user logs into the application$")
	public void user_logs_into_the_application() throws IOException  
	{
	    homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	    
	}

	@Then("^verifies home page title$")
	public void verifies_home_page_title() throws IOException 
	{
	    homepage=new FreeCRMHomePage();
	    String homePageTitle=homepage.homePageTitle();
	    System.out.println("Home Page Title--->"+homePageTitle);
	    Assert.assertEquals("Cogmento CRM", homePageTitle);
	}

	@Then("^checks if username is displayed$")
	public void checks_if_username_is_displayed()  
	{
	    boolean flag=homepage.verifyUsernameLabel();
	    Assert.assertTrue(flag);
	}

	@Then("^user clicks on contacts link$")
	public void user_clicks_on_contacts_link() throws IOException  
	{
	    contactspage=homepage.clickOnContactsLink();
	}
}
