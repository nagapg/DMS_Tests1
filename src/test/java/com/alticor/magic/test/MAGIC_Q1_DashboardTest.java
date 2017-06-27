/*Step 1>Navigate to Dash board
 * Step 2>Capture Dash board
 */
package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_DashboardTest {
	
	/** Declare variables */
	boolean bStatus;
	
@Then("^Capture Dashboard$")
    public void Capture_Dashboard() throws Throwable{
		
		//Validating the Expected//
           String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='iboDashboard_collapsibleAboInformation']/div[1]"));
	       System.out.println("##########Expected-Result########################");
		   System.out.println("The Output is:"  +ExpVal);
		   System.out.println("###############################################");
		   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	}


