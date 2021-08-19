package core.generics.basics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author raghavendra
 * 
 * The main benefit of lower-bound is we can modify/add elements
 * to the given list which is not possible in upper-bound.
 *
 */
public class LowerBoundWildCardExample {

	// upper-Bound - ? extends Class
	// lower-Bound - ? super Class
	public static void main(String[] args) {
		List<Object> list = IntStream.rangeClosed(1, 100)
				.boxed().collect(Collectors.toList());
		lowerBoundDisplay(list);
		//uperBoundDisplay(list);
	}

	public static void lowerBoundDisplay(List<? super Number> list) {
		list.add(new Integer(1008)); // allowed
		for(Object number : list) {
			System.out.println(number);
		}
	}
	
	public static void uperBoundDisplay(List<? extends Number> list) {
		//list.add(new Integer(1008)); // not allowed
		for(Object number : list) {
			System.out.println(number);
		}
	}
	
}
