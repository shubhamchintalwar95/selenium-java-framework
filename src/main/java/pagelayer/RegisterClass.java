package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RegisterClass {
	
	public WebDriver driver;
	
	public RegisterClass(WebDriver d) {
		
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	//object repo

private	By FirstName_Textbox =By.xpath("//input[@name='firstname']");			
private	By LastName_Textbox =By.xpath("//input[@name='lastname']");
private	By Email_Textbox =By.xpath("//input[@name='email']");
private	By Telephone_Textbox =By.xpath("//input[@name='telephone']");
private	By Password_Textbox = By.xpath("//input[@name='password']");
private	By PasswordConfim_Textbox =By.xpath("//input[@name='confirm']");
//private	By Newsletter_No_Button =By.xpath("//input[@value='0']");
private	By Newsletter_yes_Button =By.xpath("//input[@value='1']");
private	By PrivacyPolicy_Checkbox =By.xpath("//input[@name='agree']");
private By continuebutton =By.xpath("//input[@value='Continue']");

private By email_duplicate_error_msg= By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	//Actions
	
	public void enterFirstName(String firstname) {
		
	driver.findElement(FirstName_Textbox).sendKeys(firstname);
		
	}
	
	public void enterLastName(String lastname) {
		
	driver.findElement(LastName_Textbox).sendKeys(lastname);
		
	}
	
	public void enterEmail(String email) {
		
	driver.findElement(Email_Textbox).sendKeys(email);
		
	}
	
	public void enterTelephone(String number) {
		
	driver.findElement(Telephone_Textbox).sendKeys(number);
		
	}
	
	public void enterPassword(String password) {
		
	driver.findElement(Password_Textbox).sendKeys(password);
		
	}
	
	public void enterconfirmPassword(String confirm_password) {
		
	driver.findElement(PasswordConfim_Textbox).sendKeys(confirm_password);
		
	}
	
	public void selectYesradiobutton() {
		
	driver.findElement(Newsletter_yes_Button).click();	
	
	}
	
	public void selectCheckbox() {
		
	driver.findElement(PrivacyPolicy_Checkbox).click();
			
	}
	
	public void clickonContinue() {
		
	driver.findElement(continuebutton).click();
		
	}
	
	public String emailDuplicateMsgError() {
		
		String msg= driver.findElement(email_duplicate_error_msg).getText();
		 return msg;
		
	}
	
	
	
	
}
