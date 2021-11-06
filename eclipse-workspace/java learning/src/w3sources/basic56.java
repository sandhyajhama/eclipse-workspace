package w3sources;

import java.util.Scanner;

public class basic56 {

	public static void main(String[] args) {
		System.out.println("Enter your range here and the specific no to devide the range:-  ");
		
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int p = in.nextInt();
		
		
			if(x%p == 0)  
				System.out.print(y/p - x/p+1);
			
			else
				System.out.print(y/p - x/p);
			
		}

	}


