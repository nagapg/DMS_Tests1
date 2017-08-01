/*Step 1>Go to Awards Details Screen
 * Expected:Rework Qual month check box is visible
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10846Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^MAGIC user goes to Awards Details Screen$")
	public void MAGIC_user_goes_to_Awards_Details_Screen() throws Throwable {
	 
		//Navigate to Server//
				bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
				if (bStatus) {
						    System.out.println("Server Firefox-Pass");
						     } else {
						     System.out.println("Server Firefox-Fail");
						     }
							
							//Navigate to MAGIC-QA//
						 bStatus =GeneralFunctions.openapp("https://magic-beta/EBS_UI_Web/Magic");
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
						   bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"180");
				  if (bStatus) {
				System.out.println("AFF-Pass");
				} else {
				System.out.println("AFF-Fail");
				}
				  
				  //Enter ABO//
				   
				bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"2531573");
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
				             	
				             	 //Awards//
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
				             	
				             	//Inquiry-->Awards-->Awards Details//
				             		  try {
											Thread.sleep(3000);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									    
				             	bStatus=GeneralFunctions.clickElement(By.linkText("Award Details"));   
				                  if(bStatus){
				             		System.out.println("Award Details-Pass");
				                  }	
				                  else{
				                  	System.out.println("Award Details-Fail");
				                  }
				               }

				             	@When("^Prior Year is selected$")
				             	public void Prior_Year_is_selected() throws Throwable{
				             	}

				             	@Then("^Rework Qual month check box is visible$")
				             	public void Rework_Qual_month_check_box_is_visible() throws Throwable{
				             		
				             		  try {
											Thread.sleep(3000);
										} catch (InterruptedException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									    
				             		bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='reworkQualMonths']"));

				             		 //Capture the Expected//
						      	 	  GeneralFunctions.screenShot("MA10846.png");
				             		if (bStatus) {
				                      System.out.println("Check box present-Pass");
				                     } else {
				                      System.out.println("Check box present-Fail");
				             }
				             	}

				             	@Then("^Close Awards Details Screen$")
				             	public void Close_Awards_Details_Screen() throws Throwable{
				             		
				             		bStatus = GeneralFunctions.close();
				                     if (bStatus) {
				                          System.out.println("MAGIC Closed-Pass");
				                      } else {
				                          System.out.println("Close MAGIC-Fail");
				                      }
				             }
				             }
	
