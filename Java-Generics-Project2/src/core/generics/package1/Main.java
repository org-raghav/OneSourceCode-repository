package core.generics.package1;

import java.util.List;

public class Main {
	
	//We can not add elements to the upperBound Generic 
	// just like below list
	// but we can remove the element
	//and iterate list object.
	public static void m1(List<? extends Number> list) {
		//list.add(1);
		list.remove(1);
	}
	
	//we can add Number or its child in lowerBound generic
	//but we can only pass(call it) Number or it's super type.
	public static void m2(List<? super Number> list) {
		list.add(1);
		list.add(10.00);
		list.add(new Integer(2));
		list.add(100);
	}

	public static void main(String[] args) {

	}

}
