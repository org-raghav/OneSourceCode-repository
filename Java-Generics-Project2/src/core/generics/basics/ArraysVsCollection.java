package core.generics.basics;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsCollection {

	public static void main(String[] args) {
		//Array
		String[] str = new String[10];
		str[0] = "john";
		str[1] = "Nancy";
		//str[11] = "Sam";//ArrayOutOfBoundException
		System.out.println("String array is :" + str);
		String name = str[0];// No need to type-cast, and automatically type safety.
		
		//Collection
		List li = new ArrayList();// No type-safe
		li.add("john");
		li.add("Nancy");
		li.add(new Integer(100));
		System.out.println(li);
		
		String name1 = (String)li.get(0);// Need to type-cast
		System.out.println("THe name1 :" + name1);
		
		int value = (int)li.get(2);
		System.out.println("value :" + value);
	}

}
