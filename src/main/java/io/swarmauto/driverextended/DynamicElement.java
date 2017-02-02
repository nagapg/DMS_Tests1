package io.swarmauto.driverextended;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.alticor.magic.report.Reports;
import com.alticor.magic.report.StepReport;
import com.google.common.base.Function;

public class DynamicElement implements WebElement
{
    private WebDriver driver;
    private WebElement root;
   
   
	
	

    private ArrayList<By> searchOptions = new ArrayList<By>();
    
/*
    public DynamicElement() {
        // No setup necessary
    	System.out.println("Empty Dynamic Element Constructor");
    }
 */

    public DynamicElement(WebDriver driver) {
    	
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Reports.CurrentTest.AddStep(new StepReport(this.driver.toString(),Reports.CurrentTest.ID));
        
    }

    private DynamicElement(WebDriver driver, WebElement foundrootElement) {
    	Reports.CurrentTest.AddStep(new StepReport("Defining element, Name: " + foundrootElement.getText(),Reports.CurrentTest.ID));
        this.root = foundrootElement;
        this.driver = driver;
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }

    public DynamicElement addSearch(By byToAdd) {
        searchOptions.add(byToAdd);
        return this;
    }

    public void clearSearches(){
        searchOptions.clear();
    }

    /**
     *
     * @return current
     */
    public WebElement returnRoot()
    {      	
        return root;
    }

  
    public void clear() {
    	
        
    	try{
        root.clear();
        Reports.CurrentTest.AddStep(new StepReport("Cleared ",true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    	}
    	catch(Exception e){
    		Reports.CurrentTest.AddStep(new StepReport("Clear Failed due to Exception: " + e,false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    		//throw e;
    	}
    	
       
        
    }

    
    public void click() {
    	
      
    	try{
        root.click();
        Reports.CurrentTest.AddStep(new StepReport("Clicked ",true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    	}
    	catch(Exception e){
    		Reports.CurrentTest.AddStep(new StepReport("Click Failed due to Exception: " + e,false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    		//throw e;
    	}
    	
        
    }

   
    public WebElement findElement(By by) {
    	// Waiting 30 seconds for an element to be present on the page, checking
    	// for its presence once every 5 seconds.
    	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    	    .withTimeout(30, TimeUnit.SECONDS)
    	    .pollingEvery(5, TimeUnit.SECONDS)
    	    .ignoring(NoSuchElementException.class);

    	WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
    	{
    	  public WebElement apply(WebDriver driver) {
    		  root = root.findElement(by);
    		  System.out.println("Finding an Element");
    	        return root;
    	}
    	});
       return foo;
    }

    
    public List<WebElement> findElements(By by) {
        return Collections.unmodifiableList(root.findElements(by));

    }

   
    public String getAttribute(String arg0) {
        this.find();
        return this.root.getAttribute(arg0);
    }


    public String getCssValue(String arg0) {
        this.find();
        return root.getCssValue(arg0);
    }

    
    public Point getLocation() {
        this.find();
        return root.getLocation();
    }


    
    public Dimension getSize() {
        this.find();
        return this.root.getSize();
    }

  
    public String getTagName() {
        this.find();
        return this.root.getTagName();
    }

  
    public String getText() {
        this.find();
        return this.root.getText();
    }


    public boolean isDisplayed() {
    	System.out.println("Checking to see if it is displayed");
        this.find();
        return this.root.isDisplayed();
    }


    public boolean isEnabled() {
		this.find();
		return this.root.isEnabled();
    }

	
    public boolean isSelected() {
		this.find();
		return this.root.isSelected();
    }

 
    public void sendKeys(CharSequence... arg0) {
        this.find();
        this.root.sendKeys(arg0);
        System.out.println("Sending Key " + arg0);
    
        
    }
    
    public void sendKeys(String argument){
    	this.find();
    	this.root.sendKeys(argument);
    	System.out.println("Sending Key " + argument);
    	
    	
    }

   
    public void submit() {
        this.find();
        this.root.submit();
        System.out.println("Submit");
     
       
    }
      

    private DynamicElement findDynamicElement(By by)
    {
        return new DynamicElement(driver, root.findElement(by));
    }

    public List<DynamicElement> findDynamicElements(By by)
    {
        List<WebElement> baseElements = root.findElements(by);
        List<DynamicElement> elementsToReturn = new ArrayList<DynamicElement>();

        for(WebElement currentElement : baseElements) {
            elementsToReturn.add(new DynamicElement(driver, currentElement));
        }

        return elementsToReturn;
    }

    public List<DynamicElement> findDynamicElements()
    {
        boolean foundElements = false;
        List<WebElement> elements  = null;
        List<DynamicElement> elementsToReturn = new ArrayList<DynamicElement>();

        for (By currentSearch : searchOptions) {
            if (!foundElements) {
                elements = driver.findElements(currentSearch);
                if (!elements.isEmpty()) {
                    foundElements = true;
                }
            }
        }

        if(foundElements)
        {
            for(WebElement currentElement : elements){
                elementsToReturn.add(new DynamicElement(driver, currentElement));
            }

            Collections.reverse(elementsToReturn); // TODO: Why do we even need a reversal?
        }

        return elementsToReturn;
    }

    private boolean elementStale() {
        try
        {
            root.getLocation();
            return false;
        }
        catch (StaleElementReferenceException e)
        {
        	return true;
        }
        
    }

    private DynamicElement find()  {
    	
       
            for (By currentBy: searchOptions)
            {
                try{
                    root = driver.findElement(currentBy);
                    Reports.CurrentTest.AddStep(new StepReport("Found Element,  Driver: " + driver.toString() +" By " + currentBy,true,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
                    return this;
                }
                catch(Exception e)
                {
                	Reports.CurrentTest.AddStep(new StepReport("Didn't Find element,  Driver: " + driver.toString() +" Attempted By: " + currentBy,false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
                	continue;
                }
            
           
            
            }
        Reports.CurrentTest.AddStep(new StepReport("Element Not Found", false,((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
		throw new ElementNotVisibleException("Not found!");

        
    }

	public <X> X getScreenshotAs(OutputType<X> arg0) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Rectangle getRect() {


		// TODO Auto-generated method stub
		return null;
	}
	



	 

	
}
