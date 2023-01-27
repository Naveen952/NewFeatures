package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
			
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('input-email').setAttribute('value','ravi.kiran1@gmail.com')");
		Thread.sleep(3000);
		jse.executeScript("document.getElementById('input-password').setAttribute('value','rkiran')");
		Thread.sleep(3000);
		jse.executeScript("arguments[0].click()", driver.findElement(By.cssSelector("input[type='submit']")));
		Thread.sleep(3000);




		
		

	}

}
