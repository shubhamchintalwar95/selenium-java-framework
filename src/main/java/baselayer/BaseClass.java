package baselayer;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagelayer.Homepageclass;
import pagelayer.LoginPageclass;
import pagelayer.RegisterClass;


public class BaseClass {

	public static WebDriver driver ;
 	public Homepageclass Homepageclass_obj;
 	public	RegisterClass RegisterClass_obj;
 	public LoginPageclass LoginPageclass_obj;
	public static Logger logger;
 	@BeforeTest()
 	public void start() {
 		
 		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		String logFile = "./log/testlog_" + timestamp + ".log";

		System.setProperty("logFile", logFile);
		
		logger = Logger.getLogger("*** Test Data Driven Opencart Project ***");
		PropertyConfigurator.configure("log4jfile.properties");
		
		logger.info("-------- Open cart framework execution started --------");
		
 		
 	}
 	
 	@AfterTest()
 	public void finish(){
 		
		logger.info("-------- Open cart framework execution finish --------");
 	}
 	
	@BeforeMethod
	public void setUp() {
		
	String	browser_name="Chrome";
	
	if (browser_name.equalsIgnoreCase(browser_name)){
		
		 driver= new ChromeDriver();
		
	}
	else if (browser_name.equalsIgnoreCase(browser_name)) {
		
		 driver= new FirefoxDriver();
		
	}
	else if(browser_name.equalsIgnoreCase(browser_name)) {
		
		 driver= new EdgeDriver();
	}
	else {
		
		System.out.println("Please provide valid browser");
	}
		
		
		// driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		RegisterClass_obj = new RegisterClass(driver);
		Homepageclass_obj = new Homepageclass(driver);
		 LoginPageclass_obj =new LoginPageclass(driver);
		
		
	}
	
	
	@AfterMethod
	
	public void TearDown() {
		
	driver.quit();
		
	}
	
	
}
