/*Step 1>Navigate to Dash board
 * Step 2>Validate Platinum value/Sponsor value
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q2_MA9742Test {

	/** Declare variables */
	boolean bStatus;
	 String plat,sponsor;
	 
	 @Given("^user navigates to Dashboard$")
		public void user_navigates_to_Dashboard() throws Throwable {
			
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
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072017");
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
			                  }
	 
			                 @Then("^Capture Platinum value and sponsor value$")
			         		public void Capture_Platinum_value_and_sponsor_value() throws Throwable{
		
			  //Capture Platinum Value from Dashboard//
			                	 try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}	   
			    plat=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[3]/td[5]/a"));
			    
			    //Capture the Expected//
			 	  GeneralFunctions.screenShot("Platinum_Screenshot.png");
			 	  
			 	System.out.println("The Platinum value is    "  +  plat);
				
				//Capturing Sponsor value from Dashboard//
			 	 try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	   
				sponsor=GeneralFunctions.getText(By.xpath(".//*[@id='ABOInfo']/table/tbody/tr[4]/td[2]/a"));
				
				   //Capture the Expected//
			 	  GeneralFunctions.screenShot("Sponsor_Screenshot.png");
			 	  
				System.out.println("The Sponsor value is      "  +  sponsor);
				 }
	  
	  @Then("^Values are same$")
		public void Values_are_same() throws Throwable{
	
				    if(plat!=null&&!plat.equals("sponsor")){
		    	 System.out.println("###########Result################");
					System.out.println("Platinum and Sponsor are equal");
					 System.out.println("#############################");		
		     }
				else
				{
					 System.out.println("###########Expected-Result##########");
					System.out.println("Platinum and Sponsor are not equal");
					 System.out.println("##################################");
				}
	  }


	  @Then("^Close Dashboard$")
		public void  Close_Dashboard() throws Throwable {
		  
		  	bStatus = GeneralFunctions.close();
		      if (bStatus) {
		           System.out.println("MAGIC Closed-Pass");
		       } else {
		           System.out.println("Close MAGIC-Fail");
		       }
		}
		}





