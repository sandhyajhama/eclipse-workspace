package mislenius;
import java.util.Scanner;
public class Primeno {

	public static void main(String[] args) {
		System.out.println("Enter your no here:- ");
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		
		System.out.printf("%d\n", number);
		
		int i =2;
		while (i < number)
		number = number % i;
			if (number != 0) {
					System.out.println("This is a prime no.");
			}
				else
					System.out.println("This is a not prime no.");
			}
		}
			
	


