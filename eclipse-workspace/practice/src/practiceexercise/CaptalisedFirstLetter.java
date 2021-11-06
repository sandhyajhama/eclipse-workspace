package practiceexercise;

import java.util.Scanner;

public class CaptalisedFirstLetter {

	public static void main(String[] args) {
		
		System.out.println("Enter any string here:-");
		
		Scanner s = new Scanner(System.in);
		
		char []arr = (s.nextLine()).toCharArray();
		
		int len = arr.length;
		
		
		for(int i = 0; i <= len-1; i++) {
			
			arr[0] = Character.toUpperCase(arr[0]);
			
			if(arr[i] == ' ')
			{
				arr[i+1] = Character.toUpperCase(arr[i+1]);
			}
		
		}
		for(int i = 0; i <= len-1; i++)
		System.out.print(arr[i]);
		
		s.close();
		
	}
		
}
