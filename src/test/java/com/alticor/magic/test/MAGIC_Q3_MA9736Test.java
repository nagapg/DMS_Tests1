/*Step 1>Navigate to ILB alternate ILB address
 * Step 2>Enter ABO:9995 and Click on Go 
 * Step 3>Click on Submit 
 * Expected 1>Alert Pops up
 * Step 4>Enter Name and Reason Code
 * Step 5>Click on Cancel
 *Expected 2>Field values clears
 *Step 6>Again Fill Fields
 *Step 7>Click add
 *Expected 3>Capture Add Success message
 *Step8>Edit Name
 *Step 9>Click Update
 *Expected 4>Capture Edit Success message
 *Step 10>Delete Name
 *Expected 5>Capture delete Success message
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA9736Test {

	/** Declare variables */
	boolean bStatus;
	final private String sExpNote="Test Notes";
	
	@Given("^user goes to ILB alternate ILB address$")
	public void user_goes_to_ILB_alternate_ILB_address() throws Throwable {
	 
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
				
						    try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						    
						    //Enter Aff//
						  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
				  if (bStatus) {
				System.out.println("AFF-Pass");
				} else {
				System.out.println("AFF-Fail");
				}
				  
				  //Enter ABO//
				  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	   
				bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
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
				 				
				 				//Maintenance-->Alternate ILB Address//
				 				 try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}	   
				 				bStatus=GeneralFunctions.clickElement(By.linkText("Alternate ILB Address"));   
				 			       if(bStatus){
				 					System.out.println("Alternate ILB Address-Pass");
				 			       }	
				 			       else{
				 			       	System.out.println("Alternate ILB Address-Fail");
				 			      }
				 			       
				 			       //Enter ABO:9995//
				 			      try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								 
				 			       bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='inputAboNumber']"),"5166282");
				 					  if (bStatus) {
				 					System.out.println("ABO-Pass");
				 					} else {
				 					System.out.println("ABO-Fail");
				 					}
				 			       
				 			       //Click Go//
				 					  bStatus =GeneralFunctions.clickElement(By.id("goButton"));
				 		                 if (bStatus) {
				 		        System.out.println("Go-Pass");
				 		    } else {
				 		        System.out.println("Go-Fail");
				 	    }
				 		                }

@When("^name entered$")
	public void name_entered() throws Throwable {
	  
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
    if(bStatus){
		System.out.println("Add-Pass");
    }	
    else{
    	System.out.println("Add-Fail");
    
    }

	   // Expected 1>Alert Pops up//
     GeneralFunctions.AlertActiveElement();
	
 //Enter Name//
     try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='nameOne']"),"tester");
  if (bStatus) {
System.out.println("Name-Pass");
} else {
System.out.println("Name-Fail");
}

//Select Reason Code//
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='maintILBProcessForm']/div[6]/div/div/div/button/i"));
if(bStatus){
	System.out.println("Reason Code-Pass");
}	
else{
	System.out.println("Reason Code-Fail");
}

//Select//
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='maintILBProcessForm']/div[6]/div/div/div/ul/li/div/table/tbody/tr/td[2]"));
if(bStatus){
	System.out.println("Select-Pass");
}	
else{
	System.out.println("Select-Fail");
}

//Enter Note//
bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
if(bStatus){
	System.out.println("Add Notes-Pass");
   }	
   else{
   	System.out.println("Add Notes-Fail");
   }

//Click on save button//
    bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
    if(bStatus){
		System.out.println("Save-Pass");
    }	
    else{
    	System.out.println("Save-Fail");
    }
    
    //  Expected 2>Field values clears//
     //Click on Cancel//
    bStatus=GeneralFunctions.clickElement(By.id("cancelButton"));
    if(bStatus){
		System.out.println("Cancel-Pass");
    }	
    else{
    	System.out.println("Cancel-Fail");
    }
    
 //Re-enter Name//
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='nameOne']"),"tester");
  if (bStatus) {
System.out.println("Name-Pass");
} else {
System.out.println("Name-Fail");
}

//Re-Select Reason Code//
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='maintILBProcessForm']/div[6]/div/div/div/button/i"));
if(bStatus){
	System.out.println("Reason Code-Pass");
}	
else{
	System.out.println("Reason Code-Fail");
}

//Re-Select//
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='maintILBProcessForm']/div[6]/div/div/div/ul/li/div/table/tbody/tr/td[2]"));
if(bStatus){
	System.out.println("Select-Pass");
}	
else{
	System.out.println("Select-Fail");
}

//Re-Enter Note//
bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
if(bStatus){
	System.out.println("Add Notes-Pass");
   }	
   else{
   	System.out.println("Add Notes-Fail");
   }

//Click on save button//
    bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
    if(bStatus){
		System.out.println("Save-Pass");
    }	
    else{
    	System.out.println("Save-Fail");
    }
    
   //Click on add button//
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
    	 bStatus=GeneralFunctions.clickElement(By.id("submitButton"));
	        if(bStatus){
	    		System.out.println("Add-Pass");
	        }	
	        else{
	        	System.out.println("Add-Fail");
	        	GeneralFunctions.waittime();
	        	}
	        
	        //Expected 3>Capture Add Success message//
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	       String addmessg=GeneralFunctions.getText(By.xpath(".//*[@id='rightPane']/div[1]/div[4]/div[3]"));
	       
	       //Capture the Expected//
		 	  GeneralFunctions.screenShot("MA9736_Add.png");
		 	  
	       System.out.println("*************Add-Result******");
	      System.out.println( addmessg);
	      System.out.println("****************************");

      //Edit the name//
    	bStatus=GeneralFunctions.enterTextToElement(By.id("nameOne"),"TesterQA");
		if(bStatus){
        	System.out.println("Name Edit-Pass");
        	}	
        else{
        	System.out.println("Name Edit-Fail");
        	 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		
		//Click on Update button//
        bStatus=GeneralFunctions.clickElement(By.id("changeButton"));
        if(bStatus){
    		System.out.println("Update-Pass");
           }	
           else{
           	System.out.println("Update-Fail");
           }
        
     //Expected 4>Capture Update Success message//
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
        String updatemessg=GeneralFunctions.getText(By.xpath(".//*[@id='rightPane']/div[1]/div[4]/div[3]"));
        
        //Capture the Expected//
	 	  GeneralFunctions.screenShot("MA9736_Update.png");
	 	  
        System.out.println("*************Update-Result****");
       System.out.println( updatemessg);
       System.out.println("***************************");

}

@Then("^Validate buttons$")
	public void validate_buttons() throws Throwable {
	 
     //Click on Delete button//
        bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
        if(bStatus){
    		System.out.println("Delete-Pass");
           }	
           else{
           	System.out.println("Delete-Fail");
            try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }

        //Accept the Pop Up//
	  GeneralFunctions.driver.switchTo().alert().accept();
	  
	//Expected 5>Capture Delete Success message//
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
      String deletemessg=GeneralFunctions.getText(By.xpath(".//*[@id='rightPane']/div[1]/div[4]/div[3]"));
      
      //Capture the Expected//
 	  GeneralFunctions.screenShot("MA9736_Delete.png");
 	  
      System.out.println("*************Delete-Result****");
     System.out.println(deletemessg);
     System.out.println("*****************************");
     }

@Then("^Close ILB alternate ILB address screen$")
	public void close_ILB_alternate_ILB_address_screen() throws Throwable {
	  
bStatus = GeneralFunctions.close();
      if (bStatus) {
           System.out.println("MAGIC Closed-Pass");
       } else {
           System.out.println("Close MAGIC-Fail");
       }
}
}
