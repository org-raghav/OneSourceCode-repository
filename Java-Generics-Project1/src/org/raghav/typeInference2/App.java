package org.raghav.typeInference2;

import java.util.ArrayList;
import java.util.List;

public class App {

	// We must declare <T> return type with List<T> type.
	public static <T> List<T> add(List<T> list, T item1, T item2) {
		list.add(item1);
		list.add(item2);
		return list;
	}

	public static void main(String[] args) {

		// Type of arrayList is automatically determine by type inference algorithms
		// algorithms says:: apply most specific class Type that fits to all.
		List<Integer> list1 = add(new ArrayList<>(), 20, 30);
		System.out.println(list1);
		
		List<String> list2 = add(new ArrayList<>(), "Adam", "Raghav");
		System.out.println(list2);
		
		List<Character> list3 = add(new ArrayList<>(), 'A', 'R');
		System.out.println(list3);
	}

}
