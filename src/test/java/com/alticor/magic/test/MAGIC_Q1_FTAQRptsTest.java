/*Step 1>Navigate to FTAQ Rpts
 * Step 2>Capture FTAQ Rpts
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q1_FTAQRptsTest {

	/** Declare variables */
	boolean bStatus;
	
	@When("^FTAQRpts is selected$")
	public void FTAQRpts_is_selected() throws Throwable{
	
		//Reports//
		  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[4]"));
			    if(bStatus){
		        	System.out.println("Reports-Pass");
		        }	
		        else{
		        	System.out.println("Reports-Fail");
		        }
			    
		   		 //Reports-->Qualification Reports//
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[7]/span[1]"));
   	        if(bStatus){
   			System.out.println("Qualification Rpts-Pass");
   	        }	
   	        else{
   	        	System.out.println("Qualification Rpts-Fail");
   	        }
   	        
   			//Reports-->Qualification Reports-->Award Qualification Reports //
   	        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4_8']/a[1]/span[1]"));   
   	       if(bStatus){
   			System.out.println("Award Qualification Reports-Pass");
   	       }	
   	       else{
   	       	System.out.println("Award Qualification Reports-Fail");
   	       }
   	       
	  //Reports-->Qualification Reports-->Award Qualification Reports-->First Time Award Qual Rpts //
   	        bStatus=GeneralFunctions.clickElement(By.linkText("First Time Award Qualifier Reports"));   
   	       if(bStatus){
   			System.out.println("First Time Award Qual Rpts-Pass");
   	       }	
   	       else{
   	       	System.out.println("First Time Award Qual Rpts-Fail");
   	       }
   	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

@Then("^Capture FTAQRpts$")
public void Capture_FTAQRpts() throws Throwable{
	
	//Validating the Expected//
    String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
    System.out.println("##########Expected-Result########################");
	   System.out.println("The Output is:"  +ExpVal);
	   System.out.println("###############################################");
}
}