package extendreport;



import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtendReport {
	@Test
	public void createReport()
	{
		String time = LocalDateTime.now().toString().replace(":", "-");
		// step 1: create ExtendSparkReporters object
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_REPORT/Extentreport"+time+".html");
		
		// step:2  create ExtentReports object
		
		ExtentReports extReport=new ExtentReports();
		
		//step :3 attach  ExtendSparkReporters to ExtentReports
		extReport.attachReporter(spark);
		
		//step :4  create ExtentTest object
		ExtentTest test= extReport.createTest("createReport");
		
		
		// step:5 call logs (status , message)
		test.log(Status.PASS, "log message Added into report");
		
		
		// step:6 call flush
		extReport.flush();
		
		
	}
	
	

}
