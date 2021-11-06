package w3sources;
import java.util.*;
public class Twodarray {

	public static void main(String[] args) {
		
		System.out.print("Enter no of row here:-\n");
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		
		
		System.out.print("Enter no of column here:-\n");
		int column = s.nextInt();
	
		
		int array[][] = new int[row][column]; //create and initialize an array with new 
		
		System.out.println("Enter your elements of array here :-\n");
		
		for (int i = 0; i <= row -1; i++) {
			for (int j = 0;j <= column-1; j++) {
				array[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i <= row -1; i++) {
			for (int j = 0;j <= column-1; j++) {
				System.out.print(+array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\n");
	}
}
