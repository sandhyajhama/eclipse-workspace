package hackathon;

import java.util.Scanner;

public class Q11StringSplit {

	public static void main(String[] args) {
		System.out.println("Enter any string here:-");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
		
		String[] str1 = str.split(" ");
		for (int i = 0; i <= str1.length-1; i++)
		System.out.println(str1[i]);
		
		s.close();
	}

}
