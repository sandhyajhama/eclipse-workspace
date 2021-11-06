package mislenius;

import java.util.Scanner;

public class Ocurrence {

	public static void main(String[] args) {
		
		System.out.println("size of array-");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int array[] = new int[n];//defining and initializing array with 10 elements.
		
		System.out.println("Enter the numbers here:-");
		for (int i = 0; i < n;i++) {
			array[i] = s.nextInt();// Assigning array the next scanned number.
			
		}

		System.out.println("array elements are:-");
		for (int i = 0; i <n;i++) {
			System.out.print(" " +array[i]);
		}
	}	
}
