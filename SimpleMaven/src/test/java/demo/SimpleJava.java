package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleJava {
	@Test
	public void launch()
	{
		WebDriver driver= new ChromeDriver();
		Reporter.log("SimpleJava Executer",true);
	}

}
