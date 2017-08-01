/*Step 1>Navigate to FTAQ Rpts
 * Step 2>Capture FTAQ Rpts
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_FTAQRptsTest {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to FTAQRpts$")
	public void user_navigates_to_FTAQRpts() throws Throwable {
		
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
			    
		   		 //Reports-->Qualification Reports//
			    try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[7]/span[1]"));
   	        if(bStatus){
   			System.out.println("Qualification Rpts-Pass");
   	        }	
   	        else{
   	        	System.out.println("Qualification Rpts-Fail");
   	        }
   	        
   			//Reports-->Qualification Reports-->Award Qualification Reports //
   	     try {
 			Thread.sleep(3000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
   	        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4_8']/a[1]/span[1]"));   
   	       if(bStatus){
   			System.out.println("Award Qualification Reports-Pass");
   	       }	
   	       else{
   	       	System.out.println("Award Qualification Reports-Fail");
   	       }
   	       
	  //Reports-->Qualification Reports-->Award Qualification Reports-->First Time Award Qual Rpts //
   	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	       bStatus=GeneralFunctions.clickElement(By.linkText("First Time Award Qualifier Reports"));   
   	       if(bStatus){
   			System.out.println("First Time Award Qual Rpts-Pass");
   	       }	
   	       else{
   	       	System.out.println("First Time Award Qual Rpts-Fail");
   	       }
   	 }

@Then("^Capture FTAQRpts$")
public void Capture_FTAQRpts() throws Throwable{
	
	//Validating the Expected//
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
    
    //Capture the Expected//
	  GeneralFunctions.screenShot("FTAQRpts.png");
	  
 System.out.println("##########Expected-Result###");
	   System.out.println(ExpVal);
	   System.out.println("#########################");
}

@Then("^Close FTAQRpts$")
public void  Close_FTAQRpts() throws Throwable {
  
  	bStatus = GeneralFunctions.close();
      if (bStatus) {
           System.out.println("MAGIC Closed-Pass");
       } else {
           System.out.println("Close MAGIC-Fail");
       }
}
}
