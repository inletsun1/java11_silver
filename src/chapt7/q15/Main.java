package chapt7.q15;

public class Main {

	public static void main(String[] args) {
		A[] array = {new B(), new C()};
		Class clazz = array.getClass();
		System.out.println(clazz.getCanonicalName());
		for(var obj : array) {
			Class tmp = obj.getClass();
			System.out.println(tmp.getCanonicalName());
		}

		array[0].hello();
		array[1].hello();
		C array1 = (C) array[1];
		array1.world();

	}

}
