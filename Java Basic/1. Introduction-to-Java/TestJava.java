import java.util.*;

public class TestJava {
	public static void main(String... args) {
		System.out.println("Hello Java");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.stream().forEach(x -> System.out.println(x));
		System.out.println("Mikata");		
	}
}
