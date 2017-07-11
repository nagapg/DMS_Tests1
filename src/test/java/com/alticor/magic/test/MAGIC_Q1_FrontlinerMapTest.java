/*Step 1>Navigate to Front liner Map
 * Step 2>Capture Front liner Map
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_FrontlinerMapTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^navigated to Frontliner Map$")
	public void navigated_to_Frontliner_Map() throws Throwable {
	
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
			 
	   		  //Inquiry-->Map//
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        bStatus=GeneralFunctions.clickElement(By.linkText("Map"));
   	        if(bStatus){
   			System.out.println("Map-Pass");
   	        }	
   	        else{
   	        	System.out.println("Map-Fail");
   	        }
   	   }

@Then("^Capture Frontliner Map$")
public void Capture_Frontliner_Map() throws Throwable{
	
	//Validating the Expected//
	String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='LosMapExpand']/div/span[1]"));
	    System.out.println("##########Expected-Result########################");
		   System.out.println("The Output is:"  +ExpVal);
		   System.out.println("##############################################");
}
}