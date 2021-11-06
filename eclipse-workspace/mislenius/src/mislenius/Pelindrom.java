package mislenius;
import java.util.Scanner;



public class Pelindrom {

	public static void main(String[]argv) {
		
		System.out.println("Enter any word here to check pelindrom:-");
		
		Scanner s = new Scanner(System.in);
		String word = s.next();
		
		
		int len = word.length();
	
		String rev= "";
		
		for (int i = len-1;i >=0; i--) {
			 rev =rev + word.charAt(i);
		}
		System.out.println("The reverse  string is :-"+rev);
		System.out.println(word);
		
		if (word.equals(rev)) 
		
			System.out.println("This string is pelindrom.");
		
		else
			System.out.println("This string is not a pelindrom.");
		
}
}

