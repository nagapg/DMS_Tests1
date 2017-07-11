/*Step 1>Navigate to Invoice Inquiry
 * Step 2>Validate Orange Links
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9741Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^in Invoice Inquiry Screen$")
	public void in_Invoice_Inquiry_Screen() throws Throwable {
		
				//Click on Payment Inquiry//
		                GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
				if(bStatus){
		        	System.out.println("Payment Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Payment Inquiry-Fail");
		        }
				
				//Payment Inquiry-->Invoice Inquiry//
				bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
				if(bStatus){
		        	System.out.println("Invoice Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Invoice Inquiry-Fail");
		        }
				}

	@When("^Click Orange Link$")
	public void click_Orange_Link() throws Throwable {
		
	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
		if(bStatus){
        	System.out.println("Orange Link-Pass");
        }	
        else{
        	System.out.println("Orange Link-Fail");
        }
		}

	@When("^Click Amount$")
	public void click_Amount() throws Throwable {
		
		 //Validating the Expected//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[4]/span/b"));
		if(bStatus){
        	System.out.println("Amount Details-Pass");
        }	
        else{
        	System.out.println("Amount Details-Fail");
        }
		}

	@Then("^Bonus amount displays$")
	public void bonus_amount_displays() throws Throwable {
		
		  //Capture the screen//
		bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div"));
			if(bStatus){
			System.out.println("Values present-Pass");
 }
  else{
 System.out.println("Values  present-Fail");
}
}

	@Then("^Click Cross$")
	public void Click_Cross() throws Throwable {
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
		if(bStatus){
        	System.out.println("Click on Cross-Pass");
        }	
        else{
        	System.out.println("Click on Cross-Fail");
        }
		}

	@Then("^Click back$")
	public void Click_back() throws Throwable {
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[13]/td[2]/button"));
		if(bStatus){
        	System.out.println("Back-Pass");
        }	
        else{
        	System.out.println("Back-Fail");
        }
		}
}