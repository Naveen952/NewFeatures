package Demo.NewFeatures;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,499)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-400)");
		Thread.sleep(3000);
		jse.executeScript("alert('ertet')");
		

	}

}
