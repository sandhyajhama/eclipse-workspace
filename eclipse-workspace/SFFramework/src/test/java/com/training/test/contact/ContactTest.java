package com.training.test.contact;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.AccountPage;
import com.training.page.ContactPage;
import com.training.page.HomePage;
import com.training.page.LeadPage;
import com.training.page.LoginPage;
import com.training.utilities.CommonUtilities;

public class ContactTest extends BaseTest {


	Actions action;
	LoginPage loginpage;
	HomePage homepage;
	AccountPage accountpage;
	LeadPage Leadpage;
	ContactPage contactpage;
	CommonUtilities common = new CommonUtilities();
	

	@BeforeMethod
	public void beforetest() throws Exception {
		
		launchbrowser();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		accountpage = new AccountPage(driver);
		Leadpage = new LeadPage(driver);
		contactpage = new ContactPage(driver);
		action = new Actions(driver);
		enterText(loginpage.username,"sandy@tekarch.com","User Name");
		enterText(loginpage.password,"kriti*10","Password");
		clickObj(loginpage.LoginButton, "Login");
		
		}
	

	@Test (description = "Tc-25; Contact Link")
	private void ContactTab() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.NewButton, "New Button");
		waitforElement(ContactPage.LastName);
		enterText(ContactPage.LastName,"Mahaseth ","Last Name");
		enterText(ContactPage.ACName,"Tek Arch ","AC Name");
		clickObj(ContactPage.Save, "Save");
	}
	
	@Test (description = "Tc-26; Create New View")
	private void CreateNewView() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.CreateNewView, "Create New View");
		
		//waitforElement(ContactPage.viewName);
		enterText(ContactPage.viewName,"ABCD ","View Name");
		clickObj(ContactPage.uniqueName, "Unique Name");
		String UniqueName = ContactPage.uniqueName.getText();
		String actualName = ContactPage.viewName.getText();
		Assert.assertEquals(actualName, UniqueName);
		System.out.println("Both name are same");
		clickObj(ContactPage.save, "Save");
		driver.close();
		
	}
	

	@Test (description = "Tc-27; RecentlyCreated")
	private void RecentlyCreated() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.recentlyCreated, "recently Created");
		Select select = new Select(ContactPage.recentlyCreated);
		select.selectByVisibleText("Recently Created");
		
		
	}
	
	

	@Test (description = "Tc-28; My Contact")
	private void MyContact() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.viewDD, "View drop down");
		Select select = new Select(ContactPage.viewDD);
		select.selectByVisibleText("My Contacts");
		
	}
	
	@Test (description = "Tc-29;  Contact Name")
	private void ContactName() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.contactName, "contact Name");
		
		
	}

	@Test (description = "Tc-30; Create Contact")
	private void CreateContact() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.CreatecontactView, "Create contact View");
		waitforElement(ContactPage.ViewUniqueName);
		enterText(ContactPage.ViewUniqueName,"EFGH","View Unique Name");
		clickObj(ContactPage.save, "Save");
		
		
		String errormsg = ContactPage.errorMsg.getText();
		String actualmsg ="Error: You must enter a value";
		validateErrormsg(actualmsg, errormsg);
	}
	
	@Test (description = "Tc-30; Cancel Contact")
	private void CancelCreateContact() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.CreatecontactView, "Create contact View");
		enterText(ContactPage.viewName,"ABCD ","View Name");
		waitforElement(ContactPage.ViewUniqueName);
		enterText(ContactPage.ViewUniqueName,"EFGH","View Unique Name");
		clickObj(ContactPage.cancel, "cancel");
	}
	
	
	@Test (description = "Tc-31; Save and New")
	private void SaveNNew() throws Exception {
		
		clickObj(ContactPage.ContactTab, "Contact Tab");
		waitforElement(ContactPage.closePrompt);
		clickObj(ContactPage.closePrompt, "Close Prompt");
		clickObj(ContactPage.NewButton, "New Button");
		enterText(ContactPage.LastName,"Indian ","Last Name");
		enterText(ContactPage.ACName,"Global Media","AC Name");
		clickObj(ContactPage.SaveNNew, "Save and New");
	}
	
}
