package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nopcommerce_LoginPage {
	
	private WebDriver driver;
	
	@FindBy(id="Email")
	WebElement Login_TextBox;
	@FindBy(id="Password")
	WebElement Password_TestBox;
	@FindBy(xpath="//button[text()='Log in']")
	WebElement Login_Button;

	
	public nopcommerce_LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void userName_TextBox(String userName) {
		Login_TextBox.clear();
		Login_TextBox.sendKeys(userName);
	}
	
	public void password_TextBox(String password) {
		Password_TestBox.clear();
		Password_TestBox.sendKeys(password);
	}
	
	public void loginButton() {
		Login_Button.click();
	}
}
