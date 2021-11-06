package hackathon;

import java.util.Scanner;

public class Q27 {			//ascending order Quick sort
public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array here:-");
		n  = scan.nextInt();
		int []array = new int[n];
		System.out.println("Enter elements of array here:-");
		for(int i = 0; i<= n-1;i++) {
			array[i] = scan.nextInt();
		}
		for(int i:array) {
			System.out.println(i+" ");
	}
		quick(0,n-1,array);
		System.out.println("Sorted elements of array after quick sort are:- ");
		for(int i:array) {
			System.out.println(i+" ");
			scan.close();
	}	
}
	private static void quick(int l, int m, int[] arr) {
		if(l<m) {
			int p = partition(l,m,arr);
			quick(l,p-1,arr);
			quick(p+1,m,arr);
		}
	}
private static int partition(int l, int m, int[] arr) {
		int pivot = arr[l], i = l, j = m;
		while(i<j) {
			while(pivot <arr[j] && j>l)
				j--;
			if(i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[l];
		arr[l] = arr[j];
		arr[j] = temp;
		return j;
	}
		
	}
