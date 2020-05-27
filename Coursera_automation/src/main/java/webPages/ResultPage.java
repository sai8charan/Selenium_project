package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilites.*;

public class ResultPage {

	//WebDriver driver = null;
	

	//apply language filter
	
	public static void applyFilter(WebDriver driver, String lang)
	{
		WebElement languageFilter =driver.findElement(By.xpath(Locators.get_LanguageFilter()));
		Select language = new Select(languageFilter);
		language. selectByVisibleText(lang);
		
	}
	
	//apply level filter 
	
	//get total no of results
	
	//pagination 
	
	
	// select a course in list
	
	
	
	
}
