
public class HachQ5 {

	public static void main(String[] args) {

		String s = "ABBCEAABCAB"; 			//this program printing last character as output if you make line 23 comment
										//or it print arr[j] of line 23.
		int[]freq= new int [s.length()]; //size of freq array,for worse situation, when there is no duplication.
		char minChar = s.charAt(0);   //assign the first character of given string to a char variable minChar
		int i, j, min;              //Declare i and j for for loop and min to hold integer of array freq
		
		char []arr = s.toCharArray();	//convert the given string into character array for traversing the elements.
		System.out.println(arr);
		for( i = 0; i < arr.length;i++) { //create outer for loop to traverse all characters of array arr.
											
			freq[i] = 1; 
			for(j = i+1;j < arr.length; j++) { //start with second character to all over the last character
				
				if(arr[i] !='0' && arr[i] == arr[j]) { //compare if they are equal and non zero.
					arr[j] = '0';    //assign every such arr[j] which are equal to arr[i] blank,to fail the if condition
					freq[i]++;		//if they equal, increase the value of freq[i] which is 1 initially with every new same element.	
					 
				}
			
			}
		}
				min = freq[0]; //assign first frequency to variable min.
				for( i = 0; i < freq.length;i++){ //to traverse the array freq
					System.out.print(freq[i]+" ");
				
				if(min > freq[i] && freq[i] != '1') //if any non zero element of freq is greater than min
					min = freq[i];					//put that value to min
					minChar = arr[i];
					System.out.println(minChar);
					System.out.println("     Minimum occuring character :- "+minChar+" index is "+i); 
				}
		}
}
