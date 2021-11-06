package practiceexercise;

public class palindrom {

	public static void main(String[] args) {
		 
		int[] num = {123};
		int n = num.length;
		int l = (n- n%2)/2;
		boolean value =false;
		for (int i = 0; i <= l; i++) {
			if (num[i] == num[n-1-i]) 
					value = true;
					continue;
			}
			if(value)
				System.out.println("Number is a pelindrom");
			
			else
				System.out.println("Number is not a pelindrom");
		}
		
	}


