package shapes;

/**
 * This class creates a triangle with 3 sides, a color, a date created, and if it is filled or not.
 * @author Dallen Corry
 * @version 1.0 
 * @since 9/20/2021
 */
public class Triangle extends GeometricObject
	implements Colorable{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		super();
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this(side1, side2, side3);
		setColor(color);
		setFilled(filled);
	}

	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public void setSide1(double side1){
		this.side1 = side1;
	}
	
	public void setSide2(double side2){
		this.side2 = side2;
	}
	
	public void setSide3(double side3){
		this.side3 = side3;
	}
	
	public String toString() {
		return "Side 1:"+side1+"\nSide 2:"+side2+"\nSide 3:"+side3+"\n"+super.toString();
	}
	
	@Override
	public double getArea() {
		double s=(side1+side2+side3)/2;///getPerimeter()/2);
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}

	@Override
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all three sides");
	}

}
