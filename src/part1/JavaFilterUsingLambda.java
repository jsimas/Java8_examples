package part1;

import java.io.File;
import java.io.FileFilter;

public class JavaFilterUsingLambda {

	public static void main(String[] args) {
		FileFilter fileFilter = (File file) -> file.getName().endsWith(".java");
		File dir = new File("c:/tmp");
		File[] files = dir.listFiles(fileFilter);
		
		if (files != null) {
			for (File file : files) {
				System.out.println("File name: " + file);
			}
		}
	}
}
