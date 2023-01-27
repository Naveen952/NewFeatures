package Demo.NewFeatures;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotMW {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		
		Thread.sleep(6000);
		Robot robot = new Robot();
		robot.mouseWheel(15);
		Thread.sleep(3000);
		robot.mouseWheel(-8);
		
		
		
	}

}
