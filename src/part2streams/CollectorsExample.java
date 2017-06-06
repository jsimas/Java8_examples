package part2streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CollectorsExample {

	public static void main(String[] args) throws IOException {
		List<Person> persons = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(
				new InputStreamReader(CollectorsExample.class.getResourceAsStream("persons.txt")))) {

			Stream<String> lines = reader.lines();
			lines.map(line -> {
				String[] a = line.split(" ");
				Person p = new Person(a[0].trim(), Integer.valueOf(a[1]));
				persons.add(p);
				return p;
			}).forEach(System.out::println);
		}
		
		System.out.println("________");
		Stream<Person> stream = persons.stream();
		stream.filter(p -> p.getAge() > 20).forEach(System.out::println);
		System.out.println("________");
		stream = persons.stream();
		Optional<Person> min = stream.filter(p -> p.getAge() > 20).min(Comparator.comparing(Person::getAge));
		System.out.println(min);
		System.out.println("________");
		
		
		
	}
}
