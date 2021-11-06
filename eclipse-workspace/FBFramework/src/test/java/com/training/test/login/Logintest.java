package com.training.test.login;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class Logintest extends BaseTest {

	WebDriver driver;
	CommonUtilities common = new CommonUtilities();
	
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void beforetest() throws FileNotFoundException {
		
		driver = getDriver();
		String url = common.getApplicationProperty("url");
		driver.get(url);
	
		loginpage = new LoginPage(driver);
		
	}
		@Test
		
	private void validatelogin() throws FileNotFoundException  {
			
			
			loginpage.enterintoUsername();
			
			loginpage.enterintoPassword() ;
			
			loginpage.Login();
		
	}
}
