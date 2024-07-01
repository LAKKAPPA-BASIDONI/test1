package techscore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CandidatePage {
	WebDriver driver;
	
	public CandidatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
//    private By btnAddCandidates = By.cssSelector("button:text-is('Add Candidate')");
//    private By inputCandidateLinkedinUrl = By.cssSelector("#linkedInUrl");
//    private By inputCandidateFirstName = By.cssSelector("#givenName");
//    private By inputCandidateLastName = By.cssSelector("#familyName");
//    private By inputCandidatePhoneNumber = By.cssSelector("#phone");
//    private By inputCandidateEmail = By.cssSelector("#email");
//    private By inputCandidateJobTitle = By.cssSelector("#jobTitle");
//    private By inputCandidateYearsOfExperience = By.cssSelector("#year");
//    private By inputCandidateLocation = By.cssSelector("#location");
//    private By candidateDegree = By.cssSelector("div[aria-label='Without label']");
//    private By candidateBachelorsDegree = By.cssSelector("li[data-value='Bachelors']");
//    private By txtCandidate = By.cssSelector("p span");
    
    @FindBy(css= "button:text-is('Add Candidate')")
    WebElement btnAddCandidates;
    
    @FindBy(css= "#linkedInUrl")
    WebElement inputCandidateLinkedinUrl;
    
    @FindBy(css= "#givenName")
    WebElement inputCandidateFirstName;
    
    @FindBy(css= "#familyName")
    WebElement inputCandidateLastName;
    
    @FindBy(css= "#phone")
    WebElement inputCandidatePhoneNumber;
    
    @FindBy(css= "#email")
    WebElement inputCandidateEmail;
    
    @FindBy(css= "#jobTitle")
    WebElement inputCandidateJobTitle;
    
    @FindBy(css= "#year")
    WebElement inputCandidateYearsOfExperience;
    
    @FindBy(css= "#location")
    WebElement inputCandidateLocation;
    
    @FindBy(css= "div[aria-label='Without label']")
    WebElement candidateDegree;
    
    @FindBy(css= "li[data-value='Bachelors']")
    WebElement candidateBachelorsDegree;
    
    @FindBy(css= "p span")
    WebElement txtCandidate;
    
    
}
