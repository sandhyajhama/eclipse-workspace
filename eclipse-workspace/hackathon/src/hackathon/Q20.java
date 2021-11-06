package hackathon;

import java.util.Scanner;

public class Q20 {		//total number of repeated integers, upper case and lower case character in the give string
		
			public static void main(String[] args) {
			
			System.out.println("Enter a string with integer, upper case character and lower case char:-");
			
				Scanner scan = new Scanner(System.in);
			
				String s = scan.nextLine();
			
				char []a = s.toCharArray();
				
				int []freq = new int[a.length];
				
				int count= 0;
				
				int count1 = 0;
				
				int count2= 0;
				
				for( int i = 0; i < a.length;i++) { 
					freq[i] = 1; 
					for(int j = i+1;j < a.length; j++) { 
						
						if(a[i] !='0' && a[i] == a[j]) { //compare if they are equal and non zero.
							a[j] = '0';    //assign every such arr[j] which are equal to arr[i] blank,to fail the if condition
							freq[i]++;		//if they equal, increase the value of freq[i] which is 1 initially with every new same element.	
						}
						
					}
					if (a[i] != '0')
					System.out.println(a[i]+ " comes " + freq[i]+" times");
				}
			
			for (int i =0; i < s.length();i++) {
				
				if (a[i] >= 48 && a[i] <= 57) {
					
					   count++;
				
							}
						else if(a[i] >= 65 && a[i] <= 90) {
					
								count1++;
						}
							else if(a[i] >= 97 && a[i] <= 122) 
					
										count2++;
					}		
			
			System.out.println("No of integers in given string is "+count);
			
				System.out.println("No of lower case character in given string is "+count2);
			
					System.out.println("No of Uper case character in given string is "+count1);
			
					scan.close();
				
			}
			
		
				
			}
			
		

