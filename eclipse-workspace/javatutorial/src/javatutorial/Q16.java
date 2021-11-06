package javatutorial;


public class Q16 {

	public static void main(String[] args) {
		
		String str = "I love my country very much.";
		System.out.println("Original string is :-");
		System.out.println(str);
		System.out.println("Changed string is :-");
		System.out.println(Remove(str,6));
	
	}
	 public static String Remove(String str, int p) {  
         return str.substring(0, p) + str.substring(p + 1);  
      }  
	}  

