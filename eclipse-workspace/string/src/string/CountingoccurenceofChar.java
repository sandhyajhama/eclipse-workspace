package string;

public class CountingoccurenceofChar {

	public static void main(String[] args) {
		
		String s = new String("The ssssss is s and ssns is again ssss.");
		int len = s.length();
		char c ='s';
		int count  = 0;
		for(int i = 0; i <= len-1;i++) {
			if (s.charAt(i)== c) {
				
				count++;
			}
		}	
				System.out.println("There are "+count+" s in this line.");
		
	}

}
