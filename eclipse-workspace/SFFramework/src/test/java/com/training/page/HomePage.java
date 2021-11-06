package com.training.page;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.training.Base.BasePage;
import com.training.Base.BaseTest;

public class HomePage extends BasePage {
	// no need to write WebDriver driver, creating null pointer exception.

	public HomePage(WebDriver driver) {

		super(driver);

	}

		public void gettitle() {
		String title = driver.getTitle();
			System.out.println(title);
	}
		
	@FindBy(xpath = "//span[contains(text(),'Sandhya Mahaseth')]")
	public WebElement UM;	
		
		
	@FindBy(xpath = "//div[@id='userNavButton']")
	public WebElement usermenu;

	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	public WebElement myprofile;
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//a[normalize-space()='My Settings']")
	public WebElement mysetting;

	@FindBy(xpath = "//a[normalize-space()='Developer Console']")
	public WebElement developerCon;

	@FindBy(xpath = "//a[@title='Switch to Lightning Experience']")
	public WebElement switchLE;

	@FindBy(xpath = "//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']")
	public WebElement editprofile;

	
	@FindBy(xpath = "//iframe[@id='contactInfoContentId']")
	public WebElement iframe;
	
	@FindBy(xpath = "//a[normalize-space()='About']")
	public WebElement about;
	

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement Firstname;
	
	
	@FindBy(xpath = "//input[@id='lastName']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@value='Save All']")
	public WebElement saveall;

	@FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
	public WebElement postIframe;

	@FindBy(id = "publisherAttachTextPost")
	public WebElement post;

	@FindBy(xpath = "//textarea[@id='publishereditablearea']")
	// @FindBy(xpath = "//body")
	public WebElement PostTextArea;

	@FindBy(xpath = "//input[@id='publishersharebutton']")
	public WebElement ShareButton;

	@FindBy(xpath = "//span[normalize-space()='File']")
	public WebElement FileLink;

	@FindBy(xpath = "//a[@id='chatterUploadFileAction']")
	public WebElement ShareFileSF;
	
	@FindBy(xpath = "//iframe[@id='chatterFindExistingContentContentId']")
	public WebElement iFrameForShareFileSF;
	

	@FindBy(xpath = "//a[normalize-space()='Upload a file from your computer']")
	public WebElement ShareFileComp;
	
	@FindBy(xpath = "//input[@id='chatterFile']")
	public WebElement chooseFile;
	
	@FindBy(xpath = "//a[@id='uploadLink']")
	public WebElement imgUpload;

	@FindBy(id = "displayBadge")
	public WebElement moderator;
	
	@FindBy(xpath = "//iframe[@id='uploadPhotoContentId']")
	public WebElement IFrameForimgUpload;

	@FindBy(id= "j_id0:uploadFileForm:uploadInputFile")
	public WebElement choosePhoto;
	
	@FindBy(id = "j_id0:uploadFileForm:uploadBtn")
	public WebElement SavePhoto;
	
	@FindBy(xpath = "//a[@title='My Settings']")
	public WebElement mysettings;

	@FindBy(xpath = "//span[@id='PersonalInfo_font']")
	public WebElement persettings;

	@FindBy(xpath = "//span[@id='LoginHistory_font']")
	public WebElement loginhistrory;
	
	
	@FindBy(xpath = "//*[@id=\\\"RelatedUserLoginHistoryList_body\\\"]/div/a")
	public WebElement LoginHistory6Months;

	@FindBy(xpath = "//span[@id='DisplayAndLayout_font']")
	public WebElement displaynLayout;

	@FindBy(xpath = "//span[@id='CustomizeTabs_font']")
	public WebElement custmytab;

	@FindBy(xpath = "//select[@id='p4']")
	public WebElement content;
	
	@FindBy(id = "duel_select_0")
	public WebElement availableTab;

	@FindBy(xpath = "//option[@value='report']")
	public WebElement optionReport;

	@FindBy(xpath = "//img[@title='Add']")
	public WebElement Add;
	

	@FindBy(xpath = "//input[@title='Save']")
	public WebElement save;
	
	
	@FindBy(xpath = "//span[@id='tsidLabel']")
	public WebElement selectTab;

	@FindBy(xpath = "//option[@value='report']") 
	public WebElement reportcheck;

	@FindBy(xpath = "//span[@id='EmailSetup_font']")
	public WebElement emailSetup;

	@FindBy(xpath = "//span[@id='EmailSettings_font']")
	public WebElement emailSetting;

	@FindBy(id = "sender_name")
	public WebElement emailSenderName;

	@FindBy(xpath = "//input[@id='sender_email']")
	public WebElement emailSenderaddress;
	
	@FindBy(id = "auto_bcc1")
	public WebElement RadioButton;
	
	@FindBy(name= "save")
	public WebElement SaveButton;
	
	//TC 7 elements
	
	@FindBy(id = "CalendarAndReminders_font")
	public WebElement calendar;
	
	@FindBy(xpath = "//span[@id='Reminders_font']")
	public WebElement reminder;
	
	@FindBy(id = "testbtn")
	public WebElement openreminder;
	
	//TC 8 elements
	
	@FindBy(linkText= "Developer Console")
	public WebElement developerConsole;
	
	
	
	@FindBy(xpath= "//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='Sandhya Mahaseth']")
	public WebElement NameLink;
	
	@FindBy(xpath= "//a[normalize-space()='Sandhya MahasethAbcd']")
	public WebElement changedName;
	
	
	//test case 35 elements
	
	
	@FindBy(xpath= "//img[@title='All Tabs']")
	public WebElement plusTab;
	
	@FindBy(xpath= "//input[@title='Customize My Tabs']")
	public WebElement Customize  ;
	
	@FindBy(xpath= "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]")
	public WebElement SelectedTab  ;
	
	@FindBy(xpath= "//option[@value='ContentSubscriptions']")
	public WebElement Subscriptions ;
	
	@FindBy(xpath= "//img[@title='Remove']")
	public WebElement Remove ;
	
	
	//test case 36 elements
	
	@FindBy(xpath= "//li[@id='home_Tab']//a[contains(text(),'Home')]")
	public WebElement HomeTab;
	
	@FindBy(xpath= "//a[normalize-space()='Sunday October 10, 2021']")
	public WebElement DateTab;
		
	@FindBy(xpath= "//a[@id='tryLexDialogX']")
	public WebElement ClosePrompt;
	
	
	@FindBy(xpath= "//a[normalize-space()='8:00 PM']")
	public WebElement Time1;
		
	
	@FindBy(xpath= "//img[@title='Subject Combo (New Window)']")
	public WebElement Subject;
		
	@FindBy(xpath= "//li[@class='listItem4']//a[1]")
	public WebElement Other;
	
	@FindBy(xpath= "//input[@id='EndDateTime_time']")
	public WebElement endTimeBox;
	
	@FindBy(xpath= "//div[@id='timePickerItem_42']")
	public WebElement endTime;
	
	@FindBy(xpath= "//td[@id='topButtonRow']//input[@title='Save']")
	public WebElement saveButton;
	
	
	//test case 37 elements
	
	@FindBy(xpath= "//a[normalize-space()='4:00 PM']")
	public WebElement Time4pm;
	
	@FindBy(xpath= "//div[@id='timePickerItem_38']")
	public WebElement endTime7pm;
	
	@FindBy(xpath= "//input[@id='IsRecurrence']")
	public WebElement Recurrence;
	
	
	@FindBy(xpath= "//input[@id='rectypeftw']")
	public WebElement weekly;
	
	@FindBy(xpath= "//input[@id='wi']")
	public WebElement RecDay;
	

	@FindBy(xpath= "//label[@for='16']")
	public WebElement  CurrentDay;
	
	@FindBy(xpath= "//input[@id='RecurrenceEndDateOnly']")
	public WebElement  EndDayBox;
	

	@FindBy(xpath= "//td[normalize-space()='24']")
	public WebElement  EndToDay;
	
	
	@FindBy(xpath= "//img[@class='monthViewIcon']")
	public WebElement  monthView;
	

}