package org.raghav.unboundedWildCards1;

import java.util.Arrays;
import java.util.List;

public class App {

	//We can only print the list but we can not add anything into it 
	//because we do not know the type.
	public static void print(List<?> list) {
		for (Object obj : list)
			System.out.println(obj);
	}

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3);
		print(nums);
		
		List<String> strings = Arrays.asList("Adam", "Raghav", "Bob");
		print(strings);
	}

}
