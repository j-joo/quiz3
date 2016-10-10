package cisc181.quiz3;

import java.lang.Math;

public class Triangle extends GeometricObject {

	private double side1;
	private double side2;
	private double side3;
	private double area;
	
public Triangle() {
	side1 = 1;
	side2 = 1;
	side3 = 1;
}

public Triangle(double side1, double side2, double side3, String color, boolean filled) {
	super(color, filled);
	
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;
}

public double getSide1() {
	return this.side1;
}

public double getSide2() {
	return this.side2;
}

public double getSide3() {
	return this.side3;
}


public double getArea() {
	area = ((side1 + side2 + side3) / (2));
	return (Math.sqrt(area * ((area-side1) * (area-side2) * (area-side3))));
}

public double getPerimeter(){
	return (side1 + side2 + side3);
}

public String toString(){	
	return ("The perimeter of the triangle is " + getPerimeter() + 
			" and your area is " + getArea());
}


}