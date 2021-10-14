package calendar;

import java.util.*;
import java.io.*;

/**
 * Creates a Day object with a specified Meal and Date. 
 * @author Dallen Corry
 * @version 1.2
 * @since 10/13/2021
 *
 */
public class Day {
	
	//instance Variables
	private Meal meal;
	private Date date;
	
	/**
	 * Default constructor, creates Day with null Meal and Date.
	 */
	public Day() {
		meal=null;
		date=null;
	}
	
	/**
	 * Creates a new day with a specified file and line
	 * @param line The line of the File you are getting a recipe from
	 * @param f (File) The File containing correctly formated lines of recipes. Correct formating is:
	 *<blockquote><pre>
	 * "Recipe Name&#60;(double)MeasurmentQuantity_(String)MeasurementType_(String)IngredientName, identifiers with the ingredient name_int_..."
	 * </pre></blockquote>   
	 * Example: {@code "Chicken meal<1_pound_Chicken, shredded_2_cups_water_1_ounce_black pepper, freshly ground"}
	 */
	public Day(int line, File f){//, Date date){//date to be implemented later
		String s;
		try {	
			Scanner scanner = new Scanner(f);
			for(int i=0; i<line-1; i++)
				scanner.nextLine(); 
			s= scanner.nextLine();
			meal = new Meal(s);
			date=null;
			
			scanner.close();
		}catch(Exception e) {
			System.out.println("error in Day: "+e);
		}
	}
	
	/**
	 * Creates a Day with a specified meal.
	 * @param s (String) the recipe for the Meal to be created. Must be formatted correctly, 
	 *
	 * <blockquote><pre>
	 * "Recipe Name&#60;(double)MeasurmentQuantity_(String)MeasurementType_(String)IngredientName, identifiers with the ingredient name_int_..."
	 * </pre></blockquote><p>
	 * Example: {@code "Chicken meal<1_pound_Chicken, shredded and boiled_2_cups_water_1_ounce_black pepper, freshly ground"}
	 */
	public Day(String s) {
		meal = new Meal(s);
		date=null;
	}
	
	/**
	 * gets the meal of the current day
	 * @return (Meal) the meal of the Day object.
	 */
	public Meal getMeal() {
		return meal;
	}
	/**
	 * sets the meal of the Day object to a specified meal.
	 * @param meal (Meal) the meal to be set. 
	 */
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	/**
	 * gets the date of the Day object.
	 * @return (Java.util.Date) the date of the object.
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * sets the date of the object to a specified date.
	 * @param date (Jave.util.Date) The Date object to be set. 
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		if(meal!=null)
			return "\nDate: "+date+"\n  Meal: "+meal.toString()+"\n";
		else
			return "\nDate:"+date+"\n  *No Meal\n";
	}
	/**
	 * Creates a String with the date and a meal without ingredients.
	 * @return a string representation of the Day without the ingredients from the Meal.
	 */
	public String toStringWithoutIngredients() {
		if(meal!=null)
			return "\nDate: "+date+"\n  Meal: "+meal.toStringWithoutIngredients()+"\n";
		else
			return "\nDate:"+date+"\n  *No Meal*\n";
	}
}
