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
	
@When("^Frontliner Map is selected$")
	public void Frontliner_Map_is_selected() throws Throwable{
	
//Inquiry//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			 if(bStatus){
		        	System.out.println("Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Inquiry-Fail");
		        }
			 
	   		  //Inquiry-->Map//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Map"));
   	        if(bStatus){
   			System.out.println("Map-Pass");
   	        }	
   	        else{
   	        	System.out.println("Map-Fail");
   	        }
   	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}

@Then("^Capture Frontliner Map$")
public void Capture_Frontliner_Map() throws Throwable{
	
	//Validating the Expected//
	String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='LosMapExpand']/div"));
    System.out.println("##########Expected-Result########################");
	   System.out.println("The Output is:"  +ExpVal);
	   System.out.println("##############################################");
}
}