package practiceexercise;

import java.util.Scanner;

public class Booleanwithcount {

public static void main(String[] args) {
		
		System.out.println("Enter any three boolean value here.");
		
		Scanner scan = new Scanner(System.in);
		
		boolean a = scan.nextBoolean();
		
		System.out.println(a);
		
		boolean b = scan.nextBoolean();
		
		System.out.println(b);
		
		boolean c = scan.nextBoolean();
		
		System.out.println(c);
		
		if(a && (b || c) || (b && c))
		
			System.out.println("At least two values are true.");
		
		else
			
			System.out.println("At two values are not true.");
		
		scan.close();
		
	}
}
