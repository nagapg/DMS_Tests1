package com.alticor.magic;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralFunctions {
	
	private static final String Select = null;
	public static WebDriver driver;
	public static String sErrMsg="";
	static WebElement ele;
	
/******************************************
	 * FunctionName  :clickElementByJavascriptExecutor
	 * Purpose       : Click by JavaScript Executor
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
		}
		catch(Exception e)
		{
			sErrMsg=e.getMessage();
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
	       return false;
		}
	}
	
	/******************************************
	 * FunctionName  :openapp
	 * Purpose       : Opens Application
	 *
	 * *****************************************/
	public static boolean openapp(String appURL )
	{
		try{
		driver.get(appURL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return true;
	}
		catch(Exception e)
	{
		sErrMsg=e.getMessage();
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
	
			System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			cap.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR, true);
            cap.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
            cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            cap.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING,false);
            cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,true);
            
			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
			        
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
	 * FunctionName  :openChormeBrowser
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
	 * FunctionName  :openhubBrowser
	 * Purpose       : opens browser in Hub
	 * @return 
	 *
	 * *****************************************/
	public static  boolean openhubBrowser(String nodeurl,String browser) throws MalformedURLException{
		try{
			DesiredCapabilities brow=new DesiredCapabilities();
	
			//Browsers//
		 if(browser.equalsIgnoreCase("chrome"))
		 brow = DesiredCapabilities.chrome();
	//brow.setPlatform(Platform.VISTA);	//
	 brow.setPlatform(Platform.LINUX);
		 
		if(browser.equalsIgnoreCase("firefox"))
			  brow = DesiredCapabilities.firefox();
		brow.setCapability("marionette",true);
		brow.setCapability("acceptInsecureCerts",true);
		brow.setCapability("AcceptUntrustedCertificates",true);	
      //  brow.setPlatform(Platform.VISTA);	//
	 brow.setPlatform(Platform.LINUX);
		 
	 if(browser.equalsIgnoreCase("internet explorer"))
			 brow = DesiredCapabilities.internetExplorer();
	//brow.setPlatform(Platform.VISTA);	//
	 brow.setPlatform(Platform.LINUX);
	 
		driver = new RemoteWebDriver(new URL(nodeurl), brow);
			
			return true;
	}
		catch(Exception e)
	{
		sErrMsg=e.getMessage();
		return false;
	}

}
/******************************************
	 * FunctionName  :openFFBrowser
	 * Purpose       : opens Firefox browser
	 *
	 * *****************************************/
	public static boolean openFFBrowser(String sURL)
	{
		try{
			System.setProperty("webdriver.firefox.marionette","geckodriver.exe");
			driver.get(sURL);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return true;
		}catch(Exception e)
		{
			sErrMsg=e.getMessage();
			System.out.println(sErrMsg);
			e.printStackTrace();
			return false;
		}
}
	
/******************************************
	 * FunctionName  :close
	 * Purpose       :closes the browser
	 *
	 * *****************************************/
public static boolean close() {
	try{
driver.quit();
return true;
		}
	catch(Exception e)
	{
		sErrMsg=e.getMessage();
		System.out.println(sErrMsg);
		e.printStackTrace();
		return false;
	}
	
}

/******************************************
 * FunctionName  :activeElement
 * Purpose       : element active 
 *
 * *****************************************/
public static boolean activeElement(By objLocator)
{
	try{
return true;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
	return false;
	}
}

/******************************************
 * FunctionName  :display
 * Purpose       : display element
 *
 * *****************************************/
public static boolean display(By objLocator)
{
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
	try{
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
return;
}catch(Exception e)
	{
		return;
	}
}

/******************************************
 * FunctionName  :ExplicitWait
 * Purpose       :Waits
 * @return 
 *
 * *****************************************/
public static boolean ExplicitWait(By string) {
	WebDriverWait expwait=new WebDriverWait(driver,10);
			
	try{
 expwait.until(ExpectedConditions.elementToBeClickable(string));
 return true;
}catch(Exception e)
	{
		return false;
	}
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
		
		driver.findElement(objLocator);
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
* FunctionName  : DropDown
* * Purpose       :Selecting 
 * @return 
*
* *****************************************/
public static  boolean  DropDown(By objLocator,String sval) {
	try{
		if(verifyVisibilityOFElement(objLocator)){
			Select a=new Select( driver.findElement(objLocator));
	       a.selectByVisibleText(sval);
	}
		return true;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
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
	return text;
	}

/******************************************
 * FunctionName  :switchToFrame
 * Purpose       :Moving to particular frame
 *
 * *****************************************/
public static void switchToFrame(String name) {
	try {
		driver.switchTo().frame(name);
		System.out.println("Navigated to frame with id " + name);
		} 
	catch (NoSuchFrameException e) {
		System.out.println("Unable to locate frame with id " + name
				+ e.getStackTrace());
		} 
	catch (Exception e) {
		System.out.println("Unable to navigate to frame with id " + name
				+ e.getStackTrace());
	}
}

/*****************************************
 * FunctionName  :getTagName
 * Purpose       : get tagname
 *
 * *****************************************/
public static String getTagName(By objLocator)
{
	try{
if(verifyVisibilityOFElement(objLocator) )
	{		

	String sText=driver.findElement(objLocator).getTagName();
	
		return sText;
	}
	return null;
	}
	catch(Exception e)
	{
		sErrMsg=e.getMessage();
	return null;
	}
}

/******************************************
 * FunctionName  :Navigate
 * Purpose       : Navigate Commands
 * @return 
 *
 * *****************************************/
public static String Navigate()
{
	driver.navigate().back();
	//driver.navigate().forward();//
	//driver.navigate().refresh();//
	return sErrMsg;
	}

/******************************************
 * FunctionName  :AlertActiveElement
 * Purpose       : Alert Web element

 * *****************************************/
public static boolean AlertActiveElement() {
    try {
    driver.switchTo().activeElement().sendKeys(Keys.ENTER);
return true;
    } 
    catch (Exception e) {
        return false;
    } 
}

/******************************************
 * FunctionName  :AlertPopUp
 * Purpose       : Alert 

 * *****************************************/
public static boolean AlertPopUp() {
    try {
        driver.switchTo().alert();
       driver.switchTo().alert().accept();
       driver.switchTo().defaultContent();
 return true;
    } 
    catch (Exception e) {
        return false;
    } 
}

/******************************************
* FunctionName  :screenShot
* Purpose       : takes screenShot 

* *****************************************/

//public static void screenShot(String filename,By objLocator) throws IOException, InterruptedException {//
public static void screenShot(String filename) throws IOException, InterruptedException {
	 //   ele = driver.findElement(objLocator);//

	File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//	BufferedImage  fullImg = ImageIO.read(scr);//

	//Get the location of element on the page//
	/*org.openqa.selenium.Point point = ele.getLocation();

	// Get width and height of the element
	int eleWidth = ele.getSize().getWidth();
	int eleHeight = ele.getSize().getHeight();

	// Crop the entire page screenshot to get only element screenshot
	BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),
	eleWidth, eleHeight);
	ImageIO.write(eleScreenshot, "png",  scr );*/

	String currentDir = System.getProperty("user.dir");
	//File dest = new File(currentDir + "\\Screenshots\\" + System.currentTimeMillis() + filename);//
	File dest = new File(currentDir + "\\Screenshots\\" +  filename);
	FileUtils.copyFile(scr, dest);
	}


/******************************************
 * FunctionName  :ClearField
 * Purpose       : clears
 *
 * *****************************************/
public static boolean ClearField(By objLocator)
{
	try{
		if(verifyVisibilityOFElement(objLocator)){
		driver.findElement(objLocator).clear();
        return true;
		}
		return false;
	}catch(Exception e)
	{
		sErrMsg=e.getMessage();
return false;
	}
}

	 //Close the main//
	}






