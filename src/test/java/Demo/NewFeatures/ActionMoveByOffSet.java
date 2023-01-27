package Demo.NewFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.errorprone.annotations.Var;

public class ActionMoveByOffSet {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		actions.moveByOffset(100, 100).contextClick().build().perform();
	
		

	}

}
