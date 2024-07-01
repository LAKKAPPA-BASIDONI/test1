package techscore;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelfHealingExample {
	WebDriver driver;
	public SelfHealingExample(WebDriver driver) {
		this.driver = driver;
	}


	
	String[] ele = {"//button[@class=\"submit signInBn\"]","//jk","//kj","//button[@type='submit']"};
	
	public WebElement getLocator(String[] arr) {
		for(String a: arr) {
			try {
				WebElement ele =driver.findElement(By.xpath(a));
				return ele;
			}catch(NoSuchElementException e) {
				e.printStackTrace();
				
			}
			
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		SelfHealingExample locator = new SelfHealingExample(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		locator.getLocator(locator.ele).click();
		

	}

}
