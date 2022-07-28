package utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import testBase.Testbase;

public class ListenerClass extends Testbase implements ITestListener{

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {

		logger.info("Test case failed");
		UtilClass.takeSS(arg0.getName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {

		logger.info("Test case Execution Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		logger.info("Test Executed Successfully");
		
	}
	

}
