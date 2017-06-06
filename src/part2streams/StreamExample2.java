package part2streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("One", "Two", "Three", "Four", "Five"));
		
		Stream<String> stream = list.stream();
		
		list.add("Six");
		
		stream.forEach(System.out::println);
		
		System.out.println("__________________________");
		
		Predicate<String> p = s -> s.length() > 3;
		list.stream().peek(System.out::println).filter(p).forEach(System.out::println);
	}
}
