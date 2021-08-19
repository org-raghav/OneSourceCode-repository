package org.raghav.genericMethod;

/**
 * 
 * @author raghavendra
 * 
 * <T extends Comparable> is a bounded type Generic Bounded type
 * generics are used for bound to a method to a specific type Always use
 * extends keyword in generics No matter Interface or class
 */
public class GenericMethodExample2 {

	//We can call this method with class type which implements Comparable interface.
	//This is minimum requirement of our method that both object must be comparable together. 
	// Integer, Double, String, our Person etc extends Comparable interface
	public static <T extends Comparable<T>> T calcualteMin(T t1, T t2) {
		if (t1.compareTo(t2) < 0)
			return t1;
		return t2;
	}

	public static <T extends Comparable<T>> T calcualteMax(T t1, T t2) {
		if (t1.compareTo(t2) > 0)
			return t1;
		return t2;
	}
	
	public static void main(String[] args) {
		
		Person p1 = new Person("raghav", 33);
		Person p2 = new Person("akash", 31);
		Person p = calcualteMin(p1, p2);
		System.out.println(p);
		
		p = calcualteMax(p1, p2);
		System.out.println(p);
		
		int p3 = p1.compareTo(p2);
		System.out.println(p3);
		
		Integer i1 = 100;
		Integer i2 = 10;
		Integer i = calcualteMin(i1, i2);
		System.out.println(i);
		
		String str1 = "raghav";
		String str2 = "akash";
		String str = calcualteMin(str1, str2);
		System.out.println(str);
	}
}
class Person implements Comparable<Person>{
	
	private String name;
	private Integer age;
	
	public Person(String name, Integer age){
		this.name=name;
		this.age=age;
	}

	@Override
	public int compareTo(Person otherPerson) {
		return this.age.compareTo(otherPerson.getAge());
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
