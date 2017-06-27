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
	
	@When("^ILB Bank File is selected$")
	public void ILB_Bank_File_is_selected() throws Throwable {
		
	//Processing//
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
			       			if(bStatus){
			       	        	System.out.println("Processing-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("Processing-Fail");
			       	        }
			       			
			       			//Processing-->payments//
			       			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[7]/span[1]"));
			       			if(bStatus){
			       	        	System.out.println("Payments-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("Payments-Fail");
			       	        }
			       			
			       			//Processing-->Payments-->ILB bank file//
			       				bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("ILB Bank File"));
			       			if(bStatus){
			       	        	System.out.println("ILB Bank File-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("ILB Bank File-Fail");
			       	        }
			       			
			       			//Enter Period//
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
			    			}

	@When("^select Transmitted links$")
	public void select_Transmitted_links() throws Throwable {
		
		GeneralFunctions.waittime();
		
		//Click on Transmitted link//
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

	@Then("^user should be able to view audit details$")
	public void user_should_be_able_to_view_audit_details() throws Throwable {
		
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