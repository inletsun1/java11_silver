package chapt3.q10;

public class Main {

	public static void main(String[] args) {
		Object a = new Sample(10);
		Object b = new Sample(10);

		System.out.println(a.equals(b));
		Class clazz_a = a.getClass();
		System.out.println(clazz_a.getCanonicalName());
		System.out.println(clazz_a.getTypeName());
		System.out.println(a instanceof Object);

		Sample c = (Sample) a;
		Sample d = (Sample) b;

		System.out.println(c.equals(d));
		System.out.println(c instanceof Object);


	}

}
