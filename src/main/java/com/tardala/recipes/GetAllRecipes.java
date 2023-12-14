package com.tardala.recipes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.tardala.projectSpecific.ProjectSpecificMethods;
import com.tardala.utilities.LoggerLoad;

public class GetAllRecipes extends ProjectSpecificMethods {

	public GetAllRecipes(ChromeDriver receivedDriver) {
		driver = receivedDriver;
	}

	public GetAllRecipes clickBreakfast() {
		WebElement eleBreakfast = driver.findElement(By.xpath("//a[@href='recipes-for-COURSE-Breakfast-151?sort=8']"));
		eleBreakfast.click();
		System.out.println("Hi******************************");
		LoggerLoad.info(" Title of the page " + driver.getTitle());
		System.out.println(driver.getTitle());
		return this;

	}

	public void vegBreakFastList() throws InterruptedException {
		WebElement eleVegBreakfastTable = driver.findElement(By.className("table-responsive"));
		List<WebElement> tableData = eleVegBreakfastTable.findElements(By.tagName("tr"));
		int size = tableData.size();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");

		for (int i = 1; i < size; i++) {
			try {
				tableData.get(i).click();
				String attribute1 = driver.findElement(By.tagName("form")).getAttribute("action");
				System.out.println(attribute1);
				driver.navigate().back();
				// driver.navigate().refresh();
			} catch (StaleElementReferenceException e) {
				driver.navigate().refresh();
				WebElement eleVegBreakfastTable1 = driver.findElement(By.className("table-responsive"));
				eleVegBreakfastTable1.findElements(By.tagName("tr")).get(i).click();
				String attribute1 = driver.findElement(By.tagName("form")).getAttribute("action");
				System.out.println(attribute1);
				System.out.println("HIIIIIIIIIIIIIIIII");
				driver.navigate().back();
			}
		}

		/*
		 * WebElement webElement = tableData.get(1); String text = webElement.getText();
		 * String[] split = text.split("1. "); String recipeName = split[1];
		 * System.out.println(recipeName); webElement.click(); String attribute =
		 * driver.findElement(By.tagName("form")).getAttribute("action");
		 * //System.out.println(attribute); String[] splits =
		 * attribute.split("recipeid="); String recipeId = splits[1];
		 * System.out.println(recipeId); ////span[text()='Dinner']
		 */ }

}
