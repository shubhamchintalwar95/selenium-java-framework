package pagelayer;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageclass {

 private WebDriver driver;
	
public 	Homepageclass(WebDriver d){
		
	driver= d;
	PageFactory.initElements(driver, this);
	
	}

// object repo 
	@FindBy(xpath="//a[@title='My Account']")
private	WebElement MyAccount_link;

	@FindBy(xpath="//a[text()='Register']")	
private	WebElement Register_button;
	
	@FindBy(xpath="//a[text()='Login']")
private WebElement LogInButton;
	

	
	
	  
	
//Actions
	
	public void clickonAccountlink() {
	
	MyAccount_link.click();
	
	}
	
	public void clickonRegisterlink() {
		
	Register_button.click();
		
	}
	
	public void clickonLoginButton() {
		
		LogInButton.click();
	
	}
	
	
}