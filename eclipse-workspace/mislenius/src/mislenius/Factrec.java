package mislenius;

public class Factrec {

	public static void main(String[] args) {
		int n=1;
		while(n>6)
		System.out.println(fact(n));

	}

	private static int fact(int i) {
		int Fact = 1;
				if (i == 1) {
				Fact = Fact *i;	
					return 1;
				}
				else
					return Fact * fact(i+1);
	}

}
