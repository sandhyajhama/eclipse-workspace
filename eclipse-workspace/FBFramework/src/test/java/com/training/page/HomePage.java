package com.training.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.training.Base.BasePage;

public class HomePage extends BasePage {
	

     public HomePage(WebDriver driver) {
    	
		super(driver);
		
	}
     
     @FindBy(id = "name")
 	 WebElement FirstName;
     
     
     
 	public void enterIntoFirstName(String sfname) throws InterruptedException {
 		Thread.sleep(1000);
 	
 	waitforElement(FirstName);
 	FirstName.sendKeys("Sandhya");
 	
 	}
}
