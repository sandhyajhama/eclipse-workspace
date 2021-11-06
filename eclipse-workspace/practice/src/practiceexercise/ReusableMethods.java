package practiceexercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReusableMethods {

	
		
		public static void scansystemforint() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the length of array here:");
			int len = scan.nextInt();
			int []array = new int[len];
			System.out.println("Enter the elements of array here:");
			
			for(int i = 0; i<= len-1;i++) {
				
				array[i] = scan.nextInt();
			}
			for(int i:array) {
				
				System.out.print(i+" ");
			}
			
		}
		
		public static void scansystemforstring() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your string here:");
			String str = scan.nextLine();
			System.out.print(str);
		}
		
		public static void sortarrayint() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the length of array here:");
			int len = scan.nextInt();
			int[] array = new int[len];
			System.out.println("Enter the elements of array here:");
			
			for(int i = 0; i<= len-1;i++) {
				
				array[i] = scan.nextInt();
			}
			for(int i:array) {
				
				System.out.print(i+" ");
			}
				Arrays.sort(array);
				System.out.println();
				for(int i:array) {
				System.out.print(i+" ");
		}
		
		}

}
