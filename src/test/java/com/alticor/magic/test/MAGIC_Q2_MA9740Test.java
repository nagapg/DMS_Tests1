/*Step 1>Navigate to LTS
 * Step 2>Validate Trip Number/Target Number
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9740Test{
	
/** Declare variables */
boolean bStatus;
String trip;
String target;

@Given("^user navigates to LTS$")
public void user_navigates_to_LTS() throws Throwable {
	
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
			    
     //Enter Aff//
    bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
	  if (bStatus) {
	System.out.println("AFF-Pass");
	} else {
	System.out.println("AFF-Fail");
	}

	  //Enter Abo//
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	   
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
	  if (bStatus) {
	System.out.println("ABO-Pass");
	} else {
	System.out.println("ABO-Fail");
	}
	
	   //Enter Period//
	 bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072017");
	               if(bStatus){
	System.out.println("Period-Pass");
	}         
	else{
	System.out.println("Period-Fail");
	}
	 
	   	  //Click on submit//
	               try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	   
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
	     GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
     			if(bStatus){
     	        	System.out.println("Inqiry-Pass");
     	        }	
     	        else{
     	        	System.out.println("Inquiry-Fail");
     	        }
     			
     		//Inquiry-->GIP//
     			 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	   
     			GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[6]/span[1]"));
     			if(bStatus){
     	        	System.out.println("GIP-Pass");
     	        }	
     	        else{
     	        	System.out.println("GIP-Fail");
     	        }
     		
     		//Inquiry-->GIP-->LTS//
     			 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	   
     			bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
     	        if(bStatus){
     			System.out.println("LTS-Pass");
     	        }	
     	        else{
     	        	System.out.println("LTS-Fail");
     	        }
     	        }
	
@ When("^Capture Trip Number and Target Number$")
	public void Capture_Trip_Number_and_Target_Number() throws Throwable {
	
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
trip=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[1]/td[6]"));

//Capture the Expected//
 GeneralFunctions.screenShot("Trip_Screenshot.png");
 
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	 target=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[2]/td[6]"));

	   //Capture the Expected//
	  GeneralFunctions.screenShot("Target_Screenshot.png");
}

@Then("^Compare Values$")
public void compare_Values() throws Throwable {
	
	if (trip==target){
System.out.println("Trip and Target are equal");
 }
	else{
		System.out.println("Trip is less than Target");
	 }
	}

@Then("^Display values$")
		 public void Display_values() throws Throwable {
	System.out.println("##########Expected-Result###");
			 System.out.println(trip);
			 System.out.println( target);
			 System.out.println("####################");
}


@Then("^Close LTS$")
public void  Close_LTS () throws Throwable {
  
  	bStatus = GeneralFunctions.close();
      if (bStatus) {
           System.out.println("MAGIC Closed-Pass");
       } else {
           System.out.println("Close MAGIC-Fail");
       }
}
}
