package core.generics.basics;

public class MultipleBoundedTypes {

	public static void main(String[] args) {
		Integer findMax = findMax(200, 300, 100);
		System.out.println(findMax);
		Double gD = findMax(20.05, 10.05, 8.05);
		System.out.println(gD);
	}

	public static <T extends Number & Comparable<T>> T findMax(T t1, T t2, T t3) {
		T max = t1;
		if(t2.compareTo(t1)>0)
			max=t2;
		if(t3.compareTo(max)>0)
			max=t3;
		return max;
	}
}
