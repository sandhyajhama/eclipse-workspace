package hackathon;

import java.util.HashMap;
import java.util.Scanner;

public class Q15UniqueWord {		//print the unique words of the string.

	public static void main(String[] args) {
			System.out.println("Enter your string here:-");
			Scanner scan = new Scanner (System.in);
			String str = scan.nextLine();
			String words[]=str.split("\\s");
			HashMap<String, Integer>hm = new HashMap<String,Integer>();
					for(int i = 0; i< words.length; i++) {
						hm.put(words[i], i);
					}
					System.out.println(hm.keySet());
	}

}
