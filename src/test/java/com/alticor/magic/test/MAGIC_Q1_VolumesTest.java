/*Step 1>Navigate to Volumes
 * Step 2>Capture Volumes
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_VolumesTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^Volumes is selected$")
	public void Volumes_is_selected() throws Throwable{
		
          //Click on Volumes link//
			 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
			  if (bStatus) {
		          System.out.println("Volumes-Pass");
		      } 
			  else {
		          System.out.println("Volumes-Fail");
		      }
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }

@Then("^Capture Volumes$")
public void Capture_Volumes() throws Throwable{ 
	
	 String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='IboBonusDtlBar']"));
	    System.out.println("##########Expected-Result########################");
		   System.out.println("The Output is:"  +ExpVal);
		   System.out.println("##############################################");
		}
}


