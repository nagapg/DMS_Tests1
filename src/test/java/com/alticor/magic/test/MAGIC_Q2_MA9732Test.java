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
	    System.out.println("Navigated to Server");
	     } else {
	     System.out.println("Cannot Navigate to Server");
	     }
		
		//Navigate to MAGIC-QA//
	 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
	    if (bStatus) {
	    System.out.println("Navigated to MAGIC");
	    } else {
	    System.out.println("Cannot Navigate to MAGIC");
	    }
	    
	    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	  com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();
	   
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    //Okta Login//
	  GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
	  GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
	  GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
		
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Enter Aff//
	  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"430");
	  if (bStatus) {
	System.out.println("AFF entered");
	} else {
	System.out.println("Cannot enter AFF");
	}

	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  //Enter Abo:9995//
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"46");
	  if (bStatus) {
	System.out.println("ABO entered");
	} else {
	System.out.println("Cannot enter ABO");
	}
	  
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   //Enter Period:052017//
	bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"052017");
	               if(bStatus){
	System.out.println("Entered Period");
	}         
	else{
	System.out.println("Cannot Enter Period");
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
	        System.out.println("Click on Submit");
	    } else {
	        System.out.println("Cannot click on submit");
	    }

	                 try {
	     				Thread.sleep(3000);
	     			} catch (InterruptedException e) {
	     				// TODO Auto-generated catch block
	     				e.printStackTrace();
	     			}
	     		
	//Maintenance//
	//	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));//
			  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			  if(bStatus){
        	System.out.println("Click on Maintanence");
        }	
        else{
        	System.out.println("Cannot Click on Maintanence");
        }
		
		//Maintenance-->GIP//
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2']/a[14]/span[1]"));
		if(bStatus){
        	System.out.println("Click on GIP");
        }	
        else{
        	System.out.println("Cannot Click on GIP");
        }
		
      //Maintenance-->GIP-->Baseline Rerun//
        bStatus=GeneralFunctions.clickElement(By.linkText("Baseline Rerun"));   
       if(bStatus){
		System.out.println("Click on Baseline Rerun");
       }	
       else{
       	System.out.println("Cannot Click on Baseline Rerun");
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
        	System.out.println("Enter Eff PY");
        }	
        else{
        	System.out.println("Cannot Enter Eff PY");
        }
	}
	
	@When("^Click on Rerun button$")
		public void  Click_on_Rerun_button() throws Throwable{
		bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
		if(bStatus){
        	System.out.println("Click on Submit Rerun");
        }	
        else{
        System.out.println("Cannot Click on Submit Rerun");
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
	       com.alticor.magic.GeneralFunctions.close();
	     
	     
	      	}
	      }

