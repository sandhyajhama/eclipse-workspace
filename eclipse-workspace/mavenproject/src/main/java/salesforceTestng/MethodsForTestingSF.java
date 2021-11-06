package salesforceTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsForTestingSF {
	
	@Test(priority = 2)
	public static void LoginwithoutPassword() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("User@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
	
	}
	
	@Test (priority=1)
	public static void Validlogin() throws Exception {
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
	
	@Test
	public static void RememberMe() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id=\"username\"]"))));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("sandy@tekarch.com");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("kriti*10");
		driver.findElement(By.xpath("//label[normalize-space()=\"Remember me\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Login")).click();
		wait = new WebDriverWait(driver, 10);
		WebElement wb =driver.findElement(By.xpath("//img[@class='icon noicon']"));
		wait.until(ExpectedConditions.visibilityOf(wb));
		wb.click();
		driver.findElement(By.xpath("//a[@class='profile-link-label logout uiOutputURL']")).click();
		driver.quit();
	}
	
	@Test
	public static void InvalidCredential() throws Exception {
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
