package hackathon;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q31RevFile {		//new file in reverse order.(reverse line 1-10 to line 10-1)

	public static void main(String[] args) throws Exception {
		String sPath = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Text.file";
		FileReader fr = new FileReader(sPath);
		BufferedReader br = new BufferedReader(fr);
		
		String sPath1 = "/Users/kaushalmahaseth/eclipse-workspace/mavenproject/src/file/Write.file";
		FileWriter fw = new FileWriter(sPath1);
		
		List<String> tmp = new ArrayList<String>();

	    String ch;
		do {
	        ch = br.readLine();
	        tmp.add(ch);
	        System.out.print(ch); 
	    } while (ch != null);

	    for(int i=tmp.size()-1;i>=0;i--) {
	        System.out.print(tmp.get(i));
	        //fw.write(tmp.get(i));
	    	}

		   fr.close();
		   fw.close();
		}
	
}








