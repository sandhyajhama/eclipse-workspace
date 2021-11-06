package hackathon;

import java.util.Scanner;

public class Q21Stringtoint {		// convert string to int 

	public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your digit as a string here :-");
			String digit = scan.next();
			
			Integer i = Integer.valueOf(digit);
		
			System.out.println("Your digit is :-" +i);
			
			String digit1 = "500";
			Integer i1 = Integer.valueOf(digit1);
			System.out.println("second digit is :-" +i1);
			Integer integer = i+i1;
			System.out.println("sum of both digits is :-" +integer);
			scan.close();
				}								
	}
