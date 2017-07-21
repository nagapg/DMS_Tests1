/*Step 1>Navigate to Baseline Rerun
 * Step 2>Capture the success message
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9732Test {
	
	/** Declare variables */
	boolean bStatus;
	
@Given("^user navigates to Baseline Rerun$")
	public void user_navigates_to_Baseline_Rerun() throws Throwable {
		
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
			    try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	   
    bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"430");
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
			bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"46");
			  if (bStatus) {
			System.out.println("ABO-Pass");
			} else {
			System.out.println("ABO-Fail");
			}
			  
			   //Enter Period//
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072017");
			               if(bStatus){
			System.out.println("Period-Pass");
			}         
			else{
			System.out.println("Period-Fail");
			}
			 
			   		//Click on submit//
			         bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
			                 if (bStatus) {
			        System.out.println("Submit-Pass");
			    } else {
			        System.out.println("Submit-Fail");
			    }
			              
	              //Maintenance//
		                 try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			  if(bStatus){
        	System.out.println("Maintanence-Pass");
        }	
        else{
        	System.out.println("Maintanence-Fail");
        }
		
		//Maintenance-->GIP//
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
		if(bStatus){
        	System.out.println("GIP-Pass");
        }	
        else{
        	System.out.println("GIP-Fail");
        }
		
      //Maintenance-->GIP-->Baseline Rerun//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
       if(bStatus){
		System.out.println("Baseline Rerun-Pass");
       }	
       else{
       	System.out.println("Baseline Rerun-Fail");
       }  
      }

@When("^Enter eff PY and Click Rerun$")
	public void  Enter_eff_PY_and_Click_Rerun() throws Throwable{

	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='effPerfYear']"),"2016");
		if(bStatus){
        	System.out.println("Eff PY-Pass");
        }	
        else{
        	System.out.println("Eff PY-Fail");
        	  }
		 
		bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
		if(bStatus){
        	System.out.println("Submit Rerun-Pass");
        }	
        else{
        System.out.println("Submit Rerun-Fail");
        }
		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	@Then("^Capture success message$")
	public void Capture_success_message() throws Throwable{
	
		//Validating Expected//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	   
		 String Sucess=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
		 
		   
		   //Capture the Expected//
		 	  GeneralFunctions.screenShot("MA9732_Screenshot.png");
		 	  
		   System.out.println("##########Expected-Result##");
		   System.out.println(Sucess);
		   System.out.println("#########################");
	}

	@Then("^Close Baseline Rerun$")
	public void  Close_Baseline_Rerun() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}




