package traing;
import java.util.Scanner;
public class Assignment1dt082021 {
	
	public static void main(String[] args) {
		
		System.out.print("Enter number of row here:- ");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		for(int i = 1; i <= row; i++) {     //under outer for loop there is two inner
			for (int j=row; j>i;j--) {		//loop, one for space.
				System.out.print(" ");
					}
				for (int k=1; k<=2*i-1;k++) {		//one for star.
					System.out.print("*");		//
					}	
				System.out.println();
				}	
		for(int i = row-1; i >= 1; i--) {
			for (int j=row; j>i;j--) {
				System.out.print(" ");
				}
				for (int k=1; k<=2*i-1;k++) {
					System.out.print("*");
			}	
				System.out.println();
		}
		scan.close();
	}
}
			