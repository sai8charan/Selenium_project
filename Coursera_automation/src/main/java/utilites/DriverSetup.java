package utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {

	private static String url = "https://www.coursera.org/";
	public static WebDriver getWebDriver()
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Drivers\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
	
	
	
	
}
