package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_AwardDetailsTest {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^Open browser and Navigate to MAGIC2$")
	public void Open_browser_and_Navigate_to_MAGIC2() throws Throwable{
		
		bStatus =GeneralFunctions.openFFBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		 if (bStatus) {
			  System.out.println("Navigated to MAGIC Gamma");
			  } else {
			  System.out.println("Cannot Navigated to MAGIC Gamma");
			 }
		 
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	   com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();
	      try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		//Okta Login//
			GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
			GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
			GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
@When("^navigated to Award Details Screen$")
public void navigated_to_Award_Details_Screen() throws Throwable{
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	//Enter Aff:010//
	  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
	  if (bStatus) {
  System.out.println("AFF entered");
  } else {
  System.out.println("Cannot enter AFF");
 }
	  
	  //Enter Abo:9995//
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
	  if (bStatus) {
    System.out.println("ABO entered");
    } else {
    System.out.println("Cannot enter ABO");
   }
	  
	  //Enter Period:022017//
bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022017");
		if(bStatus){
    	System.out.println("Entered Period");
    }	
    else{
    	System.out.println("Cannot Enter Period");
    }
		
//Click on submit//
		  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		  if (bStatus) {
	        System.out.println("Click on Submit");
	    } else {
	        System.out.println("Cannot click on submit");
	    }
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		//Inquiry//
		//bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));-When Dashboard is on menu//
		  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
		    if(bStatus){
	        	System.out.println("Click on Inquiry");
	        }	
	        else{
	        	System.out.println("Cannot Click on Inquiry");
	        }
		    
	   		 //Inquiry-->Awards//
	      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[3]/span[1]"));
	   	if(bStatus){
	   	System.out.println("Click on Awards");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Awards");
	   	        }
	   	
	   			//Click on Award Details//
		      bStatus=GeneralFunctions.clickElement(By.linkText("Award Details"));
	   	        if(bStatus){
	   			System.out.println("Click on Award Details");
	   	        }	
	   	        else{
	   	        	System.out.println("Cannot Click on Award Details");
	   	        }
}
	   	     
@Then("^Capture MAGIC Award Details$")
	   	    public void Capture_MAGIC_Award_Details() throws Throwable{
	
	   	    	 //Validating the Expected//
	  	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id('AwdHistExpand')/x:div[1]"));
	  	     System.out.println("##########Expected-Result########################");
	  	      System.out.println("The Award Details Screen is "+ ExpVal);
	  	    System.out.println("###############################################");
}

	  	    @And("^Close MAGIC Gamma2$")
			   public void Close_MAGIC_Gamma2() throws Throwable{   
		       com.alticor.magic.GeneralFunctions.close();
		        }
		}
	   		    




