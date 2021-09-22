package shapes;

import java.util.*;

/**
 * This is the testing class for geometric object
 * @author Dallen Corry
 *
 */
public class TestGeometricObject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Clones of Octagons 13.11
		
		//create and clone the Octagon
		Octagon o1 = new Octagon(3);
		Octagon o2 = (Octagon)o1.clone();
		//compare using compareTo() and ==
		System.out.println("o1.compareTo(o2): "+o1.compareTo(o2));
		if(o1==o2) 
			System.out.println("o1 == o2: true");
		else
			System.out.println("o1 == o2: false");
		
		
		
		/*
		//array of Geometric Objects 13.7
		
		//create the objects 
		Triangle t1 = new Triangle(3,4,5);
		Triangle t2 = new Triangle(1,2,2);
		Triangle t3 = new Triangle(3,3,3);
		Triangle t4 = new Triangle(7,8,9);
		Triangle t5 = new Triangle(23,17,13);
		Rectangle r1 = new Rectangle(1,5);
		Octagon o1 = new Octagon(3);
		Octagon o2 = (Octagon)o1.clone();
		//create the array
		GeometricObject [] arr = {t1,t2,t3,t4,t5,r1,o1,o2};
		
		//print the array
		for(GeometricObject i:arr) {
			System.out.println("Area: "+i.getArea());
			if(i instanceof Colorable) {
				((Colorable)i).howToColor();
			}
		}*/
		
		
		/*
		//user input triangles 13.1
		
		Triangle t1 = new Triangle(3,4,5);
		//set the sides
		System.out.println("Enter Side 1");
		t1.setSide1(input.nextDouble());
		System.out.println("Enter Side 2");
		t1.setSide2(input.nextDouble());
		System.out.println("Enter Side 3");
		t1.setSide3(input.nextDouble());
		
		//set the color and filled
		System.out.println("Enter the color");
		t1.setColor(input.next());
		System.out.println("Enter Filled, y/n");
		String test=input.next();
		if(test.equalsIgnoreCase("y")||test.equals("1")||test.equalsIgnoreCase("true")) 
			t1.setFilled(true);
		else
			t1.setFilled(false);
		
		//print the area, perimeter, and triangle
		System.out.println("The area is "+ t1.getArea());
		System.out.println("The perimeter is: "+t1.getPerimeter());
		System.out.println(t1.toString());*/
	}
}
