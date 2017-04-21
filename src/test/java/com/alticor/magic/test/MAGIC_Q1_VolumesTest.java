package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_VolumesTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^Open browser and Navigate to MAGIC9$")
	public void Open_browser_and_Navigate_to_MAGIC9() throws Throwable{
		GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@When("^navigated to volumes Screen$")
public void navigated_to_volumes_Screen() throws Throwable{
	
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
	  
	  //Enter Period:012017//
	  bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"012017");
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
		    
		//Click on Volumes link//
			 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
			  if (bStatus) {
		          System.out.println("Navigated to Volumes");
		      } 
			  else {
		          System.out.println("Cannot Navigate to Volumes");
		      }
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

@Then("^Capture MAGIC Volumes$")
public void Capture_MAGIC_Volumes() throws Throwable{ 
    String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='IboBonusDtlBar']"));
    System.out.println("##########Expected-Result########################");
	   System.out.println("The Output is:"  +ExpVal);
	   System.out.println("##############################################");
}

@And("^Close MAGIC Gamma9$")
public void Close_MAGIC_Gamma9() throws Throwable{   
com.alticor.magic.GeneralFunctions.close();
}
}