package mavenproject;
import java.io.*;
import java.io.BufferedWriter;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws Exception {
		
		String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Write.file";
		Scanner scan = new Scanner(System.in);
		int line = scan.nextInt();
		FileWriter oFileWriter = new FileWriter(sPath,true);
		BufferedWriter oBW = new BufferedWriter(oFileWriter);
		
		int x = 0;
		do {
			System.out.println("Enter the string:");
			String s = scan.nextLine();
			
			if(!(s.equals("exit"))) {
				oBW.write(s);
				oBW.write("\n");
			}
		}
		while(x <= line);
		
		scan.close();
		oBW.close();
		
	}
}

	


	
