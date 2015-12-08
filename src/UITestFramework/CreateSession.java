package UITestFramework;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;


public class CreateSession  {

	
	Properties configProp = new Properties();
	FileInputStream configFis;
	protected File file = new File("");
	public WebDriver driver = null;
	public PropertiesConfiguration mwNewFlowProperties;
	// Properties prop = new Properties();	

	@BeforeMethod(alwaysRun = true)
	public void createSession() throws Exception {
		propertiesFileLoad();
		driver = new FirefoxDriver();
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void teardown(){
		
		System.out.println("Shutting down driver");
		
		//driver.quit();
	}
	
	public void propertiesFileLoad() throws Exception{
		mwNewFlowProperties = new PropertiesConfiguration(file.getAbsoluteFile()
				+ "//src//config//config.properties");
	}
}
