package hackerRankFirst;


	import java.io.*;
	import java.util.*;
	public class TwoDArray {
		
	
	    public static void main(String[] args)
	    {
	        int a[][] = new int[6][6];
	        int maxSum = Integer.MIN_VALUE;
	        
	        System.out.println("Enter elements of array here:-");
	       Scanner scanner = new Scanner(System.in);
	        {
	            for(int i = 0; i < 3; i++)
	            {
	                for(int j = 0; j < 3; j++)
	                {
	                    a[i][j] = scanner.nextInt();
	                    if (i > 1 && j > 1)
	                    {
	                        int sum =
	                            a[i][j]
	                            + a[i][j-1]
	                            + a[i][j-2]
	                            + a[i-1][j-1]
	                            + a[i-2][j]
	                            + a[i-2][j-1]
	                            + a[i-2][j-2];
	                        if (sum > maxSum) {maxSum = sum;}
	                    }
	                }
	            }
	        }
	        System.out.println(maxSum);
	        scanner.close();
	    }
	}

