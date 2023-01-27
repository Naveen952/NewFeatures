package Demo.NewFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class SikuliDemo {

	public static void main(String[] args) throws SikuliException  {
		
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("http://tutorialsninja.com/demo/");	
	Screen screen = new Screen();	
	Pattern MyAccountOption = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\MyAccount.png");
	Pattern LoginOption =     new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\login.png");
	Pattern EmailAddress = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\emailaddress.png");
	Pattern Password     = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\Password.png");
	Pattern LoginButton  = new Pattern(System.getProperty("user.dir")+"\\ImageFiles\\LoginButton.png");
	
	screen.wait(MyAccountOption,6);
	screen.click(MyAccountOption);
	screen.click(LoginOption);
	screen.type(EmailAddress, "ravi.kiran1@gmail.com");
	screen.type(Password, "rkiran");
	screen.click(LoginButton);

	}

}
