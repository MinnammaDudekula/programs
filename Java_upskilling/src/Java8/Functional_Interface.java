package Java8;
@FunctionalInterface
interface Drawable {
	void draw();
}

public class Functional_Interface {
	public static void main(String[] args) {
		int width = 10;
//		Drawable d1 = new Drawable() {
//			public void draw() {
//				System.out.println("anonimous class drawing" + width);
//
//			}
//
//		};
//		d1.draw();
		Drawable d2=() ->System.out.println(width);
		d2.draw();
	}
}
