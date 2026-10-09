package utilities;


import org.testng.ITestListener;
import org.testng.ITestResult;

import baselayer.BaseClass;

public class Listner extends BaseClass implements  ITestListener  {

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
		//ScreenshotUtiliti.Takescreenshot(null);
		ScreenshotUtiliti.Takescreenshot(result.getName());
		
		logger.info("=============Screenshot Captured=============");

	}

	@Override
	public void onTestSkipped(ITestResult result) {

		System.out.println("Execution Skipped :-" + result.getName());

	
	}
	
}
