package part2streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("One", "Two", "Three", "Four", "Five");
		
		Predicate<String> p1 = s->s.length() >3;
		Predicate<String> p2 = Predicate.isEqual("Two");
		Predicate<String> p3 = p1.or(p2);
		stream.filter(p3).forEach(System.out::println);
	}
}
