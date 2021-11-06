package hackathon;

import java.util.Scanner;

public class Q12Stringpelindrom {

	public static void main(String[] args) {
		

		  {  
		      
		      
		      String reverse = ""; 

		      Scanner scan = new Scanner(System.in);  
		      
		      System.out.println("Enter a string to check palindrome"); 
		      
		      	String	str = scan.next();  
		      
		      		int length = str.length(); 
		      		
		      			for ( int i = length - 1; i >= 0; i-- )  
		      				
		      				reverse = reverse + str.charAt(i);  
		      			
		      					if (str.equals(reverse)) 
		      						
		      						System.out.println("Entered string is a palindrome.");  
		      					else  
		       
		      						System.out.println("Entered string is not a palindrome."); 
		      					
		      						scan.close();
		  				}  
		  					
				}
		}

	


