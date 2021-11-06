package practiceexercise;

import java.util.Scanner;

public class intpelindrom {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number here:-");
		
		int num = scan.nextInt();
		
		int temp = num;
		
		System.out.println(num);
		
		int rem=0;
		
		int sum = 0;
		
		while (num > 0) {
		
			rem = (num % 10);
		
			sum = (sum*10) +rem;
		
			num = num/10;
		
		}
		
		System.out.println(sum);
		
		if(temp == sum) 
			System.out.println("Number is pelindrom.");
		
		else
			System.out.println("Number is not a pelindrom.");
	}

}
