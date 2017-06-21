//Validate  Baseline Rerun Screen//

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9732Test {
	
	/** Declare variables */
	boolean bStatus;
	
@Given("^User is in Baseline Rerun Screen$")
public void  User_is_in_Baseline_Rerun_Screen() throws Throwable{
	
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

	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  //Enter Abo//
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"46");
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
	     		
	//Maintenance//
			  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			  if(bStatus){
        	System.out.println("Maintanence-Pass");
        }	
        else{
        	System.out.println("Maintanence-Fail");
        }
		
		//Maintenance-->GIP//
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
		if(bStatus){
        	System.out.println("GIP-Pass");
        }	
        else{
        	System.out.println("GIP-Fail");
        }
		
      //Maintenance-->GIP-->Baseline Rerun//
        bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
       if(bStatus){
		System.out.println("Baseline Rerun-Pass");
       }	
       else{
       	System.out.println("Baseline Rerun-Fail");
       }
       }

	@When("^Enter eff PY$")
	public void  Enter_eff_PY() throws Throwable{
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
	}
	
	@When("^Click on Rerun button$")
		public void  Click_on_Rerun_button() throws Throwable{
		bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
		if(bStatus){
        	System.out.println("Submit Rerun-Pass");
        }	
        else{
        System.out.println("Submit Rerun-Fail");
        }
		}
	
	@Then("^Capture the success message$")
	public void Capture_the_success_message() throws Throwable{
	
		//Validating Expected//
		 String Sucess=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
		 System.out.println("##########Expected-Result########################");
		   System.out.println(Sucess);
		   System.out.println("###############################################");
	}
	
		   @And("^Close MAGICGamma$")
		   public void Close_MAGICGamma() throws Throwable{   
			   bStatus = GeneralFunctions.close();
		        if (bStatus) {
		             System.out.println("MAGIC Closed-Pass");
		         } else {
		             System.out.println("Close MAGIC-Fail");
		         }
		}
		}