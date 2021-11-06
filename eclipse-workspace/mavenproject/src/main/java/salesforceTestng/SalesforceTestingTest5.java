package salesforceTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceTestingTest5 {

	@Test(groups= {"Smoke Test"})
	public static void velidatelogin() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id=\"username\"]"))));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("22131");
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		
	}
}
	

