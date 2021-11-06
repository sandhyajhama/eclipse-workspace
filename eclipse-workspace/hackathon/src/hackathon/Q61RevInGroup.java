package hackathon;

import java.util.Scanner;

public class Q61RevInGroup {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter length of array here:- ");
		int len = scan.nextInt();
		int[] array = new int[len];
		System.out.print("Enter elements of array here:- ");
		for(int i = 0; i<= len-1;i++) {
			
			array[i] = scan.nextInt();
		}
		System.out.print("The original array is:- ");
		for (int i:array) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.print("Enter desired numberfor grouping here:- ");
		int k =scan.nextInt();
		reverse(array, len, k);
		System.out.print("The reversed array is :- ");
		for (int i:array) {
			System.out.print(i+ " ");
		}
}
	static void reverse(int array[], int len, int k)
		{
			for (int i = 0; i < len; i = i+ k)		//here for outer loop we increase i with i+k every time.
			{
				int left = i;

				//n is not fully divided by k, than for reversing last group right will be 
				int right = Math.min(i + k - 1, len - 1);  //This Math.min method returns the smaller of two value
				int temp;								//

				while (left < right)
				{
					temp=array[left];
					array[left]=array[right];
					array[right]=temp;
					left = left+ 1;				//increase left
					right = right-1;			//decrease right
				}
			}
		}

		
	}

