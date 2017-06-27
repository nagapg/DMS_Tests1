/*Step 1>Navigate to LTS
 * Step 2>Validate Trip Number/Target Number
 */
package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9740Test{
	
/** Declare variables */
boolean bStatus;
String trip;
String target;

@When("^LTS is selected$")
	public void LTS_is_selected() throws Throwable {
		
	  	//Inquiry//
	     GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
     			if(bStatus){
     	        	System.out.println("Inqiry-Pass");
     	        }	
     	        else{
     	        	System.out.println("Inquiry-Fail");
     	        }
     			
     			GeneralFunctions.waittime();
     			
     			//Inquiry-->GIP//
     			GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[6]/span[1]"));
     			if(bStatus){
     	        	System.out.println("GIP-Pass");
     	        }	
     	        else{
     	        	System.out.println("GIP-Fail");
     	        }
     		
     		//Inquiry-->GIP-->LTS//
     			bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
     	        if(bStatus){
     			System.out.println("LTS-Pass");
     	        }	
     	        else{
     	        	System.out.println("LTS-Fail");
     	        }
     	        }
	
@ When("^Capture Trip Number and Target Number$")
	public void Capture_Trip_Number_and_Target_Number() throws Throwable {
	GeneralFunctions.waittime();
	
	trip=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[1]/td[6]"));
	GeneralFunctions.waittime();
	
	 target=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[2]/td[6]"));
		}

@When("^Compare Values$")
public void compare_Values() throws Throwable {
	if (trip==target){
System.out.println("Trip and Target are equal");
 }
	else{
		System.out.println("Trip is less than Target");
	 }
	}

@Then("^Display the values$")
		 public void Display_the_values() throws Throwable {
	System.out.println("##########Expected-Result########################");
			 System.out.println("The  Trip value is  : "  +  trip);
			 System.out.println("The Target Value  is  :  "  +  target);
			 System.out.println("###########################################");
}
}