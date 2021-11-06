package practiceexercise;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {

		System.out.println("Enter your string here:-");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		char []chr = str.toCharArray();
		
		int len = chr.length;
		
		for (int i = len -1; i >0; i--) {
			
			System.out.print(chr[i]);	
		}
		
		scan.close();
	}

}
