package mavenproject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadnWrite {
	public static void main(String[] args) throws IOException {
		String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Text.file";
		
		FileReader fr = new FileReader(sPath);
		
		String sPath1 = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Write.file";
		
		FileWriter fw = new FileWriter(sPath1);
		
		
		String str ="";
		
		int i;
		
		
		while((i = fr.read()) != -1) {
			str = str + (char)i;
		}
		System.out.println(str);
		fw.write(str);
		
		fr.close();
		fw.close();
		}

}
