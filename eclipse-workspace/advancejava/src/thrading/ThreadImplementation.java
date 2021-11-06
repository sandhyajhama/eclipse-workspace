package thrading;

 public class ThreadImplementation {
	 public static void main(String[] args) throws Exception {
			Hi obj1 = new Hi();
			obj1.start();
			Hello obj2 = new Hello();
			obj2.start();
	 }
 }
 class Hi extends Thread{ 
 
  public void run() {
		for(int i = 1; i <=5 ;i++) {
			System.out.println("Hi!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Hi implements Runnable{ 
	public  void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
