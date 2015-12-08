package Outfittery.web.tests;

import java.util.concurrent.TimeoutException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Outfittery.web.helpers.HomeHelper;
import UITestFramework.CreateSession;

public class HomePageTest extends CreateSession{

	HomeHelper homeHelper;
	String email;
	String password;
	String baseUrl;
	String fname,lname;
	
	@BeforeMethod(alwaysRun = true)
	public void instantiateHelpers(){
		
		email = mwNewFlowProperties.getString("email");
		password = mwNewFlowProperties.getString("password");
		baseUrl = mwNewFlowProperties.getString("baseUrl");
		homeHelper = new HomeHelper(driver,baseUrl);

	}
		
	@Test(priority=0)
	public void logintest() throws InterruptedException, TimeoutException
	{
	    driver.manage().window().maximize();
		homeHelper.login(email, password);
		homeHelper.profileupdate(fname,lname);
		//homeHelper.profile();
		
	}
	
	
	
}
