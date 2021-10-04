package calendar;

import java.util.ArrayList;

public class Week {
	Day[] days = new Day[7];
	ArrayList<String> shoppingList = new ArrayList<String>();
	
	public Week() {
		for (int i =0; i<days.length; i++)
			days[i]= new Day();
		shoppingList = null;
	}
	
	public Week(Day d1, Day d2, Day d3, Day d4, Day d5, Day d6, Day d7) {
		days[0]=d1;
		days[1]=d2;
		days[2]=d3;
		days[3]=d4;
		days[4]=d5;
		days[5]=d6;
		days[6]=d7;
		//set the shopping list equal to the ingredients of all days
		shoppingList = createShoppingList(days);
	}

	
	private ArrayList<String> createShoppingList(Day[] d) {
		ArrayList<String> newList = new ArrayList<String>();
		return newList;
	}
	/*
	 * I need to make a list of all the ingredients and their quantities types and names.
	 * Names will be hardest. How do I check if chicken, pulled chicken, and canned chicken are the same?
	 * search through the whole names list, and the index of that is what needs to be added with the existing thing.
	 * 		say that each recipe will never have more than 1 occurrence of an ingredient
	 * 
	 * so if I find chicken in meal 1, then I add Chicken to the List. 
	 * then i go through all of meal 2, and if I find anything that contains "chicken" I add the numbers together in the List. 
	 * 	But keep the name just "chicken 
	 * 
	 * But what if in Meal 1 2 and 3 they all say different things than just chicken? 
	 * 		I could make it so you can only input names that fit with my categories but that would mean I need to check each input.
	 * 		Or I could have a giant list of names and check against it when I create my List.
	 * */

	public String mealName(int i, int m) {// m is for meal number, not yet implemented (ie, one day has multiple meals)
		if(days[i]!=null&&days[i].getMeal()!=null)
			return days[i].getMeal().getName();
		return "No Meal";
	}
	
	public Day getDay(int i) {
		return days[i];
	}

	public void setDay(int i, Day day) {
		days[i] = day;
	}

	public String getShoppingList(int i) {
		return shoppingList.get(i);
	}

	public void setShoppingList(int i, String item) {
		shoppingList.set(i, item);
	}
	
	@Override
	public String toString() {
		String s = "";
		for(int i=0; i<days.length; i++)
			s+= days[i].toString();
		return s;
	}
	
	public String toStringWithoutIngredients() {
		String s = "";
		for(int i=0; i<days.length; i++)
			s+= days[i].toStringWithoutIngredients();
		return s;
	}

}
