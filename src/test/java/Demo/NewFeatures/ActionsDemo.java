package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(5000);
		Actions actions = new Actions(driver);
		WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		actions.moveToElement(blogsMenu).perform();
		Thread.sleep(3000);
		WebElement seleniumByArunOption = driver.findElement(By.linkText("SeleniumByArun"));
		actions.moveToElement(seleniumByArunOption).click().build().perform();
		
		
		
		
		

	}

}
