package practiceexercise;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);  
	      
	      System.out.println("Enter a number here:"); 
	      
	      	int num = scan.nextInt(); 
	      	
	      	int i;
	      	
	      	int mul = 0;
	      	
	      	for(i = 1; i<= 10; i++) {
	      		
	      		mul  = num *i ;
	      
	      		System.out.println(num + " times " + i +" = "+ mul);
	      	}
	    
	}
	
	
}
