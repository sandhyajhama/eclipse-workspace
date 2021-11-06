package hackathon;

import java.util.Scanner;

public class Q3sortarray {

	public static void main(String[] args) {
		System.out.println("Enter the length of the array:-");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int []array = new int[len];
		System.out.println("Enter the elements of the array here:-");
		
		for (int i = 0; i <= len-1; i++) {
			array[i] = scan.nextInt();
		}
		System.out.print("Array before sorting:-");
		for (int i = 0; i <= len-1; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Array after sorting:-");
		for (int i = 0; i <= len-1; i++) {
			for(int j = i+1; j <= len-1;j++) {
			if(array[j] < array[i]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				}
			}
		}
		System.out.println();
		for (int i = 0; i <= len-1; i++) {
			System.out.print(array[i]+" ");
	}
		scan.close();
	}
}
