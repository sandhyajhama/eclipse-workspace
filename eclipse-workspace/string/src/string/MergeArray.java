package string;

public class MergeArray {
	
	void moveToEnd(int array[], int size)
		    {
		        int i, j = size - 1;
		        for (i = size - 1; i >= 0; i--) {
		            if (array[i] != -1) {
		                array[j] = array[i];
		                j--;
		            }
		        }
		    }
		    void merge(int mPlusN[], int N[], int m, int n)
		    {
		        int i = n;
		 
		        int j = 0;
		 
		        int k = 0;
		 
		        while (k < (m + n))
		        {
		            if ((i < (m + n) && mPlusN[i] <= N[j])
		                || (j == n)) {
		                mPlusN[k] = mPlusN[i];
		                k++;
		                i++;
		            }
		            else 
		            {
		                mPlusN[k] = N[j];
		                k++;
		                j++;
		            }
		        }
		    }
		   void printArray(int arr[], int size)
		    {
		        int i;
		        for (i = 0; i < size; i++)
		            System.out.print(arr[i] + " ");
		 
		        System.out.println("");
		    }
		   
		  public static void main(String[] args)
		    {
		        MergeArray mergearray = new MergeArray();
		 
		        int array[] = { 3, 9, 12, 18, 22, -1, -1, -1, -1 };
		        int N[] = { 4, 7, 8, 25 };
		        int n = N.length;
		        int m = array.length - n;
		 
		        mergearray.moveToEnd(array, m + n);
		 
		        mergearray.merge(array, N, m, n);
		 
		        mergearray.printArray(array, m + n);
		    }
		  }

