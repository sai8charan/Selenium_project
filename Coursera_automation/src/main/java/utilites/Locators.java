package utilites;

public class Locators {
	
	// xPaths for home page
	
	//private static final String 
	private static final String login_Button = "//a[contains(text(),'Log In')]";	
	private static final String search_Box="//input[@placeholder='What do you want to learn?']";
	private static final String search_Button ="//button[@class='nostyle search-button']//div[@class='magnifier-wrapper']//*[local-name()='svg']";
	private static final String suggestions = "//div[@role='listbox' and @id='react-whatever-1']";
	//xPaths for login page 
	
	private static final String email ="//input[@placeholder='Email']";
	private static final String password="//input[@placeholder='Password']";
	private static final String logIn="//form[@name='login']//span[contains(text(),'Log in')]";
	private static final String facebook_Link="//span[contains(text(),'Continue with Facebook')]";

	//xPath for results page
	private static final String language_Filter="//div[contains(text(),'Language')]";
	private static final String level_Filter="//div[contains(text(),'Level')]";
	private static final String pagination_boxs ="//button[@id='pagination_number_box_button']";
	private static final String results_message = "//body/div[@id='rendered-content']/div/div/div/div/div/div/div/div/div/div/h3/span[1]";
	private static final String first_Course = "//li[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[2]//div[1]//h2[1]";
	private static final String second_Course = "//li[1]//div[1]//a[1]//div[1]//div[1]//div[1]//div[2]//div[1]//h2[1]";
	// xPath for display page
	private static final String course_Name = "//main[@id='main']//div//div//div//div//div//div//div//div//div//h1";
	private static final String ratings = "//body/div[@id='rendered-content']/div/div[@id='root']/main[@id='main']/div/div/div/div/div/div/div/div/div/div/div/div/div/span[1]";
	private static final String level = "//body//div[@id='root']//div//div//div//div//div//div//div//div[1]//div[2]//div[4]//div[2]//h4[1]";
	private static final String duration="//body//div[@id='root']//div//div//div//div//div//div//div//div[1]//div[2]//div[5]//div[2]//h4[1]//span[1]";
	private static final String language = "//body//div[@id='root']//div//div//div//div//div//div//div//div[1]//div[2]//div[6]//div[2]//h4[1]";
	
	//Home page
	
	

}
