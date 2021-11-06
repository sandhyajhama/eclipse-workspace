package traing;
import java.util.*;
public class Assignment1dt081921 {

	public static void main(String[] args) {
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter any two numbers here :-");
		int a = number.nextInt();
		int b = number.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int rem = a%b;
		
		System.out.println("Addition of the given two numbers is :-  "+add);
		System.out.println("Substraction of the given two numbers is :-  "+sub);
		System.out.println("Multiplication of the given two numbers is :-  "+mul);
		System.out.println("Division of the given two numbers is :-  "+div);
		System.out.println("Remainder of the given two numbers is :-  "+rem);
		
		number.close();
	}
		
}
