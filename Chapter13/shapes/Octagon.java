package shapes;

public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable, Colorable{
	double side1;
	
	public Octagon() {
		super();
	}

	public Octagon(double side1) {
		this.side1=side1;
	}
	
	public Octagon(double side1, String color, boolean filled) {
		this(side1);
		setColor(color);
		setFilled(filled);
	}
	

	@Override
	public double getArea() {
		return 2*(1+Math.sqrt(2))*side1*side1;
	}

	@Override
	public double getPerimeter() {
		return (side1)*8;
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}
		catch(CloneNotSupportedException e){
			return null;
		}
	}
	
	public void howToColor() {
		System.out.println("Color all 8 sides");
	}
	
}
