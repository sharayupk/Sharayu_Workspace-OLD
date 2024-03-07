package StepDefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillingSteps 
{   
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	@Given("^user is on billing page$")
	public void user_is_on_billing_page() 
    {
	    System.out.println("user is on billing page");
	}

	@When("^user enters biling amount (\\d+)$")
	public void user_enters_biling_amount(double billingAmount) 
    {
	    this.billingAmount=billingAmount;
	}

	@When("^user enters tax amount (\\d+)$")
	public void user_enters_tax_amount(double taxAmount)  
	{
	    this.taxAmount=taxAmount;
	}
	
	/*@When("^user enters tax amount (\\d+)\\.(\\d+)$")
	public void user_enters_tax_amount(int arg1, int arg2) throws Throwable {
	}*/

	@When("^user clicks on calculate button$")
	public void user_clicks_on_calculate_button() 
    {
	    System.out.println("user clicks on calculate button");
	}

	@Then("^it gives final amount (\\d+)$")
	public void it_gives_final_amount(double expfinalAmount) 
	{
	    this.finalAmount=this.billingAmount+this.taxAmount;
	    System.out.println("Expected Final Amount====>"+expfinalAmount);
	    System.out.println("Actual Final Amount====>"+this.finalAmount);
	    
	    Assert.assertTrue(expfinalAmount==this.finalAmount);
	    
	}

	/*@Then("^it gives final amount (\\d+)\\.(\\d+)$")
	public void it_gives_final_amount(int arg1, int arg2) throws Throwable {
	    
	}*/
}
