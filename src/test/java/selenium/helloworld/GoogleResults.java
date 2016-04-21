package selenium.helloworld;

import org.openqa.selenium.WebDriver;

// Page result - represents result of page operation
public class GoogleResults {

	private WebDriver driver;

	public GoogleResults(WebDriver driver) {
		this.driver = driver;
	}

	// Validation methods
	
	public boolean validateSearchText(String expectedText) {
		return driver.getPageSource().contains(expectedText);
	}
}
