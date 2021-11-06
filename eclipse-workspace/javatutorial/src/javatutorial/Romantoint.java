package javatutorial;

import java.util.Scanner;

public class Romantoint {

	public static void main(String[] args) {
		
		System.out.println("Enter your roman letter here(in capital only) :-");
		Scanner S = new Scanner(System.in);
		
		String str = S.next();
		
			System.out.println(str);
				
			int len = str.length();
					int i = 0;
					int sum = 0;
					while(i >= len-1) {
						if (roman_int(str.charAt(i))>= roman_int(str.charAt(i+1))) {
							sum = sum +roman_int(str.charAt(i));
							i = i+1;
							System.out.println(sum);
						}
						else {
							sum = sum + roman_int(str.charAt(i+1)) - roman_int(str.charAt(i));
							i = i +2;
						}
					}
					System.out.println(sum);
				}
				
		
			
		

		static int roman_int(char ch) {
			int n = 0;
			
			switch(ch) {
			
			case 'M': n =1000;		// whenever ch = M, store 1000 in int n
			break;
			case 'D': n = 500;
			break;
			case 'C': n = 100;
			break;
			case 'L': n = 50;
			break;
			case 'X': n = 10;
			break;
			case 'V': n = 5;
			break;
			case 'I': n = 1;
			break;
			default:
				System.out.println("Invalid input.");
			}
			return n;				//return the value of n to whom who calls it.
			}
		
		}

