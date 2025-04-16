package extendreport;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddScreenShotIntoreport {
	@Test
	public void addScreenshot()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_REPORT/screenshotreport.html");
		ExtentReports extreport= new ExtentReports();
		 extreport.attachReporter(spark);
		 
		 
		 
		ExtentTest test = extreport.createTest("addScreenshot");
		test.log(Status.INFO,"addind screenShort");
		
		test.addScreenCaptureFromBase64String(screenshot);
		extreport.flush();
		
		
		}
		
	}


