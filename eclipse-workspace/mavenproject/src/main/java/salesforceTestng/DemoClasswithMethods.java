package salesforceTestng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoClasswithMethods {

	@Test(priority = 2)
	public static void methOdone() {
		System.out.println("This is second line.");
	}
	
	@Test(priority = 2)
	@Parameters({"country","state"})
	public static void methodTwo(String country, String state) {
		System.out.println("This is first line.");
		System.out.println("TMy country is:-"+country);
		System.out.println("TMy state is:-"+state);
	}
	@Test(priority = 1)
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
