/*Step 1>Navigate to ILB Bank File
 * Step 2>Validate Audit Details
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9738Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^user navigates to ILB Bank File$")
	public void user_navigates_to_ILB_Bank_File() throws Throwable {
		
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
				  
	//Enter Aff//
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		  if (bStatus) {
		System.out.println("AFF-Pass");
		} else {
		System.out.println("AFF-Fail");
		}

			  //Enter Abo//
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
			       	        }
			       			
			       			//Processing-->payments//
			       			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu5']/a[7]/span[1]"));
			       			if(bStatus){
			       	        	System.out.println("Payments-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("Payments-Fail");
			       	        }
			       			
			       			//Processing-->Payments-->ILB bank file//
			       				bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("ILB Bank File"));
			       			if(bStatus){
			       	        	System.out.println("ILB Bank File-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("ILB Bank File-Fail");
			       	        }
			       			
			       			//Enter Period//
			       		  try {
			  				Thread.sleep(3000);
			  			} catch (InterruptedException e) {
			  				// TODO Auto-generated catch block
			  				e.printStackTrace();
			  			}
			       	bStatus=GeneralFunctions.enterTextToElement(By.name("period"),"022015");
				               if(bStatus){
				System.out.println("Period-Pass");
				}         
				else{
				System.out.println("Period-Fail");
				}
			    			
			    			//Click on Go button//
			    			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
			    			if(bStatus){
			    	        	System.out.println("Go-Pass");
			    	        }	
			    	        else{
			    	        System.out.println("Go-Fail");
			    	        }
			    			  try {
			    					Thread.sleep(3000);
			    				} catch (InterruptedException e) {
			    					// TODO Auto-generated catch block
			    					e.printStackTrace();
			    				}
			    			}

	@When("^Transmitted links selected$")
	public void Transmitted_links_selected() throws Throwable {
		
	//Click on Transmitted link//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus=GeneralFunctions.clickElement(By.linkText("Transmitted"));
		if(bStatus){
        	System.out.println("Click Transmitted Link-Pass");
        }	
        else{
        System.out.println("Click Transmitted Link-Fail");
        }
		
		//Click on Second Transmitted link//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr[2]/td[2]/span/b"));
			if(bStatus){
	        	System.out.println("Second Transmitted Link-Pass");
	        }	
	        else{
	        System.out.println("Second Transmitted Link-Fail");
	        }
			}

	@Then("^view audit details$")
	public void view_audit_details() throws Throwable {
	
	     //Expected:View Audit Details//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='divAuditDetails0']/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div"));
				if(bStatus){
		        	System.out.println("Audit Details-Pass");
		        }	
		        else{
		        	System.out.println("Audit Details-Fail");
		        }
				
				//Click on Cross//
				 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='divAuditDetails0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
			   	  if(bStatus){
			         	System.out.println("Click Cross-Pass");
			         }	
			         else{
			         	System.out.println("Click Cross-Fail");
			         }
			
			   	  //Click on Back//
		 bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
   	  if(bStatus){
         	System.out.println("Click Back-Pass");
         }	
         else{
         	System.out.println("Click Back-Fail");
         }
   	 	}

	@Then("^Close ILB Bank File$")
	public void  Close_ILB_Bank_File() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}