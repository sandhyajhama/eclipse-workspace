package advancejava;

public class Student implements Comparable<Student> {

	String name;
	int Id;
	int age;
	
	Student(String name, int Id, int age){
		this.name = name;
		this.Id = Id;
		this.age = age;
	}
	
	public int compareTo(Student s) {
	return this.age - s.age;
	}
	
}
