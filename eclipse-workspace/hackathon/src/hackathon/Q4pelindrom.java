package hackathon;

import java.util.Scanner;

public class Q4pelindrom {

	public static void main(String[] args) {
		
		System.out.println("Enter number of elements of array to check pelindrom:-");
		
		Scanner s = new Scanner(System.in);
		int number = s.nextInt();
		int []array = new int[number];
		System.out.println("Enter elements of array here :- ");
		
		for(int i = 0; i<= number-1;i++) {
			array[i] = s.nextInt();
		}
		for(int i:array){
			System.out.print(i+" ");
		}
		boolean value = true;
		int l = (number - number%2)/2;
		for(int i = 0; i<= l; i++) {
			
		 if(array[i]!= array[number-1-i])
			 value = false;
		 		break;
		}
			if(value) 
				System.out.println("The array is a pelindrom.");
			else
				System.out.println("The array is not a  pelindrom.");
			s.close();
		}
		
	
	
	}

	

