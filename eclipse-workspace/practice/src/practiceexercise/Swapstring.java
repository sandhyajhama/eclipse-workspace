package practiceexercise;

import java.util.Scanner;

public class Swapstring {
	
	public static void main(String[] args) {
		
	
	System.out.println("Enter your string here:-");
	
	Scanner s = new Scanner(System.in);
	
		String str = s.nextLine();
	
		String []word = str.split("//s");
	
		int len = word.length;
	
		for (int i =0; i <= len-1; i++) {
		
			System.out.print(word[i]+" ");
		}
			System.out.println();
	
			for ( int i = len - 1; i >= 0; i-- ) { 
  				
				System.out.print(word[i]+" ");
  				
		}
	}
}
