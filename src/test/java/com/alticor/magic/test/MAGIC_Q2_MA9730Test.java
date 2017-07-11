/*Step 1>Navigate to Annual Bonus
 * Step 2>Capture Total Bonus
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9730Test {
	
	/** Declare variables */
	boolean bStatus;
	String ExpVal;

	@When("^navigated to Annual Bonus Screen$")
	public void navigated_to_Annual_Bonus_Screen() throws Throwable {
		
		       //Inquiry//
		              GeneralFunctions.waittime();
				       GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
	         			if(bStatus){
	         	        	System.out.println("Inquiry-Pass");
	         	        }	
	         	        else{
	         	        	System.out.println("Inquiry-Fail");
	         	        	 }
	         	
	         			//Inquiry-->Annuals//
	         			GeneralFunctions.waittime();
	         			GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[4]/span[1]"));
	         			if(bStatus){
	         	        	System.out.println("Annuals-Pass");
	         	        }	
	         	        else{
	         	        	System.out.println("Annuals-Fail");
	         	        }
         			
	         			//Inquiry-->Annuals-->Annual Bonus//
	         			GeneralFunctions.waittime();
	         			bStatus=GeneralFunctions.clickElement(By.linkText("Annual Bonus"));
	         	        if(bStatus){
	         			System.out.println("Annual Bonus-Pass");
	         	        }	
	         	        else{
	         	        	System.out.println("Annual Bonus-Fail");
	         	        }
	         	      }

@When("^PY selected and Clicked Go$")
public void  PY_selected_and_Clicked_Go() throws Throwable{
	
	//Select PY:2016//
	GeneralFunctions.waittime();
	 bStatus=GeneralFunctions.DropDown(By.xpath(".//*[@id='searchBoxDiv']/form/div[2]/table/tbody/tr/td[2]/select"), "2016");
	if(bStatus){
  	System.out.println("Select PY-Pass");
  }	
  else{
  	System.out.println("Select PY-Fail");
  }

//Click on Go button//
	GeneralFunctions.waittime();
    bStatus =GeneralFunctions.clickElement(By.id("goButton"));
    if (bStatus) {
System.out.println("Go Button-Pass");
} else {
System.out.println("Go Button-Fail");
}
   }

@Then("^Capture Total Bonus$")
public void  Capture_Total_Bonus() throws Throwable{
	
		 //Capture Total Bonus//
	GeneralFunctions.waittime();
	ExpVal=GeneralFunctions.getText(By.xpath(".//*[@id='searchBoxDiv']/table/tbody/tr[40]/td[8]"));
	System.out.println("##########Expected-Result########################");
	 System.out.println("The Total Bonus  is "+ ExpVal);
	 System.out.println("###############################################");
}
}

