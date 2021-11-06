package com.training.august.read;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteMultipleLine {

	public static void main(String[] args) throws Exception {
		
		String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Write.file";
		
		System.out.println("Enter no of line you wants to print:- ");
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		System.out.println(line);
		
		String []s = new String[line];	//Create an array of size equal to line
		System.out.println("Enter the string which you want to add:-");
		
		int i = 0;
		scan.nextLine();
		while(i < line) {
		s[i] = scan.nextLine(); //store scanned line in string array.
		i++;
		}
		
		FileWriter oFileWriter = new FileWriter(sPath,true);
		BufferedWriter oBW = new BufferedWriter(oFileWriter);
		for(int j = 0; j<line;j++) {
			oBW.write("\n"+s[j]);
			System.out.println();
		}
		oBW.close();
		scan.close();	
		
	}
	
}
