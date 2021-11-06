package string;

public class Assignment5dt082321 {

	public static void main(String[] args) {
		
		 String name = "I am learning java";
	
		 String words[]=name.split("\\s");  
		 int len = words.length;
		 
		 System.out.println("The required string is:- ");
		
		 for (int j = len-1; j >=0; j--) 
			System.out.print(" "+words[j]);
		
		}
	

	
}
