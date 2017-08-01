/*Step 1>Navigate to Award Search
 * Step 2>Capture Award Search
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_AwardSearchTest {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to AwardSearch$")
	public void user_navigates_to_AwardSearch() throws Throwable {
		
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
				               bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
				                 if (bStatus) {
				        System.out.println("Submit-Pass");
				    } else {
				        System.out.println("Submit-Fail");
				    }
				                
		//Inquiry//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));      
			  if(bStatus){
			        	System.out.println("Inquiry-Pass");
			        }	
			        else{
			        	System.out.println("Inquiry-Fail");
			        }
			        
			   	       //Inquiry-->Awards//
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[3]/span[1]"));
		   	        if(bStatus){
		   			System.out.println("Awards-Pass");
		   	        }	
		   	        else{
		   	        	System.out.println("Awards-Fail");
		   	        }
		   	        
		   				//Inquiry-->Awards-->Award Search//
		   	     try {
		 			Thread.sleep(3000);
		 		} catch (InterruptedException e) {
		 			// TODO Auto-generated catch block
		 			e.printStackTrace();
		 		}
		   	        bStatus=GeneralFunctions.clickElement(By.linkText("Award Search"));   
		   	       if(bStatus){
		   			System.out.println("Award Search-Pass");
		   	       }	
		   	       else{
		   	       	System.out.println("Award Search-Fail");
		   	       }
		   	   }
	
	@Then("^Capture Award Search$")
	public void Capture_Award_Search() throws Throwable{
		
		//Validating the Expected//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDivHeader']"));
	       
	       //Capture the Expected//
	 	  GeneralFunctions.screenShot("AwardSearch.png");
	 	  
	       System.out.println("##########Expected-Result####");
		   System.out.println(ExpVal);
		   System.out.println("###########################");
	}

	@Then("^Close AwardSearch$")
	public void  Close_AwardSearch() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}