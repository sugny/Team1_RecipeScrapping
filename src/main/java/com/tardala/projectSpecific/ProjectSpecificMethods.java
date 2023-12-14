package com.tardala.projectSpecific;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tardala.utilities.PropertyFileReader;

public class ProjectSpecificMethods {
    
	public ChromeDriver driver;
	
	
	@BeforeMethod
	public ChromeDriver bm() {
		driver = new ChromeDriver();
		driver.get(PropertyFileReader.setProperties("baseURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
    
	@AfterMethod
	public void am() {
        //driver.close();
	}
	

}
