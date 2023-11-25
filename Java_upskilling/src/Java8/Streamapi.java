package Java8;

import java.nio.file.DirectoryStream.Filter;
import java.util.*;

public class Streamapi {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mang");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(12);
		li.add(13);
		li.add(54);
		li.add(234);
		
		System.out.println(list);
		list.stream().filter(p -> p.length()>4).forEach(System.out::println);
		long c=li.stream().filter(n ->n>20).count();
	}
}
