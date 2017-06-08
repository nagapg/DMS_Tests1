package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9738Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^user is in MAGIC ILB Bank File Screen$")
	public void user_is_in_MAGIC_ILB_Bank_File_Screen() throws Throwable {
		
		//Navigate to Hub//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
		//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");//
			if (bStatus) {
			    System.out.println("Hub Firefox-Pass");
			     } else {
			     System.out.println("Hub Firefox-Fail");
			     }
				
				//Navigate to MAGIC-Gamma//
			 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
			  if (bStatus) {
			    System.out.println("MAGIC_Gamma-Pass");
			    } else {
			    System.out.println("MAGIC_Gamma-Fail");
			    }
			   // com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
			   
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

				  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					  //Enter Abo//
				bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"5166282");
				  if (bStatus) {
				System.out.println("ABO-Pass");
				} else {
				System.out.println("ABO-Fail");
				}
				  
				  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					   //Enter Period//
				bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062017");
				               if(bStatus){
				System.out.println("Period-Pass");
				}         
				else{
				System.out.println("Period-Fail");
				}
				 
				  try {
				   				Thread.sleep(3000);
				   			} catch (InterruptedException e) {
				   				// TODO Auto-generated catch block
				   				e.printStackTrace();
				   			}
				   		
			       //Click on submit//
			                 bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
			                 if (bStatus) {
			        System.out.println("Submit-Pass");
			    } else {
			        System.out.println("Submit-Fail");
			    }
 try {
			     				Thread.sleep(3000);
			     			} catch (InterruptedException e) {
			     				// TODO Auto-generated catch block
			     				e.printStackTrace();
			     			}
			     		
			               //Processing//
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
			       			bStatus=GeneralFunctions.clickElement(By.linkText("ILB Bank File"));
			       			if(bStatus){
			       	        	System.out.println("ILB Bank File-Pass");
			       	        }	
			       	        else{
			       	        	System.out.println("ILB Bank File-Fail");
			       	        }
			       			
			       			try {
			    				Thread.sleep(4000);
			    			} catch (InterruptedException e1) {
			    				// TODO Auto-generated catch block
			    				e1.printStackTrace();
			    			}	
			       			
			       		//Enter Period//
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
			    				Thread.sleep(4000);
			    			} catch (InterruptedException e1) {
			    				// TODO Auto-generated catch block
			    				e1.printStackTrace();
			    			}	
			    			}

	@When("^user selects Transmitted links$")
	public void user_selects_Transmitted_links() throws Throwable {
		
		//Click on Transmitted link//
		bStatus=GeneralFunctions.clickElement(By.linkText("Transmitted"));
		if(bStatus){
        	System.out.println("Click Transmitted Link-Pass");
        }	
        else{
        System.out.println("Click Transmitted Link-Fail");
        }
		 try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		//Click on Second Transmitted link//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchForm']/table/tbody/tr[2]/td[2]/span/b"));
			if(bStatus){
	        	System.out.println("Second Transmitted Link-Pass");
	        }	
	        else{
	        System.out.println("Second Transmitted Link-Fail");
	        }
			 try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
    	}

	@Then("^user should be able to view audit details$")
	public void user_should_be_able_to_view_audit_details() throws Throwable {
		
		     //Expected:View Audit Details//
				bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='divAuditDetails0']/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div"));
				if(bStatus){
		        	System.out.println("Audit Details-Pass");
		        }	
		        else{
		        	System.out.println("Audit Details-Fail");
		        }
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
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

	@Then("^Close MAGIC ILB Bank File Screen$")
	public void close_MAGIC_ILB_Bank_File_Screen() throws Throwable {
		
		   bStatus = GeneralFunctions.close();
	        if (bStatus) {
	             System.out.println("MAGIC Closed-Pass");
	         } else {
	             System.out.println("Close MAGIC-Fail");
	         }
	}
	}