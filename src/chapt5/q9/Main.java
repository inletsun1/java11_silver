package chapt5.q9;

public class Main {

	public static void main(String[] args) {
		A[] array = {new C(), null, new D()};
		Class clazz = array.getClass();
		System.out.println(clazz.getCanonicalName());
		Object[] objArray = array;

	}

}
