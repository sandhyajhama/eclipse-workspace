package com.training.test.home;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.training.Base.BaseTest;
import com.training.page.HomePage;



public class HomeTest extends BaseTest{

	static WebDriver driver;
	static Actions action;
	static WebDriverWait wait;
	HomePage homepage;
	@Test
	private void validateHome() throws FileNotFoundException, InterruptedException  {
			
		homepage.enterIntoFirstName("Sandhya");
			
	}
	 public static void windowalert() throws InterruptedException{
		  
		   
			
			action = new Actions(driver) ;
			WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			waitforElement(switchTo);
			action.moveToElement(switchTo).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
			driver.findElement(By.xpath("//div[@class= ' login' ]//button[contains(text(),'Window Alert')]")).click();
			Alert windowAlert = driver.switchTo().alert();
			System.out.println(windowAlert.getText());
			Thread.sleep(10000);
			windowAlert.accept();
			
	  }
	  
	  
	  public static void promptalert() throws InterruptedException{
		  
		   
			action = new Actions(driver) ;
			WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			waitforElement(switchTo);
			action.moveToElement(switchTo).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Alert')]")).click();
			driver.findElement(By.xpath("//div[@class= ' login' ]//button[contains(text(),'Promt Alert')]")).click();
			Alert promptAlert = driver.switchTo().alert();
			System.out.println(promptAlert.getText());
			promptAlert.sendKeys("August Batch");
			Thread.sleep(10000);
			promptAlert.dismiss();
			System.out.println(driver.findElement(By.xpath("//p[@id= 'Selenium']")).getText());
			
			
	}
	  
	  
	  public static void switchtoTab() throws InterruptedException{
		  
		   
			action = new Actions(driver) ;
			WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			waitforElement(switchTo);
			action.moveToElement(switchTo).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Tab')]")).click();
			
			String parentwindow = driver.getWindowHandle();
			
			System.out.println(driver.getWindowHandles().size());
			
			for(String handle: driver.getWindowHandles()) {
				System.out.println("No of handles" +handle);
				driver.switchTo().window(handle);
			}
			
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.switchTo().window(parentwindow);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			
			
	}
	  
	  
	  public static void switchtowindow() throws InterruptedException{
		  
		   
			action = new Actions(driver) ;
			WebElement switchTo = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
			waitforElement(switchTo);
			action.moveToElement(switchTo).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Window')]")).click();
			
			String parentwindow = driver.getWindowHandle();
			
			System.out.println(driver.getWindowHandles().size());
			
			for(String handle: driver.getWindowHandles()) {
				System.out.println("No of handles" +handle);
				driver.switchTo().window(handle);
			}
			
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.switchTo().window(parentwindow);
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			
			
	}
	  
	  
	  public static void upload() throws IOException{
		  
		   
			action = new Actions(driver) ;
			WebElement FileUpload = driver.findElement(By.xpath("//a[normalize-space()='File Upload']"));
			waitforElement(FileUpload);
			FileUpload.click();
			driver.findElement(By.xpath("//input[@name='logo']")).click();
			Runtime.getRuntime().exec("C:\\august2021\\AutoIT\\Upload.exe");

	}
	  
	  
	  
	  
	  public static void table(){
		  
		   
			action = new Actions(driver) ;
			WebElement Widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			waitforElement(Widget);
			action.moveToElement(Widget).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Table')]")).click();
			
			WebElement table = driver.findElement(By.xpath("//p"));
			waitforElement(table);
			
			List<WebElement> tableHeader = driver.findElements(By.xpath("//th"));
			displaytable(tableHeader);
			
			List<WebElement> firstrow = driver.findElements(By.xpath("//tr[2]/td"));
			displaytable(firstrow);
			
			List<WebElement> secondrow = driver.findElements(By.xpath("//tr[3]/td"));
			displaytable(secondrow);
			
			List<WebElement> thirdRow = driver.findElements(By.xpath("//tr[4]/td"));
			displaytable(thirdRow);
			
			List<WebElement> fourthRow = driver.findElements(By.xpath("//tr[5]/td"));
			displaytable(fourthRow);
			findName(fourthRow,"Ujjwal");
	  
	  }
	  
	  public static void displaytable(List<WebElement> elementList ) {
		  
		  Iterator<WebElement> iter = elementList.iterator();
			
			while(iter.hasNext()) {
				
				System.out.print(iter.next().getText());
				System.out.print("\t");
			}
			
			System.out.println();
		  
	  }
	  
	 public static void findName(List<WebElement> elementList,String expectedName ) {
		  
		  Iterator<WebElement> iter = elementList.iterator();
			
			while(iter.hasNext()) {
				
				String actualName = iter.next().getText();
				
				if (actualName.equalsIgnoreCase(expectedName)) {
					
					System.out.print("Able to find the Name" +actualName);
				} 
				
			}
			
			System.out.println();
		  
	  }
	  
	  
	  public static void waitforElement(WebElement element){
		  
		  wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
	  }
}
