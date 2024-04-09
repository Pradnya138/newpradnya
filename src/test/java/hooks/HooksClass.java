package hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {
	WebDriver driver;
	@Before
	public void initiateBrowser() throws IOException
	{
		Properties prop=new Properties();
		String path =System.getProperty("user.dir")+"//src//test//resources//config.properties";
		FileInputStream fis=new FileInputStream(path);
		prop.load(fis);
		//String browserName = prop.getProperty("browser");
		
	//	driver = df.initBrowser(browserName);
		// maximize
		driver.manage().window().maximize();
	}

	
	//@After(order =2)
	//public <TakeScreenshot> void tearDown(Scenario scenario)
	//{
	 // if(scenario.isFailed())
	  //{
		//  String scenarioName = scenario.getName();
		 // String name=scenarioName.replaceAll("", "");
		 // TakeScreenshot ts=(TakeScreenshot) driver;
		 // byte[] source=  ts.getScreenshotAs(OutputType.BYTES);
		 // scenario.attach(source, "image/png", name);
		  
	  //}
//	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
