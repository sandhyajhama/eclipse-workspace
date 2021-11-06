package practiceexercise;

import java.util.Arrays;
import java.util.Scanner;

public class Removeduplicate extends ReusableMethods {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array here:");
		int len = scan.nextInt();
		int[] array = new int[len];
		int[]freq = new int[len];
		System.out.println("Enter the elements of array here:");
		
		for(int i = 0; i<= len-1;i++) {
			
			array[i] = scan.nextInt();
		}
		for(int i:array) {
			
			System.out.print(i+" ");
		}
			Arrays.sort(array);
			System.out.println("The sorted array is:-");
			for(int i:array) {
			System.out.print(i+" ");
			}
	
		for(int i = 0; i<= len-1;i++) {
			freq[i] = 1;
			for(int j = i+1; j<len; j++) {
				if (array[i]== array[j] && array[i] != 0)
					array[j] = 0;
					freq[i]++;
					}
				}
		System.out.println();
		Arrays.sort(array);
		System.out.println("The sorted array without duplicate value is:-");
		
		for(int i= 0; i <= len-1; i++) {
			if (array[i] == 0)
				array[i] = '_';
			System.out.print(array[i]+" ");
			
		
		}
	}
			
}


