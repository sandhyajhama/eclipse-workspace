package com.training.test.home;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.HomePage;
import com.training.page.LoginPage;
import com.training.test.login.LoginTest;
import com.training.utilities.CommonUtilities;




 public class HomeTest extends BaseTest {
	Action action;
	LoginPage loginpage;
	HomePage homepage;
	CommonUtilities common = new CommonUtilities();
	

	@BeforeMethod
	public void beforetest() throws IOException, InterruptedException {
		
		launchbrowser();
		loginpage = new LoginPage(driver);
		homepage = new HomePage(driver);
		loginpage.enterintoUsername("sandy@tekarch.com");
		loginpage.enterintoPassword("kriti*10") ;
		loginpage.Login();
		
	}
	/*
	 * @AfterMethod public void teardown() { driver.quit(); }
	 */
	
	
	@Test(description = "Tc-05;Display user menu")
		private void Displayusermenu() throws FileNotFoundException, InterruptedException  {
		
		clickObj(homepage.UM, "UserMenu");
		
		Select dropdown = new Select(homepage.UM);

	    List<WebElement> dropDown = dropdown.getOptions();

	    System.out.println(dropDown.size());

	    for (int i = 0; i < dropDown.size(); i++) {
	        System.out.println(dropDown.get(i).getText());

	    }
	   
	    System.out.println("TC_05_ is completed");
	
		
		
		
		
		
		
	
	}
	
	@Test(description = "Tc-06;select My Profile from user menu")
	private void validateusermenu() throws FileNotFoundException, InterruptedException  {
		
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.myprofile, "My Profile");
		
	}

	@Test(description = "Tc-06;edit last name and save all.")
	private void editabout() throws Exception  {
		
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.myprofile, "My Profile");
		waitforElement(homepage.post);
		clickObj(homepage.editprofile, "Edit Profile");
		switchFrame(driver, homepage.iframe);
		clickObj(homepage.about, "About");
		enterText(homepage.lastname,"Mahaseth","Last Name");
		clickObj(homepage.saveall, "Save All");
	}
	
	@Test (description = "Tc-06;edit post.")
	private void Post() throws Exception  {
		
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.myprofile, "My Profile");
		waitforElement(homepage.post);
		clickObj(homepage.post, "Post");
		switchFrame(driver, homepage.postIframe);
		clickObj(homepage.PostTextArea, "Post Text Area");
		enterText(homepage.PostTextArea,"It's difficult but not impossible","Post Area");
		driver.switchTo().defaultContent();
		clickObj(homepage.ShareButton, "Share Button");
	}
	
	@Test (description = "Tc-06; upload file.")
	private void UploadFile() throws Exception  {
		
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.myprofile, "My Profile");
		waitforElement(homepage.FileLink);
		clickObj(homepage.FileLink, "File Link");
		clickObj(homepage.ShareFileSF, "UploadFile");
		System.out.println("clicked on uploadfile button on computer");
		Thread.sleep(3000);
		enterText(homepage.chooseFile, "/Users/kaushalmahaseth/Documents/Q41.txt","file path ");
		System.out.println("choosefile option is selected");
		clickObj(homepage.ShareButton, "Share Button");

		}
	
	@Test (description = "Tc-06; upload profile photo.")
	private void Uploadphoto() throws Exception{
		
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.myprofile, "My Profile");
		Thread.sleep(3000);
		mouseOver(driver, homepage.moderator);
		clickObj(homepage.imgUpload, "Add Photo link");
		switchFrame(driver, homepage.IFrameForimgUpload);
		//clickObj(homepage.choosePhoto, "Choose Photo");
		enterText(homepage.choosePhoto, "/Users/kaushalmahaseth/Documents/pic.jpeg","choose image ");
		System.out.println("image upload option is selected");
		clickObj(homepage.SavePhoto, "Save Photo");

		}
	
	
	
	@Test (description = "Tc-07; Login History Download")
	private void MySetting() throws Exception{
		
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.mysettings, "My Setting");
		waitforElement(homepage.persettings);
		clickObj(homepage.persettings, "Personal");
		clickObj(homepage.loginhistrory, "Login History");
		}
	
	
	@Test (description = "Tc-07; Display and LayOut")
	private void DisplayNLayout() throws Exception{
	
		clickObj(homepage.usermenu, "UserMenu");
		clickObj(homepage.mysettings, "My Setting");
		waitforElement(homepage.persettings);
		clickObj(homepage.displaynLayout, "Display and Layout.");
		clickObj(homepage.custmytab, "Customize Tab");
		waitforElement(homepage.content);
		clickObj(homepage.content, "Content");
		Select dropdownOptions = new Select(homepage.content); 
		dropdownOptions.selectByVisibleText("Salesforce Chatter");
		waitforElement(homepage.availableTab);
		dropdownOptions = new Select(homepage.availableTab); 
		dropdownOptions.selectByVisibleText("Reports");
		clickObj(homepage.Add, "option Add");
		clickObj(homepage.save, "Save");
		
		dropdownOptions = new Select(homepage.selectTab); 
		dropdownOptions.selectByVisibleText("Salesforce Chatter");
		
		List<WebElement> elements = dropdownOptions.getOptions();
		for(int i=0; i<elements.size(); i++) {
		  if(elements.get(i).getText().equals("Reports")) {
			  System.out.println("Reports Tab is added"); 
			  } 
		  else 
		  {
			  System.out.println("Reports Tab is  not added"); }
		  }
		
	}
	
	
		@Test (description = "Tc-07 continued; Email setting")
		private void EmailSetting() throws Exception {
			
		
			clickObj(homepage.usermenu, "UserMenu");
			clickObj(homepage.mysettings, "My Setting");
			waitforElement(homepage.emailSetup);
			clickObj(homepage.emailSetup, "Email");
			clickObj(homepage.emailSetting, "Email Setting");
			waitforElement(homepage.emailSenderName);
			clear(homepage.emailSenderName);
			enterText(homepage.emailSenderName,"Sandhya Mahaseth","Sender Name");
			clear(homepage.emailSenderaddress);
			enterText(homepage.emailSenderaddress,"sandhya.mahaseth@gmail.com","Sender address");
			
			Radiobutton(homepage.RadioButton, "Radio Button");
			waitforElement(homepage.SaveButton);
			clickObj(homepage.SaveButton, "SaveButton");
		}
		
		
		
		@Test(description = "Tc-07 continued; Calander")
		private void CalanderNReminder() throws Exception {

			clickObj(homepage.usermenu, "UserMenu");
			clickObj(homepage.mysettings, "My Setting");
			waitforElement(homepage.calendar);
			clickObj(homepage.calendar, "Calendar");
			clickObj(homepage.reminder, "Reminder");
			waitforElement(homepage.openreminder);
			clickObj(homepage.openreminder, "Open Reminder");

			String parentWindow = driver.getWindowHandle();
			for (String handle : driver.getWindowHandles()) {
				if (handle != parentWindow) {
					driver.switchTo().window(handle);
					String expectedUrl1 = driver.getCurrentUrl();
					String actualUrl1 = "https://tekarch65-dev-ed.my.salesforce.com/ui/core/activity/ActivityReminderPage?at=1633385997892&test=1";

					if (actualUrl1.equalsIgnoreCase(expectedUrl1)) {
						System.out.println("MySettings page is not Lunched");
					} else {
						System.out.println("User is on MySettings page");
					}
				}
			}
			driver.close();
			System.out.println("Tc_7_SelectMySettings is completed");
		}
		
		@Test(description = "Tc-08; Developer Console")
		private void DeveloperConsole() throws Exception {

			clickObj(homepage.usermenu, "UserMenu");
			clickObj(homepage.developerConsole, "Developer Console");

			Set<String> getAllWindows = driver.getWindowHandles();
			String[] window = getAllWindows.toArray(new String[getAllWindows.size()]);
			driver.switchTo().window(window[1]).close();
			System.out.println("TC_8_Selectdeveloperconsole completed");
		}
		
		
		@Test(description = "Tc-09; LogOut")
		private void Logout() throws Exception {

			clickObj(homepage.usermenu, "UserMenu");
			clickObj(homepage.logout, "Log out");

			String expectedUrl1 = driver.getCurrentUrl();
			String actualUrl1 = "https://login.salesforce.com/";

			if (actualUrl1.equalsIgnoreCase(expectedUrl1)) {
				System.out.println("User is not in login page");
			} else {
				System.out.println("User is on login page");
			}
			driver.close();

		}
		
		
		//************************Random Scenario***********************\\
		
		

		@Test (description = "Tc-33; Misc")
		private void Misc1() throws Exception {

			clickObj(homepage.UM, "UserMenu");
			String name = homepage.UM.getText();
			String actual = "Sandhya Mahaset";
			System.out.println(name);
			if(name.equalsIgnoreCase(actual))
				System.out.println("Both are same, test pass.");
			}
			
		
		
		
		@Test (description = "Tc-34; Misc")
		private void Misc2() throws Exception {
			clickObj(homepage.usermenu, "UserMenu");
			clickObj(homepage.myprofile, "My Profile");
			//clickObj(homepage.NameLink, "Name Link");
			waitforElement(homepage.post);
			clickObj(homepage.editprofile, "Edit Profile");
			switchFrame(driver, homepage.iframe);
			clickObj(homepage.about, "About");
			
			enterText(homepage.lastname,"Abcd","Last Name");
			clickObj(homepage.saveall, "Save All");
			clickObj(homepage.changedName, "changed Name");
			String UMname = homepage.UM.getText();
			String name = homepage.changedName.getText();
			String actual = "Sandhya MahasetAbcd";
			if (actual.equalsIgnoreCase(name) && actual.equalsIgnoreCase(UMname))
				System.out.println("profile name changed successfully");
			
		}
		
		
		
		
		@Test (description = "Tc-35; Misc")
		private void CustmizeTab() throws Exception {
			
			
			clickObj(homepage.plusTab, "plus Tab");
			waitforElement(homepage.Customize);
			clickObj(homepage.Customize, "Customize");
			waitforElement(homepage.Subscriptions);
			clickObj(homepage.Subscriptions, "Subscriptions");
			clickObj(homepage.Remove, "Remove");
			clickObj(homepage.save, "Save");
			clickObj(homepage.usermenu, "User Menu");
			clickObj(homepage.logout, "Log out");
			launchbrowser();
			loginpage = new LoginPage(driver);
			homepage = new HomePage(driver);
			loginpage.enterintoUsername("sandy@tekarch.com");
			loginpage.enterintoPassword("kriti*10") ;
			loginpage.Login();
			
		}
		
		
		
		
		@Test (description = "Tc-36; Misc")
		private void Date() throws Exception {
			waitforElement(homepage.HomeTab);
			clickObj(homepage.HomeTab, "Home Tab");
			waitforElement(homepage.DateTab);
			clickObj(homepage.DateTab, "Date Tab");
			waitforElement(homepage.Time4pm);
			
			clickObj(homepage.Time4pm, "Time 4pm");
			waitforElement(homepage.ClosePrompt);
			clickObj(homepage.ClosePrompt, "Close Prompt");
			clickObj(homepage.Subject, "Subject");
			
			Set<String> windowHandles = driver.getWindowHandles();
			String currentHandle = driver.getWindowHandle();
			windowHandles.remove(currentHandle);
			String newHandle = windowHandles.iterator().next();
			driver.switchTo().window(newHandle);
			clickObj(homepage.Other, "Other");
			driver.switchTo().window(currentHandle);
			
			clickObj(homepage.endTimeBox, "endTimeBox");
			clickObj(homepage.endTime, "endTime7pm");
			clickObj(homepage.saveButton, "saveButton");
			
		}
		
		
		
		
		@Test (description = "Tc-37; Misc")
		private void CheckRecurrence() throws Exception {
			waitforElement(homepage.HomeTab);
			clickObj(homepage.HomeTab, "Home Tab");
			waitforElement(homepage.ClosePrompt);
			clickObj(homepage.ClosePrompt, "Close Prompt");
			waitforElement(homepage.DateTab);
			clickObj(homepage.DateTab, "Date Tab");
			waitforElement(homepage.Time1);
			
			clickObj(homepage.Time1, "Time 1");
			
			clickObj(homepage.Subject, "Subject");
			
			Set<String> windowHandles = driver.getWindowHandles();
			String currentHandle = driver.getWindowHandle();
			windowHandles.remove(currentHandle);
			String newHandle = windowHandles.iterator().next();
			driver.switchTo().window(newHandle);
			clickObj(homepage.Other, "Other");
			driver.switchTo().window(currentHandle);
			
			clickObj(homepage.endTimeBox, "endTimeBox");
			clickObj(homepage.endTime, "endTime");
			
			Radiobutton(homepage.Recurrence, "Recurrence");
			Radiobutton(homepage.weekly, "Weekly");
		
			clickObj(homepage.EndDayBox, "endTimeBox");
			waitforElement(homepage.EndToDay);
			clickObj(homepage.EndToDay, "endTime");
			clickObj(homepage.saveButton, "saveButton");
			waitforElement(homepage.monthView);
			clickObj(homepage.monthView, "Month View");
		}
	}	 
 
 
