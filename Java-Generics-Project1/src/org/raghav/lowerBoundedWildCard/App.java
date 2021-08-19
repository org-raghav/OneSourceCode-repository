package org.raghav.lowerBoundedWildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	// Lower Bounded wild card are allow to add item in the list
	// List<? super T> list
	// we can add element to the lower bounded list
	// element must be a type of Number or it's subType only
	public static void printAll(List<? super Number> list) {
		list.add(Integer.valueOf(10));
		//list.add(new String("raghav"));//invalid add
		list.add(Double.valueOf(10.05));
		list.add(Long.valueOf(100L));
		
		//only way of printing is to use Super Type of Number i.e. Object.
		for(Object obj : list)
			System.out.println(obj);
	}
	
	public static void main(String[] args) {
		//List<Number> nums = Arrays.asList(8, 2.3f, 9.77, 607.08, 10);
		List<Number> nums = new ArrayList<>();
		nums.add(Double.valueOf(19));
		nums.add(Double.valueOf(12.7));
		nums.add(Integer.valueOf(3));
		//Exception in thread "main" java.lang.UnsupportedOperationException
		//nums = Arrays.asList(8, 2.3f, 9.77, 607.08, 10);// immutable list
		printAll(nums);
	}

}
