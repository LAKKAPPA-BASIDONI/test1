package techscore;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.epam.healenium.SelfHealingDriver;

public class TechScoreTestCases {
	WebDriver driver;
	TechScoreLocator locate;
	DataManipulation data = new DataManipulation();
    String techScoreURL = "https://app.stage.yourtechscore.com/login", userEmail ="lbasidoni@bayonesolutions.com", userPassword ="LakkappaB@18"; 
	
	@BeforeTest
	public void login() {
		 // Configure ChromeDriver
        WebDriver delegate = new ChromeDriver();
		driver = SelfHealingDriver.create(delegate);
		locate = new TechScoreLocator(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(techScoreURL);
        this.locate.login.inputUser.sendKeys(userEmail);
        this.locate.login.inputPassword.sendKeys(userPassword);
        this.locate.login.btnLogin.click();
	}
	
	@Test(enabled = false)
	
	public void updateFirstAndLastNameOfUser()throws InterruptedException{
		Thread.sleep(5000);
        this.locate.home.profileIcon.click();
        this.locate.home.optManageAccount.click();
        this.locate.home.inputFirstName.isEnabled();
        this.locate.home.inputFirstName.click();
        this.locate.home.inputFirstName.sendKeys(Keys.BACK_SPACE);
        
        this.locate.home.inputFirstName.sendKeys("Lakkappa");
        this.locate.home.inputLastName.click();
        this.locate.home.inputLastName.sendKeys(Keys.BACK_SPACE);
        this.locate.home.inputLastName.sendKeys("Basidoni");
        this.locate.home.btnSave.click();
        this.locate.home.txtUpdatedSuccessFully.isEnabled();
        Assert.assertEquals(this.locate.home.txtUpdatedSuccessFully.getText(), "Details updated successfully!");

    }
    @Test(enabled = false)
    public void addCandidate()throws InterruptedException, IOException{
    	HashMap<String,String> map = data.getExcelData("D:/Book1.xlsx", "sheet1", "candidate1");
        // click candidate
        Thread.sleep(5000);
        this.locate.home.btnCandidates.click();
        this.locate.candidate.btnAddCandidates.click();
        this.locate.candidate.inputCandidateLinkedinUrl.sendKeys(map.get("url"));
        this.locate.candidate.inputCandidateFirstName.sendKeys(map.get("firstName"));
        this.locate.candidate.inputCandidateLastName.sendKeys(map.get("lastName"));
        this.locate.candidate.inputCandidatePhoneNumber.sendKeys(map.get("phoneNumber"));
        this.locate.candidate.inputCandidateEmail.sendKeys(map.get("email"));
        this.locate.candidate.inputCandidateJobTitle.sendKeys(map.get("jobTitle"));
        this.locate.candidate.candidateDegree.click();
        this.locate.candidate.candidateBachelorsDegree.click();
        this.locate.candidate.inputCandidateYearsOfExperience.sendKeys(map.get("yearOfExperience"));
        this.locate.candidate.inputCandidateLocation.sendKeys(map.get("location"));
        this.locate.candidate.btnAddCandidates.click();
        

    } 
    
    @Test
    public void test12() {
    	System.out.println("Inside test12 method...") ;
    }
    
    @AfterTest
    public void tearDown() {
    	driver.close();
    }
    

}
