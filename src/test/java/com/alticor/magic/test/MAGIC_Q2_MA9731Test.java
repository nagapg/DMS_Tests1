/* Step 1>Go to Award Board 
 * Step 2>Add the Name
 * Step 3>Confirm Add
 * Step 4>Update the Name
 * Step 5>Confirm Update
 * Step 6>Delete the Name
 * step 7>Confirm Delete
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9731Test {

	/** Declare variables */
	boolean bStatus;
	final private String sExpNote="Testing Notes";
	
@When("^navigated to Award board Name$")
	public void navigated_to_Award_board_Name() throws Throwable {
		
	 //Maintenance//
	                 GeneralFunctions.waittime();
			              bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			         		if(bStatus){
			                 	System.out.println("Maintanence-Pass");
			                 	}	
			                 else{
			                 	System.out.println("Maintanence-Fail");
			                 }
			         		
			         		
			         		//Maintenance-->Award Board//
			         		GeneralFunctions.waittime();
							 bStatus=GeneralFunctions.clickElement(By.linkText("Award Board"));   
			         	       if(bStatus){
			         			System.out.println("Award Board-Pass");
			         	       }	
			         	       else{
			         	       	System.out.println("Award Board-Fail");
			         	       }
			         	}
			         	
@When("^add name$")
public void  add_name() throws Throwable {
	
	/*Add name*/
	GeneralFunctions.waittime();
    bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='commonName']"),"Test1");
		if(bStatus){
     	System.out.println("Name entered-Pass");
     	}	
     else{
     	System.out.println("Name entered-Fail");
     }
		
		//Enter the note//
		GeneralFunctions.waittime();
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchBox']/table/tbody/tr[10]/td[3]/img"));
     if(bStatus){
		System.out.println("Select Reason Code-Pass");
     }	
     else{
     	System.out.println("Select Reason Code-Fail");
     }
     
     GeneralFunctions.waittime();
	bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[1]"));
     if(bStatus){
 		System.out.println("Select Notes-Pass");
        }	
        else{
        	System.out.println("Select Notes-Fail");
        }
     
     GeneralFunctions.waittime();
     bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
     if(bStatus){
 		System.out.println("Entered Notes-Pass");
        }	
        else{
        	System.out.println("Enter Notes-Fail");
        }
     
     //Click on save button//
     GeneralFunctions.waittime();
     bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
     if(bStatus){
 		System.out.println("Click Save-Pass");
        }	
        else{
        	System.out.println("Click Save-Fail");
        }
     
     //Click on Add button//
     GeneralFunctions.waittime();
     bStatus=GeneralFunctions.clickElement(By.id("addButton"));
     if(bStatus){
 		System.out.println("Click Add-Pass");
        }	
        else{
        	System.out.println("Click Add-Fail");
        }
}

	@When("^Confirm add$")
public void  Confirm_add() throws Throwable {
		
		GeneralFunctions.waittime();
		  String addmessg=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
		  System.out.println("##########Add Response########################"); 
		  System.out.println(addmessg);
		  System.out.println("##################################");
	}  

@When("^update name$")
public void  update_name() throws Throwable {
	
	GeneralFunctions.waittime();
	   bStatus=GeneralFunctions.enterTextToElement(By.id("commonName"),"Test2");
				if(bStatus){
		        	System.out.println("Name Update-Pass");
		        	}	
		        else{
		        	System.out.println("Name Update-Fail");
		        }
				
				//Enter the note//
				GeneralFunctions.waittime();
				bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchBox']/table/tbody/tr[10]/td[3]/img"));
		        if(bStatus){
		 		System.out.println("Reason Code-Pass");
		        }	
		        else{
		        	System.out.println("Reason Code-Fail");
		        }
		        
		        GeneralFunctions.waittime();
	 		bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[1]"));
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
		        
		        //Click on Update button//
		        GeneralFunctions.waittime();
		        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
		        if(bStatus){
		    		System.out.println("Update-Pass");
		           }	
		           else{
		           	System.out.println("Update-Fail");
		           }
 }

@When("^Confirm update$")
public void  Confirm_update() throws Throwable {
	
	GeneralFunctions.waittime();
	  String editmssg=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
	  System.out.println("##########Update Response########################");
	  System.out.println(editmssg);
	  System.out.println("##################################");
	     }


@Then("^delete name$")
public void  delete_name() throws Throwable {
	
	//Enter the note//
	GeneralFunctions.waittime();
	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchBox']/table/tbody/tr[10]/td[3]/img"));
        if(bStatus){
 		System.out.println("Reason Code-Pass");
        }	
        else{
        	System.out.println("Reason Code-Fail");
        }
      
        GeneralFunctions.waittime();
	bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[1]"));
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
    
    //Click on Delete button//
    GeneralFunctions.waittime();
    bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
    if(bStatus){
		System.out.println("Delete-Pass");
       }	
       else{
       	System.out.println("Delete-Fail");
       }

    //Accept the Pop Up//
    GeneralFunctions.waittime();
  GeneralFunctions.driver.switchTo().alert().accept();
   }

@Then("^Confirm delete$")
public void  Confirm_delete() throws Throwable {
	
	GeneralFunctions.waittime();
	   String deletemessg=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
	   System.out.println("##########Delete Response########################");  
	   System.out.println(deletemessg);
	   System.out.println("##################################");
}      
}