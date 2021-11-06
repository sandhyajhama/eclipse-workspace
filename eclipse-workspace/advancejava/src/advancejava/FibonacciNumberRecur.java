package advancejava;

public class FibonacciNumberRecur {

	public static void main(String[] args) {
		int n = 15;
		int i = 0;
		while(i <= n-1) {
		System.out.print(fibn(i)+" ");
		i++;
		}
	}
	 static int fibn(int n) {
		if(n == 0)
			return 0;
		if (n <= 2)
			return 1;
		
		int fibnum = fibn(n-1) + fibn(n-2);
			return fibnum;
		
	}

}
