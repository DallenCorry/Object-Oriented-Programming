package calendar;

/**
 * This class takes a file and generates a list of ingredients with their name, quantity and type (pound, cup, tsp etc.)
 * @author Dallen Corry
 * @version 1.0
 * @since 9/29/2021
 */
public class IngredientsList {
	private String[] ingredientsQuantity;//ie, 3, 2, .5 etc.
	private String[] ingredientsMeasurmentType;//ie pound, cup, tsp, etc.
	private String[] ingredientsNames;//ie chicken, flour, salt, etc.
	//so 3 pounds of chicken is converted into 3 separate arrays.
	
	//constructors
	public IngredientsList(){
		ingredientsQuantity = new String[0];
		ingredientsMeasurmentType = new String[0];
		ingredientsNames = new String[0];
	}

	public IngredientsList(String[] ingredientsQuantity, String[] ingredientsMeasurmentType, String[] ingredientsNames) {
		this.ingredientsQuantity = ingredientsQuantity;
		this.ingredientsMeasurmentType = ingredientsMeasurmentType;
		this.ingredientsNames = ingredientsNames;
	}

	//getters and setters
	public String getIngredientsQuantity(int i) {
		return ingredientsQuantity[i];
	}

	public void setIngredientsQuantity(int i, String ingredientsQuantity) {
		this.ingredientsQuantity[i] = ingredientsQuantity;
	}

	public String getIngredientsMeasurmentType(int i) {
		return ingredientsMeasurmentType[i];
	}

	public void setIngredientsMeasurmentType(int i, String ingredientsMeasurmentType) {
		this.ingredientsMeasurmentType[i] = ingredientsMeasurmentType;
	}

	public String getIngredientsNames(int i) {
		return ingredientsNames[i];
	}

	public void setIngredientsNames(int i, String ingredientsNames) {
		this.ingredientsNames[i] = ingredientsNames;
	}
	
	@Override
	public String toString() {
//		return "";
		String string="";
		for(int i=0; i<ingredientsNames.length;i++)
		{
			string += "\n\t"+ingredientsQuantity[i]+" "+ingredientsMeasurmentType[i]+" "+ingredientsNames[i];
		}
		return string;
	}
	
}
