package core.generics.basics;

import java.util.ArrayList;
import java.util.List;

class Student{
	
}
public class GenericMethodExample {

	static List<String> listMethod(String s1, String s2){
		List<String> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return list;
	}
	

	static <T> List<T> genericMethod(T s1, T s2){
		List<T> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		return list;
	}

	
	public static void main(String[] args) {
		System.out.println(genericMethod("Apple", "Orange"));
		System.out.println(genericMethod(100, 200));
		System.out.println(genericMethod('A', 'B'));
		System.out.println(genericMethod(new Student(), new Student()));
		String s = genericMethod("Apple", "Orange").get(0);
		System.out.println("value :" + s);
	}

}
