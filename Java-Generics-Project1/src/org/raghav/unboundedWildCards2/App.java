package org.raghav.unboundedWildCards2;

import java.util.ArrayList;
import java.util.List;

public class App {

	//we cannot add elements in shapes
	public static void drawAll(List<Shape> shapes) {
		for (Shape shape : shapes)
			shape.draw();
	}

	public static void main(String[] args) {
		Shape rectangel = new Rectangle();
		Shape circle = new Circle();
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(rectangel);
		shapes.add(circle);
		drawAll(shapes);
	}

}
