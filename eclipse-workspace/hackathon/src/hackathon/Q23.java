package hackathon;

import java.util.Scanner;

public class Q23 {		//differentiate input as string, int or bool

	public static void main(String[] args) {
		
	System.out.println("Input here please.");
	
	Scanner scan = new Scanner(System.in);
	
	if(scan.hasNextInt()) 
		System.out.println("Input is integer.");
		
	else if (scan.hasNextBoolean()) 
		
		System.out.println("Input is boolean.");
	else  
		System.out.println("Input is string.");
	scan.close();
		
		}
	
	}

