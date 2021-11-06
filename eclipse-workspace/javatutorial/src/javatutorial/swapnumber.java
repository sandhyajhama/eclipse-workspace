package javatutorial;
import java.util.Scanner;

public class swapnumber {
public static void main(String[] argv) {
		
		int temp;
		int x;
		int y;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter two no here:");
		x = s.nextInt();
		y = s.nextInt();
		
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("Swaped numbers are :\n"+x);

		System.out.println("\n" +y);
	}

}
