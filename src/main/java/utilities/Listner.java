package utilities;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner implements  ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("Execution started :-" + result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {

		System.out.println("Execution Success :-" + result.getName());
		
		

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Execution Failed :-" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("Execution Skipped :-" + result.getName());

	
	}
	
}
