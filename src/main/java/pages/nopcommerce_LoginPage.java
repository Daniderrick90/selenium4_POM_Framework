package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class nopcommerce_LoginPage {
	
	private WebDriver driver;

	private By Login_TextBox = By.id("Email");
	private By Password_TestBox = By.id("Password");
	private By Login_Button = By.xpath("//button[text()='Log in']");
	
	public nopcommerce_LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void userName_TextBox(String userName) {
		driver.findElement(Login_TextBox).clear();
		driver.findElement(Login_TextBox).sendKeys(userName);
	}
	
	public void password_TextBox(String password) {
		driver.findElement(Password_TestBox).clear();
		driver.findElement(Password_TestBox).sendKeys(password);
	}
	
	public void loginButton() {
		driver.findElement(Login_Button).click();
	}
}
