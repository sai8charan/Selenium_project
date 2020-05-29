package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilites.Locators;

public class DisplayPage {

	// Get course details 
	public static String getCourseName(WebDriver driver)
	{
		String Name = driver.findElement(By.xpath(Locators.get_CourseName())).getText();
		return Name;
	}
	
	public static String getRating(WebDriver driver)
	{
		String Rating  = driver.findElement(By.xpath(Locators.get_Ratings())).getText();
		return Rating;
	}
	
	public static String getLevel(WebDriver driver)
	{
		String Course_level = driver.findElement(By.xpath(Locators.get_level())).getText();
		return Course_level;
	}
	
	
	public static String getDuration(WebDriver driver)
	{
		String Course_duration = driver.findElement(By.xpath(Locators.get_Duration())).getText();
		return Course_duration;
	}
	
	public static String getLanguage(WebDriver driver)
	{
		String lang  = driver.findElement(By.xpath(Locators.get_Language())).getText();
		return lang;
	}
	
	
		
	
	
	
	//navigate to back page
	
	
	
	
}
