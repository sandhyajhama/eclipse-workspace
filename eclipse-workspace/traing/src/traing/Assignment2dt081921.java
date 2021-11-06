package traing;

import java.util.Scanner;

public class Assignment2dt081921 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter any number here :-");
		int a = number.nextInt();
	
		if(a <0)
			System.out.println("Given number is a negative number.");
		else
			System.out.println("Given number is a positive number.");
	
		number.close();	
		
	}
}
