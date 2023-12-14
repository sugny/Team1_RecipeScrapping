package com.tardala.dataBuild;

import java.util.HashMap;
import java.util.List;

public class RecipeData {
	
	
	String recipeID;
	String recipeName;
	String recipeCategory;
	String foodCategory;
	String ingredients;
	int preparationTime;
	int cookingTime;
	List<String> preparationMethod;
	HashMap<String, String> nutrientValues;
	String targettedMorbidConditions;
	String recipeURL;
	
	public String getRecipeID() {
		return recipeID;
	}
	public void setRecipeID(String recipeID) {
		this.recipeID = recipeID;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getRecipeCategory() {
		return recipeCategory;
	}
	public void setRecipeCategory(String recipeCategory) {
		this.recipeCategory = recipeCategory;
	}
	public String getFoodCategory() {
		return foodCategory;
	}
	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public int getPreparationTime() {
		return preparationTime;
	}
	public void setPreparationTime(int preparationTime) {
		this.preparationTime = preparationTime;
	}
	public int getCookingTime() {
		return cookingTime;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	public List<String> getPreparationMethod() {
		return preparationMethod;
	}
	public void setPreparationMethod(List<String> preparationMethod) {
		this.preparationMethod = preparationMethod;
	}
	public HashMap<String, String> getNutrientValues() {
		return nutrientValues;
	}
	public void setNutrientValues(HashMap<String, String> nutrientValues) {
		this.nutrientValues = nutrientValues;
	}
	public String getTargettedMorbidConditions() {
		return targettedMorbidConditions;
	}
	public void setTargettedMorbidConditions(String targettedMorbidConditions) {
		this.targettedMorbidConditions = targettedMorbidConditions;
	}
	public String getRecipeURL() {
		return recipeURL;
	}
	public void setRecipeURL(String recipeURL) {
		this.recipeURL = recipeURL;
	}

}
