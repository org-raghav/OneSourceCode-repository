package core.generics.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UpperBoundWildcardExample1 {

	public static void main(String[] args) {
		List<Integer> integers = IntStream.rangeClosed(1, 100).boxed()
				.collect(Collectors.toList());
		calculateSum(integers);
	}
	
	/**
	 * ? known as wild-card
	 * below ?(wild-card) can only contains Number or it's sub-classes 
	 * @param list
	 */
	public static void calculateSum(List<? extends Number> numberList) {
		double sum = 0;
		for(Number n:numberList) {
			sum = sum + n.doubleValue();
		}
		System.out.println("Total is : "+ sum);
	}

}
