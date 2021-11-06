package mislenius;
import java.util.*;

public class Bookstring1 { //counting no of characters between any specific
						//character in a string.
	public static void main(String[]argv) {
		
		String name = "Sanaadaahaaya";
		char ch = 'a';
		int len = name.length();
		
		int count = 0;
		
		for (int i = 0; i < len; i++) {
			
		if (name.charAt(i) == 'a')
			count++;
		}
		
		System.out.println(count);
		
	}
}