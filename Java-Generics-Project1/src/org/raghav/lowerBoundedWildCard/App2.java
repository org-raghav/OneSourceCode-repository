package org.raghav.lowerBoundedWildCard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class App2 {
	
	// This list may be contains Number or it's super any type
	// so that why iteration required Object type because it is the most super type Object.
	// We can add element to list but element must be Number or it's sub Type.
	// We can call this method with a list minimum containing  number or it's any super type.
	public static void showAll(List<? super Number> list) {
		for(Object obj : list)
			System.out.println(obj);
	}

	public static void main(String[] args) {
		
		//Lower Bounded wild card examples
		// initializing arrayList with Integer or it's super type
		// we can iterate only with Integer or it's Super Type.
		List<? super Integer> list1 = new ArrayList<Integer>();
		List<? super Integer> list2 = new ArrayList<Number>();
		List<? super Integer> list3 = new ArrayList<Object>();
		
		//showAll(list1); //invalid because (minimum) lower bound is Number 
		
		//Number class extend Object implements Serializable 
		List<? super Number> nums = new ArrayList<>();
		//We can add element to lower bounded wild card
		// but element must be the given type or it's Sub type
		nums.add(3);//valid because Integer is a sub type of Number
		nums.add(10.23);//valid because Double is a sub type of Number
		nums.add(50.3f);//valid because Float is a sub type of Number
		//Valid  call
		showAll(nums);
		
		//Valid call because Number extends Object
		List<? super Object> objects = new ArrayList<>();
		showAll(objects);
		
		//Valid call because Number extends Serializable
		List<Serializable> list = new ArrayList<>();
		list.add("Adam");
		list.add("Raghav");
		list.add("Mark");
		showAll(list);
	}

}
