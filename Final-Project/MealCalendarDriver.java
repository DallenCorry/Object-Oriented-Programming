package calendar;

import java.io.*;
import java.util.*;

/**
 * The driver for the Meal Calendar project, Creates a calendar for one week of meals. 
 * Created 9/29/2021
 * @author Dallen Corry
 * @version 1.9
 * @since 10/13/2021
 */ 
public class MealCalendarDriver {
	/*TODO
	 * URGENT
 	 * [X]implement randomization for Days creating meals.
 	 * 		[~]If a that number already exists in meals, don't use it(ie don't repeat meals)
	 * [X]implement Shopping List as an array list
	 * [X]implement adding ingredients to IL from meal.java
	 * [X]implement toString for IngredientsList

	 * 
	 * [X]create 7 days with a meal
	 * [X]Create printing method.
	 * [ ]Make every recipe standard in units of measurement
	 * 		I.e, all chicken must be measured in pounds.
	 * 
	 * 
	 * Other
	 * [ ]Print starting selection different if there is a menu created or not
	 * [ ]implement date element of Day
	 *		[ ] Implement a start date and calculate out x amount of days
	 * 			use Calendar cal = new GregorianCalendar (2021,9,1) (9 is October, because Jan. is 0)
	 * 
	 * Future Expansion?
	 * [ ]Change the meal object in Day to an arrayList of Meal Objects
	 * [ ]Make it possible to change the meal of a certain day
	 * [ ]Make a program to be able to input a recipe and format it correctly. 
	 * */
	
	/**
	 * Prints out the menu for a week in a formated manner
	 * @param w (Week) The week to be printed out. 
	 */
	public static void printWeek(Week w) {		
		String s = "| 1."+w.mealName(0,0)+" | 2."+w.mealName(1,0)+" | 3."+w.mealName(2, 0)+" | 4."+w.mealName(3,0)+" | 5."+w.mealName(4, 0)+" | 6."+w.mealName(5, 0)+" | 7."+w.mealName(6, 0)+" |";
		System.out.print(" ");
		for(int i=0; i<s.length()-2;i++)
			System.out.print("_");
		System.out.println();
		System.out.print("|");
		for(int i=0; i<s.length()-2;i++)
			System.out.print(" ");
		System.out.println("|");
		for( int i=0; i<7;i++) {
			System.out.print("| "+(i+1)+"."+w.mealName(i, 0)+" ");
		}
		System.out.println("|");
		System.out.print("|");
		for(int i=0; i<s.length()-2;i++)
			System.out.print("_");
		System.out.print("|");
		System.out.println();
	}
	
	/**
	 * Generates a new menu from a given file of recipes.
	 * @param f (File) The file containing lines of recipes
	 * @return (Week) A week with 7 days of meals created from the specified file
	 */
	public static Week generateNewMenu(File f) {
		try {
			Day[] d = new Day[7];
			int random =0;
			int count=0;
			int[] test = new int[7];
			Scanner input = new Scanner(f);
			while(input.hasNextLine()) {
				count++;
				input.nextLine();
			}
			for(int i=0; i<d.length;i++) {
				random = (int)Math.floor(Math.random()*count);
				//test if the meal is a repeat.
				if(!contains (test,random)) {
					d[i] = new Day(random+1,f);
					test[i]=random;
				}else {
					random = (int)Math.floor(Math.random()*count);
					d[i] = new Day(random+1,f);
					test[i]=random;
				}	
			}
			Week w = new Week(d);
			return w;
		}catch(Exception E) {
			System.out.println(E);//"Bad file!");
			return new Week();
		}
	}
	/**
	 * Searches an int array for a specific number.
	 * @param arr (int[]) The array being searched.
	 * @param x (int) The int being searched for.
	 * @return True if the array contains x, false otherwise.
	 */
	public static boolean contains(int[] arr, int x) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==x)
				return true;
		}
		return false;
	}
	
	/**
	 * Main method. Uses the file Ingredients.txt
	 * @param args (String[]) Unused
	 */
	public static void main(String[] args) {
		try {
			boolean active = true;
			Scanner input = new Scanner(System.in);
			File f = new File("Ingredients.txt");
			Week w = null;			
			
			System.out.println("Welcome to Dallen Corry's Meal Calendar");
			System.out.println("_______________________________________");
			
			while(active) {
				System.out.println();
				System.out.println("What would you like to do?");
				System.out.println(" 1. Create new Menu");
				System.out.println(" 2. View current Menu");
				System.out.println(" 3. View Shopping List");
				System.out.println(" 4. View Ingredients List for a day");
				System.out.println(" 0. Exit");

				switch (input.nextInt()) {
					case 1:
						System.out.println("New Menu:");
						w = generateNewMenu(f);
						printWeek(w);
						break;
					case 2:
						if(w!=null) {
							System.out.println("Menu:");
							printWeek(w);
						}else
							System.out.println("**No Menu Created Yet!**");
						break;
					case 3:
						if(w!=null) {
							System.out.println("Shopping List:");
							System.out.println(w.getShoppingList().toString());
						}else
							System.out.println("**No Menu Created Yet!**");
						break;
					case 4:
						if(w!=null) {
							System.out.println("What day?(1-7)");
							int num = input.nextInt();
							if(w.getDay(num-1).getMeal()!=null)
								System.out.println(w.getDay(num-1).getMeal());
							else
								System.out.println("*No Meal*");
						}else
							System.out.println("**No Menu Created Yet!**");
						break;
					case 0:
						System.out.println("Goodbye!");
						active = false;
						break;
					default:
						System.out.println("Invalid input");
						break;
				}
			}
			input.close();
			System.out.println("End Program");
		}catch (InputMismatchException e) {
			System.out.println("ERROR:Invalid input");
			System.out.println("System Restart...");
			System.out.println();
			System.out.println();
			main(args);
		}catch (Exception E) {
			System.out.println("Program Terminated "+E);
		}
	}
}
