package org.raghav.typeInference1;

import java.util.ArrayList;
import java.util.List;

class Bucket<T> {

	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return this.item;
	}
}

//type inference Example
///Bucket<T> bucket = new Bucket<>(); rhs has no type , this concept is called type inference 
public class App{
	
	public static <T> void addStore(T t, List<Bucket<T>> list) {
		Bucket<T> bucket = new Bucket<>();
		bucket.setItem(t);
		list.add(bucket);
		System.out.println(t.toString() + " has been added to the list");
	}
	
	public static void main(String[] args) {
		// type inference
		List<Bucket<String>>  list = new ArrayList<>();
		App.addStore("Adam", list);
	
		// <String> is called Type witness
		// Every T in addStore() method replaced by <String>
		App.<String>addStore("Raghav", list);//VVIP
	}
}
