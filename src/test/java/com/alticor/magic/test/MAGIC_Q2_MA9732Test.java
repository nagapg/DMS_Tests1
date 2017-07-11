/*Step 1>Navigate to Baseline Rerun
 * Step 2>Capture the success message
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9732Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^navigated to Baseline Rerun$")
	public void  navigated_to_Baseline_Rerun() throws Throwable{

//Maintenance//
		 GeneralFunctions.waittime();
		       bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			  if(bStatus){
        	System.out.println("Maintanence-Pass");
        }	
        else{
        	System.out.println("Maintanence-Fail");
        }
		
		//Maintenance-->GIP//
			  GeneralFunctions.waittime();
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

@When("^Enter eff PY and Click Rerun$")
	public void  Enter_eff_PY_and_Click_Rerun() throws Throwable{

	 bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='effPerfYear']"),"2016");
		if(bStatus){
        	System.out.println("Eff PY-Pass");
        }	
        else{
        	System.out.println("Eff PY-Fail");
        	  }
		 
		GeneralFunctions.waittime();	
	bStatus=GeneralFunctions.clickElement(By.id("rerunBaselineButton"));
		if(bStatus){
        	System.out.println("Submit Rerun-Pass");
        }	
        else{
        System.out.println("Submit Rerun-Fail");
        }
		}
	
	@Then("^Capture success message$")
	public void Capture_success_message() throws Throwable{
	
		//Validating Expected//
		 GeneralFunctions.waittime();
		 String Sucess=GeneralFunctions.getText(By.xpath(".//*[@id='successMsgDiv']"));
		 System.out.println("##########Expected-Result########################");
		   System.out.println("The Message is " + Sucess);
		   System.out.println("###############################################");
	}
}