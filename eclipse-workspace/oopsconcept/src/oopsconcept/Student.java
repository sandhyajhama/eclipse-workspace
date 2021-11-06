package oopsconcept;

public class Student {
	
	 String n;
	 
	 Student (String c){
		 n = c;
	
	 }
	 Student(){
		 n = "unknown";
	 }
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.n = "Sandhya";
		System.out.println(s1.n);
		
		System.out.println(s2.n);
		
	}

}
