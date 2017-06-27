/*Step 1>Navigate to Invoice Inquiry
 * Step 2>Validate bonus amount details
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9739Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@When("^Invoice Inquiry is selected$")
	public void Invoice_Inquiry_is_selected () throws Throwable {
		
			//Click on Payment Inquiry//
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

@When("^Orange link is clicked$")
	public void orange_link_is_clicked() throws Throwable {
	
	GeneralFunctions.waittime();
	
	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
	if(bStatus){
    	System.out.println("Orange Link-Pass");
    }	
    else{
    	System.out.println("Orange Link-Fail");
    }
	}

	@Then("^view bonus amount details$")
	public void view_bonus_amount_details() throws Throwable {
		
		GeneralFunctions.waittime();
		
		//Validating the Expected//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[4]/span/b"));
		if(bStatus){
        	System.out.println("Amount Details-Pass");
        }	
        else{
        	System.out.println("Amount Details-Fail");
        }
		}
}





