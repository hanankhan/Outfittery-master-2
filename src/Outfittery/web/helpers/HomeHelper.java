package Outfittery.web.helpers;



import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.openqa.selenium.support.ui.Select;






import Outfittery.web.screens.HomePage;

public class HomeHelper extends HomePage{
 WebDriver driver = null;

HomePage hp;
HomeHelper hh;

	public HomeHelper(WebDriver driver, String baseUrl) 
	{
	// TODO Auto-generated constructor stub
	super(driver);
	this.driver = driver;
    hp = new HomePage(driver);
    driver.get(baseUrl);
  
	}
	
	public void profileupdate(String fname,String lname) throws TimeoutException 
	{
		
		hp.waitForVisibility(hp.menu);
		hp.findElement(hp.menu).click();
		hp.waitForVisibility(hp.billing);
		hp.findElement(hp.billing).click();
		hp.waitForVisibility(hp.myprofiletab);  // Waiting for my Profile Tab to appear on screen
		hp.findElement(hp.myprofiletab).click();// Click on My profile tab
		hp.waitForVisibility(hp.welcome);       // Checking if the user have appeared on My profile screen
		String wel = hp.findElement(hp.welcome).getText();
		hp.verifyEquals(wel, "Welcome to your profile", "Verifying Profile page", false, false);		
	

        /*
    	 * Test test the user information :
    	 * Gender Toggle Radio Buttons
    	 * First Name and Last name
    	 * Save Button for this section. 
    	 */
    		boolean b = false;
    		b= hp.findElement(hp.radio1).isSelected();
    		if(b=true){  hp.findElement(hp.radio2).click(); } // This block is checking if Mr. is selected choose Ms and vice versa
    		else { hp.findElement(hp.radio1).click(); }
    		
    		hp.findElement(hp.fnm).sendKeys(fname);
    		String newname = hp.findElement(hp.fnm).getText();
    		hp.findElement(hp.lnm).sendKeys(lname); // Block to update name and saving 
    		String newlname = hp.findElement(hp.fnm).getText();
    		hp.findElement(hp.savename).click();
    		hp.waitForVisibility(hp.savepopup);
    		hp.findElement(hp.savepopup).click();
    		// Verifying if the names are updated or not
    		hp.verifyEquals(fname, newname, "First Name Updated-Pass", false, false); 
    		hp.verifyEquals(lname, newlname, "Last Name Updated-Pass", false, false);
    			
    		
    		/*
    		 * Tests for the Mandatory General clothing size of customer
    		 */	
    		
    		hp.waitForVisibility(hp.bdyht);
    		hp.findElement(hp.bdyht).click();
            Select bdyhight = new Select(hp.findElement(hp.bdyht));
            bdyhight.selectByIndex(7);
            
            hp.findElement(hp.weight).click();
            Select weight = new Select(hp.findElement(hp.weight));
            weight.selectByIndex(7);
            
            
            hp.findElement(hp.shirt).click();
            Select shirt = new Select(hp.findElement(hp.shirt));
            shirt.selectByIndex(3);
            
            hp.findElement(hp.jeans).click();
            Select jn = new Select(hp.findElement(hp.jeans));
            jn.selectByIndex(3);
            
            hp.findElement(hp.lth).click();
            Select jnln = new Select(hp.findElement(hp.lth));
            jnln.selectByIndex(2);
            
            hp.findElement(hp.shoe).click();
            Select sh = new Select(hp.findElement(hp.shoe));
            sh.selectByIndex(3);     
            hp.findElement(hp.savesize).click();
            
            
    	
    	}
        
        
        


		
	/*
	 * Login method to help other method call login functionality directly
	 */

	public  void login(String email, String password)  
	{	
		hp.findElement(hp.customerlogin).click();
		hp.findElement(hp.email).sendKeys(email);
		hp.findElement(hp.password).sendKeys(password);	
		hp.findElement(hp.submit).click();
		
	}
//		
//@AfterTest
//public void tearDown(){
//	driver.quit();
//}


}