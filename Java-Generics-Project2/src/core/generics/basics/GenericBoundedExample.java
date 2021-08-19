package core.generics.basics;

public class GenericBoundedExample {

	public static void main(String[] args) {
		System.out.println("*********** inspect1 ****************");
		inspect1("Hello");
		inspect1(100);
		inspect1(10.0);
		inspect1(3.14f);
		inspect1(2000L);
		inspect1(1000l);
		inspect1('C');
		
		System.out.println("*********** inspect2 ****************");
		inspect2(20);
		
		System.out.println("*********** display ****************");
		Integer displayInteger = display(100, 200);
		System.out.println(displayInteger);
		
		System.out.println("*********** findMax ****************");
		Integer findMax = findMax(10, 30, 20);
		System.out.println(findMax);
		Integer findMax1 = findMax(30, 30, 20);
		System.out.println(findMax1);
		
	}
	
	public static <T> void inspect1(T t) {
		System.out.println("T type is : "+ t.getClass().getName());
	}
	
	/**
	 * Bounded type example
	 * 
	 * Bounded to Number and it's sub classes only.
	 * 
	 * @param <T>
	 * @param t
	 */
	public static <T extends Number> void inspect2(T t) {
		System.out.println("T type is : "+ t.getClass().getName());
	}
	
	public static <T extends Comparable<T>>T display(T t1, T t2) {
		return t1.compareTo(t2)>0? t1:t2;
	}
	
	public static <T extends Comparable<T>> T findMax(T t1, T t2, T t3) {
		T max = t1;
		if(t2.compareTo(t1)>0)
			max=t2;
		if(t3.compareTo(t2)>0)
			max=t3;
		return max;
	}
	
	
	
	
	
	

}
