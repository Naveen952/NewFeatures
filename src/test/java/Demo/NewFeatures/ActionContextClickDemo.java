package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionContextClickDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		
		WebElement  Selenium143Link = driver.findElement(By.id("link1"));
		actions.contextClick(Selenium143Link).perform();
		
		
		

	}

}
