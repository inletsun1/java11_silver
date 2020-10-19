package chapt5.q5;

public class Main {
	public static void main(String[] args) {
		Item[] items = new Item[3];
		Class clazz = items.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getCanonicalName());
		System.out.println(System.identityHashCode(items));
		System.out.println(System.identityHashCode(items[0]));
		System.out.println(System.identityHashCode(items[1]));
		for(int i = 0; i < items.length; i++) {
			items[i] = new Item();
		}
		System.out.println(System.identityHashCode(items));
		System.out.println(System.identityHashCode(items[0]));
		System.out.println(System.identityHashCode(items[1]));
		System.out.println(items[0].price);
	}

}
