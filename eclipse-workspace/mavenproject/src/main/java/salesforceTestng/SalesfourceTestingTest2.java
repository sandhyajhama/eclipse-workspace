package salesforceTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesfourceTestingTest2 {
	@Test(groups= {"Smoke Test"})
	public static void velidate() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id=\"username\"]"))));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("sandy@tekarch.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("kriti*10");
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
	
	}
}
