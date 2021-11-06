package hackathon;

import java.util.HashMap;
import java.util.Scanner;

public class Q5 {		//Given an array prints the unique numbers.


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
		
		HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
		for(int i = 0; i < array.length; i++){
		hm.put(array[i], i);
		}
		System.out.println(hm.keySet());
		scan.close();
	}
	
}
