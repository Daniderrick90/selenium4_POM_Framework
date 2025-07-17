package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.nopcommerce_LoginPage;

public class nopcommerce_Valid_Login_Test extends BaseTest {

	@Test
	public void Valid_Login_Test() {
		
		nopcommerce_LoginPage  LoginPage = new nopcommerce_LoginPage(driver);
		
		LoginPage.userName_TextBox("admin@yourstore.com");
		LoginPage.password_TextBox("admin");
		LoginPage.loginButton();
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is : " + pageTitle);
		//This is to check the page title matched with the expected result
		//Test
		try {
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
		System.out.println("The title matched as expected..Test case passed");
		}
		catch(Exception e) {
			System.out.println("The title does'nt match" + e);
		}
	}
	
}
