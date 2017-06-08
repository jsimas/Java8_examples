package part4io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExploringDirectories {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("c:", "Vodafone");
		
		
		try(Stream<Path> s = Files.list(p)) {
			s.filter(path -> path.toFile().isDirectory()).forEach(System.out::println);
		}
		
		try(Stream<Path> s = Files.walk(p, 2)) {
			s.filter(path -> path.toFile().isDirectory()).forEach(System.out::println);
		}
	}
}
