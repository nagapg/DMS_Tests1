/*Step 1>Navigate to Front liner Map
 * Step 2>Capture Front liner Map
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_FrontlinerMapTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to Frontliner Map$")
	public void user_navigates_to_Frontliner_Map() throws Throwable {
		
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
				                
	//Inquiry//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			 if(bStatus){
		        	System.out.println("Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Inquiry-Fail");
		        }
			 
	   		  //Inquiry-->Map//
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        bStatus=GeneralFunctions.clickElement(By.linkText("Map"));
   	        if(bStatus){
   			System.out.println("Map-Pass");
   	        }	
   	        else{
   	        	System.out.println("Map-Fail");
   	        }
   	   }

@Then("^Capture Frontliner Map$")
public void Capture_Frontliner_Map() throws Throwable{
	
	//Validating the Expected//
	String ExpVal=GeneralFunctions.getText(By.xpath(".//*[@id='LosMapExpand']/div/span[1]"));
	
	  //Capture the Expected//
	  GeneralFunctions.screenShot("FrontlinerMap.png");
	  

	    System.out.println("##########Expected-Result####");
		   System.out.println(ExpVal);
		   System.out.println("##########################");
}

@Then("^Close Frontliner Map$")
public void  Close_Frontliner_Map() throws Throwable {
  
  	bStatus = GeneralFunctions.close();
      if (bStatus) {
           System.out.println("MAGIC Closed-Pass");
       } else {
           System.out.println("Close MAGIC-Fail");
       }
}
}
