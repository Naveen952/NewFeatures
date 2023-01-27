package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoDragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/p/page3.html");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		
		WebElement startButton = driver.findElement(By.cssSelector("a[class$='ui-btn-null']"));
		actions.dragAndDropBy(startButton, 100, 0).perform();
		
		
		
		

	}

}
