package io.swarmauto.driverextended;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.*;

public class DynamicElement implements WebElement
{
    private WebDriver driver;
    private WebElement rootElement;
	private String displayName = null;
	private Report report;

    private ArrayList<By> searchOptions = new ArrayList<By>();
    

    public DynamicElement() {
        // No setup necessary
    }
 

    public DynamicElement(WebDriver driver, String DisplayName) {
        this(driver, null, DisplayName);
    }
/*
    public DynamicElement(WebDriver driver, Report report) {
        this(driver, report, rootElement.getTagName());
    }
*/
    public DynamicElement(WebDriver driver, Report report, String displayName) {
        this.driver = driver;
        this.report = new SafeReport(report);
        this.displayName = displayName;
        
    }

    private DynamicElement(WebDriver driver, WebElement foundrootElement) {
        this.rootElement = foundrootElement;
        this.driver = driver;
        displayName = foundrootElement.getTagName();
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
    	this.displayName = rootElement.getTagName();
        return rootElement;
    }

  
    public void clear() {
        this.find();
        this.rootElement.clear();
        report.writeStep("Clear element " + displayName);
        
    }

    
    public void click() {
        this.find();
        this.rootElement.click();
        this.report.writeStep("Click element " + displayName);
        
    }

   
    public WebElement findElement(By by) {
        rootElement = rootElement.findElement(by);
        return rootElement;
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
        report.writeStep("Send Keys (" + arg0 + ") to  element " + displayName);
        
    }
    
    public void sendKeys(String argument){
    	this.find();
    	this.rootElement.sendKeys(argument);
    	report.writeStep("Send Keys (" + argument + ") to element " + displayName);
    	
    }

   
    public void submit() {
        this.find();
        this.rootElement.submit();
        report.writeStep("Submit element " + displayName);
       
    }

    public DynamicElement findDynamicElement(By by)
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
                    return this;
                }
                catch(Exception e)
                {
                	continue;
                }
            }

            report.validate("Could not find the element " + displayName, false);
 



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
