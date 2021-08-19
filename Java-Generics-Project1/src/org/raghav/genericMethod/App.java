package org.raghav.genericMethod;

public class App {

	public static void main(String[] args) {
		
		GenericMethodExample1 genericMethodExample = new GenericMethodExample1();
		genericMethodExample.method1("Hello World Java Generics !!!");

		//We can't do like below because generic work only with Object not with primitive type
		int[] nums = { 1, 2, 3, 4, 5 };
		// genericMethodExample.method2(nums);

		//We can do this following
		Integer[] integerArray = { 1, 2, 3, 4, 5 };
		genericMethodExample.method2(integerArray);

	}
}
