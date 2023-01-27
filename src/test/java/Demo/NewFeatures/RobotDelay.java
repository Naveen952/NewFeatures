package Demo.NewFeatures;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDelay {

	public static void main(String[] args) throws AWTException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyPress(KeyEvent.VK_F5);
		
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyPress(KeyEvent.VK_F5);
	    
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyPress(KeyEvent.VK_F5);
		
		

	}

}
