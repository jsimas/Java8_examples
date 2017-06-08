package part4io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadingTextFiles {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("d:", "tmp", "file.txt");
		
		try(Stream<String> s = Files.lines(path)) {
			s.filter(line -> line.contains("ERROR")).findFirst().ifPresent(System.out::println);
		}
	}
}
