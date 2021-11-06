package hackathon;

import java.util.Scanner;

public class Q17 {
public static void main(String[] args) {
		
		System.out.println("Enter a string with integer, upper case character and lower case char:-");
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		
		int count= 0;
		int count1 = 0;
		int count2= 0;
		
		for (int i =0; i < s.length();i++) {
			if (Character.isDigit(s.charAt(i))) 
				count++;
			
			else
				if(Character.isUpperCase(s.charAt(i))) 
					count1++;
				
				else
					if(Character.isLowerCase(s.charAt(i))) 
						count2++;
					
		}
		
		System.out.println("No of integers in given string is "+count);
		System.out.println("No of Uper case character in given string is "+count1);
		System.out.println("No of lower case character in given string is "+count2);
		scan.close();
	}
	

}
