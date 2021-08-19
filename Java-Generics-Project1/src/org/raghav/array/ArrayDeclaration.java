package org.raghav.array;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		
		Integer[] integers = {1,2,3,4};
		
		String[] strings = {"Raghav", "Amit", "Ban", "Man", "Nilu"};
		
		String[] stringArrays = new String[]{"Raghav", "Amit", "Ban", "Man", "Nilu"};
		
		Integer[] integerArrays1 = new Integer[] {1,2,3,4};
		
		Integer[] integerArrays2 = new Integer[10];
		
		System.out.println(nums.toString());
		System.out.println(integers.toString());
		System.out.println(strings.toString());
		System.out.println(stringArrays.toString());
		System.out.println(integerArrays1.toString());
		System.out.println(integerArrays2.toString());
		
	}

}
