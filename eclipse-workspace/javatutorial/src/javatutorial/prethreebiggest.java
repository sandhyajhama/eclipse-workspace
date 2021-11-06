package javatutorial;

import java.util.Scanner;

public class prethreebiggest {
public static void main(String[] argv) {
		
		int temp;
		int firstlargest;
		int secondlargest;
		int thirdlargest;
		int sum;
		
		System.out.println("Enter three digits here :");
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		System.out.println("First variable is "+a);
		
		int b= s.nextInt();
		System.out.println("Second variable is "+b);
		
		int c= s.nextInt();
		System.out.println("Third variable is "+c);
		
		sum = (a + b+ c);
				
		temp = a>b?a:b;
		firstlargest = (c >temp?c:temp);
	
		
			temp = a<b?a:b;
			thirdlargest = (c <temp?c:temp);
			
				sum = sum - firstlargest - thirdlargest;
				
					System.out.println("\nlargest variables is "+firstlargest);	
			
					System.out.println("\nSecond largest variables is "+sum);	
					
					System.out.println("\n third largest variables is "+thirdlargest);	
						
				}							

			}




