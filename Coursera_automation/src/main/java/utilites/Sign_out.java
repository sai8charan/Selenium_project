package utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public  class Sign_out{
	public static void sign_out(WebDriver driver )
	{
		driver.findElement(By.xpath(Locators.get_ProfileDropDown())).click();
		driver.findElement(By.xpath(Locators.get_SignOutButton())).click();
	}

}
