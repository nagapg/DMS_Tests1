/*Step 1>Go to create batch screen
 * Step 2>Enter Batch Description
 * Step 3>Select Transaction Type as Volume
 * Step 4>Click Add Batch
 * Step 5>Click Submit
 * Expected:Capture Error Message for invalid ABO
  */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10845Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^MAGIC user goes to create batch screen$")
	public void magic_user_goes_to_create_batch_screen() throws Throwable {
	 
		//Navigate to Server//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
		if (bStatus) {
				    System.out.println("Server Firefox-Pass");
				     } else {
				     System.out.println("Server Firefox-Fail");
				     }
					
					//Navigate to MAGIC-QA//
				 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
				  if (bStatus) {
				    System.out.println("MAGIC_QA-Pass");
				    } else {
				    System.out.println("MAGIC_QA-Fail");
				    }
				GeneralFunctions.waittime(); 
				//Okta Login//
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-username']"),"cmns559");
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-password']"),"our49pot");
				    GeneralFunctions.clickElement(By.xpath(".//*[@id='okta-signin-submit']"));
					GeneralFunctions.waittime(); 
					
					//Enter Aff//
				   bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		           if (bStatus) {
		           System.out.println("AFF-Pass");
	             	} else {
		           System.out.println("AFF-Fail");
		          }
		  
		  //Click on submit//
		       	GeneralFunctions.waittime(); 
		      bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		                 if (bStatus) {
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }
		                 
		                    //Processing//
		             	GeneralFunctions.waittime(); 
		             	bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
		                 if (bStatus) {
		                System.out.println("Processing-Pass");
		                } else {
		              System.out.println("Processing-Fail");
		             }
		                 
		                  //Processing-->Batch Processing//
		             	GeneralFunctions.waittime(); 
		                 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[2]/span[1]"));
		                 if (bStatus) {
		        System.out.println("Batch Processing-Pass");
		    } else {
		        System.out.println("Batch Processing-Fail");
		    }
		                 
		                 // Processing-->Batch Processing-->Create a batch//
		                bStatus =GeneralFunctions.clickElement(By.linkText("Create A Batch"));
		                  if (bStatus) {
		        System.out.println("Create A Batch-Pass");
		    } else {
		        System.out.println("Create A Batch-Fail");
		    }
		                 }

	@When("^Invalid ABO entered$")
	public void invalid_ABO_entered() throws Throwable {
	  
		//Enter Batch Description//
		GeneralFunctions.waittime(); 
		  bStatus=GeneralFunctions.enterTextToElement(By.id("batchDescription"),"testing");
		  if(bStatus){
		  System.out.println("Batch Decription-Pass");
		  }         
		  else{
		  System.out.println("Batch Decription-Fail");
		  }
		  
		  //Check transaction type volume//
		  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='check1']"));
			if(bStatus){
			System.out.println("Check transaction type-Pass");
		}	
		else{
			System.out.println("Check transaction type-Fail");
		}     
		  
		  //Click Add batch//
			 bStatus =GeneralFunctions.clickElement(By.name("go"));
			  if (bStatus) {
			 System.out.println("Add Batch-Pass");
			 } else {
			 System.out.println("Add Batch-Fail");
			}

			//Enter Period//
			  GeneralFunctions.waittime();
				bStatus=GeneralFunctions.enterTextToElement(By.id("period1"),"082015");
				  if(bStatus){
				  System.out.println("Period-Pass");
				  }         
				  else{
				  System.out.println("Period-Fail");
				  }
				  
				//Enter Reason Code//
				  bStatus=GeneralFunctions.enterTextToElement(By.id("reasonCode1"),"RWK");
				  if(bStatus){
				  System.out.println("Reason Code-Pass");
				  }         
				  else{
				  System.out.println("Reason Code-Fail");
				  }
				
				//Enter Ref//
				  bStatus=GeneralFunctions.enterTextToElement(By.id("invoiceNo1"),"3456");
				  if(bStatus){
				  System.out.println("Ref-Pass");
				  }         
				  else{
				  System.out.println("Ref-Fail");
				  }
				
				//Enter ABO//
				  bStatus=GeneralFunctions.enterTextToElement(By.id("spIboNum1"),"12209552");
				  if(bStatus){
				  System.out.println("ABO-Pass");
				  }         
				  else{
				  System.out.println("ABO-Fail");
				  }
				
				//Click Submit//
				  bStatus =GeneralFunctions.clickElement(By.name("validate"));
				  if (bStatus) {
				 System.out.println("Submit-Pass");
				 } else {
				 System.out.println("Submit-Fail");
				}
			}

	@Then("^error message displayed$")
	public void error_message_displayed() throws Throwable {
	
		//Capture the expected and Print//
		 String Mssg=GeneralFunctions.getText(By.xpath(".//*[@id='messageTable']/tbody/tr/td/div"));
		 GeneralFunctions.screenShot("MA10845.png");
		 
		  System.out.println("*************Result********************");
	     System.out.println(Mssg);
	     System.out.println("********************************************");
}

	@Then("^close MAGIC Batch Screen$")
	public void close_MAGIC_Batch_Screen() throws Throwable {
	   
		bStatus = GeneralFunctions.close();
        if (bStatus) {
             System.out.println("MAGIC Closed-Pass");
         } else {
             System.out.println("Close MAGIC-Fail");
         }
}
}

