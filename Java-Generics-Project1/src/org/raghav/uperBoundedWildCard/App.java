package org.raghav.uperBoundedWildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void showAll(List<? extends Number> list) {
		for(Number n : list)
			System.out.println(n);
	}
	
	public static double sumAll(List<? extends Number> list) {
		double sum = 0;
		for(Number n : list)
			sum += n.doubleValue();
		return sum;
	}

	public static void main(String[] args) {
		
		// UpperBoundedWildCard Example
		// we cannot add element to list because we do not know exact subType
		// list is kind of read only or modify only type.
		List<? extends Number> list = new ArrayList<>();
		//list.add(new Integer(22));
		list.add(null);//fine
		
		List<? extends Number> list1 = new ArrayList<Integer>();
		List<? extends Number> list2 = new ArrayList<Long>();
		List<? extends Number> list3 = new ArrayList<Double>();
		List<? extends Number> list4 = new ArrayList<Float>();
		List<? extends Number> list5 = new ArrayList<Byte>();
		List<? extends Number> list6 = new ArrayList<Short>();
		
		showAll(list1);showAll(list2);showAll(list3);
		showAll(list4);showAll(list5);showAll(list6);
		
		// Valid because Integer is a subType of Number
		List<Integer> integers = new ArrayList<Integer>();
		showAll(integers);
		
		// Valid
		showAll(Arrays.asList(1,2,3));
		
		//Mix //Valid
		showAll(Arrays.asList(0.5f,2,3.00));
		
		double sumAll = sumAll(Arrays.asList(1.2f, 3.00, 7, 8, 10.05, 2.5f, 1825L));
		System.out.println("The sumAll is :: "+ sumAll);
	}

}
