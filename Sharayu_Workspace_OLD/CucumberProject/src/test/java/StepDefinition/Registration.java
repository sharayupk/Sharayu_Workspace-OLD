package StepDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration {

	@Given("^user is on registration page$")
	public void user_is_on_registration_page()  
	{
		System.out.println("user is on registration page");
	}

	@When("^user enter following details$")
	public void user_enter_following_details(DataTable table)  
	{
		List<Map<String,String>> userList=table.asMaps(String.class, String.class);
		
		System.out.println(userList);
		/*for(Map<String,String> e:userList)
		{
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("email"));
			System.out.println(e.get("phone"));
			System.out.println(e.get("city"));
		}*/
	}
	
     @Then("^user is registered successfully$")
     public void user_is_registered_successfully() 
     {
        System.out.println("user is registered successfully");
     }
}
