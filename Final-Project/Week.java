package calendar;

/**
 * Creates a Week with 7 Day objects and a Shopping list Object.
 * @author Dallen Corry
 * @version 1.1
 * @since 10/13/2021
 */
public class Week {
	Day[] days = new Day[7];
	ShoppingList shoppingList;
	
	/**
	 * Default Constructor
	 */
	public Week() {
		for (int i =0; i<days.length; i++)
			days[i]= new Day();
		shoppingList = null;
	}
	
	/**
	 * Creates a week from 7 given days
	 * @param d1 (Day) day 1
	 * @param d2 (Day) day 2
	 * @param d3 (Day) day 3
	 * @param d4 (Day) day 4
	 * @param d5 (Day) day 5
	 * @param d6 (Day) day 6
	 * @param d7 (Day) day 7
	 */
	public Week(Day d1, Day d2, Day d3, Day d4, Day d5, Day d6, Day d7) {
		days[0]=d1;
		days[1]=d2;
		days[2]=d3;
		days[3]=d4;
		days[4]=d5;
		days[5]=d6;
		days[6]=d7;
		shoppingList = new ShoppingList(this);
	}
	/**
	 * Creates a week from an array of Day objects
	 * @param d (Day[]) The array of Days that will create the Week
	 */
	public Week(Day[] d) {
		for (int i=0; i<days.length;i++)
			days[i] = d[i];
		shoppingList = new ShoppingList(this);
	}

	/**
	 * Gets the name of a meal for a specific day of the week
	 * @param i (Day) Day of the week to get meal from, indexed 0-6 inclusive
	 * @param m (int) Unused currently (for later implementation of multiple Meals a Day)
	 * @return (String) The name of a Meal for Day i.
	 */
	public String mealName(int i, int m) {// m is for meal number, not yet implemented (ie, one day will have multiple meals)
		if(days[i]!=null&&days[i].getMeal()!=null)
			return days[i].getMeal().getName();
		return "No Meal";
	}
	/**
	 * Gets the IngredientsList object for a specified day 
	 * @param i (int) The index of the Day of the Week you want to get the Meal of.
	 * @return the IngredientsList object of the Meal of the selected Day of the Week.
	 */
	public IngredientsList getIngredients(int i) {
		return days[i].getMeal().getIngredients();
	}
	/**
	 * Gets a specified Day from a week.
	 * @param i (int) The index of the day to be gotten (0-6 inclusive).
	 * @return (Day) The specified Day object.
	 */
	public Day getDay(int i) {
		return days[i];
	}
	/**
	 * Sets the day to a specified Day
	 * @param i (int) The index of the day to be set (0-6 inclusive).
	 * @param d (Day) the Day object to be set
	 */
	public void setDay(int i, Day d) {
		days[i] = d;
	}
	/**
	 * Gets the Shopping list for a week
	 * @return (ShoppingList) the Shopping List object for this week.
	 */
	public ShoppingList getShoppingList() {
		return shoppingList;
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<days.length; i++)
			s+= days[i].toString();
		return s;
	}
	/**
	 * Creates a String with the date and a meal without ingredients.
	 * @return a string representation of the Day without the ingredients from the Meal.
	 */
	public String toStringWithoutIngredients() {
		String s = "";
		for(int i=0; i<days.length; i++)
			s+= days[i].toStringWithoutIngredients();
		return s;
	}
}
