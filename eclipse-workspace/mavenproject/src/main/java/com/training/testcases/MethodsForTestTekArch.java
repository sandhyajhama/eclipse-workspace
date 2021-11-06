package com.training.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MethodsForTestTekArch {
	
	
	static WebDriver driver;
	
	static Actions action;
	
	static WebDriverWait wait;
	
	public static void LaunchWeb(String str) {
	
		//str = "https://qa-tekarch.firebaseapp.com/";
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get(str);
		
		driver.manage().window().maximize();
		
	}
	
		public static void LoginPage() {
		
		driver.findElement(By.xpath("//input[@id='email_field']")).sendKeys("admin123@gmail.com");
		
		driver.findElement(By.xpath(" //input[@id='password_field']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login to Account']")).click();
		
	}
		public static void RadioButton()
		
		{
			
			Boolean IsButtonmale = driver.findElement(By.xpath("//span[1]/input")).isSelected();
			
			System.out.println(IsButtonmale);
			
			Boolean IsButtonfemale = driver.findElement(By.xpath("//span[2]/input")).isSelected();
			
			System.out.println(IsButtonfemale);
			
		}
		
		public static void OpenWindow()	{
			
			action = new Actions(driver);
			
			WebElement SwitchToTab = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			
		    wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.visibilityOf(SwitchToTab));
			
			action.moveToElement(SwitchToTab).build().perform();
			
			driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
			
		}
		
		public static void DoubleClick() throws Exception{
			
			action = new Actions(driver);
			WebElement Intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(Intractions));
			action.moveToElement(Intractions).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
			WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
			wait.until(ExpectedConditions.visibilityOf(doubleclick));
			
			Thread.sleep(1000);
			action.doubleClick(doubleclick).build().perform();
			
		}
		
		public static void toolTip(String strtoolTip){
				  
			action = new Actions(driver) ;
			WebElement Intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(Intractions));
			action.moveToElement(Intractions).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
			  
			switch(strtoolTip){
				
				case "Right":
				RightTolTip();
				break;
				
				case "Left":
					LeftTolTip();
				break;
				
				case "Top":
					TopTip();
				break;
				
				case "Bottom":
					BottomTip();
				break;
				
				}
				
		  }
		  
		public static void RightTolTip(){
			  
			WebElement tooltipright	 = driver.findElement(By.xpath("//div[contains(text(),'Right')]"));	
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltipright));
			action.moveToElement(tooltipright).build().perform();
			WebElement tooltiprightText = driver.findElement(By.xpath("//span[@class='tooltiptextr']"));
			wait.until(ExpectedConditions.visibilityOf(tooltiprightText));
			String ActualToolTip = tooltiprightText.getText();
			String ExpectedtToolTip = "Right";
			System.out.println(ActualToolTip);
			Assert.assertEquals(ActualToolTip,ExpectedtToolTip);
				
		  }
		  
		  public static void LeftTolTip(){
			  
			WebElement tooltiptop	 = driver.findElement(By.xpath("//div[contains(text(),'Top')]"));	
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltiptop));
			action.moveToElement(tooltiptop).build().perform();
			WebElement tooltiptopText = driver.findElement(By.xpath("//div[@class='tooltipt']"));
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltiptopText));
			String ActualToolTip = tooltiptopText.getText();
			String ExpectedtToolTip = "Left";
			System.out.println(ActualToolTip);
			Assert.assertEquals(ActualToolTip,ExpectedtToolTip);
				
		}
		  public static void TopTip() {
		  WebElement tooltipTop	 = driver.findElement(By.xpath("//div[contains(text(),'Top')]"));	
		  	wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltipTop));
			action.moveToElement(tooltipTop).build().perform();
			WebElement tooltipTopText = driver.findElement(By.xpath("//span[@class='tooltiptextr']"));
			wait.until(ExpectedConditions.visibilityOf(tooltipTopText));
			String ActualToolTip = tooltipTopText.getText();
			String ExpectedtToolTip = "Top";
			System.out.println(ActualToolTip);
			Assert.assertEquals(ActualToolTip,ExpectedtToolTip);
			
		  }
		private static void BottomTip() {
			WebElement tooltipbottom	 = driver.findElement(By.xpath("//div[contains(text(),'Bottom')]"));	
		  	wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltipbottom));
			action.moveToElement(tooltipbottom).build().perform();
			WebElement tooltipbottomText = driver.findElement(By.xpath("//span[@class='tooltiptextb']"));
			wait.until(ExpectedConditions.visibilityOf(tooltipbottomText));
			String ActualToolTip = tooltipbottomText.getText();
			String ExpectedtToolTip = "Bottom";
			System.out.println(ActualToolTip);
			Assert.assertEquals(ActualToolTip,ExpectedtToolTip);
			
			}

		public static void AutoFill() throws Exception	{
			
			action = new Actions(driver);
			
			WebElement autofill = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			
			wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.visibilityOf(autofill));
			
			action.moveToElement(autofill).build().perform();
			
			driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("myInput"))));
			
			driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys("uni");
			
			List<WebElement> countrylist = driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
			
			for(int i = 0; i< countrylist.size(); i++) {
				
				if (countrylist.get(i).getText().equalsIgnoreCase("United States of America")) {
				
					System.out.println(countrylist.get(i).getText());
					
					countrylist.get(i).click();
					
					break;
				}
				else
				{
					System.out.println(countrylist.get(i).getText());
				}
				
				Thread.sleep(1000);
			}
		}
		public static void Accordian() throws Exception {

			action = new Actions(driver);
			
			WebElement autofill = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			
			wait = new WebDriverWait(driver,10);
			
			wait.until(ExpectedConditions.visibilityOf(autofill));
			
			action.moveToElement(autofill).build().perform();
			
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[contains(text(),'Accordian')]"))));
			
			driver.findElement(By.xpath("//a[contains(text(),'Accordian')]")).click();

			wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//button[normalize-space()='Section 1']"))));
			driver.findElement(By.xpath("//button[normalize-space()='Section 1']")).click();
			
			List<WebElement> list = driver.findElements(By.xpath("//div[1]//p[1]"));
			for(int i = 0; i <list.size();i++)
				System.out.println(list.get(i).getText());
			
		}
		
		public static void dragndrop() throws Exception {

		
		}
		
		
		public static void fileupload() throws Exception {

			
		}
		
		public static void datepicker() throws Exception {

			
		}
		
		
		
		
		public static void Calculator() throws Exception {

			action = new Actions(driver);
			
			WebElement calculator = driver.findElement(By.xpath("//a[normalize-space()='Calculator']"));
			
			wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(calculator));
			calculator.click();
			wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='1']"))));
			driver.findElement(By.xpath("//input[@value='1']")).click();
			driver.findElement(By.xpath("//input[@value='+']")).click();
			driver.findElement(By.xpath("//input[@value='2']")).click();
			driver.findElement(By.xpath("//input[@value='=']")).click();
			WebElement display = driver.findElement(By.xpath("//input"));
		    String result = display.getAttribute("value");
		    System.out.println(result);
			Assert.assertEquals(result,"3");
				
		}	
}
	
	


