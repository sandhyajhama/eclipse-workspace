package javaobject;

public class Student {
	
	 static String name = "Sandhya";
	 static int mark = 85;
	
	static void Show_details() {
		try {
			try {
				System.out.println("Name of the Student is "+name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Marks of the Student is"+mark);
	}
	

}
