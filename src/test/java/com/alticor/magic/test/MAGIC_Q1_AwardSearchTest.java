package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_AwardSearchTest {
	
	/** Declare variables */
	boolean bStatus;
	
@Given("^Open browser and Navigate to MAGIC3$")
	public void Open_browser_and_Navigate_to_MAGIC3() throws Throwable{
		GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@When("^navigated to Award Search Screen$")
	public void navigated_to_Award_Search_Screen() throws Throwable{
		
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
			
//Click on Submit//
			  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
			  if (bStatus) {
		        System.out.println("click on Submit");
		    } else {
		        System.out.println("Cannot click on submit");
		    }
			  
		 //Inquiry//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[2]"));
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
		   	        
		   				//Inquiry-->Awards-->Award Search//
		   	        bStatus=GeneralFunctions.clickElement(By.linkText("Award Search"));   
		   	       if(bStatus){
		   			System.out.println("Click on Award Search");
		   	       }	
		   	       else{
		   	       	System.out.println("Cannot Click on Award Search");
		   	       }
}
	
	@Then("^Capture MAGIC Award Search$")
	public void Capture_MAGIC_Award_Search() throws Throwable{
		
		   //Validating the Expected//
	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
		   System.out.println("The Output is:"  +ExpVal);
	}

	    @And("^Close MAGIC Gamma3$")
	   public void Close_MAGIC_Gamma3() throws Throwable{   
       com.alticor.magic.GeneralFunctions.close();
        }
}