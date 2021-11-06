package com.training.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonUtilities extends Constant{
	
	public String getApplicationProperty(String key) throws FileNotFoundException {
		
		Properties properties = new Properties();
		String filepath = USER_DIR +File.separator+ APPLICATION_PROPERTIES;
		FileInputStream inputfile = new FileInputStream(filepath);
		String value = "";
		
		try {
			properties.load(inputfile);
			value = properties.getProperty(key);
			System.out.println(key+"is"+value);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
	}
	

}
