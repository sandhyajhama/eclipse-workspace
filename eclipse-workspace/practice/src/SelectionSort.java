import java.util.Scanner;

public class SelectionSort {

	
	public static void sort(int n, int []array) {
		
		
			for(int i =1; i <= n-1; i++) {
					int k = array[i];
					int j = i-1;
					
					while(j >= 0 && array[j] > k) {
						
						array[j+1] = array[j];
						
						j = j-1;
					}
						array[j+1] = k;
				}
			for(int i : array) {
				
				System.out.println(i + " ");
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
		sort(n,a);
		scan.close();
		}
}


