package testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import baselayer.BaseClass;

public class Registerpagetestclass extends BaseClass {
	
	
	

	@Test()
	
	public void tc001_Verify_registration_with_valid_user () throws InterruptedException {
		
		
		Homepageclass_obj.clickonAccountlink();
		Homepageclass_obj.clickonRegisterlink();
		
		
		RegisterClass_obj.enterFirstName("stest");
		RegisterClass_obj.enterLastName("ctest");
		RegisterClass_obj.enterEmail("sctest@gmail.com");
		RegisterClass_obj.enterTelephone("1234567890");
		RegisterClass_obj.enterPassword("sctest@123");
		RegisterClass_obj.enterconfirmPassword("sctest@123");
		RegisterClass_obj.selectCheckbox();
		RegisterClass_obj.clickonContinue();
		
		String ActualTitle  =	driver.getTitle();
		String  expectedTitle= "Your Account Has Been Created!";
		
		Assert.assertEquals(ActualTitle, expectedTitle);
		
		Thread.sleep(5000);
		
		
	}
	
	@Test
	public void tc002_Verify_registration_with_Duplicate_mail () {
		
		Homepageclass_obj.clickonAccountlink();
		Homepageclass_obj.clickonRegisterlink();
		
		
		RegisterClass_obj.enterFirstName("stest");
		RegisterClass_obj.enterLastName("ctest");
		RegisterClass_obj.enterEmail("sctest@gmail.com");
		RegisterClass_obj.enterTelephone("1234567890");
		RegisterClass_obj.enterPassword("sctest@123");
		RegisterClass_obj.enterconfirmPassword("sctest@123");
		RegisterClass_obj.selectCheckbox();
		RegisterClass_obj.clickonContinue();
		
		String expected_error_msg = "Warning: E-Mail Address is already registered!";
		
		String Actual_error_msg = RegisterClass_obj.emailDuplicateMsgError();
	
	
		Assert.assertEquals(Actual_error_msg, expected_error_msg);
	}
	
}

