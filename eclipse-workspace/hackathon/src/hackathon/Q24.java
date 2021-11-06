package hackathon;

import java.util.Scanner;

public class Q24 {		//possible consecutive number combinations

	
	public static void main (String[] args)
	{
		System.out.println("Enter your number here:-");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("possible consecutive number combinations of "+n +" are:- ");
	    ComNum(n);
	    scan.close();
	}
	
	static void ComNum(int n)
	{
	   
	    int begin = 1;
	    int end = (n + 1) / 2;	//
	
	    while (begin < end)
	    {
	        int sum = 0;
	        for (int i = begin; i <= end; i++)
	        {
	            sum = sum + i;
	 
	            if (sum == n)
	            {
	            	for (int j = begin; j <= i; j++)
	                     
	                    System.out.print(j + " ");
	                    System.out.println();
	                break;
	            }
	 
	            if (sum > n)
	                break;
	        }
	        sum = 0;
	      begin++;
	      
	    }
	  
	}
	
}
	 
	
		


