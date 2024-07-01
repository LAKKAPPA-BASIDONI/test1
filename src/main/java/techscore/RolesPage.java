package techscore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RolesPage {
	WebDriver driver;
	
	public RolesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//private By txtRoles = By.cssSelector("p span");
	
	@FindBy(css = "p span")
	WebElement txtRoles;
	
	
	
	

}
