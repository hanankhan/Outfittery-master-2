package UITestFramework;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class OutfitteryScreens {
	
	public boolean testCaseStatus = true;
	boolean testStatus;

		WebDriver driver = null;
		public OutfitteryScreens(WebDriver driver) {
			this.driver = driver;
			// TODO Auto-generated constructor stub
		}

		public final int timeOut = 10;
		
		/**
		 *  method to wait for an element to be visible
		 * @param targetElement element to be visible
		 * @return true if element is visible else throws TimeoutException
		 * @throws TimeoutException 
		 */
		public boolean waitForVisibility(By targetElement) throws TimeoutException {
			WebDriverWait wait = new WebDriverWait(driver, timeOut);
			wait.until(ExpectedConditions.visibilityOfElementLocated(targetElement));
			return true;
		}
		

		public WebElement findElement(By locator){
			try {
				WebElement element = driver.findElement(locator);
				return element;
			}
			catch (NoSuchElementException e){
				System.out.println(this.getClass().getName() +"findElement Element not found" + locator);
				throw new NoSuchElementException(e.getMessage());
			}
		}
		
		public void verifyNotEquals(Object actual, Object expected, String message,
				boolean screenshotOnFailure, boolean exitOnFailure) {

			Reporter.log("<br>");

			try {
				Assert.assertNotEquals(actual, expected, message);
				Reporter.log("<Font Color=#008000> PASS </Font>" + message);

			} catch (AssertionError e) {
				this.testCaseStatus = false;
				

				if (exitOnFailure) {
					Reporter.log("<br>");

					Reporter.log("Exiting this function as exitOnFail flag is set to True. Will move to next test.");

					throw e;

				}

			}
		}

		public boolean verifyTrue(boolean condition, String message,
				boolean screenshotOnFailure, boolean exitOnFailure) {

			Reporter.log("<br>");

			try {
			
				Assert.assertTrue(condition, message);
				Reporter.log("<Font Color=#008000> PASS </Font>" + message);
			
			} catch (AssertionError e) {
				this.testCaseStatus = false;
				
			
				if (exitOnFailure) {
					Reporter.log("<br>");

					Reporter.log("Exiting this function as exitOnFail flag is set to True. Will move to next test.");

					throw e;

				}

			}

			return this.testCaseStatus;
		}


		public boolean verifyEquals(Object actual, Object expected, String message, boolean screenshotOnFailure, boolean exitOnFailure) {
			testStatus=true;
			Reporter.log("<br>");
			try {
				Assert.assertEquals(actual, expected, message);
				Reporter.log("<Font Color=#008000> PASS </Font>" + message);

			} catch (AssertionError e) {
			
				testStatus = false; 
				

				if (exitOnFailure) {
					Reporter.log("<br>");
					Reporter.log("Exiting this function as exitOnFail flag is set to True. Will move to next test.");
					throw e;
				}

			}
			return testStatus;
		}
	}

