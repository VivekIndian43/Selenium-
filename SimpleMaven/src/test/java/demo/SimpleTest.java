package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SimpleTest {
	
@Test
public void launch()
{
	
	WebDriver driver = new ChromeDriver();
	Reporter.log("Sample Test class Executed", true);
	}
}
