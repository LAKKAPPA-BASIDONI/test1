package techscore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	private By inputUser = By.cssSelector("#number");
//	private By inputPassword = By.cssSelector("#password");
//	private By btnLogin = By.cssSelector("button[type='submit']");
	
	@FindBy(css ="#number")
	WebElement inputUser;
	
	@FindBy(css ="#password")
	WebElement inputPassword;
	
	@FindBy(css ="button[type='submit']")
	WebElement btnLogin;

}
