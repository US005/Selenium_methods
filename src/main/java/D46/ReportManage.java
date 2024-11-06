package D46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManage implements ITestListener {
	
	public ExtentSparkReporter sparkReporter; // Report Design
	public ExtentReports extent;  //Common info on reposrt
	public ExtentTest test;  //creating test case entries in the report
	
	public void onStart(ITestContext Context) {

		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + " Reports.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
	  }
	
	public void onTestSuccess(ITestResult result) {
	    test=extent.createTest(result.getName()); //create new entry in report
		test.log(Status.PASS, "TC Passed :" + result.getName());
		
	  }
	
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL," TC FAILED" + result.getThrowable());
	  }
	
	public void onFinish(ITestContext context) {
		 
		extent.flush();
	  }


}
