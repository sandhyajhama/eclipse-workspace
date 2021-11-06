package HashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList<Integer>l1 = new LinkedList<>();
		LinkedList<Integer>l2 = new LinkedList<>();
		l1.add(10);
		l1.add(5);
		l1.add(15);
		l1.add(25);
		
		l2.add(10);
		l2.add(5);
		l2.add(15);
		l2.add(25);
		
		for (int i = 0; i < l1.size(); i++) {
			System.out.println("Elements of list are:-" +l1.get(i));
		}	
		
		Collections.sort(l1);
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			System.out.println("Elements are :-" +it.next());
			
		
		}
	}

}
