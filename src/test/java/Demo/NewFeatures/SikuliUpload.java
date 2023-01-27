package Demo.NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SikuliUpload {

	public static void main(String[] args) throws SikuliException {
	
		
	/*	WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");	
		driver.findElement(By.id("uploadfile")).click(); */
		Screen screen = new Screen();
		Pattern FileName = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\FileName.PNG");
		Pattern Open = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\Open.png");
		
		screen.wait(FileName,6);

		//String ImagePath = System.getProperty("user.dir")+"\\Files\\qafox.png";
		screen.type(FileName,"C:\\NewFeatures\\Files\\qafox.png");
		screen.click(Open);

	}

}
