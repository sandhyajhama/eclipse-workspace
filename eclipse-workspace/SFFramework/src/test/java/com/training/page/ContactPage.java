package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.Base.BasePage;

public class ContactPage extends BasePage{

	public ContactPage(WebDriver driver) {
		
		super(driver);
		
	}

	@FindBy(xpath= "//a[@title='Contacts Tab']")
	public static WebElement ContactTab;
	
	@FindBy(xpath= "//a[@id='tryLexDialogX']")
	public static WebElement closePrompt;
	
	
	@FindBy(xpath= "//input[@title='New']")
	public static WebElement NewButton;
	
	
	@FindBy(id= "name_firstcon2")
	public static WebElement FirsName;
	
	@FindBy(xpath= "//input[@id='name_lastcon2']")
	public static WebElement LastName;
	
	@FindBy(xpath= "//input[@id='con4']")
	public static WebElement ACName;
	
	
	@FindBy(xpath= "//td[@id='topButtonRow']//input[@title='Save']")
	public static WebElement Save;

	@FindBy(xpath= "//a[normalize-space()='Create New View']")
	public static WebElement CreateNewView;
	
	@FindBy(xpath= "//input[@id='fname']")
	public static WebElement viewName;
	
	@FindBy(xpath= "//input[@id='devname']")
	public static WebElement uniqueName;
	

	@FindBy(xpath= "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	public static WebElement save;
	

	@FindBy(xpath= "//select[@id='hotlist_mode']")
	public static WebElement recentlyCreated;
	

	@FindBy(xpath= "//select[@id='fcf']")
	public static WebElement viewDD;
	
	@FindBy(xpath= "//a[normalize-space()='Gonzalez, Rose']")
	public static WebElement contactName;
	
	@FindBy(xpath= "//a[normalize-space()='Create New View']")
	public static WebElement CreatecontactView;
	
	@FindBy(xpath= "//input[@id='devname']")
	public static WebElement ViewUniqueName;
	
	@FindBy(xpath= "//div[@class='requiredInput']//div[@class='errorMsg']")
	public static WebElement errorMsg;
	
	@FindBy(xpath= "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]")
	public static WebElement cancel;
	
	@FindBy(xpath= "//td[@id='topButtonRow']//input[@title='Save & New']")
	public static WebElement SaveNNew;
	

}
