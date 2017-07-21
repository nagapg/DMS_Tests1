/*Step 1>Navigate to Region Security
 * Step 2>Validate Expand all/Collapse all
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q2_MA9735Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to Region Security$")
	public void user_navigates_to_Region_Security() throws Throwable {
		
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
	
			  //Enter ABO//
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
		               try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}	   
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
        	System.out.println("Maintanence-Fail ");
        }
   		
     //Maintenance-->Admin//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	   
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu2']/a[1]/span[1]"));
		if(bStatus){
        	System.out.println("Admin-Pass");
        }	
        else{
        	System.out.println("Admin-Fail");
        }
		
		 //Maintenance-->Admin-->Region Security//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	   
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2_1']/a[2]/span[1]"));
        if(bStatus){
		System.out.println("Region Security-Pass");
        }	
        else{
        	System.out.println("Region Security-Fail");
        }
		
        //Maintenance-->Admin-->Region Security-->Region Security//
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	   
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
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='expandRegionSecurityScreen']/div[1]/img"));   
       if(bStatus){
		System.out.println("Region Enabled UI Screen-Pass");
       }	
       else{
       	System.out.println("Region Enabled UI Screen-Fail");
       }
     
        //Validating Expand All//
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	   
     bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='expandAll']"));   
       if(bStatus){
		System.out.println("Expand All-Pass");
       }	
       else{
       	System.out.println("Expand All-Fail");
       }
     
       //Click on any link//
        bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='rs_33']"));   
       if(bStatus){
		System.out.println("Clicked Link-Pass");
       }	
       else{
       	System.out.println("Clicked Link-Fail");
       }
      
        //validating Collapse all//
       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='collapseAll']"));   
      
       //Capture the Expected//
	 	  GeneralFunctions.screenShot("MA9735_Screenshot.png");
	 	  
       if(bStatus){
		System.out.println("Collapse All-Pass");
       }	
       else{
       	System.out.println("Collapse All-Fail");
       }
       }

	@Then("^Close Region Security$")
	public void  Close_Region_Security() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}




