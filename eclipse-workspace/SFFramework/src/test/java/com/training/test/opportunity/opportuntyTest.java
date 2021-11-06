package com.training.test.opportunity;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.AccountPage;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.page.opportunityPage;
import com.training.utilities.CommonUtilities;

public class opportuntyTest extends BaseTest {

	Actions action;
	LoginPage loginpage;
	HomePage homepage;
	AccountPage accountpage;
	opportunityPage oppage;
	CommonUtilities common = new CommonUtilities();
	

	@BeforeMethod
	public void beforetest() throws Exception {
		
		launchbrowser();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		accountpage = new AccountPage(driver);
		oppage = new opportunityPage(driver);
		action = new Actions(driver);
		enterText(loginpage.username,"sandy@tekarch.com","User Name");
		enterText(loginpage.password,"kriti*10","Password");
		clickObj(loginpage.LoginButton, "Login");
		
	}
	
	
	@Test (description = "Tc-15; Opportunity drop down")
	private void OpportunityTest() throws Exception {

		clickObj(oppage.Opportunity, "Opportunity");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		
		Select dropdown = new Select(oppage.dd);

	    List<WebElement> dropd = dropdown.getOptions();

	    System.out.println(dropd.size());

	    for (int j = 0; j < dropd.size(); j++) {
	        System.out.println(dropd.get(j).getText());

	    }
	   
	    System.out.println("TC_15_opportunitiesdropdown is completed");
	}
	
	@Test (description = "Tc-16; Creat Opportunity")
	private void CreatOpportunity() throws Exception {
		
		clickObj(oppage.Opportunity, "Opportunity");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(oppage.oppNew, "New");
		enterText(oppage.oppName,"Automation","Opp Name");
		enterText(oppage.oppAC,"New Opportunity","Opp AC Name");
		enterText(oppage.closeDate,"10-01-2021","Close Date");
		enterText(oppage.Stage,"Closed won","Stage");
		enterText(oppage.Probablity,"100%","Probability");
		enterText(oppage.LeadSource,"other","Lead Source");
	}
	

	@Test (description = "Tc-17; Opportunity PipeLine")
	private void OpportunityPipeLine() throws InterruptedException {
		

		clickObj(oppage.Opportunity, "Opportunity");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(oppage.Oppipeline, "Op pipeline");
		
	}
	

	@Test (description = "Tc-18; Stuck Opportunity PipeLine")
	private void StuckOpportunity() throws InterruptedException {
		

		clickObj(oppage.Opportunity, "Opportunity");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(oppage.StuckOp, "Stuck opportunity");
		
	}
	

	@Test (description = "Tc-19; Quaterly summary")
	private void QuaterlySummary() throws Exception {
		

		clickObj(oppage.Opportunity, "Opportunity");
		waitforElement(accountpage.ClosePrompt);
		clickObj(accountpage.ClosePrompt, "Close Button");
		clickObj(oppage.QS, "Quaterly Summary");
		selectByVisibleText(oppage.interval,"Next FQ");
		selectByVisibleText(oppage.include,"Open Opportunities");
		clickObj(oppage.Run, "Run Summary");
		
	}
	

}
