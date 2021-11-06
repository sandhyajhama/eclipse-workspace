package hackathon;

import java.util.Scanner;

public class Q19OccurChar {		//display number of occurrence of all character

	public static void main(String[] args) {
		System.out.println("ENTER ANY STRING HERE:-");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine(); 
		
		int[]freq= new int [s.length()]; 
		   
		int i, j;              
		
		char []arr = s.toCharArray();
		
		System.out.println(arr);
		
		for( i = 0; i < arr.length;i++) { 
			freq[i] = 1; 
			for(j = i+1;j < arr.length; j++) { 
				
				if(arr[i] !='0' && arr[i] == arr[j]) { //compare if they are equal and non zero.
					arr[j] = '0';    //assign every such arr[j] which are equal to arr[i] blank,to fail the if condition
					freq[i]++;		//if they equal, increase the value of freq[i] which is 1 initially with every new same element.	
				}
				
			}
			if (arr[i] != '0')
			System.out.println(arr[i]+ " comes " + freq[i]+" times");
		}
				
	}
}
