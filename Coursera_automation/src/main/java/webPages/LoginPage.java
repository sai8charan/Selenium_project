package webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilites.Locators;

public class LoginPage {
	
	
	//select login via email & password
	//enter login details 
	
	public static void loginViaUN_PASS(WebDriver driver , String Email,String Password) throws InterruptedException
	{
		driver.findElement(By.xpath(Locators.get_LoginLink())).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Locators.get_EmailBox())).sendKeys(Email);
		driver.findElement(By.xpath(Locators.get_PasswordBox())).sendKeys(Password);
		driver.findElement(By.xpath(Locators.get_LoginButton())).click();
			
	}
	
	
	
	//select login via face book 
	/*public static void loginVia_FB(WebDriver driver , String Email,String Password) throws InterruptedException
	{
		driver.findElement(By.xpath(Locators.get_LoginLink())).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(Locators.get_fb_LoginLink())).click();
		driver.findElement(By.xpath(Locators.get_EmailBox())).sendKeys(Email);
		driver.findElement(By.xpath(Locators.get_PasswordBox())).sendKeys(Password);
		driver.findElement(By.xpath(Locators.get_LoginButton())).click();
			
	}*/
	
	
	//get error message 
	
    public static String errorMsgForinvalidLogin(WebDriver driver)
    {
    	String errmsg = driver.findElement(By.xpath(Locators.get_Loginerrmsg())).getText();
    	return errmsg;
    }
	
	
	

}
