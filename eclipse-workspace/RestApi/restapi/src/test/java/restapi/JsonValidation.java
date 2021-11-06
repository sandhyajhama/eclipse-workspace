package restapi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.hamcrest.Matcher;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

/*
 * Number: 
 * equalTo
 * greaterThan
 * greaterThanorEqualTo
 * lessThan
 * lessthanorEqualTo
 * 
 *  String:
 *  equalTo
 *  equalToIgnoringCase
 *  equalToIgnoreWhitespace
 *  ContainsString
 *  startsWith
 *  endsWith
 *  
 *   
 *   Collections:
 *   hasItems
 *   hasItem
 *   hasKey
 *   hadValue
 *   hasEntry
 *   empty
 * 
 * 
 * 
 */


public class JsonValidation {
	
	String sHostURL = "https://jsonplaceholder.typicode.com";
	String sEPUsers = "/users";
	String sURI ="";
	
	@Test
	public void validate() {
		sURI = sHostURL+sEPUsers;
		RestAssured.baseURI=sURI;
		Response response = RestAssured.given().get();
		System.out.println(response.jsonPath().get("name[0]"));
	
		
	}
	
	@Test
	public void verifyTestData() throws IOException {
		sURI = sHostURL+sEPUsers;
		RestAssured.baseURI=sURI;
		
		String filePath = System.getProperty("user.dir") + File.separator+"resources"+File.separator+"testData"+File.separator+"Test.json";
		String fileReadytoRead =  readfileReturnString(filePath);
		String Expectedname= JsonPath.read(fileReadytoRead, "$.[0].name");
		Response response = RestAssured.given().get();
		String ActualName = response.jsonPath().get("name[0]");
		Assert.assertEquals(ActualName,Expectedname );
		String Expectedlat= JsonPath.read(fileReadytoRead, "$.[0].address.geo.lat");

		
		if(response.statusCode()==200) {
			RestAssured.given().get().then().body("address[0].geo.lat",equalTo(Expectedlat));
			RestAssured.given().get().then().body("name[0]", startsWith("L"));
			RestAssured.given().get().then().body("address.city", hasItems("Gwenborough","South Elvis"));
			
			
		}
		
	}
	
	public static String readfileReturnString(String filePath) throws IOException {
		
		byte[] encoded = Files.readAllBytes(Paths.get(filePath));
		return new String(encoded,StandardCharsets.UTF_8);
		
		
	}

}
