package D46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylisteners implements ITestListener{
	
	
	public void onStart(ITestContext Context) {
	    System.out.println("Test Execution started  ");
	  }
	
	public void onTestStart(ITestResult result) {
		 System.out.println(" Test cases started ");
	  }
	

	public void onTestSuccess(ITestResult result) {
		 System.out.println(" Test Execution success ");
	  }
	
	public void onTestFailure(ITestResult result) {
		 System.out.println(" Test Execution failed ");
	  }
	
	public void onTestSkipped(ITestResult result) {
		 System.out.println(" Test Execution skipped ");
	  }
	
	public void onFinish(ITestContext context) {
		 System.out.println(" Test Execution Finished ");
	  }

}
