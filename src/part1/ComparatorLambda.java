package part1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

	public static void main(String[] args) {
//		Comparator<String> c = new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return Integer.compare(o1.length(), o2.length());
//			}
//		};
		
		Comparator<String> c = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
		
		//Comparator<Integer> c2 = Integer::compare;
		
		List<String> list = Arrays.asList("**", "***", "*");
		list.sort(c);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
