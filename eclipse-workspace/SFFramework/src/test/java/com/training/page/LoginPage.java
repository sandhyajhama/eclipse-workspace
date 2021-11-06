package com.training.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class LoginPage extends BasePage{

													//no need to write WebDriver driver, creating null pointer exception.
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	
	public WebElement username = driver.findElement(By.xpath( "//input[@id=\"username\"]"));
	public void enterintoUsername(String strUname) throws InterruptedException {
		waitforElement(username);
		username.sendKeys(strUname);
	}
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement clearpwd;
	public void clearPassword() throws InterruptedException {
		waitforElement(password);
		 password.clear();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Forgot Your Password?']")
	WebElement forgotpwd;
	public void forgotPassword() throws InterruptedException {
		waitforElement(forgotpwd);
		forgotpwd.click();
	}
	
	@FindBy(xpath = "//input[@id='un']")
	WebElement resetId;
	public void reset(String str) throws InterruptedException {
		waitforElement(resetId);
		resetId.sendKeys(str);
	}
	
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	
	public WebElement password;

	public void enterintoPassword(String strpwd) throws InterruptedException {
		waitforElement(password);
		 password.sendKeys(strpwd);
	}
	
	@FindBy(xpath = "//label[normalize-space()=\"Remember me\"]")
	WebElement rememberme;

	public void RememberMe() throws InterruptedException {
		waitforElement(rememberme);
		rememberme.click();
	}
	@FindBy(id = "Login")
	
	public WebElement LoginButton;

	public void Login() {
		 waitforClickableElement(LoginButton);
		 LoginButton.click();
	}
	
	
	
	
	
	
	
	
}
