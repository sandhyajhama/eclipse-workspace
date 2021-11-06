import java.util.Arrays;
import java.util.Scanner;

public class mergsort {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int []array1 = new int[10];
		int []array2 = new int[4];
		
		System.out.println("Enter the elements of array1 in accending order:-");
		for(int i = 0; i < 6; i++) {
			array1[i] = s.nextInt();
		}
		Arrays.fill(array1, 6, 10, Integer.MAX_VALUE);
		
		System.out.println("Enter the elements of array2 in accending order:-");
		for(int j = 0; j <4; j++) {
			array2[j] = s.nextInt();
		}
		int temp=0;
		for(int i = 0; i <10; i++) {
			for(int j = 0; j <4; j++) {
				if( array1[i] > array2[j] ) {
					temp = array1[i];
					array1[i]= array2[j];
					array2[j]= temp;
				}
			}
		}
		System.out.println("The merged sorted array is:-");
		for(int i = 0; i < 10; i++) {
			System.out.print(array1[i]+" ");
		}
	}

}
