package org.raghav.genericMethod;

/**
 * 
 * @author raghavendra
 * <T> unbounded types Java Generic Example
 */
public class GenericMethodExample1 {

	// After declaring T type in method argument it is very important to
	// add generics return Type even the method is void return type
	public <T> void method1(T item) {
		System.out.println("The item is::" + item.toString());
	}
	
	// <T> is  a unbounded type generic
	public <T> void method2(T[] items) {
		for (T t : items)
			System.out.println("The item is::" + t);
	}

	// method return T type which is of generics type T
	public <T> T method3(T item) {
		System.out.println("The item is::" + item.toString());
		return item;
	}
	
	// two arguments generic type
	public <T, V> void method4(T t, V v) {
		System.out.println(t.toString());
		System.out.println(v.toString());
	}
}
