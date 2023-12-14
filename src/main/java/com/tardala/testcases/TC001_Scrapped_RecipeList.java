package com.tardala.testcases;

import org.testng.annotations.Test;

import com.tardala.projectSpecific.ProjectSpecificMethods;
import com.tardala.recipes.GetAllRecipes;

public class TC001_Scrapped_RecipeList extends ProjectSpecificMethods {
	
	
	
	@Test
	public void recipeList() throws InterruptedException {
		GetAllRecipes allRecipes = new GetAllRecipes(driver);
		allRecipes.clickBreakfast().vegBreakFastList();
	}

}
