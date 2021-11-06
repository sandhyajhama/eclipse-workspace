package Object;

public class Objectexample {
	
	public static void main(String[] argv) {
		
		Student Sandhya = new Student();
		
		
		Sandhya.setName("Sandhya Mahaseth.");
		Sandhya.setMark(95);
		Sandhya.setAge(35);
		
		System.out.println("Student name is "+Sandhya.getName() + "\nstudent age is "+ Sandhya.getAge());
		System.out.println("Student marks is "+Sandhya.getMark()) ;
		
	
	}

}
