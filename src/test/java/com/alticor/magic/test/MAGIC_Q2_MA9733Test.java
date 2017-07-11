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
	
	@When("^navigated to Batch Search$")
	public void navigated_to_Batch_Search() throws Throwable {
		
	  //Processing//
	GeneralFunctions.waittime();  
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
        if(bStatus){
        	System.out.println("Processing-Pass");
        }	
        else{
        	System.out.println("Processing-Fail");
        	GeneralFunctions.waittime();
        }
		
	//Processing-->Batch Processing//
        GeneralFunctions.waittime(); 
        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[2]/span[1]"));
		if(bStatus){
        	System.out.println("Batch Processing-Pass");
        }	
        else{
        	System.out.println("Batch Processing-Fail");
        }
        
      //Processing-->Batch Processing-->Batch Search//
		GeneralFunctions.waittime(); 
		 bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
       if(bStatus){
		System.out.println("Batch Search-Pass");
       }	
       else{
       	System.out.println("Batch Search-Fail");
       }
	}

	@When("^Batch Transaction Inquiry is opened$")
	public void Batch_Transaction_Inquiry_is_opened() throws Throwable {
	    
    //Click on Search//
		GeneralFunctions.waittime(); 
	   bStatus=GeneralFunctions.clickElement(By.id("viewButton"));   
	       if(bStatus){
			System.out.println("Search-Pass");
	       }	
	       else{
	       	System.out.println("Search-Fail");
	       }
	
//Click on First ID link//
	       GeneralFunctions.waittime(); 
	       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[2]/a/span/b"));   
	       if(bStatus){
			System.out.println("ID Link-Pass");
	       }	
	       else{
	       	System.out.println("ID Link-Fail");
	       }
	}      

	@Then("^Click back Orange arrow$")
	public void click_back_Orange_arrow() throws Throwable {
	   
		//click on back arrow//  
		GeneralFunctions.waittime(); 
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='batchTransationsSummary']/tbody/tr[1]/td[1]/a/img"));
	    if(bStatus){
		System.out.println("Back link-Pass");
	    }	
	     else{
		System.out.println("Back link-Fail");
	   }
	   }
}
	