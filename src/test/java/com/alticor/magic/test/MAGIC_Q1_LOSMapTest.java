/*Step 1>Navigate to LOA Map
 * Step 2>Capture LOS Map
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_LOSMapTest {

	/** Declare variables */
	boolean bStatus;
	
	@When("^LOS Map is selected$")
	public void LOS_Map_is_selected() throws Throwable{
		
		//Reports//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//[@id='topMenu']/div/a[4]")); 
		  if(bStatus){
	        	System.out.println("Reports-Pass");
	        }	
	        else{
	        	System.out.println("Reports-Fail");
	        }
		    
		 //Reports-->ABO Reports//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[2]/span[1]"));
	        if(bStatus){
			System.out.println("ABO Reports-Pass");
	        }	
	        else{
	        	System.out.println("ABO Reports-Fail");
	        }
	        
	         //Reports-->ABO Reports-->Line Of Spon Maps Rpts//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Line of Sponsorship Maps"));   
	       if(bStatus){
			System.out.println("Line Of Spon Maps Rpts-Pass");
	       }	
	       else{
	       	System.out.println("Line Of Spon Maps Rpts-Fail");
	       }
	       try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }

@Then("^Capture LOS Map$")
public void Capture_LOS_Map() throws Throwable{
	
	String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
    System.out.println("##########Expected-Result########################");
	   System.out.println("The Output is:"  +ExpVal);
	   System.out.println("##############################################");
	  }
}

