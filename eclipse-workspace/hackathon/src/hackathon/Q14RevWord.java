package hackathon;

import java.util.Scanner;

public class Q14RevWord {		//reverse of the words string.(Input: Java Code Output: Code Java)

	public static void main(String[] args) {
		

		System.out.println("Enter your string here :-	");
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
			String array[]=str.split("\\s");
			
			int len = array.length;
			
				for (int i =0; i <= len-1; i++) {
					
					System.out.print(array[i]+" ");
				}
				System.out.println();
				
			for (int j = len-1; j >=0;j--){
				
				System.out.print(array[j]+" ");
			}
	}

}