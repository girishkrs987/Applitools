package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.exceptions.TestFailedException;
import com.applitools.eyes.selenium.Eyes;

public class app_ui {

	
	public static WebDriver driver; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Girish/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Initialize the eyes SDK and set your private API key.
		Eyes eyes = new Eyes();

		// Set Applitools API key
		eyes.setApiKey("UkDryyzbaRzgFj0HFDsUlXMWwhmQcbPGYwHa4104p2OW8110");
		
		try {
		
		// Start the test by setting AUT's name, window or the page name that's being tested, viewport width and height
		eyes.open(driver, "Horlicks_Mother","mothers", new RectangleSize(1022, 633));
		//eyes.open(driver, "Horlicks_Mother","windowName", new RectangleSize(1200, 750));

		// Navigate the browser to the "ACME" demo app
		driver.get("https://mothers.horlicks.in/Range.html");
		
		// Visual checkpoint.
		eyes.checkWindow("Login window");
		
		
		// End the test
		eyes.close();

		} catch (TestFailedException e) {
			 System.out.println("\n" + e + "\n");
		} finally {

			// Close the browser.
			driver.quit();

			// If the test was aborted before eyes.close was called, ends the test as
			// aborted.
			eyes.abortIfNotClosed();

			// End main test
			System.exit(0);
		}
		// Close the browser.
	//	driver.quit();

		// If the test was aborted before eyes.close was called, ends the test as aborted.
		eyes.abortIfNotClosed();

	}

}
