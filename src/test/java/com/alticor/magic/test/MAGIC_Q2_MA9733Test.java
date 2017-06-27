/*Step 1>Navigate to Batch Search
 * Step 2>Validate Orange back arrow 
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9733Test {
	
	/** Declare variables */
	boolean bStatus;
	
		@When("^Batch Search is selected$")
	public void batch_Search_is_selected() throws Throwable {
		
		//Processing//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
        if(bStatus){
        	System.out.println("Processing-Pass");
        }	
        else{
        	System.out.println("Processing-Fail");
        	GeneralFunctions.waittime();
        }
		
	//Processing-->Batch Processing//
        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[2]/span[1]"));
		if(bStatus){
        	System.out.println("Batch Processing-Pass");
        }	
        else{
        	System.out.println("Batch Processing-Fail");
        }
        
      //Processing-->Batch Processing-->Batch Search//
		 bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
       if(bStatus){
		System.out.println("Batch Search-Pass");
       }	
       else{
       	System.out.println("Batch Search-Fail");
       }
	}

	@Then("^go to Batch Transaction Inquiry Screen$")
	public void go_to_Batch_Transaction_Inquiry_Screen() throws Throwable {
	    
		GeneralFunctions.waittime();
		
		//Click on Search//
	   bStatus=GeneralFunctions.clickElement(By.id("viewButton"));   
	       if(bStatus){
			System.out.println("Search-Pass");
	       }	
	       else{
	       	System.out.println("Search-Fail");
	       }
	       
	       //Click on First ID link//
	       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[2]/a/span/b"));   
	       if(bStatus){
			System.out.println("ID Link-Pass");
	       }	
	       else{
	       	System.out.println("ID Link-Fail");
	       }
	      }

	@Then("^Click on back Orange arrow$")
	public void click_on_back_Orange_arrow() throws Throwable {
	   
		//click on back arrow//  
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='batchTransationsSummary']/tbody/tr[1]/td[1]/a/img"));
	    if(bStatus){
		System.out.println("Back link-Pass");
	    }	
	     else{
		System.out.println("Back link-Fail");
	   }
	   }
}
