package mislenius;

import java.util.Scanner;

public class sumofarray {

	public static void main(String[] args) {
		
		
		
		System.out.println("size of array-");
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int array[] = new int[n];//defining and initializing array with 10 elements.
		
		System.out.println("Enter the numbers here:-");
		for (int i = 0; i < n;i++) {
			array[i] = s.nextInt();// Assigning array the next scanned number.
			
		}

		System.out.print("array elements are:-\n");
		for (int i = 0; i <n;i++) {
			System.out.println(" " +array[i]);
			
	}

		int sum= 0;
		for (int i = 0; i < n;i++) {
	    sum = sum +array[i];
	
		}
		System.out.println("\nSum of array is " +sum);
	}
}
