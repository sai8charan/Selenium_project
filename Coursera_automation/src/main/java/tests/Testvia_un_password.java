package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilites.DriverSetup;
import utilites.ExcelData;
import webPages.DisplayPage;
import webPages.HomePage;
import webPages.LoginPage;
import webPages.ResultPage;

public class Testvia_un_password {

	private static WebDriver driver = null;
	// driver set up and login
	@BeforeTest
	public void driverstarter()
	{
		driver= DriverSetup.getWebDriver();

	}
	
	@Test(priority = 1)
	public void validLogin() throws InterruptedException
	{    String valid_uname = ExcelData.desiredFile(0, 1, 1);
	     String valid_password = ExcelData.desiredFile(0, 1, 2);
		
		try {
			LoginPage.loginViaUN_PASS(driver, valid_uname, valid_password);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String ActualPagetitle = driver.getTitle();
		 String Expected_Pagetitle = "\"Coursera | Online Courses & Credentials From Top Educators. Join for Free\"";
		 Assert.assertEquals(ActualPagetitle, Expected_Pagetitle);
	}
	
	//search courses
	
	@Test(priority = 2)
	public void searchTheCourse()
	{
		String ExpectedPageTitle = "Web Development Courses | Coursera";
		String ActualTitle;
		HomePage.enterSearchKeyword(driver, "Web Development");
		HomePage.clickOnSearchButton(driver);
		ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedPageTitle);
		
	}
	
	//pagination
	@Test(priority = 3)
	public void VerifyPagination()
	{
		int totalResults =ResultPage.getTotalResults(driver);
		int totalPages = ResultPage.getnoPages(driver);
		Assert.assertTrue(totalPages*10>=totalResults);
	}
	
	//courses
	@Test(priority=4)
	public void getCourseDetails1()
	{   String courseDetails[];
	    courseDetails= new String[5];
		ResultPage.select_Course1(driver);
		courseDetails[0]=DisplayPage.getCourseName(driver);
		courseDetails[1]=DisplayPage.getDuration(driver);
		courseDetails[2]=DisplayPage.getLanguage(driver);
		courseDetails[3]=DisplayPage.getRating(driver);
		
		
	}
	@Test(priority = 5)
	public void getCourseDetails2(){
		String courseDetails[];
	    courseDetails= new String[5];
		ResultPage.select_Course1(driver);
		courseDetails[0]=DisplayPage.getCourseName(driver);
		courseDetails[1]=DisplayPage.getDuration(driver);
		courseDetails[2]=DisplayPage.getLanguage(driver);
		courseDetails[3]=DisplayPage.getRating(driver);
		
		
	}
	
	
	
	
	
	
	
	
}
