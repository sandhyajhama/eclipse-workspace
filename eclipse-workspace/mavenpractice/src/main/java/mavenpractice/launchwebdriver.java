package mavenpractice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class launchwebdriver {
	
	public static void main(String[] args) {
		
		WebDriverManager driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriverManager();
		driver.get("https://login.salesforce.com/");
		
	}

}
