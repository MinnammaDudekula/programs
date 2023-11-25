package Java8;

import java.util.function.BiConsumer;

public class Bi_Consume {
	static void say(String name,int age) {
		System.out.println("hello "+name+" ur age is "+age);
	}
	public static void main(String[] args) {
		BiConsumer<String, Integer> bicon=Bi_Consume::say;
		bicon.accept("MANU", 12);
		
	}

}
