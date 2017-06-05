package part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PredicateLambda {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("One", "Two", "Three", "Four", "Five");
		
		List<String> results = new ArrayList<>();
		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = results::add;
		
		//strings.forEach(System.out::println);
		strings.forEach(c1.andThen(c2));
		results.forEach(c1);
	}
}
