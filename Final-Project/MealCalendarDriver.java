package calendar;

import java.io.*;
import java.util.*;

/**
 * This class is the driver for the Meal Calendar project. It creates a calendar for one week of meals to eat.
 * @author Dallen Corry
 * @version 1.0
 * @since 9/29/2021
 */
public class MealCalendarDriver {
	/*TODO
	 * URGENT
	 * [X]implement adding ingredients to IL from meal.java
	 * [ ]implement Shopping List as an array list
	 * [X]implement toString for IngredientsList
	 * [ ]implement randomization for Days creating meals.
	 * 
	 * [X]create 7 days with a meal
	 * [X]Create printing method.
	 * 
	 * [ ]change the meal object in day to an arraylist of meals
	 * 
	 * Other
	 * [ ]implement date element of Day
	 *		[ ] Implement a start date and calculate out x amount of days
	 * 			use Calendar cal = new GregorianCalendar (2021,9,1) (9 is october, because jan is 0)
	 * 
	 * */
	
	public static void printWeek(Week w) {
		System.out.println(w.toStringWithoutIngredients());//obviously could be called in the main, but this method is here for future upscaling.
		
		//somehow make the lines on top and bottom print out at a certain number of chars or something.
//		System.out.println(" __________________________________________________________________________________________________________ ");
//		System.out.println("|                                                                                                          |");
//		System.out.print("| 1."+w.mealName(0,0)+" | 2."+w.mealName(1,0)+" | 3."+w.mealName(2, 0)+" | 4."+w.mealName(3,0)+
//				" |5."+w.mealName(4, 0)+" | 6."+w.mealName(5, 0)+" | 7."+w.mealName(6, 0));
//		System.out.println(" |");
//		System.out.println("|__________________________________________________________________________________________________________|");
	}
	
	private static Week generateNewMenu(File f) {
		int random = (int)Math.floor(Math.random()*10);
		System.out.println(random);
		Day d1 = new Day(1,f);
		//Week w = new Week(d1,d2,d3,d4,d5,d6,d7);
		return null;
	}
	
	public static void main(String[] args) {
		try {
			boolean active = true;
			Scanner input = new Scanner(System.in);
			
			//get the ingredients file
			File f = new File("Ingredients.txt");
			Day day = new Day(1,f);
			Day day2 = new Day(2,f);
			Day day3 = new Day(3,f);
			
			Week w1 = new Week();
			w1.setDay(0, day);
			w1.setDay(1, day2);
			w1.setDay(2, day3);
			w1.setDay(3, day);
			w1.setDay(4, day2);
//			w1.setDay(5, day3);
			w1.setDay(6, day3);
			
		
			System.out.println("Welcome to Dallen Corry's Meal Calendar");
			while(active) {
				System.out.println("What would you like to do?");
				System.out.println(" 1. Create new Menu");
				System.out.println(" 2. View Recipe List");
				System.out.println(" 0. Exit");
				//printWeek(w1);
				switch (input.nextInt()) {
					case 1:
						System.out.println("Menu:");
						Week w = generateNewMenu(f);
						break;
					case 2:
						System.out.println("Not implemented yet");
						break;
					case 0:
						System.out.println("Goodbye!");
						active = false;
						break;
					default:
						System.out.println("invalid input");
						break;
				}
			}
			System.out.println("End Program");
		}catch (Exception e) {
			System.out.println("Main error");
			System.out.println(e);
			System.out.println(e.getStackTrace());
		}
//		IngredientsList l1 = new IngredientsList();
//		System.out.println(l1.getIngredientsMeasurmentType(0));
	}

	

}
