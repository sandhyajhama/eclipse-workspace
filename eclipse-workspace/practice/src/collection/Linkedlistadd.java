package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlistadd {

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		
		l1.add(10);		a1.add(50);
		
		l1.add(20);		a1.add(60);
		
		l1.add(30);		a1.add(70);
		
		l2.add(11);		a2.add(81);
		
		l2.add(12);		a2.add(12);
		
		l2.add(13);		a2.add(19);
		
		l1.addAll(l2);		a1.addAll(a2);
		
		l1.addAll(a1);
		
		Collections.sort(l1);
		
		Iterator it = l1.iterator();
		
		System.out.print("The sorted list with all elements is:- ");
		
		System.out.println();
		
		while(it.hasNext()) {
			
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
	
		if(l1.contains(12)) 
			
			System.out.println("Linked list contains digit 12. ");
		
		else
			
			System.out.println("Linked list does not contains 12 ");
	}

}
