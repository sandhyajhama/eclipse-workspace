package hackathon;

import java.util.Scanner;

public class Q22IntToStr {		//convert int to string
	
public static void main(String[] argv) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number are :-");
		String number = scan.next();
		
		
		char chr[] = number.toCharArray();
		
		System.out.println("Your digits are :-");
		for(int i = 0; i < chr.length; i++) {
			
			System.out.print(chr[i]);		//printing input.
		}
		
		for(int i = 0; i < chr.length; i++) {
		switch(chr[i]) {
			
			
					case '0' : System.out.print(" Zero,");
					break;
					case '1' : System.out.print(" One,");
					break;
					case '2' : System.out.print(" Two,");
					break;
					case '3' : System.out.print(" Three,");
					break;
					case '4' : System.out.print(" Four,");
					break;
					case '5' : System.out.print(" Five,");
					break;
					case '6' : System.out.print(" Six,");
					break;
					case '7' : System.out.print(" Seven,");
					break;
					case '8' : System.out.print(" Eight,");
					break;
					case '9' : System.out.print(" Nine,");
					break;
				
					default : 
						System.out.println(chr[i]);        
				}
			
		
			}								
		scan.close();
		}

	}
