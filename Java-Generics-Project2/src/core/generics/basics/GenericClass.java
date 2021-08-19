package core.generics.basics;

/**
 * 
 * @author raghavendra
 *
 *Pretty much like a normal class except that class name comes with 
 *the type parameter with diamond operator.
 *
 *Type parameter can be multiple types as well.
 *
 *They are know as parameterized classes.
 *
 *See below example:
 *
 * @param <T>
 */
public class GenericClass<T> {
	T t;
}
class GenericClass2<T, S>{
	T t;
	S s;
}
