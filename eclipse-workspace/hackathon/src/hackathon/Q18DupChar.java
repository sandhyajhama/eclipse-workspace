package hackathon;

import java.util.Scanner;

public class Q18DupChar {		//duplicate character in string 
	public static void main(String[] args) {  
		
		System.out.print("Write a line here:-");  
        Scanner scan = new Scanner(System.in); 
        String str = scan.nextLine();
        int count;  
          
         
        char string[] = str.toCharArray();  
          
        System.out.println("Duplicate characters in a given string: ");  
        
        for(int i = 0; i <string.length; i++) {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;   
                    string[j] = '0';  
                }  
            }  
             
            if(count > 1 && string[i] != '0')  
                System.out.print(string[i]+" ");  
        }  
        scan.close();
    }  

}