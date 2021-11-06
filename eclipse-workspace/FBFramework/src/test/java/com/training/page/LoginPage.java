package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.Base.BasePage;

public class LoginPage extends BasePage{

	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	
	@FindBy(xpath = "//input[@id=\\\"username\\\"]")
	WebElement username;

	
	public void enterintoUsername() {
		waitforElement(username);
		username.sendKeys("sandy@tekarch.com");
	}
	
	@FindBy(xpath = "//input[@id=\"password\"]")
	WebElement password;

	public void enterintoPassword() {
		waitforElement(password);
		 password.sendKeys("kriti*10");
	}
	
	@FindBy(id = "Login")
	WebElement LoginButton;

	public void Login() {
		waitforClickableElement(LoginButton);
		 LoginButton.click();
	}
}
