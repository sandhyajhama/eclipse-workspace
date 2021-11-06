package string;

public class SelectionSort {


		 public static void selectionSort(int[] arr){  
		        for (int i = 0; i < arr.length - 1; i++)  //iterate up to second last element in outer loop
		        {  										//as in inner loop we compare second last with last element.
		            int index = i;  
		            for (int j = i + 1; j < arr.length; j++){  
		                if (arr[j] < arr[index]){  
		                    index = j;		//searching index  for smallest element
		                }  
		            }  
		            int smallerNumber = arr[index];   
		            arr[index] = arr[i];  
		            arr[i] = smallerNumber;  
		        }  
		    }  
		       
		    public static void main(String a[]){  
		        int[] arr1 = {9,14,3,-2,43,14,58,22};  
		        System.out.println("Before Selection Sort");  
		        for(int i:arr1){  
		            System.out.print(i+" ");  
		        }  
		        System.out.println();  
		          
		        selectionSort(arr1);//sorting array using selection sort  
		         
		        System.out.println("After Selection Sort");  
		        for(int i:arr1){  
		            System.out.print(i+" ");  
		        }  
		}

	}


