package practiceexercise;

import java.util.Scanner;

public class SumOfBinary {

	public static void main(String[] args) {
		
		long b1,b2;
		
		int i = 0;
		
		int rem = 0;
		
		int []sum = new int[20];	//range of long is 20 digits long.
		
		Scanner scan = new Scanner(System.in);
		
		b1 = scan.nextLong();
		
		b2 = scan.nextLong();
		
		while(b1 != 0 || b2 !=0) {
			
			sum[i++] = (int)((b1 % 10 + b2 %10 + rem) %2); 		//casting long to int
			
			rem = (int)((b1 % 10 + b2 %10 + rem) /2); 
			
			b1 = b1 /10;
			
			b2 = b2 /10;
		}
		
		if(rem != 0) {
			
			sum[i++] = rem;
		}
			i--;
			
		while(i >= 0) {
			
			System.out.print(sum[i--]);
		}
			System.out.println();
		
		scan.close();
	}

}
