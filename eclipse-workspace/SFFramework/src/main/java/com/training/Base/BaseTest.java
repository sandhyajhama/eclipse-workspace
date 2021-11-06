package com.training.Base;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver; // declear driver.

	CommonUtilities common = new CommonUtilities();

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void launchbrowser() throws IOException {
		driver = getDriver();
		String url = common.getApplicationProperty("url"); // instantiate driver with given url.
		driver.get(url);
	}

	public void waitforElement(WebElement element) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void implicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void waitforElementTobeSelected(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeSelected(element));

	}

	public void waitforClickableElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void waitforElementforFrame(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));

	}

	public static void enterText(WebElement element, String textval, String objName) throws Exception {

		if (element.isDisplayed())

		{
			element.sendKeys(textval);

			System.out.println("pass: " + textval + "value is entered in " + objName + "field");
		}

		else

		{

			System.out.println("fail:" + objName + "field does not exist please check application");

		}

	}

	public static void clickObj(WebElement element, String objName)

	{

		if (element.isDisplayed())

		{
			element.click();

			System.out.println("pass :" + objName + "button is clicked");
		}

		else

		{

			System.out.println("Fail:" + objName + "button is not displayed ,please check the application");
		}

	}

	public static void selectCheckBox(WebElement element, String objName) {

		if (element.isDisplayed() && element.isSelected()) {

			System.out.println("Pass: " + objName + " is already selected");

		} else {

			element.click();

			System.out.println("Pass: " + objName + " is selected");

		}
	}

	public static void selectDropdown(WebElement element, String objName) {

		if (element.isDisplayed()) {

			System.out.println("Pass: " + objName + " is selected");

			element.click();

		} else

		{

			System.out.println("Fail:" + objName + " is not present.Please chk application");

		}
	}

	public static void validateErrormsg(String actualmsg, String errormsg) {

		if (actualmsg.equals(errormsg))

		{

			System.out.println("TestCase is passed");

		} else

		{

			System.out.println("TestCase is failed");

		}

	}

	public static void switchFrame(WebDriver driver, WebElement obj) {

		if (obj.isDisplayed()) {

			driver.switchTo().frame(obj);

			System.out.println("Pass: we can switch to the " + obj + " frame");

		} else {

			System.out.println("fail: we can't switch to the " + obj + " frame");

		}

	}

	public static void switchFrameid(WebDriver driver, String obj) {

		driver.switchTo().frame(obj);

		System.out.println("Pass: we can switch to the " + obj + " frame");

	}

	public static void switchdefaultFrame(WebDriver driver)

	{

		driver.switchTo().defaultContent();

		System.out.println("Pass: we can switch to the " + driver + " back to frame");

	}

	public static void mouseOver(WebDriver driver, WebElement obj) {

		if (obj.isDisplayed()) {

			Actions action = new Actions(driver);

			action.moveToElement(obj).build().perform();

			System.out.println("Pass: " + obj + " is present");

		} else {

			System.out.println("Fail:" + obj + " is not present.Please chk application");

		}

	}

	public static void SelectbyText(WebElement element, String VisibleText) {

		if (element.isDisplayed())

		{

			Select selObj = new Select(element);

			selObj.selectByVisibleText(VisibleText);

			System.out.println("Pass: " + VisibleText + " is Selected by VisibleText");
		}

		else

		{

			System.out.println("Fail: " + VisibleText + " is not available");

		}

	}

	public static void SelectByValue(WebElement element, String val) {

		if (element.isDisplayed()) {

			Select selObj = new Select(element);

			selObj.selectByValue(val);

			System.out.println("pass:" + val + " is selected from drop down ");

		} else {

			System.out.println("Fail:" + val + "is not selected");

		}

	}

	public static void selectByIndex(WebElement element, int index) {

		if (element.isDisplayed()) {

			Select selObj = new Select(element);

			selObj.selectByIndex(index);

			System.out.println("pass:" + index + " is selected from drop down ");

		} else {

			System.out.println("Fail:" + index + "is not selected");

		}

	}

	public static void selectByVisibleText(WebElement obj, String Name) {

		if (obj.isDisplayed()) {

			Select drop = new Select(obj);

			drop.selectByVisibleText(Name);

			System.out.println("Pass: dropdown is selected");

		} else {

			System.out.println("Fail: dropdown is not available check your application");

		}

	}

	public static void Radiobutton(WebElement obj, String objName) {

		if (obj.isDisplayed()) {

			obj.click();

			System.out.println("Pass: " + objName + " is clicked");
		} else {

			System.out.println("Fail:" + objName + " is not displayed .Please check your application");

		}

	}

	public static void switchtoAlert(WebDriver driver) {

		driver.switchTo().alert().accept();

		System.out.println("Pass: alert is present and accept");

	}

	public static void clear(WebElement element) {

		element.clear();

		System.out.println("Text box is clear.");

	}
	
	public static Date Systemdate(Date date) {
		
		 // Create object of SimpleDateFormat class and decide the format
			 DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
			 
			 //get current date time with Date()
			 Date date1 = new Date();
			 
			 // Now format the date
			 String date2= dateFormat.format(date);
			 
			 // Print the Date
			 System.out.println(date1);
			 
			 return date;
		
		}

}
