package hackathon;

public class Q32MergeSortedArray {		//merge B into A in sorted order

	public static void moveToEnd(int array[], int size)
	 {
		 int i, j = size - 1;
		 for (i = size - 1; i >= 0; i--) {//traverse backward from end of array & decrease 
		if (array[i] != -1) {		//elements from last which are not -1, ie entered elements of array.
		  array[j] = array[i];		//push them at last index
		     j--;					//make lase as second last
			}					//because the array is sorted so elements will shift to last as same order.
	    }
	 }
	
			    
	public static void merge(int arr[], int N[], int m, int n) {
			    
		int i = n;
			 
		int j = 0;
			 
		int k = 0;
			 
		while (k < (m + n)) {
			        
		if ((i < (m + n) && arr[i] <= N[j])|| (j == n)) {
			              
			arr[k] = arr[i];
			 k++;
			 i++;
		}
		else 
		 {
			arr[k] = N[j];
			 k++;
			 j++;
		 }
	 }
 }
	public static void printArray(int arr[], int size)
		 {
			int i;
			for (i = 0; i < size; i++)
			    System.out.print(arr[i] + " ");
				System.out.println("");
			    }
			   
		public static void main(String[] args) {
			    
			//Q32MergeSortedArray ma = new Q32MergeSortedArray();
			 
			int array[] = { 3, 9, 12, 18, 22, -1, -1, -1, -1 };
			int N[] = { 4, 7, 8, 25 };
			int n = N.length;
		    int m = array.length - n;
			 
			  moveToEnd(array, m + n);
			  merge(array, N, m, n);
			  printArray(array, m + n);
		}
	  }

	
	


