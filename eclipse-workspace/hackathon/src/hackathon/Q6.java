package hackathon;
import java.util.Scanner;

public class Q6 {				//selection sort
	
	
		public static void insertionSort (int []a) {
			int i,j,k;
			for (i = 1; i < a.length;i++) {
				k = a[i];
				j = i-1;
				
				while(j >= 0 && a[j] > k) {
					a[j+1]= a[j];
					j = j-1;
				}
					a[j+1] = k;
			}
			for(int val:a) {
				System.out.print(" "+val);
			}
		}
		public static void main(String[] args) {
			System.out.print("Enter number of elements of the array:-"); 	//to declare an array we need a fixed size for it.
			Scanner scan = new Scanner(System.in);
			
			int n = scan.nextInt();
			int []a = new int[n];
			System.out.print("Enter elements of the array:-");	
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			System.out.println("Sorted array is:- ");
			insertionSort(a);
			scan.close();
	}

}
