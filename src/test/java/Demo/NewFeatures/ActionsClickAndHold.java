package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		
		WebElement homeButton = driver.findElement(By.id("home"));
		actions.clickAndHold(homeButton).perform();
		Thread.sleep(4000);
		actions.release().perform();

	}

}
