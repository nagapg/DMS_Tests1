/*Step 1>Navigate to FAA
 * Step 2>Capture FAA
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_FAATest {
	
	/** Declare variables */
	boolean bStatus;
	
@When("^FAA is selcted$")
	public void FAA_is_selcted() throws Throwable{
	
			//Inquiry//
				bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]")); 
					if(bStatus){
				        	System.out.println("Inquiry-Pass");
				        }	
				        else{
				        	System.out.println("Inquiry-Fail");
				        }
				        
				   		 //Inquiry-->Annuals//
				      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[4]/span[1]"));
			   	        if(bStatus){
			   			System.out.println("Annuals-Pass");
			   	        }	
			   	        else{
			   	        	System.out.println("Annuals-Fail");
			   	        }
			   	        try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			   	        
			   			//Inquiry-->Awards-->FAA//
			   	        bStatus=GeneralFunctions.clickElement(By.linkText("FAA"));   
			   	       if(bStatus){
			   			System.out.println("FAA-Pass");
			   	       }	
			   	       else{
			   	       	System.out.println("FAA-Fail");
			   	       }
				  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }

@Then("^Capture FAA$")
public void Capture_FAA() throws Throwable{
	
	//Validating the Expected//
     String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='faaDiv']/div"));
    System.out.println("##########Expected-Result########################");
	System.out.println("The Output is:"  +ExpVal);
	System.out.println("###############################################");
}
}
