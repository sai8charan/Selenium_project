package utilites;

public class Locators {
	
	// xPaths for home page
	//private static final String 
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
	
	//xPath for login link
	private static final String login_Link = "//a[contains(text(),'Log In')]";	
	
	//xPaths for sign out
	private static final String profile_Dropdown_menu="//body/div[@id='rendered-content']/div/div/span/div/header/div/div/div/div/div/div[@id='c-ph-right-nav']/ul[@id='authenticated-info-menu']/li/div/button[@id='right-nav-dropdown-btn']/div[1]";
	private static final String signOut_Button= "//ul[@id='c-ph-aai-dropdown']//button[@id='logout-btn']";
	
	//Home page 
	
	public static String getSearch_Box() {
		return search_Box;
	}
	
	public static String getSearch_Button() {
		return search_Button;
	}
	
	
	public static String get_Suggestions(){
		return suggestions;
	
	}
	
	//Login Page
	
	public static String get_EmailBox(){
		return email;
	
	}
	
	public static String get_PasswordBox(){
		return password;
	
	}
	
	public static String get_LoginButton(){
		return logIn;
	
	}
	
	public static String get_fb_LoginLink(){
		return facebook_Link;
	
	}
	
	
	//Results Page
	
	public static String get_LanguageFilter(){
		return language_Filter;
	
	}
	
	public static String get_LevelFilter(){
		return level_Filter;
	
	}
	
	public static String get_PaginationBoxs(){
		return pagination_boxs;
	
	}
	
	public static String get_ResultsMessage(){
		return results_message;
	
	}

	public static String get_FirstCourse(){
		return first_Course;
	
	}
	
	public static String get_Secondcourse(){
		return second_Course;
	
	}
	
	//Display page
	
	public static String get_CourseName(){
		return course_Name;
	
	}
	
	public static String get_level(){
		return level;
	
	}
	
	public static String get_Language(){
		return language;
	
	}
	
	public static String get_Ratings(){
		return ratings;
	
	}
	
	public static String get_Duration(){
		return duration;
	
	}
	
	//login link
	
	public static String get_LoginLink(){
		return login_Link;
	
	}
	
	//sign out links
	public static String get_ProfileDropDown(){
		return profile_Dropdown_menu;
	
	}
	
	public static String get_SignOutButton(){
		return signOut_Button;
	
	}
}
