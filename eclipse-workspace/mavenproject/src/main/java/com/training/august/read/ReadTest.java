package com.training.august.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTest {

	public static void main (String[] args) throws Exception {
		
	String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Text.file";
	
	FileReader oFR = new FileReader(sPath);
	BufferedReader oBufferReader = new BufferedReader(oFR);
	
	System.out.println(oBufferReader.readLine());
	
	String sLine;
	while((sLine = oBufferReader.readLine())!= null) {
		System.out.println(sLine);
		
	}
	
	
	
	}

}
