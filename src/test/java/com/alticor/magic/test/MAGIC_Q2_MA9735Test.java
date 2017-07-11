/*Step 1>Navigate to Region Security
 * Step 2>Validate Expand all/Collapse all
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9735Test {

	/** Declare variables */
	boolean bStatus;
	
	@When("^navigated to Region Security$")
	public void navigated_to_Region_Security() throws Throwable {
		
		//Maintenance//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
		if(bStatus){
        	System.out.println("Maintanence-Pass");
        	}	
        else{
        	System.out.println("Maintanence-Fail ");
        }
   		
     //Maintenance-->Admin//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu2']/a[1]/span[1]"));
		if(bStatus){
        	System.out.println("Admin-Pass");
        }	
        else{
        	System.out.println("Admin-Fail");
        }
		
		 //Maintenance-->Admin-->Region Security//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2_1']/a[2]/span[1]"));
        if(bStatus){
		System.out.println("Region Security-Pass");
        }	
        else{
        	System.out.println("Region Security-Fail");
        }
		
        //Maintenance-->Admin-->Region Security-->Region Security//
        GeneralFunctions.waittime();
        bStatus=GeneralFunctions.clickElement(By.linkText("Region Security"));   
        if(bStatus){
		System.out.println("Region Security-Pass");
        }	
        else{
        	System.out.println("Region Security-Pass");
        }
        }

	@Then("^Validate Expand All and Collapse All$")
	public void validate_Expand_All_and_Collapse_All() throws Throwable {
		
       //Validating Hierarchy View//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='expandRegionSecurityScreen']/div[1]/img"));   
       if(bStatus){
		System.out.println("Region Enabled UI Screen-Pass");
       }	
       else{
       	System.out.println("Region Enabled UI Screen-Fail");
       }
     
        //Validating Expand All//
       GeneralFunctions.waittime();
     bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='expandAll']"));   
       if(bStatus){
		System.out.println("Expand All-Pass");
       }	
       else{
       	System.out.println("Expand All-Fail");
       }
     
       //Click on any link//
       GeneralFunctions.waittime();
        bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='rs_33']"));   
       if(bStatus){
		System.out.println("Clicked Link-Pass");
       }	
       else{
       	System.out.println("Clicked Link-Fail");
       }
      
        //validating Collapse all//
       GeneralFunctions.waittime();
       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='collapseAll']"));   
       if(bStatus){
		System.out.println("Collapse All-Pass");
       }	
       else{
       	System.out.println("Collapse All-Fail");
       }
       }
}