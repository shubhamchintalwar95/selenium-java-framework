package testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import baselayer.BaseClass;
import pagelayer.Homepageclass;
import pagelayer.LoginPageclass;

public class LoginTestclass extends BaseClass {
	
	@Test
	public void testLogger() {

		logger.info("This is a test logger message");
		
	}

	@Test
	public void tc01_VerifyLogin_with_Valid_Credential() throws InterruptedException {
		
		Homepageclass Homepageclass_obj = new Homepageclass(driver);
		Homepageclass_obj.clickonAccountlink();
		Homepageclass_obj.clickonLoginButton();
		
	logger.info("landing on log in page");
		
		LoginPageclass LoginPageclass_obj =new LoginPageclass(driver);
		
		LoginPageclass_obj.enteremailadress("sctest@gmail.com");
		LoginPageclass_obj.enterpassword("sctest@123");
		
	logger.info("entered log in details");
		
		LoginPageclass_obj.clickonLogin();
		
	logger.info("clicked log in button");
	
	Thread.sleep(3000);
		
		String Expected= "My Account";
		String Actual= driver.getTitle();
		
		Assert.assertEquals(Actual, Expected);
		Thread.sleep(3000);
	}
	
	@Test
	public void tc02_verify_login_with_invalid_user() throws InterruptedException {
		
		Homepageclass Homepageclass_obj = new Homepageclass(driver);
		Homepageclass_obj.clickonAccountlink();
		Homepageclass_obj.clickonLoginButton();
		
		logger.info("landing on log in page");
		
		LoginPageclass LoginPageclass_obj =new LoginPageclass(driver);
		
		LoginPageclass_obj.enteremailadress("sctest@gmail.com");
		LoginPageclass_obj.enterpassword("sctest@123456789");
		
		logger.info("entered log in details");

		
		LoginPageclass_obj.clickonLogin();
		
		logger.info("clicked log in button");

		String Expected= "Account Login";
		String Actual= driver.getTitle();
		
		Assert.assertEquals(Actual, Expected);
		Thread.sleep(3000);
		
	}	
	
}
