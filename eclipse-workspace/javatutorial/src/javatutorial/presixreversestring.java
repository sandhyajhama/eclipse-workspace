package javatutorial;

public class presixreversestring {
	
	public static void main(String[] argv) {
		
		String name = "Java Code";
	
		char chr[] = name.toCharArray();
		int len = name.length();
		
		for(int i = len-1; i >=0; i--) {
	
		System.out.print(chr[i]);
		}
	
	}
}


