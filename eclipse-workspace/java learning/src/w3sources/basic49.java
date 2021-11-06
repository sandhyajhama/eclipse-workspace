package w3sources;

import java.util.Scanner;

public class basic49 {

	public static void main(String[] args) {
		
		System.out.print("Enter your no here:-");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		if (num %2 == 0 )
			System.out.println("1");
		else
			System.out.println("0");
			

	}

}
