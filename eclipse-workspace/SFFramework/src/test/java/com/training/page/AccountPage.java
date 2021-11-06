package com.training.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.Base.BasePage;

public class AccountPage extends BasePage {
	
	
	public AccountPage(WebDriver driver) {
		super(driver);
		
	}

		public void gettitle() {
		String title = driver.getTitle();
			System.out.println(title);
	}
	
		//elements for tc-10
		
		@FindBy(xpath= "//a[normalize-space()='Accounts']")
		public WebElement AccountTab;
		
		@FindBy(xpath= "//a[@id='tryLexDialogX']")
		public WebElement ClosePrompt;
		
		
		@FindBy(xpath= "//input[@title='New']")
		public WebElement newTab;
		
		
		@FindBy(xpath= "//a[normalize-space()='Create New View']")
		public WebElement NewViewButton;
		
		
		@FindBy(xpath= "//span[normalize-space()='Accounts']")
		public WebElement Account;
		
		@FindBy(id= "acc2")
		public WebElement AccountName;
		
		@FindBy(xpath= "//select[@id='acc6']")
		public WebElement Type;
		
		@FindBy(xpath= "//select[@id='00N5g00000Q46pE']")
		public WebElement custPriority;
		
		@FindBy(name= "save")
		public WebElement Save;
		
		@FindBy(xpath = "//span[@class='mruText']")
		public WebElement Accountlink;
		
		@FindBy(xpath = "//input[@title='View']")
		public WebElement Accountview;
		
		@FindBy(xpath = "//*[@id=\"filter_element\"]/div/span/span[2]/a[2]")
		public WebElement createNewview;
		
		
		@FindBy(xpath = "//input[@id='fname']")
		public WebElement viewName;
		
		

		@FindBy(xpath = "//input[@id='devname']")
		public WebElement DevName;
		
		
		@FindBy(xpath = "//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]")
		public WebElement DevSave;
		
		@FindBy(className = "title")
		public WebElement title;
		
		
		//elements for  TC 12
		
		
		@FindBy(xpath = "//select[@id='fcf']")
		public WebElement View;
		
		@FindBy(linkText = "Edit")
		public WebElement EditLink;
		
		@FindBy(id = "fname")
		public WebElement viewname;
		
		@FindBy(xpath = "//select[@id='fcol1']")
		public WebElement firstcolumn;
		

		@FindBy(xpath = "//select[@id='fop1']")
		public WebElement operators;
		
		@FindBy(xpath = "//input[@id='fval1']")
		public WebElement value;
		
		@FindBy(xpath = "//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
		public WebElement SaveButton;
		
		@FindBy(xpath = "//*[@id='colselector_select_0']")
		public WebElement Available_Fields_dropdown;
		
		@FindBy(xpath = "//img[@class='rightArrowIcon']")
		public WebElement Add_arrow;
		
		@FindBy(xpath = "//select[@id='colselector_select_1']")
		public WebElement Selected_Fields_dropdown_list;
		
		
		@FindBy(name = "save")
		public WebElement save;
		
		
		//Elements for tc 13
		
		@FindBy(xpath = "//a[@normalize-space()='Transfer Accounts']")
		public WebElement trfAC;
		
		
		@FindBy(xpath = "//a[text()='Merge Accounts']")
		public WebElement merge;
		
		@FindBy(xpath = "//input[@id='srch']")
		public WebElement FindAcTextBox;
		
		@FindBy(xpath = "//div[@class='pbTopButtons']//input[@title='Next']")
		public WebElement FindAccount;
		
		@FindBy(xpath = "//input[@id='cid0']")
		public WebElement Button1;
		
		@FindBy(xpath = "//input[@id='cid1']")
		public WebElement Button2;
		
		@FindBy(xpath = "//input[@id='cid2']")
		public WebElement Button3;
		
		
		@FindBy(xpath = "//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]")
		public WebElement Next;
		
		
		@FindBy(xpath = "//div[@class='pbTopButtons']//input[@title='Merge']")
		public WebElement MergeButton;
		
		
		@FindBy(xpath = "//a[normalize-space()='Accounts with last activity > 30 days']")
		public WebElement lastActivity;
		
		@FindBy(xpath = "//button[@id='ext-gen189']")
		public WebElement prompt;
		
		@FindBy(xpath = "//input[@id='ext-comp-1042']")
		public WebElement fromDate;
		
		@FindBy(xpath = "//img[@id='ext-gen152']")
		public WebElement fromcalander;
		
		//img[@class='x-form-trigger x-form-date-trigger']
		//@FindBy(xpath = "//button[@id='ext-gen277']")
		@FindBy(xpath = "//img[@class='x-form-trigger x-form-date-trigger']")
		public WebElement fromToday;
		
		
		@FindBy(xpath = "//input[@id='ext-comp-1045']")
		public WebElement ToTextBox;
		
		
		@FindBy(xpath = "//img[@id='ext-gen154']")
		public WebElement ToCalander;
		
		@FindBy(xpath = "//button[@id='ext-gen290']")
		public WebElement ToToday;
		
		
		@FindBy(xpath = "//button[@id='ext-gen49']")
		public WebElement ButtonSave;
		
		
		@FindBy(xpath = "//div[@id='ext-gen333']")
		public WebElement ReportWindow;
		
		
		@FindBy(xpath = "//input[@id='saveReportDlg_reportNameField']")
		public WebElement ReportName;
		
		@FindBy(xpath = "//input[@id='saveReportDlg_DeveloperName']")
		public WebElement UniqueName;
		
		
		@FindBy(xpath = "//button[@id='ext-gen310']")
		public WebElement RunReport;
		
		
		
		
		
}
