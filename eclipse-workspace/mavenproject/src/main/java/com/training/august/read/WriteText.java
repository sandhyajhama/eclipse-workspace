package com.training.august.read;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

	public static void main(String[] args) throws Exception {
		String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/WriteText";
		System.out.println(System.getProperty("user.dir"));
		
		writeFile(sPath);			//it is a function
	}

	private static void writeFile(String sPath)  {
	
		BufferedWriter oBufferWriter = null;	//Writes text to a character-output stream, 
		//buffering characters so as to provide for the efficient writing of single characters, 
		//arrays, and strings.
		try {
			FileWriter oFileWriter = new FileWriter(sPath);
			oBufferWriter = new BufferedWriter(oFileWriter);
		
			oBufferWriter.write("Hello everyone, how you all are doing?");
			oBufferWriter.write("\n");
			oBufferWriter.write("This is to print in multiple line.");
			oBufferWriter.write("\n");
			oBufferWriter.write("But I actually want to do it with loop.");
			oBufferWriter.write("\n");
			oBufferWriter.write("I want to use oBufferWriter only one time.");
			oBufferWriter.write("\n");
			oBufferWriter.write("Does anyone tried that?");
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		finally {
			try {
				oBufferWriter.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}	
		
		}
	}
}
