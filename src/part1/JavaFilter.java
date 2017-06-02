package part1;

import java.io.File;
import java.io.FileFilter;

/**
 * Java Filter Example using FileFilter
 * 
 * @author SIMASJM
 *
 */
public class JavaFilter {

	public static void main(String[] args) {
		FileFilter fileFilter = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".java");
			}
		};
		File dir = new File("c:/tmp");
		File[] files = dir.listFiles(fileFilter);

		if (files != null) {
			for (File file : files) {
				System.out.println("File name: " + file);
			}
		}
	}
}
