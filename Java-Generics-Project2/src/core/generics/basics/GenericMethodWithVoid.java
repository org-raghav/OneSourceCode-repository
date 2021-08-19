package core.generics.basics;

public class GenericMethodWithVoid {

	public static <T> void printData(T[] t) {
		for(T data : t) {
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		Integer[] intArray = new Integer[] {1,2,3,4,5};
		Character[] charArray = new Character[] {'A','B','C'};
		String[] stringArray = new String[] {"One", "Two", "Three"};
		
		//generic does not allow primitive data type
		int[] intarr = new int[] {1,2,3,4,5};
		//printData(intarr);//not allowed
		
		printData(intArray);
		printData(charArray);
		printData(stringArray);
	}

}
