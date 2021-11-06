package hackathon;

import java.util.Scanner;

public class Q34PlusOpe { 	//implement *, - , / operations. You should use only the + operator 

	public static int negate(int num) {
		
		return ~num+1;
	}
	
	public static int absolute(int num) {
		
		if(num > 0)
		
			return num;
		
		else 
				
			return ~num+1;
		
	}
	
	public static int substract(int num1, int num2) {
		
		int num = negate(num2);
		
		return (num1+num);
	
	}
	
	public static int multiplication(int num1, int num2) {
		
		int multiplier = absolute(num1);
		
		int multiplicant = absolute(num2);
		
		int result = 0;
		
		for (int i = 1; i <= multiplier; i++) {
			
			result = result + multiplicant;
		}
		
		if(((absolute(num1) == num1) && (absolute(num2) == num2)) || ((absolute(num1) != num1) && (absolute(num2) != num2)))
			
			return (result);
		
		else if
		
		((absolute(num1) == num1) || (absolute(num2) == num2))
			
			return negate(result);
		
		else
		
			return result;
	}
		
	
	public static int devision(int num1, int num2) {
		
		return num2;
		
		
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println("Enter any two digits for substraction here:-");
		
		//Scanner scan = new Scanner(System.in);
		
		//int a = scan.nextInt();
		
		//int b = scan.nextInt();
		
		//int c = substract(a,b);
		
		//System.out.println("Substraction of given two digits are: "+c);
		
		
		System.out.println("Enter any two digits for multiplication here:-");
		
		Scanner scan1 = new Scanner(System.in);
		
		int a1 = scan1.nextInt();
		
		int b1 = scan1.nextInt();
		
		int mul = multiplication(a1,b1);
			
		System.out.println("Multiplication of given two digits are: "+mul);
		
	}

}
