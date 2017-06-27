/* Step 1>Open Hub
 * Step 2>navigate to FF
 * Step 3>navigate to MAGIC QA
 * Step 4>Enter AFF/ABO/Period
 * Step 5>Click on Submit
 * Step 6>Close MAGIC QA
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_OpenEnvTest {
	
	/** Declare variables */
	boolean bStatus;

	@Given("^User navigates to https://magic-gamma/EBS_UI_Web/Magic$")
	public void User_navigates_to_https_magic_gamma_EBS_UI_Web_Magic() throws Throwable {
		
		//Navigate to Server//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
		//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");//
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
				   // com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
				   
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
	}

	@When("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" submitted$")
	public void submitted(String aff, String abo, String per) throws Throwable {
		
		//Enter Aff//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		  if (bStatus) {
		System.out.println("AFF-Pass");
		} else {
		System.out.println("AFF-Fail");
		}

		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			  //Enter Abo//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
		  if (bStatus) {
		System.out.println("ABO-Pass");
		} else {
		System.out.println("ABO-Fail");
		}
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			   //Enter Period//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062017");
		               if(bStatus){
		System.out.println("Period-Pass");
		}         
		else{
		System.out.println("Period-Fail");
		}
		 
		  try {
		   				Thread.sleep(3000);
		   			} catch (InterruptedException e) {
		   				// TODO Auto-generated catch block
		   				e.printStackTrace();
		   			}
		   		
		       //Click on submit//
		                 bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		                 if (bStatus) {
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }

		                 try {
		     				Thread.sleep(3000);
		     			} catch (InterruptedException e) {
		     				// TODO Auto-generated catch block
		     				e.printStackTrace();
		     			}
		                         }

	@Then("^Close https://magic-gamma/EBS_UI_Web/Magic$")
	public void  Close_https_magic_gamma_EBS_UI_Web_Magic() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
          if (bStatus) {
               System.out.println("MAGIC Closed-Pass");
           } else {
               System.out.println("Close MAGIC-Fail");
           }
  }
}



