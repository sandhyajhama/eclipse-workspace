package practiceexercise;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		int i = 1;
		
		int []sum = new int[20];	//range of long is 20 digits long.
		
		System.out.println("Enter your no here:-");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		while(num >= 1) {
			
			sum[i++] = num % 2; 		
			
			num = num/2;
		}
		
		 System.out.print("Binary number is: ");
		 
	        for(int j=i-1; j>0; j--)		//print the array in reverse except 
	        								//the last element where num = 0 & num%2 = 0
	        {
	            System.out.print(sum[j]);
	        }
			System.out.println();
		
		scan.close();
	}

	}


