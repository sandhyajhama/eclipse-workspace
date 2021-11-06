package mislenius;

import java.util.Scanner;

public class Equalmethod {

	public static void main(String[]argv) {
		
		System.out.println("Enter your words here:-");
		
		Scanner s = new Scanner(System.in);
		
		String word1 = s.next();
		System.out.println(word1);
		
		
		String word2 = s.next();
		System.out.println(word2);
		
		
		if (word1.equals(word2)) 
			
			System.out.println("Equal");
		else
			System.out.println("Not equal");
}
}