/*Step 1>Navigate to Volumes
 * Step 2>Capture Volumes
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_VolumesTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to Volumes$")
	public void user_navigates_to_Volumes() throws Throwable {
		
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
				            
          //Click on Volumes link//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
			  if (bStatus) {
		          System.out.println("Volumes-Pass");
		      } 
			  else {
		          System.out.println("Volumes-Fail");
		      }
		  }

@Then("^Capture Volumes$")
public void Capture_Volumes() throws Throwable{ 
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='IboBonusDtlBar']"));
	 
	  //Capture the Expected//
	  GeneralFunctions.screenShot("Volumes.png");
	  

	    System.out.println("##########Expected-Result###");
		   System.out.println(ExpVal);
		   System.out.println("########################");
		}

@Then("^Close Volumes$")
public void  Close_Volumes() throws Throwable {
  
  	bStatus = GeneralFunctions.close();
      if (bStatus) {
           System.out.println("MAGIC Closed-Pass");
       } else {
           System.out.println("Close MAGIC-Fail");
       }
}
}
