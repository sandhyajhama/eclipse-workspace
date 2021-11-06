package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.Base.BasePage;

public class opportunityPage extends BasePage {

	public opportunityPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath= "//a[@title='Opportunities Tab']")
	public WebElement Opportunity;
	
	@FindBy(xpath= "//select[@id='fcf']")
	public WebElement dd;
	
	
	//elements for case 16
	
	@FindBy(xpath= "//input[@title='New']")
	public WebElement oppNew;
	
	
	@FindBy(xpath= "//input[@id='opp3']")
	public WebElement oppName;
	
	@FindBy(xpath= "//input[@id='opp4']")
	public WebElement oppAC;
	
	@FindBy(xpath= "//input[@id='opp9']")
	public WebElement closeDate;
	
	@FindBy(xpath= "//input[@id='opp12']")
	public WebElement Probablity;
	
	@FindBy(xpath= "//select[@id='opp11']")
	public WebElement Stage;
	
	@FindBy(xpath= "//select[@id='opp6']")
	public WebElement LeadSource;
	
	@FindBy(xpath= "//input[@id='opp17']")
	public WebElement PrimaryCom;
	
	@FindBy(xpath= "//a[normalize-space()='Opportunity Pipeline']")
	public WebElement Oppipeline;
	
	
	@FindBy(xpath= "//a[normalize-space()='Stuck Opportunities']")
	public WebElement StuckOp;
	
	@FindBy(xpath= "//h3[normalize-space()='Quarterly Summary']")
	public WebElement QS;
	
	@FindBy(xpath= "//select[@id='quarter_q']")
	public WebElement interval;
	
	
	@FindBy(xpath= "//select[@id='open']")
	public WebElement include;
	
	@FindBy(xpath= "//input[@title='Run Report']")
	public WebElement Run;
	
	
}
