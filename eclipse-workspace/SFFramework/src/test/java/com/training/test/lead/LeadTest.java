package com.training.test.lead;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LeadPage;
import com.training.page.LoginPage;
import com.training.page.opportunityPage;
import com.training.utilities.CommonUtilities;

public class LeadTest extends BaseTest{
	

	Actions action;
	LoginPage loginpage;
	HomePage homepage;
	AccountPage accountpage;
	LeadPage Leadpage;
	CommonUtilities common = new CommonUtilities();
	
	@BeforeMethod
	public void beforetest() throws Exception {
		
		launchbrowser();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		accountpage = new AccountPage(driver);
		Leadpage = new LeadPage(driver);
		action = new Actions(driver);
		enterText(loginpage.username,"sandy@tekarch.com","User Name");
		enterText(loginpage.password,"kriti*10","Password");
		clickObj(loginpage.LoginButton, "Login");
		
	}
	
	

	@Test (description = "Tc-20; Lead")
	private void Lead() throws Exception {
		
	clickObj(LeadPage.LeadsLink, "New");
	driver.close();
	
	}
	

	@Test (description = "Tc-21; Lead Link")
	private void CreatOpportunity() throws Exception {
		
		clickObj(LeadPage.LeadsLink, "New");
		waitforElement(Leadpage.ClosePrompt);
		clickObj(Leadpage.ClosePrompt, "Close Prompt");
		Select dropdown = new Select(Leadpage.viewOption);
		List<WebElement> dropd = dropdown.getOptions();

		System.out.println(dropd.size());

		for (int j = 0; j < dropd.size(); j++) {
			System.out.println(dropd.get(j).getText());

		}
		driver.close();

	}
	
	
	@Test(description = "Tc-22; Lead Link")
	private void ReportView() throws Exception {

		clickObj(LeadPage.LeadsLink, "New");
		waitforElement(Leadpage.ClosePrompt);
		clickObj(Leadpage.ClosePrompt, "Close Prompt");
		clickObj(LeadPage.viewOption, "View Option");
		Select select = new Select(LeadPage.viewOption);
		select.selectByVisibleText("My Unread Leads");
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.logout, "Log out");
		driver.close();
		launchbrowser();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		accountpage = new AccountPage(driver);
		Leadpage = new LeadPage(driver);
		loginpage.enterintoUsername("sandy@tekarch.com");
		loginpage.enterintoPassword("kriti*10");
		loginpage.Login();
		clickObj(LeadPage.LeadsLink, "New");
		waitforElement(Leadpage.ClosePrompt);
		clickObj(Leadpage.ClosePrompt, "Close Prompt");
		clickObj(LeadPage.viewOption, "View Option");
		clickObj(LeadPage.GoToReport, "Go To Report");
	
	}
	

	@Test(description = "Tc-23; Todays Lead")
	private void TodaysLead() throws InterruptedException {
		
		clickObj(LeadPage.LeadsLink, "New");
		waitforElement(Leadpage.ClosePrompt);
		clickObj(Leadpage.ClosePrompt, "Close Prompt");
		clickObj(LeadPage.viewOption, "View Option");
		Select select = new Select(LeadPage.viewGo);
		select.selectByVisibleText("Today's Leads");
	}
	

	@Test(description = "Tc-24; Todays Lead")
	private void CreateNewLead() throws Exception {
		
		clickObj(LeadPage.LeadsLink, "New");
		waitforElement(Leadpage.ClosePrompt);
		clickObj(Leadpage.ClosePrompt, "Close Prompt");
		clickObj(Leadpage.NewButton, "New Button");
		enterText(LeadPage.LastName,"ABCD","Last Name");
		enterText(LeadPage.CompanyName,"ABCD","Company Name");
		clickObj(LeadPage.Save, "Save");
		
		
	}
	
	
}
