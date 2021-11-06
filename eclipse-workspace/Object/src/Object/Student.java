package Object;    //Example of encapsulation.

public class Student {
	
	String fullname = "";
	
	public String getName() {
		return fullname;
	}

	public void setName(String name) {
		this.fullname = name;
	}
	
	
	
	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	int mark;
	int age;
	
	public void Shows_details() {
		
		System.out.println("Name of the student is "+fullname);
		System.out.println("Mark of the student is "+mark);
		System.out.println("Age of the student is "+age);
	}

}
