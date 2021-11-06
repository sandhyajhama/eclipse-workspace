package javatutorial;

public class presevenrevword {

public static void main(String[] argv) {
		
		String name = "Sandhya is a good girl";
		
		
		char chr[] = name.toCharArray();
		int len = name.length();
		
		for(int i = len-1; i >=0; i--) {
			
			if(chr[i] == ' ') {
				System.out.print(" ");
				i = i-1;
			}
			
		
		System.out.print(chr[i]);
		}
	
	}
}

