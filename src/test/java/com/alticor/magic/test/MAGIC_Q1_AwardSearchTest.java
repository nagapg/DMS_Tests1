/*Step 1>Navigate to Award Search
 * Step 2>Capture Award Search
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_AwardSearchTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^navigated to AwardSearch$")
	public void navigated_to_AwardSearch() throws Throwable {
		
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
		   	        
		   				//Inquiry-->Awards-->Award Search//
		   	     try {
		 			Thread.sleep(3000);
		 		} catch (InterruptedException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		   	        bStatus=GeneralFunctions.clickElement(By.linkText("Award Search"));   
		   	       if(bStatus){
		   			System.out.println("Award Search-Pass");
		   	       }	
		   	       else{
		   	       	System.out.println("Award Search-Fail");
		   	       }
		   	   }
	
	@Then("^Capture Award Search$")
	public void Capture_Award_Search() throws Throwable{
		
		//Validating the Expected//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDivHeader']"));
	       System.out.println("##########Expected-Result########################");
		   System.out.println("The Output is:"  +ExpVal);
		   System.out.println("###############################################");
	}
}