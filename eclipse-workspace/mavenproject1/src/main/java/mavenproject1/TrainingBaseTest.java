package mavenproject1;
	import java.util.Iterator;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.Assert;

	import java.awt.AWTException;
	import java.awt.Toolkit;
	import java.awt.datatransfer.StringSelection;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;
	import java.awt.Robot;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TrainingBaseTest {

		static WebDriver driver;
		static Actions action;
		static WebDriverWait wait ; 
		
	  public static void launchapp(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
	  }
	  
	  
	  public static void login(String username, String password){
		  
		  	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("email_field")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id='password_field']")).sendKeys(password);
			driver.findElement(By.xpath("//button[contains(text(),'Login to Account')]")).click();
	  }
	  
	  
	  
	  public static void openwindows() {

			
		  		action = new Actions(driver) ;
				WebElement SwitchToTab = driver.findElement(By.xpath("//button[contains(text(),'Switch To')]"));
				wait  = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(SwitchToTab));
				action.moveToElement(SwitchToTab).build().perform();
				driver.findElement(By.xpath("//a[contains(text(),'Windows')]")).click();
		}
			
	  
	  public static void doubleclick () {
		  
		  	action = new Actions(driver) ;
			WebElement Intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(Intractions));
			action.moveToElement(Intractions).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Double Click')]")).click();
		    WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double Click')]"));
		    wait = new WebDriverWait(driver, 10);
		  	wait.until(ExpectedConditions.visibilityOf(doubleclick));
		    action.doubleClick(doubleclick).build().perform();
		     
	  }
	  
	  
	   
	  public static void toolTip(String strtoolTip){
		  
		   
			action = new Actions(driver) ;
			WebElement Intractions = driver.findElement(By.xpath("//button[contains(text(),'Intractions')]"));
			
			action.moveToElement(Intractions).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'Tool Tip')]")).click();
		  
		  
			switch(strtoolTip){
			
			case "Right":
			RightTolTip();
			break;
			
			case "Left":
				LeftTolTip();
			break;
			default:System.out.println("Invalid Selection!");    
			
			}
			
		       
		    }
	 
	  public static void RightTolTip(){
		  	WebElement tooltipright	 = driver.findElement(By.xpath("//div[contains(text(),'Right')]"));	
		  
		  	waitforElement(tooltipright);
		  	
		  	action.moveToElement(tooltipright).build().perform();
		  	
		  	
				WebElement tooltiprightText = driver.findElement(By.xpath("//span[@class='tooltiptextr']"));
			wait.until(ExpectedConditions.visibilityOf(tooltiprightText));
			String ActualToolTip = tooltiprightText.getText();
			String ExpectedtToolTip = "Right";
			System.out.println(ActualToolTip);
			Assert.assertEquals(ActualToolTip,ExpectedtToolTip);
			
	  }
	  
	  public static void LeftTolTip(){
		  	WebElement tooltipright	 = driver.findElement(By.xpath("//div[contains(text(),'Left')]"));	
		  	wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltipright));
			action.moveToElement(tooltipright).build().perform();
				WebElement tooltiprightText = driver.findElement(By.xpath("//span[@class='tooltiptextl']"));
				wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(tooltiprightText));
			String ActualToolTip = tooltiprightText.getText();
			String ExpectedtToolTip = "Left";
			System.out.println(ActualToolTip);
			Assert.assertEquals(ActualToolTip,ExpectedtToolTip);
			
	}
	  
	  public static void autocomplete(){
		  
		  action = new Actions(driver) ;
			WebElement Widget = driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(Widget));
			action.moveToElement(Widget).build().perform();
			driver.findElement(By.xpath("//a[contains(text(),'AutoComplete')]")).click();
			driver.findElement(By.id("myInput")).sendKeys("ind");
			
			driver.findElement(By.xpath("//div[@id='myInputautocomplete-list']/div/input[@value='India']")).click();
			
			
			/*List<WebElement> countrylist =  driver.findElements(By.xpath("//div[@id='myInputautocomplete-list']/div"));
			
			for(int count=0;count<countrylist.size();count++)
			{
				if(countrylist.get(count).getText().equalsIgnoreCase("United States of America"))
				{
					System.out.println("Condition sucssed"+countrylist.get(count).getText());
					countrylist.get(count).click();
					break;
				}
				else
				{
					System.out.println(countrylist.get(count).getText());
				}
			}*/
			
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
					
					System.out.print("Able to fine the Name" +actualName);
				} 
				
			}
			
			System.out.println();
		  
	  }
	  
	  
	  public static void waitforElement(WebElement element){
		  
		  wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
	  }
	  
	  
	}



