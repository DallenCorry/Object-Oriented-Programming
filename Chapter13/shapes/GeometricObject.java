package shapes;

import java.util.Date;

/**
 * This class creates geometric objects with a color, a date created, and if it is filled or not.
 * @author Dallen Corry
 * @version 1.0
 * @since 9/20/2021
 *
 */
public abstract class GeometricObject extends Object {
	private String color = "";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date(); 
	}
	
	protected GeometricObject(String color, boolean filled) {
       dateCreated = new java.util.Date(); 
       this.color = color;
       this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color +" and Filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
}
