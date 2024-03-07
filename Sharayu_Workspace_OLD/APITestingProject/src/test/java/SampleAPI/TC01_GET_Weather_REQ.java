package SampleAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC01_GET_Weather_REQ 
{
	@Test
	public void getWeatherReqDetails()
	{
	//Specify Base URI
	RestAssured.baseURI="https://reqres.in/api/users?page=2";

	//Request Object
	RequestSpecification httpRequest=RestAssured.given();

	//Response Object
	Response response=httpRequest.request(Method.GET);

	//Print Response in Console Window
	String responseBody=response.getBody().asString();
	System.out.println("Response is=====>"+responseBody);
}
}
