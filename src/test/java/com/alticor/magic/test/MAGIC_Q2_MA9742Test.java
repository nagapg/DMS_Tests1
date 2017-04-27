package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9742Test {

	/** Declare variables */
	boolean bStatus;
	 String plat,sponsor;
	 
	
	@Given("^user goes to Gamma$")
	public void user_goes_to_Gamma () throws Throwable{
		
		bStatus =GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
		if (bStatus) {
		    System.out.println("Navigated to MAGIC QA");
		} else {
		    System.out.println("Cannot Navigated to MAGIC QA");
		}
		
	//Okta Login//
	GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
	GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
	GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
	}
	
	@When("^aff abo entered and click on submit$")
	public void aff_abo_entered_and_click_on_submit() throws Throwable{
		
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"170");
		  if (bStatus) {
	    System.out.println("AFF entered");
	} else {
	    System.out.println("Cannot enter AFF");
	}
		  
	
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"3101003819");
		  if (bStatus) {
	      System.out.println("ABO entered");
	  } else {
	      System.out.println("Cannot enter ABO");
	  }
		 
		  
		  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		  if (bStatus) {
	        System.out.println("Click on Submit");
	    } else {
	        System.out.println("Cannot click on submit");
	    }
		  
	}
	
		  @Then("^Capture Platinum value and sponsor value$")
			public void Capture_Platinum_value_and_sponsor_value() throws Throwable{
		
			  //Capture Platinum Value from Dashboard//
			    plat=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[3]/td[5]/a"));
				System.out.println("The Platinum value is    "  +  plat);
				
				//Capturing Sponsor value from Dashboard//
				sponsor=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[4]/td[2]/a"));
				System.out.println("The Sponsor value is      "  +  sponsor);
				
				    if(plat!=null&&!plat.equals("sponsor")){
		    	 System.out.println("###########Result#######################");
					System.out.println("Platinum and Sponsor are equal");
					 System.out.println("#####################################");		
		     }
				else
				{
					 System.out.println("###########Expected-Result#######################");
					System.out.println("Platinum and Sponsor are not equal");
					 System.out.println("################################################");
				}
				GeneralFunctions.close();
}		 			
} 
		 	      	
		 	      

