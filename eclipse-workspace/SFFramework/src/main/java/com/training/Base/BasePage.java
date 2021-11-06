package com.training.Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected static WebDriver driver;
	 
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
	
		PageFactory.initElements(driver,this);
	
	}
	

	public void waitforElement(WebElement element) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
		
	}
	public void waitforClickableElement(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
		
	}
	public void waitforElementTobeSelected(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeSelected(element));
		
	}
	
	public void implicitwait(WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver,10);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	public void waitforElementTobeinvisible(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.invisibilityOf(element));
		
	}
	
	
		public static void waitforIFrame(WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		
		
	}
	

		//This method is used to get the latest downloaded file from directory
		public static File getLatestFilefromDir(String dirPath) {
			File dir = new File("/Users/kaushalmahaseth/Downloads/LoginHistory1633365868662.csv");
			File[] files = dir.listFiles();
			if(files == null || files.length==0) {
				return null;
			}
			File lastModifiedFile = files[0];
		    for (int i = 1; i < files.length; i++) {
		       if (lastModifiedFile.lastModified() < files[i].lastModified()) {
		           lastModifiedFile = files[i];
		       }
		    }
		    
		    return lastModifiedFile;
		}

		//This method checks the extension of the file downloaded
		public static boolean isFileDownloaded_Extension(String dirPath, String extension) {
			boolean flag = false;
			File dir = new File("/Users/kaushalmahaseth/Downloads/LoginHistory1633365868662.csv");
			File[] files = dir.listFiles();
			if(files == null || files.length==0) {
				flag = false;
			}
			for(int i=1; i<files.length; i++) {
				if(files[i].getName().contains(extension)) {
					flag = true;
				}
			}
			return flag;
		}

	//This method is to verify if the file is downloaded or not
			public boolean isFileDownloaded(String downloadPath, String fileName) {
				boolean flag = false;
				File dir = new File(downloadPath);
				File[] dir_contents = dir.listFiles();
			
					for(int i=0; i<dir_contents.length; i++) {
						if(dir_contents[i].getName().equalsIgnoreCase(fileName)) {
						return flag = true;
					}
				}
				return flag;
			}
		
	public static void takescreenshot(WebDriver driver) throws IOException {
		
			TakesScreenshot scrShot = ((TakesScreenshot)driver);
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			Date currentDate = new Date();
		  	String timestamp = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(currentDate);
		  	String fileSeperator = System.getProperty("file.separator");
		    String reportFilepath = System.getProperty("user.dir") +fileSeperator+ "Screenshots";
		    String reportFileName = "ScreenShot"+timestamp+".png";
		    String filePath =  reportFilepath +fileSeperator+ reportFileName;
		    File DestFile = new File(filePath);
		    FileUtils.copyFile(srcFile, DestFile);
		
		}
	}
	

	

