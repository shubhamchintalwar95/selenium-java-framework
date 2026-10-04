package pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageclass {

 public  WebDriver driver;
 public	LoginPageclass(WebDriver d){
		
		driver=d;
		PageFactory.initElements(driver, this);

	}
	
 	@FindBy(xpath="//input[@name='email']")
 	private WebElement enter_email_Adress;
 	
 	@FindBy(xpath="//input[@name='password']")
 	private WebElement enter_Password;

 	@FindBy(xpath="//input[@value='Login']")
 	private WebElement Login_Button;
 	
 	
//Actions
 	
 	public void enteremailadress(String email) {
 		
 		enter_email_Adress.sendKeys(email);
 		
 	}
 	
 	public void enterpassword(String password) {
 	
 		enter_Password.sendKeys(password);	
 		
 	}
 	public void clickonLogin() {
		
 		Login_Button.click();
 		
	}
 	
 	
}