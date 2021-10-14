package calendar;

import java.util.ArrayList;
/**
 * Creates an list that contains ingredients for a specified number of meals 
 * @author Dallen Corry
 * @version 2.0
 * @since 10/13/2021
 */
public class ShoppingList {
	ArrayList<Double> ingredientsQuantity = new ArrayList<Double>();
	ArrayList<String> ingredientsMeasurmentType = new ArrayList<String>();
	ArrayList<String> ingredientsNames = new ArrayList<String>();
	
	/**
	 * Default constructor
	 */
	public ShoppingList() {
		
	}
	/**
	 * Creates an instance with all of the ingredients of a week.
	 * @param w (Week) The week for which you are creating a shopping list.
	 * Creates a list of lists that has all of the quantities of each ingredient added together for the entire week.
	 */
	public ShoppingList(Week w){
		for(int i=0; i<7;i++) {
			IngredientsList il = w.getIngredients(i);
			for (int j=0; j<il.getIngredientsNames().length;j++){// there will need to be an extra for loop when you have multiple meals in one day.
				String[] S = il.getIngredientsNames(j).split(",");
				if(ingredientsNames.contains(S[0])) {
					int index = ingredientsNames.indexOf(S[0]);//index of the current ingredient in the shopping list
					double value = Double.parseDouble(il.getIngredientsQuantity(j));
					double value2 = ingredientsQuantity.get(index);
					ingredientsQuantity.set(index,value+value2);
				}
				if(!ingredientsNames.contains(S[0])) {
					ingredientsQuantity.add(Double.parseDouble(il.getIngredientsQuantity(j)));
					ingredientsMeasurmentType.add(il.getIngredientsMeasurmentType(j));
					ingredientsNames.add(S[0]);
				}
			}
		}		
	}
	
	@Override
	/**
	 * Prints out the quantity, measurement type and Name of each ingredient in a formatted String.
	 * @return an empty String
	 */
	public String toString() {
		String s="";
		for(int i=0; i<ingredientsNames.size(); i++) {
			System.out.printf("%.2f \t%s \t%s\n",ingredientsQuantity.get(i),ingredientsMeasurmentType.get(i),ingredientsNames.get(i));
		}
		return s;
	}
}
