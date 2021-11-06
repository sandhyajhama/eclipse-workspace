package oopsconcept;

public class Programming {

	 String mesg;
	 
	Programming(String mesg) {			//defining a parameterized constructor to initialize the variable mesg
		 this.mesg = "I love "+mesg;	//argument name of cons is same as variable name so use this to instantiate mesg
	}
	Programming(){
		mesg = "I love programming language";
	}
	
	public static void main(String[] args) {
		
		Programming p1 = new Programming();		//creating object of class Programming but not passing any argument
												//this will call second constructor 
		Programming p2 = new Programming("video game");		//passing argument to the object p2,first constructor will be called
	
		System.out.println(p1.mesg);
		System.out.println(p2.mesg);

	}

}
