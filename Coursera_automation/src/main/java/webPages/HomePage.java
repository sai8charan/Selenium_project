package webPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilites.*;

public class HomePage {
	
	//locate search box enter search text 
	
	//click on search button 
	public static void enterSearchKeyword(WebDriver driver , String keyWord)
	{
	
		driver.findElement(By.xpath(Locators.getSearch_Box())).sendKeys(keyWord);
		
	}
	
	public static void clickOnSearchButton(WebDriver driver)
	{
		
		driver.findElement(By.xpath(Locators.getSearch_Button())).click();
		
	}
	
	//locate suggestions and select suggestion
	public static void searchSuggestions(WebDriver driver)
	{
		driver.findElements(By.xpath(Locators.get_Suggestions()));
	}
	
	
	
	
	

}
