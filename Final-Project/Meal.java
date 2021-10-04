package calendar;


/**
 * This class creates a meal with a name, recipe, and list of Ingredients
 * @author Dallen Corry
 * @version 1.0
 * @since 9/29/2021
 */
public class Meal {
	private String name;
	private String recipe;
	private IngredientsList ingredients;
	
	//constructors
	public Meal(){
		name="No meal selected";
		recipe = "No recipe selected";
		ingredients = new IngredientsList();
	}
	
	public Meal(String s) {
		recipe="Recipe: null";
		String[] s1 = new String[2];
		
		s1=s.split("[<]");//split it into dish name and ingredients(2 element array)
		name = s1[0];//same way we would do the recipe
				
		String[] s3 = s1[1].split("[_]");//split into an array with quantity, type, and name
		
		//Printing the array for testing purposes
//		System.out.println(name);
//		System.out.println("----------");
//		for (String q:s3)
//			System.out.println(q);
//		System.out.println("----------");
		
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
	
	//getters and setters
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	public IngredientsList getIngredients() {
		return ingredients;
	}
	public void setIngredients(IngredientsList ingredients) {
		this.ingredients = ingredients;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		if(ingredients!=null)
			return name+"\nIngredients: "+ingredients.toString();
		return name+"\n No Ingredients";
	}
	
	public String toStringWithoutIngredients() {
		return name;
	}

}
