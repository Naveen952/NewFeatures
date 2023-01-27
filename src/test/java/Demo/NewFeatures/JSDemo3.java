package Demo.NewFeatures;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo3 {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("http://tutorialsninja.com/demo/");
			
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
		

	}

}
