/* step 1>Navigate to Award Details
 * Step 2>Capture Award Details
*/
 
package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_AwardDetailsTest {

	/** Declare variables */
	boolean bStatus;
	
	@When("^AwardDetails is selected$")
	public void AwardDetails_is_selected() throws Throwable {
		
        //Inquiry//
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
		    if(bStatus){
	        	System.out.println("Inquiry-Pass");
	        }	
	        else{
	        	System.out.println("Inquiry-Fail");
	        }
		    
	   		 //Inquiry-->Awards//
	      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[3]/span[1]"));
	   	if(bStatus){
	   	System.out.println("Awards-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Awards-Fail");
	   	        }
	   	
	   			//Click on Award Details//
		      bStatus=GeneralFunctions.clickElement(By.linkText("Award Details"));
	   	        if(bStatus){
	   			System.out.println("Award Details-Pass");
	   	        }	
	   	        else{
	   	        	System.out.println("Award Details-Fail");
	   	        }
	   	     try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
}
	   	     
@Then("^Capture Award Details$")
	   	    public void Capture_Award_Details() throws Throwable{
	
	//Validating the Expected//
      String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='AwardInfoExpand']/div/span[1]"));
    System.out.println("##########Expected-Result########################");
     System.out.println("The Award Details Screen is "+ ExpVal);
   System.out.println("###############################################");
}
}


