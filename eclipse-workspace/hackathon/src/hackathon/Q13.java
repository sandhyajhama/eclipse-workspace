package hackathon;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		
	System.out.println("Enter your string here:-");
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	System.out.println(str);	
		
		char chr[] = str.toCharArray();
		int len = str.length();
		
		for(int i = len-1; i >=0; i--) {
			
			//if(chr[i] == ' ') {
				//System.out.print(" ");
				//i = i-1;
			//}
		System.out.print(chr[i]);
		
		}
		
		
		
		s.close();
	}
}
