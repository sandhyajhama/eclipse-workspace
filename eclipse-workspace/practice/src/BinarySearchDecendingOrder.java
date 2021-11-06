import java.util.Scanner;

public class BinarySearchDecendingOrder {
	
	public static void main(String[] args) {
		
	
	System.out.println("Enter any five numbers in desending order:-");
	
	Scanner s = new Scanner(System.in);
	
	int []arr = new int[5];
	
	for(int i = 0; i<5; i++) {
		
		arr[i] = s.nextInt();
	}
	
	for(int i:arr) {
		
	System.out.print(i+" ");
	
	}
			System.out.println("Enter the no you want to search. ");
		
			int key = s.nextInt();
			
			System.out.println(key);
			
			int flag = 0;
		
			int last = arr.length -1;
		
			int first = 0;
		
			while(first >= last) {
				
				int mid = (first + last)/2;
			
				if (arr[mid] == key) {
						
						flag =1;
					
						break;
						
				}
				else if (arr[mid] < key) {
					
					last = mid -1;
				
			}
				else if (arr[mid] < key) {
					
					first = mid +1;
					
				}
			
			
		}
		
			if (flag == 0) 
				
				System.out.println("Element not found. ");
			
			else
				
				System.out.println("Element found.");
		
	
	}
}
