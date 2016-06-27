package samplefunctions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralFunctions {

	
	public static WebDriver driver;
	public static String sErrMsg="";
	
	/******************************************
	 * FunctionName  :clickElement
	 * Purpose       : element click
	 * 
	 * *****************************************/
	public static boolean clickElement(By objLocator)
	{
		try{
			if(verifyVisibilityOFElement(objLocator)){
				driver.findElement(objLocator).click();
				return true;
			}  
			else{
				return false;
			}
			
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return false;
		}
	}

	/******************************************
	 * FunctionName  :
	 * Purpose       : enters text to element
	 * 
	 * *****************************************/
	public static boolean enterTextToElement(By objLocator,String sValue)
	{
		try{
			if(verifyVisibilityOFElement(objLocator)){
			driver.findElement(objLocator).clear();
			driver.findElement(objLocator).sendKeys(sValue);;
			return true;
			}
			return false;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return false;
		}
	}

	/******************************************
	 * FunctionName  :
	 * Purpose       : existence of the element
	 * 
	 * *****************************************/
	public static boolean verifyVisibilityOFElement(By objLocator)
	{
		try{

             //new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(objLocator));
			return true;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return false;
		}
	}


	/******************************************
	 * FunctionName  :
	 * Purpose       : get list of elements
	 * 
	 * *****************************************/
	public static List<WebElement> getElemetList(By objLocator)
	{
		try{
			if(verifyVisibilityOFElement(objLocator)){
		       
				return driver.findElements(objLocator);
			}
			return null;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return null;
		}
	}

	
	/******************************************
	 * FunctionName  :
	 * Purpose       : get text
	 * 
	 * *****************************************/
	
	public static String getText(By objLocator)
	{
		try{
			
		if(verifyVisibilityOFElement(objLocator) )
		{		String sText=driver.findElement(objLocator).getText();
			return sText;
		}
		return null;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return null;
		}
	}

	/******************************************
	 * FunctionName  :
	 * Purpose       : uploads a file
	 * 
	 * *****************************************/
	public static boolean fileUpload(By objLocator,String sPath)
	{
		if(!new File(sPath).exists()){
			sErrMsg="file not exists";
			return false;
		}
		try{
			if(verifyVisibilityOFElement(objLocator)){
			driver.findElement(objLocator).click();
			
			Thread.sleep(2000);
            StringSelection content=new StringSelection(sPath);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(content, null);
            
            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            
            Thread.sleep(2000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
			return true;
			}
			return false;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return false;
		}
	}


	/******************************************
	 * FunctionName  :
	 * Purpose       : opens IE browser
	 * 
	 * *****************************************/
	public static boolean openIEBrowser(String sURL )
	{
		try{
			System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			cap.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
            cap.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
            cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            cap.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
            cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,true);
			
			
			driver=new InternetExplorerDriver(cap);
			driver.get(sURL);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return true;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return false;
		}
	}

	/******************************************
	 * FunctionName  :
	 * Purpose       : opens chrome browser
	 * 
	 * *****************************************/
	public static boolean openChormeBrowser(String sURL)
	{
		try{
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");			
			driver=new ChromeDriver();
			driver.get(sURL);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return true;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			return false;
		}
	


	
	


}
	
	/******************************************
	 * FunctionName  :close
	 * Purpose       :closes the browser
	 * 
	 * *****************************************/

	public static void close() {
		// TODO Auto-generated method stub
driver.close();		
	}

	
	
	/******************************************
	 * FunctionName  :
	 * Purpose       :Frames
	 * @return 
	 * 
	 * *****************************************/
	
public static boolean gotoframe(By xpath) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

