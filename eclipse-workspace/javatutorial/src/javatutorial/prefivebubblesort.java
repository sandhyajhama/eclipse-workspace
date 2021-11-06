package javatutorial;
public class prefivebubblesort {
	
	static void bubblesort(int arr[]) {
		
		int n = arr.length;
		int temp = 0;
		
		for(int i = 0; i < n; i++) {			
			
			for (int j = 1 ; j < (n-i); j++) {  //after every pass one digit has bubbled up as sorted from last
												//so we have to do this n-i pass.
				if(arr[j-1]>arr[j]) {		//if previous word is greater than current word
					
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
			}}}}
	public static void main(String[] argv) {
		
		int arr[] = {5,3,8,1,0,80,90};
		
		System.out.println("Array befor sorting :-");
		
		for(int i = 0; i< arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		bubblesort(arr); 
		
		System.out.println("Array after sorting :-");
			
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print(arr[i]+" ");
	}}}