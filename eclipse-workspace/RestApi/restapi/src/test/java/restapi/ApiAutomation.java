package restapi;

import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiAutomation {
	
	String sHostURL = "https://us-central1-qa01-tekarch-accmanager.cloudfunctions.net";
	String sEPLogin = "/login";
	String sEPGetData = "/getdata";
	String sURI ="";
	String sToken ="";
	Response response;
	
	@Test
	public void validateLogin() {
		sURI=sHostURL + sEPLogin;
		RestAssured.baseURI =  sURI;
		Response response=RestAssured.given().body("{\"username\": \"mithun@ta.com\", \"password\": \"mithun\"}").when().contentType("application/json").post();
		
		System.out.println(response.statusCode());
		response.prettyPrint();
		sToken= response.jsonPath().get("token[0]");
		System.out.println("Token Parsed"+sToken);
	
	}
	
	@Test
	public void validateGetData() {
		
		sURI=sHostURL + sEPLogin;
		RestAssured.baseURI =  sURI;
		response=RestAssured.given().body("{\"username\": \"mithun@ta.com\", \"password\": \"mithun\"}").when().contentType("application/json").post();
		
		System.out.println(response.statusCode());
		response.prettyPrint();
		sToken= response.jsonPath().get("token[0]");
		
		sURI=sHostURL + sEPGetData;
		RestAssured.baseURI =  sURI;
		HashMap<String, String> headerData = new HashMap();
		headerData.put("token", sToken);
		response = RestAssured.given().headers(headerData).when().contentType("application/json").get();
		//response.prettyPrint();
		List<String> listId= response.jsonPath().getList("id");
		System.out.println("Size of the List"+listId.size());
		
		
		
		for(String s: listId) {
			if(s.equals("KUlQ9Yq2pu2UqMvlr46C")) {
				System.out.println("Id os present" +s);
			}else {
				System.out.println("Id not present");
				break;
			}
			
		}
	}
	
	
	
	
	

}
