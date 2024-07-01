package techscore;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.epam.healenium.SelfHealingDriver;

public class RahulShetty12 {

	public static void main(String[] args) {
		System.out.println(":::::::::::::::::::::::::::::");
        
        WebDriver delegate = new ChromeDriver();
        WebDriver driver = SelfHealingDriver.create(delegate);

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('inputUsername').setAttribute('id','inputUser');");
		WebElement uname = driver.findElement(By.id("inputUsername"));
		uname.sendKeys("rahul");
		WebElement upass = driver.findElement(By.name("inputPassword"));
		upass.sendKeys("39847");
		WebElement usub = driver.findElement(By.className("signInBtn"));
		usub.click();
	}
	

}
