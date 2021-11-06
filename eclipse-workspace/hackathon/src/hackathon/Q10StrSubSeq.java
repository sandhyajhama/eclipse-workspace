package hackathon;

public class Q10StrSubSeq {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Java Programming");
		System.out.println("Original string is:- "+sb);
		CharSequence cb = sb.subSequence(5,12);
		System.out.println("Substring is:- "+cb);
	}

}
