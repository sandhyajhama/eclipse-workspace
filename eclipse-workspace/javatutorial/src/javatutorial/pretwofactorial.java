package javatutorial;

import java.util.Scanner;

public class pretwofactorial {
	
	public static void main(String[] argv) {
		
		System.out.println("Enter the number for factorial here:-");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i;
		int fact = 1;
		for(i = 1; i<=n; i++) {
			fact = fact * i;
		}
			System.out.println("The factorial of "+n +" is "+fact);
			scan.close();
		}
			
	}


