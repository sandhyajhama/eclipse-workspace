package traing;

import java.util.Scanner;

public class Assignment2dt082021 {

	
    public static void main(String args[]){
    	
    	System.out.println("Enter no of row here:-");  
    	 Scanner scan = new Scanner(System.in);
         int row = scan.nextInt();
         
	      for(int i = 0; i <= row; i++) {
	    	  
		         for(int j = 0; j <= row-i; j++){
		            System.out.print(" ");
		         }
		         		for(int j = 0; j <= i; j++){
		         			System.out.print(" "+ncr(i, j)); //" " is not clear  here.
		         		}
		         			System.out.println();
		      }
		   }   
		   static int factorial(int n) {
			      int f;

			      for(f = 1; n > 1; n--){
			         f = f* n;
			      }
			      return f;
		   }
	       static int ncr(int n,int r) {
			      return factorial(n) / ( factorial(n-r) * factorial(r) );
			   }
		}