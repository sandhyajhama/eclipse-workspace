package com.training.testcases;

import org.testng.annotations.Test;

public class TestingTekarch extends MethodsForTestTekArch {
	
	@Test
	public static void verification() throws Exception {
		
	String str = "https://qa-tekarch.firebaseapp.com/";	
	LaunchWeb(str);
	
	LoginPage();
	
	//RadioButton();
	
	//OpenWindow();
	
	//DoubleClick();
	
	//toolTip("Bottom");
	
	 // AutoFill();
	
	  //Accordian();
	
	Calculator();
	driver.quit();

}
}