package tests;
import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import utilites.*;
import webPages.LoginPage;
public class LoginTest {
	private static String valid_uname="pvsc333@gmail.com";
	private static String valid_password="Charan@98";
	private static String user_n1;
	private static String password1;
	private static String user_n2;
	private static String password2;
	private static String user_n3;
	private static String password3;
	private static final String Expected_error_Message ="Something went wrong. Please refresh the page and try again. If the problem persists, visit the Learner Help Center";
	
	private static WebDriver driver = null;
	@BeforeTest
	public void driverstarter()
	{
		driver= DriverSetup.getWebDriver();
		driver.get("https://www.coursera.org/?authMode=login");
	}
	@Test (priority=1)
	public void validLogin() throws InterruptedException
	{
		try {
			LoginPage.loginViaUN_PASS(driver, valid_uname, valid_password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String ActualPagetitle = driver.getTitle();
		 String Expected_Pagetitle = "\"Coursera | Online Courses & Credentials From Top Educators. Join for Free\"";
		 Assert.assertEquals(ActualPagetitle, Expected_Pagetitle);
		 Thread.sleep(3000);
		 Sign_out.sign_out(driver);; 
	}
	@Test (priority=2)
	public void invalidLogin1() {
		try {
			LoginPage.loginViaUN_PASS(driver, user_n1, password1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualMessage = LoginPage.errorMsgForinvalidLogin(driver);
		Assert.assertEquals(actualMessage, Expected_error_Message);
	}
	@Test (priority=3)
	public void invalidLogin2() {
		try {
			LoginPage.loginViaUN_PASS(driver, user_n2, password2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualMessage = LoginPage.errorMsgForinvalidLogin(driver);
		Assert.assertEquals(actualMessage, Expected_error_Message);
	}
	@Test (priority=4)
	public void invalidLogin3() {
		try {
			LoginPage.loginViaUN_PASS(driver, user_n3, password3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualMessage = LoginPage.errorMsgForinvalidLogin(driver);
		Assert.assertEquals(actualMessage, Expected_error_Message);
	}
	
	
}
