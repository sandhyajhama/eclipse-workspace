package w3sources;

import java.util.Scanner;
public class W3array5 {
	public static void main(String[] args) {
		
	boolean found = false;		
	System.out.print("Enter your line here(maximum 5 words):-\n");
	Scanner s = new Scanner(System.in);
	
	String []line = new String[5]; //create and initialize an array with fixed size.
	
	for (int i = 0; i <line.length; i++) {

		line[i] = s.next();
	}
	
	for (int i = 0; i <line.length; i++) {

		System.out.print(line[i]+ " ");
	}
		
	System.out.print("\nEnter your pattern here :-\n");
	String pattern = s.next();
	System.out.println(pattern);
	
	for (int i = 0; i <=line.length-1;i++) 
	{
			if(pattern ==  line[i])
				found = true;
				break;
	}		
			if(found)
			
				System.out.println("Patern found.");
	
			else 
				System.out.println("Patern not found.");
	
			
	}
	

}
