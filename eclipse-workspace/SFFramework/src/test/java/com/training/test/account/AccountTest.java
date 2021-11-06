package com.training.test.account;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class AccountTest extends BaseTest {

	
	Actions action;
	LoginPage loginpage;
	HomePage homepage;
	AccountPage accountpage;
	CommonUtilities common = new CommonUtilities();
	

	@BeforeMethod
	public void beforetest() throws Exception {
		
		launchbrowser();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		accountpage = new AccountPage(driver);
		action = new Actions(driver);
		enterText(loginpage.username,"sandy@tekarch.com","User Name");
		enterText(loginpage.password,"kriti*10","Password");
		clickObj(loginpage.LoginButton, "Login");
		
	}
	

	@Test (description = "Tc-10; Create Account")
	private void AccountCreate() throws Exception {

		clickObj(accountpage.AccountTab, "Account Tab");
		
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(accountpage.newTab, "New Tab");
		
		waitforElement(accountpage.AccountName);
		enterText(accountpage.AccountName,"Second Accounts","Account Name");
		
        Select select = new Select(accountpage.Type);
		select.selectByVisibleText("Technology Partner");
		Select select1 = new Select(accountpage.custPriority);
		select1.selectByVisibleText("High");
		clickObj(accountpage.Save, "Save");
		System.out.println("Clicked on Save button..");
		System.out.println("Tc_10_create account is completed");
		

	}
	

	@Test (description = "Tc-11; Create ac view")
	private void Accounview() throws Exception {

		clickObj(accountpage.AccountTab, "Account Tab");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(accountpage.createNewview, "Create New View");
		
		waitforElement(accountpage.viewName);
		clear(accountpage.viewName);
		enterText(accountpage.viewName,"sandy","View Name");
		String value = accountpage.viewName.getAttribute("value");
		System.out.println(value);
		clear(accountpage.DevName);
		enterText(accountpage.DevName,"SandyJhama","Dev Name");
		clickObj(accountpage.DevSave, "Save");
		System.out.println("Clicked on save button"); 
		
		waitforElement(accountpage.title);
		clickObj(accountpage.title, "Title");
		
		Select dropdown_options = new Select(accountpage.title);
		List<WebElement> options = dropdown_options.getOptions();
		
		for(int i=0; i<options.size(); i++) {
			if(options.get(i).getText().equals(value)) {
				System.out.println("Account name is displayed in the dropdown");
			}
		}
		System.out.println("TC_11_Createnewview is completed");
		driver.close();
	}
	
	

	@Test (description = "Tc-12; View Accounts")
	private void AccountView() throws Exception {

		clickObj(accountpage.AccountTab, "Account Tab");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(accountpage.View, "View");
		Select dropdown_options = new Select(accountpage.View);
		dropdown_options.selectByVisibleText("My Accounts");
		clickObj(accountpage.EditLink, "EditLink");
		clear(accountpage.viewname);
		enterText(accountpage.viewname, "Sandhya", "View Name");
		clickObj(accountpage.firstcolumn, "first column");
		Select select = new Select(accountpage.firstcolumn);
		select.selectByIndex(1);
		clickObj(accountpage.operators, "Contains");
		Select type = new Select(accountpage.operators);
		type.selectByVisibleText("contains");
		enterText(accountpage.value, "a", "Value");

		Select Available_Fields_dropdown_list = new Select(accountpage.Available_Fields_dropdown);
		List<WebElement> Available_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();

		boolean Element_available = false;
		for (int i = 0; i < Available_Fields_dropdown_options.size(); i++) {
			if (Available_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
				Element_available = true;
				clickObj(accountpage.Add_arrow, "Add arrow");
				break;
			}
		}

		/*
		 * These statements verifies if the "Last Activity" is availble in the Selected
		 * Fields If Last Activity is available under Selected Fields, save the
		 * modifications
		 */
		if (Element_available = false) {

			Select Selected_Fields_dropdown_list = new Select(accountpage.Available_Fields_dropdown);
			List<WebElement> Selected_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();

			for (int i = 0; i < Available_Fields_dropdown_options.size(); i++) {
				if (Selected_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
					break;
				}
			}
		}

		clickObj(accountpage.save, "Save");
		driver.close();
		System.out.println("TC12Accounts_Edit_view is completed");

	}
		
	
	@Test (description = "Tc-13; Merge Accounts")
	private void Accountmerge() throws Exception {

		clickObj(accountpage.AccountTab, "Account Tab");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		waitforElement(accountpage.merge);
		clickObj(accountpage.merge, "Merge Account ");
		waitforElement(accountpage.FindAcTextBox);
		enterText(accountpage.FindAcTextBox,"Second","Account Name");
		clickObj(accountpage.FindAccount, "FindA ccount ");
		//waitforElement(accountpage.Button1);
		Radiobutton(accountpage.Button1, "RadioButton");
		Radiobutton(accountpage.Button2, "RadioButton");
		Radiobutton(accountpage.Button3, "RadioButton");
		clickObj(accountpage.Next, "Next");
		clickObj(accountpage.MergeButton, "Murge");
	    switchtoAlert(driver);	
	    driver.close();
	    System.out.println("TC13 MergeAccounts is completed");
		}
		
	

	@Test (description = "Tc-14;Create Account Report")
	private void AccountLastActivity() throws Exception {
		clickObj(accountpage.AccountTab, "Account Tab");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		
		waitforElement(accountpage.lastActivity);
		clickObj(accountpage.lastActivity, "last Activity");
		waitforElement(accountpage.fromDate);
		clickObj(accountpage.fromDate, "from Date");
		waitforElement(accountpage.fromDate);
		clickObj(accountpage.fromcalander, "from calander");
		waitforElement(accountpage.fromToday);
		clickObj(accountpage.fromToday, "from Today");
		
		clickObj(accountpage.ToTextBox, " To Text Box");
		clickObj(accountpage.ToCalander, "To Calander");
		waitforElement(accountpage.ToToday);
		clickObj(accountpage.ToToday, "To Today");
		clickObj(accountpage.ButtonSave, "Save Button");
		clear(accountpage.ReportName);
		enterText(accountpage.ReportName,"Sandhya","Report Name");
		enterText(accountpage.UniqueName,"Sandhya","Unique Name");
		clickObj(accountpage.RunReport, "Run Report");
		driver.close();
		}
	
	}

	
	
	
	
	
	
	
	

