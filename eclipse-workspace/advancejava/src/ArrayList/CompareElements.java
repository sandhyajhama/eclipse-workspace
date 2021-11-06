package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareElements {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("White","Box","Automation"));
		ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Selenium","Box","Automation"));
		//Arrays.asList used to convert an array to a fixed-size List object(to compare arraylist)	
		
		ArrayList<String> list3 = new ArrayList<String>();
		
		
		for(String str :list1)
			list3.add(list2.contains(str)? "Yes": "No"); 	//method 1 - contains
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		Collections.sort(list1);	//method 2 - sort 
		System.out.println("The sorted list1 is : "+list1);
		if(list1.equals(list2)) 	//method 3 - to check if lists are equal.
			System.out.println("Lists are equal.");
		else
			System.out.println("Lists are  not equal.");
		
	}

}
