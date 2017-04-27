package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_LOSMapTest {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^Open browser and Navigate to MAGIC7$")
	public void Open_browser_and_Navigate_to_MAGIC7() throws Throwable{
		
		bStatus =GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		 if (bStatus) {
			  System.out.println("Navigated to MAGIC Gamma");
			  } else {
			  System.out.println("Cannot Navigated to MAGIC Gamma");
			 }
		//Okta Login//
			GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
			GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
			GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
			
	}
	
@When("^navigated to LOS Map Screen$")
public void navigated_to_LOS_Map_Screen() throws Throwable{
	
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
		  
		//Reports//
		//	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//[@id='topMenu']/div/a[4]")); 
		  if(bStatus){
	        	System.out.println("Click on Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on Reports");
	        }
		    
		 //Reports-->ABO Reports//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[2]/span[1]"));
	        if(bStatus){
			System.out.println("Click on ABO Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on ABO Reports");
	        }
	        
	         //Reports-->ABO Reports-->Line Of Spon Maps Rpts//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Line of Sponsorship Maps"));   
	       if(bStatus){
			System.out.println("Click on Line Of Spon Maps Rpts");
	       }	
	       else{
	       	System.out.println("Cannot Click on Line Of Spon Maps Rpts");
	       }
	       }

@Then("^Capture MAGIC LOS Map$")
public void Capture_MAGIC_LOS_Map() throws Throwable{//Validating the Expected//
    String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
    System.out.println("##########Expected-Result########################");
	   System.out.println("The Output is:"  +ExpVal);
	   System.out.println("##############################################");
}

@And("^Close MAGIC Gamma7$")
public void Close_MAGIC_Gamma7() throws Throwable{   
com.alticor.magic.GeneralFunctions.close();
}
}

