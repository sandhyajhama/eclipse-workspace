package javatutorial;

public class preninedigittostring {
	public static void main(String[] argv) {
		
		String number = "637852";
		int len = number.length();
		
		char chr[] = number.toCharArray();
		
		System.out.println("Your digits are :-");
		for(int i = 0; i < len; i++) {
			
			System.out.print(chr[i]);
		}
		
		for(int i = 0; i < len; i++) {
		switch(chr[i]) {
			
			
					case '0' : System.out.print(" Zero,");
					break;
					case '1' : System.out.print(" One,");
					break;
					case '2' : System.out.print(" Two,");
					break;
					case '3' : System.out.print(" Three,");
					break;
					case '4' : System.out.print(" Four,");
					break;
					case '5' : System.out.print(" Five,");
					break;
					case '6' : System.out.print(" Six,");
					break;
					case '7' : System.out.print(" Seven,");
					break;
					case '8' : System.out.print(" Eight,");
					break;
					case '9' : System.out.print(" Nine,");
					break;
				
					default : 
						System.out.println(chr[i]);        
		}
			
		
			}								//how to print braces around my both format? and new line
		
}
}
	






