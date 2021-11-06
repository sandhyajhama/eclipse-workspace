package practiceexercise;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		

		System.out.println("Enter your no here:-");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int sum = 0;
		
		int rem;
		
		while(num > 0) {
			
			rem = num %10;
			
			sum = sum + rem;
			
			num = num /10;
		}
		System.out.println(sum);
		
		scan.close();
	}
	
}
