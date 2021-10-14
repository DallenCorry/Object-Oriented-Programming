package calendar;

/**
 * Creates a Meal with a name, recipe, and list of Ingredients
 * @author Dallen Corry
 * @version 1.2
 * @since 9/29/2021
 */
public class Meal {
	private String name;
	private String recipe;
	private IngredientsList ingredients;
	/**
	 * Default constructor
	 */
	public Meal(){
		name="No meal selected";
		recipe = "No recipe selected";
		ingredients = new IngredientsList();
	}
	/**
	 * Creates a Meal from a specifically formated Ingredient String
	 * @param s (String) the String that contains a recipe. Must be formatted correctly, 
	 *
	 * <blockquote><pre>
	 * "Recipe Name&#60;(double)MeasurmentQuantity_(String)MeasurementType_(String)IngredientName, identifiers with the ingredient name_int_..."
	 * </pre></blockquote><p>
	 * Example: {@code "Chicken meal<1_pound_Chicken, shredded and boiled_1.5_cups_water_1_ounce_black pepper, freshly ground"}
	 *///&#60; = "<"
	public Meal(String s) {
		recipe="No recipe selected";
		String[] s1 = new String[2];
		
		s1=s.split("[<]");//split it into dish name and ingredients(2 element array)
		name = s1[0];//same way we would do the recipe
				
		String[] s3 = s1[1].split("[_]");//split into an array with quantity, type, and name
		
		//Split the array into 3 separate arrays
		int x=s3.length/3;
		String[] a = new String[x];
		String[] b = new String[x];
		String[] c = new String[x];
		//split each ingredient into quantity, type, name 
		for(int i=0; i<x; i++) {
			a[i] = s3[i*3];
			b[i] = s3[(i*3)+1];
			c[i] = s3[(i*3)+2];
		}
		ingredients = new IngredientsList(a,b,c);
	}
	
	/**
	 * Gets the Recipe for this Meal (Unimplemented).
	 * @return (String) Recipe for this meal.
	 */
	public String getRecipe() {
		return recipe;
	}
	/**
	 * Sets the Recipe for this Meal (Unimplemented).
	 * @param recipe (String) the Recipe (steps and processes).
	 */
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	/**
	 * Gets the Ingredients for this Meal.
	 * @return (IngredientsList) returns the Ingredients List object for this meal.
	 */
	public IngredientsList getIngredients() {
		return ingredients;
	}
	/**
	 * Sets the Recipe for this Meal.
	 * @param I (IngredientsList) sets the Ingredients List object to a specified {@code IngredientsList}.
	 */
	public void setIngredients(IngredientsList I) {
		ingredients = I;
	}
	/**
	 * Gets the Name of this Meal.
	 * @return {@code (String)} the name of the meal.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Sets the Name of this Meal.
	 * @param name (String) the new name of them meal.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		if(ingredients!=null)
			return name+"\nIngredients: "+ingredients.toString();
		return name+"\n No Ingredients";
	}
	/**
	 * Creates a String with the name of a Meal without ingredients.
	 * @return a string representation of the Meal without the ingredients.
	 */
	public String toStringWithoutIngredients() {
		return name;
	}
}
