package Demo.NewFeatures;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String args[]) throws InterruptedException, IOException {
		/*WebDriver driver = null;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(5000);
		WebElement el = driver.findElement(By.id("uploadfile"));
		el.click(); */
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\AutoitCode\\fileupl.exe");
		
	}	
}
