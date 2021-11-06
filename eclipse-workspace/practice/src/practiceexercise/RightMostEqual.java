package practiceexercise;

import java.util.Scanner;

public class RightMostEqual {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers here:- ");
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = scan.nextInt();
		
		int n2 = scan.nextInt();
		
		int n3 = scan.nextInt();
		
		n1 = n1 % 10;
		
		n2 = n2 %10;
		
		n3 = n3 %10;
		
		boolean a = (n1==n2);
		
		boolean b = (n2 == n3);
		
		boolean c = (n1 == n3);
		
		if(a || ( (b || c) || (b && c)))
			
			System.out.println("Right most digit of at least two numbers are same. ");
			
				else
						
					System.out.println("Right most digit of two or more numbers are not same. ");
		
						scan.close();
		}
			
		}
		
		
	


