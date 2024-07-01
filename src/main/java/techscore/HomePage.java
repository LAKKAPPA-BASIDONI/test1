package techscore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver; 
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);;
	}
	
	
//    private By profileIcon = By.xpath("//button[aria-label=\"account of current user\"]");
//    private By optManageAccount = By.xpath("//li[text()='Manage Account']");
//    private By btnCandidates = By.cssSelector("p:text-is('Candidates')");
//    private By inputFirstName = By.cssSelector("input[name='firstName']");
//    private By inputLastName = By.cssSelector("input[name='lastName']");
//    private By btnSave = By.cssSelector("button[type='submit']");
//    private By txtUpdatedSuccessFully = By.cssSelector("span[class='invitemsg']");
//    private By btnInvites = By.cssSelector("p:text-is('Invites')");
//    private By btnRoles = By.cssSelector("p:text-is('Roles')");
//    private By linkTermsAndConditions = By.cssSelector("p:text-is('Terms & Conditions')");
//    private By btnBack = By.cssSelector("p:text-is('Back')");
//    private By linkPrivacyPolicy = By.cssSelector("p:text-is('Privacy Policy')");
//    private By inputSearch = By.cssSelector("input[aria-label = 'search']");
    
    @FindBy(xpath = "//button[aria-label=\"account of current user\"]" )
    WebElement profileIcon;
    
    @FindBy(xpath = "//li[text()='Manage Account']" )
    WebElement optManageAccount;
    
    @FindBy(css = "p:text-is('Candidates')" )
    WebElement btnCandidates;
    
    @FindBy(css = "input[name='firstName']" )
    WebElement inputFirstName;
    
    @FindBy(css = "input[name='lastName']" )
    WebElement inputLastName;
    
    @FindBy(css = "button[type='submit']" )
    WebElement btnSave;
    
    @FindBy(css = "span[class='invitemsg']" )
    WebElement txtUpdatedSuccessFully;
    
    @FindBy(css = "p:text-is('Invites')" )
    WebElement btnInvites;
    
    @FindBy(css = "p:text-is('Roles')" )
    WebElement btnRoles;
    
    @FindBy(css = "p:text-is('Terms & Conditions')" )
    WebElement linkTermsAndConditions;
    
    @FindBy(css = "p:text-is('Back')" )
    WebElement btnBack;
    
    @FindBy(css = "p:text-is('Privacy Policy')" )
    WebElement linkPrivacyPolicy;
    
    @FindBy(css = "input[aria-label = 'search']" )
    WebElement inputSearch;



}
