/*Step 1>Go to EOM Job Processing
 * Step 2>Click Aff Link
 * Step 3>Click Status
 * Expected:Capture Status
  */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10840Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^user goes to End Of Month Job Processing$")
	public void user_goes_to_End_Of_Month_Job_Processing() throws Throwable{
	 
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
				                 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
				                 if (bStatus) {
				                System.out.println("Inquiry-Pass");
				                } else {
				                System.out.println("Inquiry-Fail");
				              }
				                 
				                 //Inquiry>Month End Status inquiry//
				                 try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
				                 bStatus =GeneralFunctions.clickElement(By.linkText("Month End Status Inquiry"));
				                 if (bStatus) {
				                System.out.println("EOM-Pass");
				                } else {
				              System.out.println("EOM-Fail");
				              }
				      	 }
				      	
				      	@When("^clicked on Affiliate Link$")
				      	public void clicked_on_Affiliate_Link() throws Throwable{
				      		
				      		//Click Affiliate Link//
				      		try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				      		bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='AffListExpand']/form/table[2]/tbody/tr[2]/td[1]/span/b"));
				              if (bStatus) {
				             System.out.println("Aff Link-Pass");
				             } else {
				             System.out.println("Aff Link-Fail");
				      }
				      }
				      	
				      	@When("^Click on status$")
				      	public void Click_on_status() throws Throwable{
				      		
				      		 //Click Status//
				      		try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				      		bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='div0']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[5]/span"));//
				      	    if (bStatus) {
				      		System.out.println("Status-Pass");
				      		} else {
				      		System.out.println("Status-Fail");
				      		}
				      	}
				      	
				      	@Then("^displays status history Bonus Period$")
				      	public void displays_status_history_Bonus_Period() throws Throwable{
				      		
				      		//Capture Status//
				      		try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				      	      String Stats=GeneralFunctions.getText(By.xpath(".//*[@id='sequenceDetailsTableDiv']/div/table/tbody/tr[2]/td[5]"));
				      	      
				      	  //Capture the Expected//
				      	 	  GeneralFunctions.screenShot("MA10840_Screenshot.png");
				      	 	  
				      	      System.out.println("*************Result********************");
				      	     System.out.println("Status:" + Stats);
				      	     System.out.println("********************************************");
				      	}
				      	
				      	@Then("^Close MAGIC EOM Screen$")
				      	public void Close_MAGIC_EOM_Screen() throws Throwable{
				      		
				      		bStatus = GeneralFunctions.close();
				              if (bStatus) {
				                   System.out.println("MAGIC Closed-Pass");
				               } else {
				                   System.out.println("Close MAGIC-Fail");
				               }
				      }
}

				            