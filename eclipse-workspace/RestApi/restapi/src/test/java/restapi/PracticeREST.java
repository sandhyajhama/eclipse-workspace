package restapi;

import static org.hamcrest.Matchers.equalToIgnoringCase;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class PracticeREST {
	

	String sHostURL = "https://jsonplaceholder.typicode.com";
	String sEPUsers = "/users/actuator";
	String sURI ="";
	
	@Test
	public void validate() {
		sURI = sHostURL+sEPUsers;
		RestAssured.baseURI=sURI;
		Response response = RestAssured.given().get();
		
		String contentType = response.header("Content-Type");
		System.out.println("Content-Type value: " + contentType);
		// Reader header of a give name. In this line we will get
		// Header named Server
		String serverType =  response.header("Server");
		System.out.println("Server value: " + serverType);
		String expectedServerType="application/Json";
		
		/*
		 * if select request body format as JSON then Postman will add automatically a
		 * header named “Content-Type” with value as “application/json“. This does not
		 * happen automatically in Rest Assured and you may get an unexpected response
		 * as a server may not identify the format of payload.
		 */
		
		assertThat(serverType, equalToIgnoringCase(expectedServerType));
		System.out.println(response.getSessionId());
		
		// Getting Response type
		System.out.println(response.getTime());
		System.out.println(response.getCookies());
		System.out.println(response.getHeader(contentType));
		
		
		// Getting ValidatableResponse type
				ValidatableResponse valRes = response.then();
				// Asserting response time is less than 2000 milliseconds
				// L just represent long. It is in millisecond by default.
				valRes.time(Matchers.lessThan(2000L));
				// Asserting response time is greater than 2000 milliseconds
				valRes.time(Matchers.greaterThan(2000L));
				// Asserting response time in between some values
				valRes.time(Matchers.both(Matchers.greaterThanOrEqualTo(2000L)).and(Matchers.lessThanOrEqualTo(1000L)));
		 
				// If we want to assert in different time units
				valRes.time(Matchers.lessThan(2L), TimeUnit.SECONDS);
				
		
	}

	private void assertThat(String serverType, Matcher<String> equalToIgnoringCase) {
		
		
	}

}
