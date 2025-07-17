package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.nopcommerce_LoginPage;
import utils.log;
import utils.ExtentReportManager;

public class nopcommerce_Valid_Login_Test extends BaseTest {

	@Test
	public void Valid_Login_Test() {
		
		test = ExtentReportManager.createTest("Login Test - ");

		test.info("Navigating to URL");
		
		nopcommerce_LoginPage  LoginPage = new nopcommerce_LoginPage(driver);
		
		log.logInfo("Entering the user name and password........");
		test.info("Adding Credentails & Password");
		LoginPage.userName_TextBox("admin@yourstore.com");
		LoginPage.password_TextBox("admin");
		log.logInfo("Clicked on login button........");
		test.info("Clicking on Login button");
		LoginPage.loginButton();
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is : " + pageTitle);
		//This is to check the page title matched with the expected result
		try {
			log.logInfo("Validating the title........");
			test.info("Verifying page title successfully");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		System.out.println("The title matched as expected..Test case passed");
		test.pass("Login Successful");
		}
		catch(Exception e) {
			System.out.println("The title does'nt match" + e);
		}
	}
	
	@Test
	public void inValid_Login_Test() {
		
		test = ExtentReportManager.createTest("Invalid Login Test - ");

		test.info("Navigating to URL");
		
		nopcommerce_LoginPage  LoginPage = new nopcommerce_LoginPage(driver);
		
		log.logInfo("Entering the user name and password........");
		test.info("Adding Credentails & Password");
		LoginPage.userName_TextBox("admin@yourstore.com");
		LoginPage.password_TextBox("admin");
		log.logInfo("Clicked on login button........");
		test.info("Clicking on Login button");
		LoginPage.loginButton();
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is : " + pageTitle);
		//This is to check the page title matched with the expected result
		try {
			log.logInfo("Validating the title........");
			test.info("Verifying page title successfully");
		Assert.assertEquals(driver.getTitle(), "Just a moment...123");
		System.out.println("The title matched as expected..Test case passed");
		test.pass("Login Successful");
		}
		catch(Exception e) {
			System.out.println("The title does'nt match" + e);
		}
	}
	
}
