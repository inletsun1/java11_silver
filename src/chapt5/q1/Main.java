package chapt5.q1;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[0];
		System.out.println(array);
		Class clazz = array.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getCanonicalName());

	}

}
