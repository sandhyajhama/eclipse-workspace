package string;

public class Assignment1dt082321 {  
		    
	public static void main(String[] args) {  
		      
		        String str = "abcabcabc";   
		        removeDup(str);   
		    }   
		
	public static void removeDup(String str) {      
		        String s1 = new String();   
		          
		        int length = str.length();   
		    
		        for (int i = 0; i < length; i++)    
		        {   
		            char ch = str.charAt(i);   
		          
		            if (s1.indexOf(ch) <0)   
		            {   
		                s1 = s1 + ch;   
		            }   
		        }   
		       
		        System.out.println(s1);  
		    } 
		
	}


		