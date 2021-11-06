package practiceexercise;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);  
	      
	      System.out.println("Enter a number here:"); 
	      
	      	int num = scan.nextInt();  
	      	
	      	for(int i = 2; i<= num/2; i++) {
	      		
	      		num = num %i;
	      		
	      	}
	      		if(num  != 0)
	      			
	      			System.out.println("Number is prime.");
	      		
	      		else
	      			
	      			System.out.println("Number is not a prime.");
	      		
	      		scan.close();
	      	}

	}


