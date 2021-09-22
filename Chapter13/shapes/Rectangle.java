package shapes;
/**for testing purposes only*/
public class Rectangle extends GeometricObject {
	double side1,side2,side3,side4;
	public Rectangle() {
		super();
	}

	public Rectangle(int side1, int side2, String color, boolean filled) {
		super(color, filled);
		this.side1=side1;
		this.side2=side2;
		this.side3=side1;
		this.side4=side2;
	}
	
	public Rectangle(int side1, int side2) {
		this(side1,side2,"white",false);
	}

	@Override
	public double getArea() {
		return side1*side2;
	}

	@Override
	public double getPerimeter() {
		return side1+side2+side3+side4;
	}

}
