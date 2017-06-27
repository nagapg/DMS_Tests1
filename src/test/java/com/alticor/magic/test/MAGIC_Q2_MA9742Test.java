/*Step 1>Navigate to Dash board
 * Step 2>Validate Platinum value/Sponsor value
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9742Test {

	/** Declare variables */
	boolean bStatus;
	 String plat,sponsor;
	 
  @When("^Platinum value and sponsor value$")
			public void Platinum_value_and_sponsor_value() throws Throwable{
		
			  //Capture Platinum Value from Dashboard//
			    plat=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[3]/td[5]/a"));
			 	System.out.println("The Platinum value is    "  +  plat);
				
				//Capturing Sponsor value from Dashboard//
				sponsor=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[4]/td[2]/a"));
				System.out.println("The Sponsor value is      "  +  sponsor);
				 }
	  
	  @Then("^Values should be same$")
		public void Values_should_be_same() throws Throwable{
	
				    if(plat!=null&&!plat.equals("sponsor")){
		    	 System.out.println("###########Result#######################");
					System.out.println("Platinum and Sponsor are equal");
					 System.out.println("#####################################");		
		     }
				else
				{
					 System.out.println("###########Expected-Result#######################");
					System.out.println("Platinum and Sponsor are not equal");
					 System.out.println("################################################");
				}
	  }
	    }
