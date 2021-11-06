package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.Base.BasePage;

public class LeadPage extends BasePage {

	public LeadPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath= "//a[@title='Leads Tab']")
	public static WebElement LeadsLink;
	
	@FindBy(xpath= "//a[@id='tryLexDialogX']")
	public static WebElement ClosePrompt;
	
	@FindBy(xpath= "//a[@title='Leads Tab']")
	public WebElement Leads;
	
	@FindBy(xpath= "//div//select[@id='hotlist_mode']")
	public static WebElement viewOption;
	
	@FindBy(xpath= "//a[normalize-space()='Go to Reports']")
	public static WebElement GoToReport;
	
	@FindBy(xpath= "//select[@id='fcf']")
	public static WebElement viewGo;
	
	
	@FindBy(xpath= "//input[@title='New']")
	public static WebElement NewButton;
	
	@FindBy(xpath= "//input[@id='name_lastlea2']")
	public static WebElement LastName;
	
	@FindBy(xpath= "//input[@id='lea3']")
	public static WebElement CompanyName;
	
	@FindBy(xpath= "//td[@id='topButtonRow']//input[@title='Save']")
	public static WebElement Save;
	
}
