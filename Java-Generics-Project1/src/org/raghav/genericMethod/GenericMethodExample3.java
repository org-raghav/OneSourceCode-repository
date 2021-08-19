package org.raghav.genericMethod;

public class GenericMethodExample3 {
	
	//<T extends Number> since T extends Number so T can use Number class Methods.
	// t.doubleValue(), t.intValue(), t.byteValue(), t.longValue(), t.shortValue() etc...
	// Bounded types allow you to invoke the method defined in bounded type Class/Interface
	// return type could be Double, double or any Number subType  
	public static <T extends Number> double add(T num1, T num2){
		double result = num1.doubleValue() + num2.doubleValue();
		return result;
	}

	public static void main(String[] args) {
		double result = add(20.5, 10);
		double FloatResult = add(20.5, 3.0f);
		System.out.println("The result is:: " + result);
		System.out.println("The result is:: " + FloatResult);
	}

}
