package com.training.test.login;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;


public class LoginTest extends BaseTest{
	
	CommonUtilities common = new CommonUtilities();
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void beforetest() throws IOException {
		
		launchbrowser();
	
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		
	}

	/*
	 * @AfterMethod public void teardown() throws IOException {
	 * 
	 * driver.close(); }
	 */
	@Test
	
	private void validateloginbyclearpwd() throws FileNotFoundException, InterruptedException  {
		
		try {
			String username = common.getApplicationProperty("Uname");
			loginpage.enterintoUsername(username);
			loginpage.clearPassword();
			loginpage.Login();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	@Test
	public void validatelogin() throws FileNotFoundException, InterruptedException  {
		
		try {
			String username = common.getApplicationProperty("Uname");
			loginpage.enterintoUsername(username);
			String password = common.getApplicationProperty("pwd");
			loginpage.enterintoPassword(password) ;
			loginpage.Login();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@Test
	
	private void validateForgotpwd() throws FileNotFoundException, InterruptedException  {
		
		try {
			String username = common.getApplicationProperty("Uname");
			loginpage.enterintoUsername(username);
			loginpage.RememberMe();
			loginpage.forgotPassword();
			loginpage.reset(username);
			Thread.sleep(5000);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		@Test
		
	private void validateloginforrememberme() throws FileNotFoundException, InterruptedException  {
			
			try {
				String username = common.getApplicationProperty("Uname");
				loginpage.enterintoUsername(username);
				
				String password = common.getApplicationProperty("pwd");
				loginpage.enterintoPassword(password) ;
				
				loginpage.RememberMe();
				
				loginpage.Login();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	

		@Test
			
		private void validateInvalidId() throws FileNotFoundException, InterruptedException  {
				
				try {
					
					loginpage.enterintoUsername("123");
					
					String password = common.getApplicationProperty("pwd");
					loginpage.enterintoPassword(password) ;
					loginpage.Login();
					Thread.sleep(5000);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}
}


