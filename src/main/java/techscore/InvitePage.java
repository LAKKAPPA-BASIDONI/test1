package techscore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.epam.healenium.SelfHealingDriver;


public class InvitePage {
//	WebDriver driver;
//
//	public InvitePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//
//	}
//	
//	//private By txtInvites = By.cssSelector("p span");
//	
//	@FindBy(css = "p span")
//	WebElement txtInvites;
//	
//	public static void main (String[] args) {
//		String actual = "Hello world";
//		String expected = "Hello ";
//		Assert.assertEquals(actual, expected);
//	}
	
	public static void main(String[] args) throws InterruptedException {
        System.out.println(":::::::::::::::::::::::::::::");

        // Configure ChromeDriver
        WebDriver delegate = new ChromeDriver();

        // Create SelfHealingDriver
        WebDriver driver = SelfHealingDriver.create(delegate);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Navigate to the login page
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Explicit wait to ensure elements are loaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@name,'name') or @placeholder='Username']")));

        // Interact with username field
        WebElement usernameInput = driver.findElement(By.xpath("//input[contains(@name,'name') or @placeholder='Username']"));
        usernameInput.sendKeys("Admin");

        // Corrected XPath for the password field
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("admin123");

        // Interact with submit button
        WebElement submitButton = driver.findElement(By.xpath("//button[starts-with(@type,'sub')]"));
        submitButton.click();

        // Add more test steps as needed...

        // Quit the driver
        driver.quit();
    }
}
