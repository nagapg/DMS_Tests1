/*Step 1>Navigate to Batch Search
 * Step 2>Validate Orange back arrow 
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9733Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to Batch Search$")
	public void user_navigates_to_Batch_Search() throws Throwable {
		
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
		  
		   //Enter Period//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062017");
		               if(bStatus){
		System.out.println("Period-Pass");
		}         
		else{
		System.out.println("Period-Fail");
		}
		 
		   		//Click on submit//
		               bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		                 if (bStatus) {
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }
		              
		  //Processing//
		                 try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}      
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
        if(bStatus){
        	System.out.println("Processing-Pass");
        }	
        else{
        	System.out.println("Processing-Fail");
        	GeneralFunctions.waittime();
        }
		
	//Processing-->Batch Processing//
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[2]/span[1]"));
		if(bStatus){
        	System.out.println("Batch Processing-Pass");
        }	
        else{
        	System.out.println("Batch Processing-Fail");
        }
        
      //Processing-->Batch Processing-->Batch Search//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
       if(bStatus){
		System.out.println("Batch Search-Pass");
       }	
       else{
       	System.out.println("Batch Search-Fail");
       }
	}

	@When("^Batch Transaction Inquiry is opened$")
	public void Batch_Transaction_Inquiry_is_opened() throws Throwable {
	    
    //Click on Search//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   bStatus=GeneralFunctions.clickElement(By.id("viewButton"));   
	       if(bStatus){
			System.out.println("Search-Pass");
	       }	
	       else{
	       	System.out.println("Search-Fail");
	       }
	
//Click on First ID link//
	       try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[2]/a/span/b"));   
	       if(bStatus){
			System.out.println("ID Link-Pass");
	       }	
	       else{
	       	System.out.println("ID Link-Fail");
	       }
	}      

	@Then("^Click back Orange arrow$")
	public void click_back_Orange_arrow() throws Throwable {
	   
		//click on back arrow//  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='batchTransationsSummary']/tbody/tr[1]/td[1]/a/img"));
		
		   
		   //Capture the Expected//
		 	  GeneralFunctions.screenShot("MA9733.png");
		 	  
	    if(bStatus){
		System.out.println("Back link-Pass");
	    }	
	     else{
		System.out.println("Back link-Fail");
	   }
	   }

	@Then("^Close Batch Search$")
	public void  Close_Batch_Search() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}