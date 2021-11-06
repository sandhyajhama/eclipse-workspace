package javatutorial;
import java.util.*;
public class biggest {
	public static void main(String[] argv) {
		
		
		System.out.println("Enter three digits here :");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("First variable is "+a);
		int b= s.nextInt();
		System.out.println("Second variable is "+b);
		int c= s.nextInt();
		System.out.println("Third variable is "+c);
		
		int result = (a+b+c)/2;
		if(a >= result)
			System.out.println("Biggest variables is "+a);
		else
			if(b >= result)
				System.out.println("Biggest variables is "+b);
			else
				if(c >= result)
					System.out.println("Biggest variables is "+c);
		
		
	}

}
