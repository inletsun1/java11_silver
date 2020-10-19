package chapt3.q12;

public class Main {

	public static void main(String[] args) {
		String a = "sample";
		String b = "sample";
		System.out.print(a == b)  ;
		System.out.print(",");
		System.out.println(a.equals(b));
		System.out.println("a hash : " + System.identityHashCode(a) + ", b hash : " + System.identityHashCode(b));

	}

}
