package practiceexercise;

import java.util.Scanner;

public class ToggelWord {

	public static void main(String[] args) {
	
		System.out.println("Enter your line here:- ");
		
		Scanner s = new Scanner(System.in)
;
		String str = s.nextLine();
		
		char[]array = str.toCharArray();
		
		for(int i =0; i < array.length; i++) {
			
			if(Character.isUpperCase(array[i]))
				
				array[i]= Character.toLowerCase(array[i]);	//assign the lower case to array[i]
				
			else if (Character.isLowerCase(array[i]))
				
				array[i]= Character.toUpperCase(array[i]);
			
			System.out.print(array[i]);
		}
		s.close();
	}

}