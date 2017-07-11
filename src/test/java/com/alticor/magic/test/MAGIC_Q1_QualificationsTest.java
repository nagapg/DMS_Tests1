/*Step 1>Navigate to Qualifications
 * Step 2>Capture Qualifications
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_QualificationsTest {

	/** Declare variables */
	boolean bStatus;
	
	@When("^navigated to Qualifications$")
	public void navigated_to_Qualifications() throws Throwable {
	
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
		        
		         //Inquiry-->Awards//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[3]/span[1]"));
	   	        if(bStatus){
	   			System.out.println("Awards-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Awards-Fail");
	   	        }
	   	        
	   			//Click on Qualification//
	   	     try {
	 			Thread.sleep(3000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
		     bStatus=GeneralFunctions.clickElement(By.linkText("Qualifications"));
	   	        if(bStatus){
	   			System.out.println("Qualifications-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Qualifications-Fail");
	   	        }
	   	  }

@Then("^Capture Qualifications$")
public void Capture_Qualifications() throws Throwable{
	
	//Validating the Expected//
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id('IboDashboardAwardsExpand')/x:div[1]"));
    System.out.println("##########Expected-Result########################");
    System.out.println("The Output is:"  +ExpVal);
    System.out.println("###############################################");
   }
}