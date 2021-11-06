package traing;

import java.util.Scanner;

public class Assignment5dt081921 {

	public static void main(String[] args) {
	
		Scanner operation = new Scanner(System.in);
		
		System.out.println("Enter any two numbers here :- ");
		
		int a = operation.nextInt();
		int b = operation.nextInt();
		
		System.out.println("Enter the airthmetic operation which you want to perform.");
		String s = operation.next();
		
		
		switch(s)			{
			
			case"+": System.out.println(a+b);
			break;
			
			case"-": System.out.println(a-b);
			break;
	
			case"*" : System.out.println(a*b);
			break;
	
			case"/" : System.out.println(a/b);
			break;
	
			case"%" : System.out.println(a%b);
			break;
			
			default: System.out.println("Invalid operation.");
			}
			operation.close();
			
		}
	}
	
