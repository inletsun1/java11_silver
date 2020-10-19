package chapt3.q14;

public class Main {

	public static void main(String[] args) {

		String a = "abc";
		String b = new String(a);
		System.out.println(a == b);
		System.out.println("a hash : " + System.identityHashCode(a) + "b hash :" + System.identityHashCode(b));
		System.out.println(b.intern());
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b.intern()));

	}

}
