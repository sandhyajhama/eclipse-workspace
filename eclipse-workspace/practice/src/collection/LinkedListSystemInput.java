package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSystemInput {

	public static void main(String[] args) {
		
		System.out.println("Enter elements of first linked list.");
	
		Scanner scan = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<>();
		
		LinkedList<String> l2 = new LinkedList<>();
		
		l1.add(scan.next());
		l1.add(scan.next());
		l1.add(scan.next());
		
		System.out.println("Enter elements of second linked list.");
		
		l2.add(scan.next());
		l2.add(scan.next());
		l2.add(scan.next());
		
		Iterator itr1 = l1.iterator();
		
		while(itr1.hasNext())
			
			for(int i = 0; i < l1.size(); i++) {
				
				System.out.print(itr1.next()+" ");
			}
			
		System.out.println();
		
		Iterator itr2 = l2.iterator();
		
		while(itr2.hasNext())
			
			for(int i = 0; i < l2.size(); i++) {
				
				System.out.print(itr2.next()+" ");
				
			}
		
		System.out.println();
				
		if(l1.contains("Mahaseth"))
			
			System.out.print("Sirname is Mahaseth ");
		
		else
			
			System.out.print("Sirname is Shree ");
		
			scan.close();
			
			}
			
	}


