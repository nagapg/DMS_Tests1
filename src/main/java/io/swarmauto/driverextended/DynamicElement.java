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
    private WebElement rootElement;
   
	
	

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
    	Reports.CurrentTest.AddStep(new StepReport("Defining DE,  Driver: " + driver.toString() +" DE Name: " + foundrootElement.getText(),Reports.CurrentTest.ID));
        this.rootElement = foundrootElement;
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
    	
        return rootElement;
    }

  
    public void clear() {
    	System.out.println("Clearing a field");
    	Reports.CurrentTest.AddStep(
    			new StepReport("Clearing "+ this +",  Driver: " + driver.toString(),
    					Reports.CurrentTest.ID)
    			);
        this.find();
        this.rootElement.clear();
       
        
    }

    
    public void click() {
    	Reports.CurrentTest.AddStep(new StepReport("Click",Reports.CurrentTest.ID));
        this.find();
        this.rootElement.click();
      
        
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
    		  rootElement = rootElement.findElement(by);
    		  System.out.println("Finding an Element");
    	        return rootElement;
    	}
    	});
       return foo;
    }

    
    public List<WebElement> findElements(By by) {
        return Collections.unmodifiableList(rootElement.findElements(by));

    }

   
    public String getAttribute(String arg0) {
        this.find();
        return this.rootElement.getAttribute(arg0);
    }


    public String getCssValue(String arg0) {
        this.find();
        return this.rootElement.getCssValue(arg0);
    }

    
    public Point getLocation() {
        this.find();
        return this.rootElement.getLocation();
    }


    
    public Dimension getSize() {
        this.find();
        return this.rootElement.getSize();
    }

  
    public String getTagName() {
        this.find();
        return this.rootElement.getTagName();
    }

  
    public String getText() {
        this.find();
        return this.rootElement.getText();
    }


    public boolean isDisplayed() {
    	System.out.println("Checking to see if it is displayed");
        this.find();
        return this.rootElement.isDisplayed();
    }


    public boolean isEnabled() {
		this.find();
		return this.rootElement.isEnabled();
    }

	
    public boolean isSelected() {
		this.find();
		return this.rootElement.isSelected();
    }

 
    public void sendKeys(CharSequence... arg0) {
        this.find();
        this.rootElement.sendKeys(arg0);
        System.out.println("Sending Key " + arg0);
    
        
    }
    
    public void sendKeys(String argument){
    	this.find();
    	this.rootElement.sendKeys(argument);
    	System.out.println("Sending Key " + argument);
    	
    	
    }

   
    public void submit() {
        this.find();
        this.rootElement.submit();
        System.out.println("Submit");
     
       
    }
      

    private DynamicElement findDynamicElement(By by)
    {
        return new DynamicElement(driver, rootElement.findElement(by));
    }

    public List<DynamicElement> findDynamicElements(By by)
    {
        List<WebElement> baseElements = rootElement.findElements(by);
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
            rootElement.getLocation();
            return false;
        }
        catch (StaleElementReferenceException e)
        {
        	return true;
        }
        
    }

    private DynamicElement find()  {
    	
        if(rootElement == null || elementStale())
        {
            for (By currentBy: searchOptions)
            {
                try{
                    rootElement = driver.findElement(currentBy);
                    Reports.CurrentTest.AddStep(new StepReport("Found Element,  Driver: " + driver.toString() +" By " + currentBy,Reports.CurrentTest.ID));
                    return this;
                }
                catch(Exception e)
                {
                	Reports.CurrentTest.AddStep(new StepReport("Didn't Find element,  Driver: " + driver.toString() +" Attempted By: " + currentBy,Reports.CurrentTest.ID,false));
                	continue;
                }
            }

            return null;
            //(throw new Exception("Element Not Found" + displayName));
        }

        return null;
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
