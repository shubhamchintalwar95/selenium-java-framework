package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import baselayer.BaseClass;

public class screenshotutiliti extends BaseClass{
	

	public static void Takescreenshot( String name) {
		
		
		try {
			
			
			TakesScreenshot ts	=(TakesScreenshot)driver;		
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			String path = "./SS/" + name + ".png";
			
			File des= new File(path);
			
			 FileHandler.copy(src, des);
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}

}
