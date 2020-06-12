package webPages;

import java.util.List;

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
	public static int getTotalResults(WebDriver driver) {
		
		String no_courses=driver.findElement(By.xpath(Locators.get_ResultsMessage())).getText();
		String str[] = no_courses.split(" ");
		return Integer.parseInt(str[1]);
	}
	
	//pagination 
	public static  int getnoPages(WebDriver driver ) {
		List <WebElement> pagination_boxs = driver.findElements(By.xpath(Locators.get_PaginationBoxs()));
		int i =pagination_boxs.size();
		String no_pages = pagination_boxs.get(i).getText();
		return Integer.parseInt(no_pages);
	}
	
	// select a course in list
	public static void select_Course1(WebDriver driver)
	{
		driver.findElement(By.xpath(Locators.get_FirstCourse())).click();
		
	}
	//select second course
	public static void select_Course2(WebDriver driver)
	{
		driver.findElement(By.xpath(Locators.get_Secondcourse())).click();
		
	}
	
	
}
