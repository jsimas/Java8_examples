package part2streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExamples {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-10, -10);
		
		//Integer reduceResult = list.stream().reduce(0, (i1, i2) -> i1 + i2);
		//Integer reduceResult = list.stream().reduce(0, Integer::max);
		Optional<Integer> reduceResult = list.stream().reduce(Integer::max);
		
		System.out.println(reduceResult);
	}
}
