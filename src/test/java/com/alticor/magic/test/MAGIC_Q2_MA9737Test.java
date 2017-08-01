/*Step 1>Navigate to ILB Alt Name
 * Step 2>Validate Business Entity
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9737Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to ILB Alt Name$")
	public void user_navigates_to_ILB_Alt_Name() throws Throwable {
		
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
				  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				    //Okta Login//
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-username']"),"cmns559");
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-password']"),"our49pot");
				    GeneralFunctions.clickElement(By.xpath(".//*[@id='okta-signin-submit']"));
				    try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	 
				    
						  //Enter ABO//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"900003");
		  if (bStatus) {
		System.out.println("ABO-Pass");
		} else {
		System.out.println("ABO-Fail");
		}
		  
		   		//Click on submit//
		               bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		                 if (bStatus) {
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }
		              
	               //Reports//
		                 try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[4]"));
if(bStatus){
	System.out.println("Reports-Pass");
}	
else{
	System.out.println("Reports-Fail");
}

//Reports-->ABO Reports//
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[2]/span[1]"));
if(bStatus){
	System.out.println("ABO Reports-Pass");
}	
else{
	System.out.println("ABO Reports-Fail");
}

//Reports-->ABO Reports-->ILB Alt Name//
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
bStatus=GeneralFunctions.clickElement(By.linkText("ILB Alt Name"));
if(bStatus){
	System.out.println("ILB Alt name-Pass");
}	
else{
	System.out.println("ILB Alt name-Fail");
}
}
	
	@When("^BE should be empty$")
	public void BE_should_be_empty() throws Throwable {
		   
		   //Capture BE Field//
			String ExpVal=GeneralFunctions.getText(By.id(".//*[@id='searchInputCol2']"));
			
		 	   System.out.println("##########Expected-Result##");
			 System.out.println("The BE Field  is empty");
			 System.out.println("####################");
		}

	@Then("^Drop down in BE$")
	public void Drop_down_in_BE() throws Throwable {
		
		bStatus=GeneralFunctions.clickElement(By.name("searchButtonCol2"));
		GeneralFunctions.screenShot("MA9737.png");
		if(bStatus){
			System.out.println("BE Drop Down list Visible-Pass");
		}	
		else{
		System.out.println("BE Drop Down List not Visible-Fail");
		}
	}

	@Then("^Close ILB Alt Name$")
	public void  Close_ILB_Alt_Name() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}



