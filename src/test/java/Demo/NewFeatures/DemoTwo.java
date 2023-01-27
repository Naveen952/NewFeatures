package Demo.NewFeatures;

import java.io.IOException;

public class DemoTwo {

	public static void main(String args[]) throws IOException
	{
	String autoItFilePath = System.getProperty("user.dir")+"\\AutoitCode\\functions.exe";
	String title = "www.naveen.com";
	String message = "easiest website";
	Runtime.getRuntime().exec(autoItFilePath);
	
	
	
}
}
