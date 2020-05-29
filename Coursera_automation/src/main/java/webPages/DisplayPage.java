package webPages;

public class DisplayPage {

	// Get course details 
	public String getCourseName(String course_Name)
	{
		String Name = driver.findElement(By.xpath(course_Name)).getText();
		return Name;
	}
	
	public String getRating(String ratings)
	{
		String Rating  = driver.findElement(By.xpath(ratings)).getText();
		return Rating;
	}
	
	public String getLevel(String level)
	{
		String Course_level = driver.findElement(By.xpath(level)).getText();
		return Course_level;
	}
	
	
	public String getDuration(String duration)
	{
		String Course_duration = driver.findElement(By.xpath(duration)).getText();
		return Course_duration;
	}
	
	public String getLanguage(String language)
	{
		String lang  = driver.findElement(By.xpath(language)).getText();
		return lang;
	}
	
	
		
	
	
	
	//navigate to back page
	
	
	
	
}
