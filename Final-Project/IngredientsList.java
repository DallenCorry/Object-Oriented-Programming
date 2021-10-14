package calendar;

/**
 * Generates a list of ingredients from a Meal with their name, quantity and type of measurement (pound, cup, tsp etc).
 * @author Dallen Corry
 * @version 1.0
 * @since 9/29/2021
 */
public class IngredientsList {
	protected String[] ingredientsQuantity;			//i.e 3, 2, .5 etc.
	protected String[] ingredientsMeasurmentType;	//i.e pound, cup, tsp, etc.
	protected String[] ingredientsNames;			//i.e chicken, flour, salt, etc.
	//so 3 pounds of chicken is converted into 3 separate arrays.
	
	/**
	 * Default constructor sets all 3 variables to String[0].
	 */
	public IngredientsList(){
		ingredientsQuantity = new String[0];
		ingredientsMeasurmentType = new String[0];
		ingredientsNames = new String[0];
	}

	/**
	 * Creates Ingredients list with specified ranges as Arrays.
	 * @param Q (String[]) The Quantity of an ingredient.
	 * @param T (String[]) The Type of measurement of an ingredient (i.e. cup, pound, etc.).
	 * @param N (String[]) The Name of an ingredient (i.e. Chicken, Onion, etc.).
	 */
	public IngredientsList(String[] Q, String[] T, String[] N) {
		ingredientsQuantity = Q;
		ingredientsMeasurmentType = T;
		ingredientsNames = N;
	}

	/**
	 * Gets the quantity of a specified ingredient.
	 * @param i (int) index of the ingredient to be gotten.
	 * @return (String) the quantity of the specified ingredient.
	 */
	public String getIngredientsQuantity(int i) {
		return ingredientsQuantity[i];
	}
	/**
	 * Sets the quantity of a specified ingredient.
	 * @param i (int) index of the ingredient to be set.
	 * @param s (String) the quantity to be set.
	 */
	public void setIngredientsQuantity(int i, String s) {
		ingredientsQuantity[i] = s;
	}
	/**
	 * Gets the type of measurement of a specified ingredient (i.e. pound, cup, etc).
	 * @param i (int) index of the ingredient to be gotten.
	 * @return (String) the type of measurement of the specified ingredient.
	 */
	public String getIngredientsMeasurmentType(int i) {
		return ingredientsMeasurmentType[i];
	}
	/**
	 * Sets the measurement type of a specified ingredient (i.e. pound, cup, etc).
	 * @param i (int) index of the ingredient to be set.
	 * @param s (String) the measurement type to be set.
	 */
	public void setIngredientsMeasurmentType(int i, String s) {
		ingredientsMeasurmentType[i] = s;
	}
	/**
	 * Gets the name of a specified ingredient.
	 * @param i (int) index of the ingredient to be gotten.
	 * @return (String) the name of the specified ingredient.
	 */
	public String getIngredientsNames(int i) {
		return ingredientsNames[i];
	}
	/**
	 * Gets the entire array of ingredient names.
	 * @return (String[]) the array of Ingredient names.
	 */
	public String[] getIngredientsNames() {
		return ingredientsNames;
	}
	/**
	 * Gets the name of a specified ingredient.
	 * @param i (int) index of the ingredient to be set.
	 * @param s (String) the name of the specified ingredient to be set.
	 */
	public void setIngredientsNames(int i, String s) {
		ingredientsNames[i] = s;
	}
	
	@Override
	public String toString() {
		String string="";
		for(int i=0; i<ingredientsNames.length;i++){
			string += "\n\t"+ingredientsQuantity[i]+" "+ingredientsMeasurmentType[i]+" "+ingredientsNames[i];
		}
		return string;
	}
}
