package com.training.utilities;

import java.io.File;

import org.testng.annotations.Test;

public class Constant {			//we put constant variable here.
	
	@Test
	public static void printuserdir() {
		
		System.out.println(System.getProperty("user.dir"));
		
	}
	
	public static final String APPLICATION_PROPERTIES = "Properties"+File.separator +"Applications.properties";
	
	public static final String USER_DIR = System.getProperty("user.dir");
	

}
