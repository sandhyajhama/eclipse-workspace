package mislenius;

final public class Finalexample {

	public static void main(String[] args){
		 int a = 20;
		 final int x = 10;
		 //x = 20;		//showing error as x is final and we can't change a final variable.
		printline(a);	//println method is final so it can't be overridden by main.
						//output is 35 only.
			 
		}



	final static void printline(int n) {
		
		int i = 35;
		System.out.println("//"+i);
	}
}

		//class NotFinal extends Finalexample{