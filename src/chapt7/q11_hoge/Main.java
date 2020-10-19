package chapt7.q11_hoge;

import chapt7.q11.B;

public class Main {

	/**
	 * アクセス制御なしのhello()メソッドをpublicでオーバライドさせた。
	 * public hello()で親クラスのhello()を呼び出すと、
	 * パッケージ外からもクラスBのhello()メソッドを通じて呼び出せるようになった。
	 * @param args
	 */
	public static void main(String[] args) {
		B b = new B();
		b.hello();

	}

}
