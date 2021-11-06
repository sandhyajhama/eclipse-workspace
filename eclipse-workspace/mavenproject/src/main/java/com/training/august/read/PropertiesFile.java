package com.training.august.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		
		String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/Property/application.properties";
		
		Properties property = new Properties();
		FileInputStream fileinput = new FileInputStream(sPath);
		property.load(fileinput);
		
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("Userid"));
		
		FileOutputStream fileOutput = new FileOutputStream(sPath);
		
		property.setProperty("password", "pass@123");
		property.store(fileOutput, "New property added");
		
		System.out.println(property.getProperty("password"));
	}

}