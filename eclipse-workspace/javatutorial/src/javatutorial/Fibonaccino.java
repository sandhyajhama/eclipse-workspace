package javatutorial;

public class Fibonaccino {
	
	
	public static void main(String[] argv) {
		int n=10;
		int low = 0;
		int hi = 1;
		int i;
		
		System.out.println("First ten Fibonacci numbers are:- ");
		System.out.print(low);
		
		for(i = 1; i<=n;i++) {
			System.out.print(" " +hi);
			hi = low + hi;
			low = hi-low;
			
		}

	}
}
