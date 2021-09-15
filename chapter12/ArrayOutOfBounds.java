package array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOutOfBounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//create and populate the array
		int[] array = new int[100];
		for(int i=0; i<100; i++) {
				array[i]= (int)(Math.random()*100);
		}
		
		//print out the array (for testing purposes)
		/*
		for (int i=0; i<100; i++) {
			System.out.println(i+":"+array[i]);
		}
		int count=0;
		for (int i=0; i<100; i++) {
			
			System.out.print(array[i]+", ");
			count++;
			if(count>9) {
				System.out.println();
				count=0;
			}
		}*/
		
		
		//have the user enter an index and catch any exceptions
		boolean continueRun=true;
		System.out.print("Enter an index of the array (0-"+ (array.length-1)+"): ");
		int num=0;
		do {
			try {//handle the out of bounds exception
				try {//handle the input mismatch exception
					num = input.nextInt();
				}catch(InputMismatchException e){
					System.out.println("Not a valid input");
					break;
				}
				
				if(num>(array.length-1)||num<0) {
					throw new ArrayIndexOutOfBoundsException("not a valid index");
				}
				System.out.println(array[num]);
				continueRun=false;
			} catch (ArrayIndexOutOfBoundsException ex){
				System.out.println("Out of Bounds.");
				System.out.print("Please enter a valid integer between 0 and "+ (array.length-1)+": ");
			}//I wanted to add a catch for the input mismatch, but I don't know how! It constantly runs the loop without checking again, unlike the other exception.
		
		}while(continueRun);
		
	}

}
