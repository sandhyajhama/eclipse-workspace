package mislenius;

public class Bookstring2 {
	public static void main(String[]argv) {
		

	String name = "Sandaanhsvaanamaya";
	char ch = 'a';
	
	int len = name.length();
	
		int begpos = name.indexOf(ch);
	if (begpos<0)
		System.out.println("Character is not there.");
	int endpos = name.lastIndexOf(ch);
	int pos = 0;
	
	for(int i =0; i < len;i++) {
		pos = name.indexOf(ch);
		pos++;
	}
		System.out.printf("%d\n", pos);
		
	
	
	System.out.println( endpos - begpos -1);
}
}