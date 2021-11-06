package hackathon;

import java.util.Scanner;

public class Q9Stringupertolower {

	public static void main(String[] args) {
		System.out.println("Enter your string here: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println("Original String is ");
		System.out.println(str);
		
		String str1 = str.toLowerCase();
		
		System.out.println("Converted String is ");
		System.out.println(str1);
	}

}
