package core.generics.boundedTypesWildCard;

import java.util.ArrayList;
import java.util.List;

public class UperBoundTest {

	/**
	 * Example of uper Bound :-
	 * we can pass only Integer or it's sub-class type of classes in the list.
	 * 
	 * And we can not modify the list.
	 */
	public static <T> void addNumbers(List<? extends Number> list) {
		for(int i=0; i<=10; i++) {
			//list.add(i);
		}
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		
		//List<Object> objects = new ArrayList<Object>();
		//objects.add("hi");
		//addNumbers(objects);
		
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(10.05);
		addNumbers(numbers);
		
		List<Integer> integers = new ArrayList<>();
		integers.add(1008);
		addNumbers(integers);
	}
}
