package string;
import java.util.*;

public class Assignment7dt082321 {
	public static void main(String[] args) {
	//anagram problem
		System.out.println("Enter any two words here:- ");
		Scanner scan = new Scanner(System.in);
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		 AnagramCheck(s1, s2);    
		        
		 scan.close();
		    }  
		 
	static void AnagramCheck(String str1, String str2) {  
    String s1 = str1.replaceAll("\\s", "");  
    String s2 = str2.replaceAll("\\s", "");  
    boolean status = false;  
    if (s1.length() != s2.length()) {  
        status = false;  
    	
    } else {  
        char[] ArrayS1 = s1.toLowerCase().toCharArray();  //to convert all characters in lower
        char[] ArrayS2 = s2.toLowerCase().toCharArray();  
        Arrays.sort(ArrayS1);  
        Arrays.sort(ArrayS2);  
        status = Arrays.equals(ArrayS1, ArrayS2);  
    		}  
    if (status) {  
        System.out.println(s1 + " and " + s2 + " are anagrams");  
    } else {  
        System.out.println(s1 + " and " + s2 + " are not anagrams");  
    		}  
		}  
	}