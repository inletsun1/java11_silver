package chapt4.q12;

public class Main {

	public static void main(String[] args) {
		String[] array = {"A", "B", "C"};
		for(String str : array) {
			System.out.print(System.identityHashCode(str));
			str = "D";
			System.out.println(", " + System.identityHashCode(str));
		}

	}

}
