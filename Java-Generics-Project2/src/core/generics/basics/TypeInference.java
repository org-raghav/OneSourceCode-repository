package core.generics.basics;

import java.util.ArrayList;
import java.util.List;

class Shape<T>{
	private T t;

	public Shape(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}

public class TypeInference {

	public static void main(String[] args) {
		//Before Java7
		List<String> li = new ArrayList<String>();
		li.add("apple");
		//In java7
		List<String> li1 = new ArrayList<>();
		li1.add("orange");
		
		Shape<String> shape = new Shape<>("circle");
		System.out.println(shape.getT());
	}
}
