package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistToArray {

	public static void main(String[] args) {
	
		ArrayList<String> l1 = new ArrayList<String>();
		
		l1.add("java");
		l1.add("PHP");
		l1.add("C++");
		l1.add("Python");
		System.out.println(l1);
		
		l1.toArray();
	
		System.out.println(l1);
	}

}
