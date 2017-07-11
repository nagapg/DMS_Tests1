/*Step 1>Navigate to ILB Bank File
 * Step 2>Validate Audit Details
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9738Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^navigated to ILB Bank File$")
	public void navigated_to_ILB_Bank_File() throws Throwable {
		
	//Processing//
		GeneralFunctions.waittime();
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
			       			if(bStatus){
			       	        	System.out.println("Processing-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("Processing-Fail");
			       	        }
			       			
			       			//Processing-->payments//
			       			GeneralFunctions.waittime();
			       			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[7]/span[1]"));
			       			if(bStatus){
			       	        	System.out.println("Payments-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("Payments-Fail");
			       	        }
			       			
			       			//Processing-->Payments-->ILB bank file//
			       			GeneralFunctions.waittime();
			       			bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("ILB Bank File"));
			       			if(bStatus){
			       	        	System.out.println("ILB Bank File-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("ILB Bank File-Fail");
			       	        }
			       			
			       			//Enter Period//
			       			GeneralFunctions.waittime();
			       	bStatus=GeneralFunctions.enterTextToElement(By.name("period"),"022015");
				               if(bStatus){
				System.out.println("Period-Pass");
				}         
				else{
				System.out.println("Period-Fail");
				}
			    			
			    			//Click on Go button//
			    			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
			    			if(bStatus){
			    	        	System.out.println("Go-Pass");
			    	        }	
			    	        else{
			    	        System.out.println("Go-Fail");
			    	        }
			    			GeneralFunctions.waittime();
			    			}

	@When("^Transmitted links selected$")
	public void Transmitted_links_selected() throws Throwable {
		
	//Click on Transmitted link//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.linkText("Transmitted"));
		if(bStatus){
        	System.out.println("Click Transmitted Link-Pass");
        }	
        else{
        System.out.println("Click Transmitted Link-Fail");
        }
		GeneralFunctions.waittime();
	 
		//Click on Second Transmitted link//
		  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr[2]/td[2]/span/b"));
			if(bStatus){
	        	System.out.println("Second Transmitted Link-Pass");
	        }	
	        else{
	        System.out.println("Second Transmitted Link-Fail");
	        }
			}

	@Then("^view audit details$")
	public void view_audit_details() throws Throwable {
		
		GeneralFunctions.waittime();
	     //Expected:View Audit Details//
				bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='divAuditDetails0']/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div"));
				if(bStatus){
		        	System.out.println("Audit Details-Pass");
		        }	
		        else{
		        	System.out.println("Audit Details-Fail");
		        }
				
				//Click on Cross//
				 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='divAuditDetails0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
			   	  if(bStatus){
			         	System.out.println("Click Cross-Pass");
			         }	
			         else{
			         	System.out.println("Click Cross-Fail");
			         }
			
			   	  //Click on Back//
		 bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
   	  if(bStatus){
         	System.out.println("Click Back-Pass");
         }	
         else{
         	System.out.println("Click Back-Fail");
         }
   	 	}
}