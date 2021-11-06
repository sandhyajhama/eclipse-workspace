import java.util.Scanner;

public class PrintUnique {
	//Hackathon Q-5
	public static void main(String[] args) {
		System.out.println("length of array :-	");
		Scanner scan = new Scanner(System.in);
		int array[] = new int[scan.nextInt()];
		
		System.out.println("Elements of array :-	");
		for(int i = 0; i <array.length; i++) {
			array[i] = scan.nextInt();
		}
		for(int i:array)
			System.out.print(i+" ");
		
		int len = array.length;
		int []freq= new int [len];
		
		for (int i = 0; i<= len-1; i++) {
			freq[i]=1;
			for(int j = i+1; j <= len-1; j++) {
				if(array[i]== array[j] && array[i] != ' ')
					array[i] = ' ';
					freq[i]++;
					}
		}
		System.out.println("frequency of elements are:");
		for (int i = 0; i<= len-1; i++) {
		
			System.out.print(+freq[i]+" ");
			}
			
		scan.close();
		
	}
	
}
