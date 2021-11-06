package HashMap;
import java.util.Scanner;

public class SelectionShort {

	public static void main(String[] args) {
		
		int index = 0;
		
		System.out.println("Enter the size of array here:-");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] array = new int [n];		//Declare an array of system input size.
		System.out.println("Enter the element of the array here :-");
		
		for (int i = 0; i <= n-1; i++) {	//taking elements of array as system input.
			array[i] = scan.nextInt();	
		}

		for (int i:array) {					//printing the array with for each loop.
			System.out.print(i+" ");	
		}
		
		//sorting array
		for(int i = 0; i< n-1;i++) {	//iterate up to second last element in outer loop
			index= i;					//take first index of array
		for (int j = i+1; j< n; j++) {		//inner loop starting from second element of unsorted array every time
		if (array[j] < array[index]) {	//if second element is smaller than first one (j = i+1, and index is i)
				index = j;			   //save the index of small element to swap it with first element.
			}
		}
			int temp = array[index];
				array[index] = array[i];
				array[i]=temp;
				}
			
		
		System.out.println("The sorted array is :-");
		for (int i:array) {					//printing the array with for each loop.
			System.out.print(i+" ");	
		}
		scan.close();
	}
}
