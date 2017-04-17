package com.alticor.magic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
//import org.apache.bcel.generic.Select;//
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


import com.alticor.magic.report.Reports;
import com.alticor.magic.report.StepReport;


public class GeneralFunctions {


	private static final String Select = null;
	public static WebDriver driver;
	public static String sErrMsg="";
	
	
	/******************************************
	 * FunctionName  :clickElementByJavascriptExecutor
	 * Purpose       : JavaScript Executor
	 *
	 * *****************************************/
	public static boolean clickElementByJavascriptExecutor(By objLocator){
		try{
			if(verifyVisibilityOFElement(objLocator)){
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", driver.findElement(objLocator));
	return true;
		}
		}catch(Exception e){};
		return false;
		}
public static boolean clickElementByJavascriptExecutor(WebElement objLocator){
		try{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",objLocator);
	return true;
		
		}catch(Exception e){};
		return false;
		}
	
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
				Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator, true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
				return true;
			}
			else{
				Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " Element Not Visible", false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
				return false;
			}

		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
		//	Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false));//
			return false;
		}
	}
    
/******************************************
	 * FunctionName  :enterTextToElement
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
	//	Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));//
			return false;
		}
	}
	
/******************************************
	 * FunctionName  :verifyVisibilityOFElement
	 * Purpose       : existence of the element
	 *
	 * *****************************************/
	public static boolean verifyVisibilityOFElement(By objLocator)
	{
		try{
return true;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
			return false;
		}
	}
	
/******************************************
	 * FunctionName  :getElemetList
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
			Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
			return null;
		}
	}
	
/******************************************
	 * FunctionName  :getText
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
			Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
			return null;
		}
	}

/******************************************
	 * FunctionName  :fileUpload
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

			Thread.sleep(3000);
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
			Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
			return false;
		}
	}
	
/******************************************
	 * FunctionName  :openIEBrowser
	 * Purpose       : opens IE browser
	 *
	 * *****************************************/
	public static boolean openIEBrowser(String sURL )
	{
		try{
			System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			cap.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
            cap.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
            cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            cap.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
            cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,true);
            
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			            //cap.setCapability(InternetExplorerDriver.HOST,true);//
            
			driver=new InternetExplorerDriver(cap);
			driver.get(sURL);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			//driver.navigate().to("javascript:document.getElementById('overridelink').click()");//
			Reports.CurrentTest.AddStep(new StepReport("Open Browser " + driver, true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
			return true;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			
		//	Reports.CurrentTest.AddStep(new StepReport("Open Broswr Failed: "  + " " + sErrMsg, false, null));//
			return false;
		}
	}
	
/******************************************
	 * FunctionName  :openChormeBrowser
	 * Purpose       : opens chrome browser
	 *
	 * *****************************************/
	public static boolean openChormeBrowser(String sURL)
	{
		try{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
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
//driver.close();//
driver.quit();
		}

/******************************************
	 * FunctionName  :gotoframe
	 * Purpose       :Frames
	 * @return
	 *
	 * *****************************************/
public static boolean gotoframe(By xpath) {
		// TODO Auto-generated method stub
		return false;
	}

/******************************************
 * FunctionName  :activeElement
 * Purpose       : element active 
 *
 * *****************************************/
public static boolean activeElement(By objLocator)
{//TODO: Shouldn't this function actully do something?
	try{
return true;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
		Reports.CurrentTest.AddStep(new StepReport("Click Element: " + objLocator + " " + sErrMsg, false,null));
		return false;
	}
}

/******************************************
 * FunctionName  :display
 * Purpose       : display element
 *
 * *****************************************/
public static boolean display(By objLocator)
{//TODO: What does this do?
	try{
return true;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
		return false;
	}
	
}

/******************************************
 * FunctionName  :Wait
 * Purpose       :Waits
 *
 * *****************************************/

public static void waittime() {
	// TODO Auto-generated method stub
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
}

/******************************************
* FunctionName  : FindElement
* * Purpose       :finding an element
 * @return 
*
* *****************************************/
public static boolean FindElement(By objLocator) {
	try{
		if(verifyVisibilityOFElement(objLocator)){
		driver.findElement(objLocator).clear();
		Reports.CurrentTest.AddStep(new StepReport("Clear Element" + objLocator,true));
		driver.findElement(objLocator);
		Reports.CurrentTest.AddStep(new StepReport("Found Element" + objLocator,true,null));
		return true;
		}
		return false;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
		Reports.CurrentTest.AddStep(new StepReport("Could not Find Element: " + objLocator + " " + sErrMsg, false));
		return false;
	}
}

/******************************************
* FunctionName  : DropDown
* * Purpose       :Selecting 
 * @return 
*
* *****************************************/
public static  boolean  DropDown(By objLocator,String sval) {
	try{
		if(verifyVisibilityOFElement(objLocator)){
			Select a=new Select( driver.findElement(objLocator));
			a.selectByValue(sval);
			Reports.CurrentTest.AddStep(new StepReport("Selected " + sval,true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
			}
		return true;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
		Reports.CurrentTest.AddStep(new StepReport("Failed to Locate Dropdown by: "  + objLocator + " " + sErrMsg,false,null));
		return false;
	}
}

/******************************************
 * FunctionName  :getTitle
 * Purpose       : Capture the title
 * @return 
 *
 * *****************************************/
public static String getTitle(By objLocator)
{
	String text= driver.getTitle();
	Reports.CurrentTest.AddStep(new StepReport("Page Title is:" + text,true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	return text;
	}

/******************************************
 * FunctionName  :switchToFrame
 * Purpose       :Moving to particular frame
 *
 * *****************************************/
public void switchToFrame(int frame) {
	try {
		driver.switchTo().frame(frame);
		System.out.println("Navigated to frame with id " + frame);
		Reports.CurrentTest.AddStep(new StepReport("Navigated to frame with id " + frame,true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	} catch (NoSuchFrameException e) {
		System.out.println("Unable to locate frame with id " + frame
				+ e.getStackTrace());
		Reports.CurrentTest.AddStep(new StepReport("Unable to locate frame with id" + frame + e.getStackTrace(),false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	} catch (Exception e) {
		System.out.println("Unable to navigate to frame with id " + frame
				+ e.getStackTrace());
		Reports.CurrentTest.AddStep(new StepReport("Unable to navigate to frame with id " + frame+ e.getStackTrace(), false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	}
}



/*close the main*/
	}






