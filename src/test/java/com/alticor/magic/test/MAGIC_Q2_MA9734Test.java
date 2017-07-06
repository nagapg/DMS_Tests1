/*Navigate to Business Owner attributes Links
 * Click Update
 * Expected 1:Alert Comes
 * Click ok
 * Click Reason
 * Enter Notes
 * Click Save
 * Click Update
 * Expected 2:Window Closes and Notes gets saved
 * Go to ABO Notes
 * Select the note
 * Delete the note
*/

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9734Test {

	/** Declare variables */
	boolean bStatus;
	final private String sExpNote="Testing";
	
	@When("^navigated to Bus Owner Attributes Screen$")
	public void navigated_to_Bus_Owner_Attributes_Screen() throws Throwable {
	
	//Maintenance//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
 		if(bStatus){
         	System.out.println("Maintanence-Pass");
         	}	
         else{
         	System.out.println("Maintanence-Fail");
         }
 		
 		
 		//Maintenance-->LOS//
 		GeneralFunctions.waittime();
 		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu2']/a[10]/span[1]"));
 		if(bStatus){
         	System.out.println("LOS-Pass");
         	}	
         else{
         	System.out.println("LOS-Fail");
         	}
 		
 	    //Maintenance-->LOS-->Bus Owner Attributes Link//
 		GeneralFunctions.waittime();
 		bStatus=GeneralFunctions.clickElement(By.linkText("Bus Owner Attribute Links"));   
	       if(bStatus){
			System.out.println("Bus Owner Links-Pass");
	       }	
	       else{
	       	System.out.println("Bus Owner Links-Fail");
	       }
	}
	
	@When("^Notes entered and click on Update$")
	public void Notes_entered_and_click_on_Update() throws Throwable {
	
		//Click on Update to validate Expected 1//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.id("update"));
 		if(bStatus){
         	System.out.println("Update-Pass");
         	}	
         else{
         	System.out.println("Update-Fail");
         }
		
 		//Click Ok on alert//
 		  GeneralFunctions.driver.switchTo().alert().accept();
 		  
 		  //Select Reason//
 		 GeneralFunctions.waittime();
 		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='iboAttributeLinksForm']/table/tbody/tr[9]/td[2]/img"));
         if(bStatus){
  		System.out.println("Reason Code-Pass");
         }	
         else{
         	System.out.println("Reason Code-Fail");
         }
     
         GeneralFunctions.waittime();
     	bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[2]"));
       if(bStatus){
 		System.out.println("Notes-Pass");
        }	
        else{
        	System.out.println("Notes-Fail");
        }
     
     GeneralFunctions.waittime();
     bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
     if(bStatus){
 		System.out.println("Entered Notes-Pass");
        }	
        else{
        	System.out.println("Cannot Enter Notes-Fail");
        }
     
     //Click on save button//
     GeneralFunctions.waittime();
    bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
     if(bStatus){
 		System.out.println("Save-Pass");
        }	
        else{
        	System.out.println("Save-Fail");
        }
     
     //Click update//
     GeneralFunctions.waittime();
     bStatus=GeneralFunctions.clickElement(By.id("update"));
     if(bStatus){
 		System.out.println("Update-Pass");
        }	
        else{
        	System.out.println("Update-Fail");
        }
     
      //Click Ok on alert//
	  GeneralFunctions.driver.switchTo().alert().accept();
	}
	
	  @Then("^Capture message$")
		public void Capture_message() throws Throwable {
     
		    //Capture Message//
		  GeneralFunctions.waittime();
		   String Expectedmssg=GeneralFunctions.getText(By.xpath(".//*[@id='messageTable']/tbody/tr/td/font"));
		   System.out.println("##########Note-Result########################");
		   System.out.println(Expectedmssg);
		 System.out.println("###############################################");
		   
		 //Go to ABO Notes//
		 GeneralFunctions.waittime();
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='pageHeaderBar']/div/div/span[3]/span[3]/a/i"));
	     if(bStatus){
	 		System.out.println("ABO Notes-Pass");
	        }	
	        else{
	        	System.out.println("ABO Notes-Fail");
	        }

	//Select one note//
	     GeneralFunctions.waittime();
	     bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='p7']/div"));
	     if(bStatus){
	 		System.out.println("Note Select-Pass");
	        }	
	        else{
	        	System.out.println("Note Select-Fail");
	        	GeneralFunctions.waittime();
	        }
	     
	     //Delete the note//
	     GeneralFunctions.waittime();
	     bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='subDeleteButton']/img"));
	     if(bStatus){
	 		System.out.println("Delete-Pass");
	        }	
	        else{
	        	System.out.println("Delete-Fail");
	        }
	   
	     //Click Ok on alert//
		  GeneralFunctions.driver.switchTo().alert().accept();
		  
		  //Capture the delete message//
		  String Delmssg=GeneralFunctions.getText(By.xpath(".//*[@id='messageTable']/tbody/tr[1]/td/font"));
		   System.out.println("##########Delete-Result########################");
		   System.out.println(Delmssg);
		 System.out.println("###############################################");
}
}


