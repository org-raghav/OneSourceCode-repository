package org.raghav.unboundedWildCards2;

import java.util.ArrayList;
import java.util.List;

public class App3 {
	
	public static void printAll(List<?> anyType) {
		for (Object obj : anyType)
			System.out.println(obj);
	}
	public static <T extends Shape> void drawAll(List<T> shapes) {
		for (T shape : shapes)
			shape.draw();
	}

	public static void main(String[] args) {
		List<Rectangle> rectangles = new ArrayList<>();
		rectangles.add(new Rectangle());
		drawAll(rectangles);
	}
}