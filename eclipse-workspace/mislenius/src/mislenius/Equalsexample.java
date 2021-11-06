package mislenius;
public class Equalsexample {

		
	public static void main(String[] args) {
		
		String []name = {"Rani","Sandhya","Shree"};
		String substr = "rani";
		boolean found = false;
		int len = name.length;
		
		
		for (int i = 0; i <= len-1; i++) {
			
			if(substr.equals(name[i])) {
				found = true;
				break;
				
			}
		}
			if (found) //if condition is true i.e. found = true expression will execute.
				System.out.println("The substring exits.");
			else
				System.out.println("The substring not exits.");
			
		}

	}

