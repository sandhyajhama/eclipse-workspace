package hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class Q26 {			//merge two sorted array

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of first array");
		int len1 = s.nextInt();
		System.out.println("Enter the length of second array");
		int len2 = s.nextInt();
		int []array1= new int[len1];
		int []array2= new int[len2];
		
		System.out.println("Enter the elements of first array");
		
		for (int i = 0; i< len1-len2;i ++) {
			array1[i] = s.nextInt();
			}
		Arrays.fill(array1, len1-len2,len1,Integer.MAX_VALUE);//if don't want to use this method fill array 
															//with max value for index (len1-len2)+1.
		
		System.out.println("Enter the elements of first array");
		for (int i = 0; i<len1;i ++) {
			System.out.print(array1[i]+" ");
			}
		System.out.println();
		System.out.println("Enter the elements of second array");
		for (int i = 0; i<len2;i ++) {
			array2[i] = s.nextInt();
			}
		System.out.println("Second array is:-");
		for (int i = 0; i<len2;i ++) {
			System.out.print(array2[i]+" ");
		}
		int temp = 0;
		for(int i = 0; i <= len1-1; i++) {
			for (int j = 0;j <= len2-1; j++) {
				if(array2[j] < array1[i]) {
					temp = array1[i];
				    array1[i]= array2[j];
				    array2[j]= temp;
				}
			}
		}
		System.out.println("Merged sorted array is:-");
		for (int i = 0; i<len1;i ++) {
			System.out.print(array1[i]+" ");
			s.close();
			}
		
		}
	
	}

