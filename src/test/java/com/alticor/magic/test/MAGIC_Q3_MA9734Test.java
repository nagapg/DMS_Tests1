/*Step 1>Navigate to Bus Owner Attributes Screen
 * Step 2>Enter Notes
 * Step 3>Click Update
 * Step 4>Click ABO Notes
 * Expected:Capture Entered notes
 * Step 5>Delete the notes
  */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA9734Test {
	
	/** Declare variables */
	boolean bStatus;
	final private String sExpNote="Test Notes";
	
	@Given("^user navigates to Bus Owner Attributes Screen$")
	public void user_navigates_to_Bus_Owner_Attributes_Screen() throws Throwable {
	    
		//Navigate to Server//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
		if (bStatus) {
				    System.out.println("Server Firefox-Pass");
				     } else {
				     System.out.println("Server Firefox-Fail");
				     }
					
					//Navigate to MAGIC-QA//
				 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
				  if (bStatus) {
				    System.out.println("MAGIC_QA-Pass");
				    } else {
				    System.out.println("MAGIC_QA-Fail");
				    }
				    try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
				 
				//Okta Login//
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-username']"),"cmns559");
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-password']"),"our49pot");
				    GeneralFunctions.clickElement(By.xpath(".//*[@id='okta-signin-submit']"));
		
				    //Enter Abo//
				    try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"900003");
			 if (bStatus) {
			 System.out.println("ABO-Pass");
			 } else {
			 System.out.println("ABO-Fail");
			}
			 
			 //Click on submit//
			  bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
			  if (bStatus) {
			 System.out.println("Submit-Pass");
			 } else {
			 System.out.println("Submit-Fail");
			}
			  
			//Maintenance//
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			 if(bStatus){
			System.out.println("Maintanence-Pass");
			}             
			else{
			System.out.println("Maintanence-Fail");
			}
			 
			  //Maintenance-->LOS//
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu2']/a[10]/span[1]"));
			 if(bStatus){
			System.out.println("LOS-Pass");
			}             
			else{
			System.out.println("LOS-Fail");
			}
			 
			//Maintenance-->LOS-->Bus Owner Attributes Link//
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 bStatus=GeneralFunctions.clickElement(By.linkText("Bus Owner Attribute Links"));   
			if(bStatus){
			                System.out.println("Bus Owner Links-Pass");
			}      
			else{
			 System.out.println("Bus Owner Links-Fail");
			}
	}

	@When("^Notes entered and Click on Update$")
	public void notes_entered_and_Click_on_Update() throws Throwable {
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Enter Text//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='notesDetailTextarea']"),sExpNote);
		 if (bStatus) {
		 System.out.println("Notes Entered-Pass");
		 } else {
		 System.out.println("Notes Entered-Fail");
		}
		
		//Click update//
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='update']"));
if(bStatus){
       System.out.println("Update-Pass");
}     
else{
System.out.println("Update-Fail");
}

//Click Ok on alert//
GeneralFunctions.driver.switchTo().alert().accept();

//Capture the success message//
String CapMssg=GeneralFunctions.getText(By.xpath("html/body/div[4]/table/tbody/tr/td[2]/div/div[1]/div[3]/div[3]/form/div/font"));
System.out.println(CapMssg);

//Capture the screenshot//
GeneralFunctions.screenShot("MA9734.png");
	}

	@Then("^navigate to ABO Notes and Capture the entered notes$")
	public void navigate_to_ABO_Notes_and_Capture_the_entered_notes() throws Throwable {
	   
		 //Go to ABO Notes//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='pageHeaderBar']/div/div/span[3]/span[3]/a/i"));
if(bStatus){
                     System.out.println("ABO Notes-Pass");
 }     
 else{
       System.out.println("ABO Notes-Fail");
 }

//Select note//
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='p7']/div"));
if(bStatus){
                     System.out.println("Note Select-Pass");
 }     
 else{
       System.out.println("Note Select-Fail");
       }

//Capture the Entered Notes//
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
String Expectedmssg=GeneralFunctions.getText(By.xpath(".//*[@id='p7']/div"));


System.out.println("##########Entered Message########################");
System.out.println(Expectedmssg);
System.out.println("###############################################");

//Delete the note//
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='subDeleteButton']/img"));
if(bStatus){
                     System.out.println("Delete-Pass");
 }     
 else{
       System.out.println("Delete-Fail");
 }

         //Click Ok on alert//
          GeneralFunctions.driver.switchTo().alert().accept();
          }

	@Then("^Close Bus Owner Attributes Screen$")
	public void close_Bus_Owner_Attributes_Screen() throws Throwable {
	  
		bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}



