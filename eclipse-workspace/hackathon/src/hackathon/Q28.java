package hackathon;

import java.util.Scanner;

public class Q28 {			//factorial of a number using recursion

	public static void main(String[] args) {
		int result;
		
		System.out.println("Enter your number hare:-");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		result = Factorial(n);
		System.out.println("Factorial of "+n+" is "+ result);
		s.close();
	}

	static int Factorial(int num) {
		if(num == 1)
		return 1;
		else
			return num * Factorial(num-1);
	}
	
}
