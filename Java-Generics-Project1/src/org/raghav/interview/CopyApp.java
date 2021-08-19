package org.raghav.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyApp {

	public static <T> void copy(List<? extends T> source, List<? super T> destination) {
		for(int i=0; i<source.size(); i++)
			destination.add(source.get(i));
	}
	
	public static void main(String[] args) {
		List<Integer> nums1 = Arrays.asList(1,2,3,4,5);
		List<Integer> nums2 = new ArrayList<>();
		copy(nums1, nums2);
		System.out.println(nums2);
 	}

}
