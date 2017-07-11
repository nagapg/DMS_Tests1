/*Step 1>Navigate to Volumes
 * Step 2>Capture Volumes
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_VolumesTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^navigated to Volumes$")
	public void navigated_to_Volumes() throws Throwable {
	
          //Click on Volumes link//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
			  if (bStatus) {
		          System.out.println("Volumes-Pass");
		      } 
			  else {
		          System.out.println("Volumes-Fail");
		      }
		  }

@Then("^Capture Volumes$")
public void Capture_Volumes() throws Throwable{ 
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='IboBonusDtlBar']"));
	    System.out.println("##########Expected-Result########################");
		   System.out.println("The Output is:"  +ExpVal);
		   System.out.println("##############################################");
		}
}