package org.raghav.unboundedWildCards2;

import java.util.ArrayList;
import java.util.List;

public class App2 {

	public static void drawAll(List<Shape> shapes) {
		for (Shape shape : shapes)
			shape.draw();
	}

	// We can not call drawAll() method with List<Rectangles>
	// because List<Rectangles>  is not a sub-type of List<Shape> even Rectangle is a child of Shape.
	// so that's why we use wild card i.e. ? 
	public static void main(String[] args) {
		List<Rectangle> rectangles = new ArrayList<>();
		//drawAll(rectangles);//we can't do this
	}
}
