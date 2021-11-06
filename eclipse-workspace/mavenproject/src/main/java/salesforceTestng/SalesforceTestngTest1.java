package salesforceTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceTestngTest1 {

	@Test(groups= {"Smoke Test"})
	@BeforeSuite
	@BeforeTest
	@BeforeMethod
	public static void message() {
	System.out.println("This is the start of test.");
	}
	public static void velidateLogin() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//WebElement wb = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		//wait.until(ExpectedConditions.visibilityOf(wb));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("User@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
	
	}
	@AfterMethod
	@AfterTest
	@AfterSuite

	public static void End() {
		System.out.println("This is End");
	}
}