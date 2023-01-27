package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/");
			
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		System.out.println(jse.executeScript("return document.title"));
		System.out.println(jse.executeScript("return document.URL"));

		
		
		
		

	}

}
