/**
 * This class creates a rectangle object with a specified height and width.
 * @author Dallen Corry
 * @version 1.0
 * @since 27 August 2021
 */
public class Rectangle {

	/**
	 * Main method
	 * */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(40,4);
		System.out.printf("Rectangle 1%n  Width: %.2f%n  Height: %.2f%n  Area: %.2f%n  Perimeter: %.2f%n",r1.width,r1.height,r1.getArea(),r1.getPerimeter());
		Rectangle r2 = new Rectangle(35.9,3.5);
		System.out.printf("Rectangle 2%n  Width: %.2f%n  Height: %.2f%n  Area: %.2f%n  Perimeter: %.2f%n",r2.width,r2.height,r2.getArea(),r2.getPerimeter());
	}
	
	//Data Fields
	double height;
	double width;
	
	/**
	 * Rectangle default constructor
	 */
	Rectangle(){
		height = 1;
		width = 1;
	}
	
	/**
	 * Rectangle constructor with specified height and width.
	 * @param newHeight height of new rectangle
	 * @param newWidth width of new rectangle
	 */
	Rectangle(double newHeight, double newWidth){
		height = newHeight;
		width = newWidth;
	}
	
	/**
	 * Returns the area of the rectangle
	 * @return the area
	 */
	double getArea(){
		return height*width;
	}
	
	/**
	 * Returns the perimeter of a rectangle
	 * @return
	 */
	double getPerimeter() {
		return 2*(height+width);
	}

}
