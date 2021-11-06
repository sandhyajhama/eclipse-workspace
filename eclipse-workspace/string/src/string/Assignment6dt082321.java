package string;

import java.util.Scanner;

public class Assignment6dt082321 {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	 String str = scan.nextLine();
	 
	 String substr = scan.next();
	 
	 CountNumber(str, substr);
	}
	 public static void CountNumber(String str1, String str2) {
	 int count= 0;
	 int result = 0;
	 
	 int position = str1.indexOf(str2);
	 System.out.println("Index of first position of substring is "+position);
	 
	 int lastposition = str1.lastIndexOf(str2);
	 System.out.println("Index of last position of substring is "+lastposition);
	 
	 for (int i = 0; i < str1.length(); i++) {
		 if (str1.charAt(i) == ' ')
			 count = count+1;
	 
	 result = lastposition -position -count;
	 }
	 System.out.println("There are "+result+" characters between first and last occurence");
	}

}
