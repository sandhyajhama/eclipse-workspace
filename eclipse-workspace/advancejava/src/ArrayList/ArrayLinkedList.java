package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLinkedList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		
		list2.add(11);
		list2.add(21);
		list2.add(31);
		list2.add(41);
		list2.add(51);
		
		Iterator<Integer> itr1=list1.iterator(); 
		while(itr1.hasNext()){  
		System.out.print(" "+itr1.next());  
		}  
		System.out.println();
		
		Iterator<Integer> itr2=list2.iterator(); 
		while(itr2.hasNext()){  
			System.out.print(" "+itr2.next());  
			}
		System.out.println();
		boolean boolval = list1.equals(list2);
		if (boolval == true)
		System.out.println("Lists are equal.");
		else
			System.out.println("Lists are not equal.");	
		
	}

}
