package advancejava;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Entry {

	public static void main(String[] args) {
		
		LinkedList<Student>studentList = new LinkedList<>();
		
		studentList.add(new Student("Sandhya",1,35));
		studentList.add(new Student("Kaushal",5,40));
		studentList.add(new Student("Kriti",3,10));
		
		System.out.println("Student's age before sorting");
		Iterator<Student>it = studentList.iterator();
		while(it.hasNext()) {
			Student tempstudent = it.next();		
			System.out.println(+tempstudent.age);
		}
		System.out.println("Student's age after sorting.");
		Collections.sort(studentList);
		Iterator<Student>it1 = studentList.iterator();
		while(it1.hasNext()) {
			Student tempstudent = it1.next();
			System.out.println(tempstudent.age);
		}
	}

}
