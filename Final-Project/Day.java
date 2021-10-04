package calendar;

import java.util.*;
import java.io.*;

public class Day {
	private Meal meal;
	private Date date;
	
	public Day() {
		meal=null;
		date=null;
	}
	
	//create a new day with a specific 
	public Day(int line, File f){//, Date date){
		String s;
		try {	
			Scanner scanner = new Scanner(f);
			for(int i=0; i<line-1; i++)
				scanner.nextLine(); 
			s= scanner.nextLine();
			meal = new Meal(s);
			date=null;
			
			scanner.close();
//			System.out.println("day success");
//			System.out.println(meal);
		}catch(Exception e) {
			System.out.println("error in Day: "+e);
		}
		//this.date=date;
	}

	public Meal getMeal() {
		return meal;
	}

	public void setMeal(Meal meal) {
		this.meal = meal;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		if(meal!=null)
			return "\nDate: "+date+"\n  Meal: "+meal.toString()+"\n";
		else
			return "\nDate:"+date+"\n  No Meal\n";
	}
	
	public String toStringWithoutIngredients() {
		if(meal!=null)
			return "\nDate: "+date+"\n  Meal: "+meal.toStringWithoutIngredients()+"\n";
		else
			return "\nDate:"+date+"\n  No Meal\n";
	}
	
}
