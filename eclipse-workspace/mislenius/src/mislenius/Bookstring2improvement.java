package mislenius;
import java.util.*;

public class Bookstring2improvement {

	public static void main(String[] args) {
		
		System.out.println("Enter your word and specific character here:");
		
		Scanner s = new Scanner(System.in);
		String word = s.next();
		char ch = s.next().charAt(0);
		
		int len = word.length();
	
		System.out.println(word);
		System.out.println(ch);
		
		int count = 0;
		
		for (int i = 0; i < len; i++) {
			
		if (word.charAt(i) == ch)
			count++;
		}
		System.out.println(count);
	}

}
