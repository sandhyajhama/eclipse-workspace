package advancejava;

public class Factorialrecur {

	
	public static void main(String[] args) {
		int result;
		int n = 6;
		result = Factorial(n);
		System.out.println("Factorial of "+n+" is "+ result);
	}

	static int Factorial(int num) {
		if(num == 1)
		return 1;
		else
			return num * Factorial(num-1);
	}
}
