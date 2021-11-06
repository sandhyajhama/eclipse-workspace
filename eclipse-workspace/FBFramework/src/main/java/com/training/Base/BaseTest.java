package com.training.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {					//all common methods for test will be written here.
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		return driver;
	}
	
	
	

}
