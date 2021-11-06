package javatutorial;

import java.util.Scanner;

public class prefourswap {
public static void main(String[] argv) {
		
		int x;
		int y;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two no here:");
		x = s.nextInt();
		y = s.nextInt();
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Swaped numbers are :\n"+x);

		System.out.println("\n" +y);
	}

}

