/*Step 1:Navigate to https://magic-gamma/EBS_UI_Web/Magic
 * Step 2:Enter Aff/Abo/Per and click on submit
 * Step 3:Close Gamma
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenMagicTest {

	/** Declare variables */
	boolean bStatus;

	@Given("^user navigates to GAMMA$")
	public void user_navigates_to_GAMMA() throws Throwable {
		
		//Navigate to Server//
				bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
				//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");//
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
						  
						// com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
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
	}
	
						    @Given("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" entered and click on submit$")
							public void entered_and_click_on_submit(String aff, String abo, String per) throws Throwable {
								
						    	//Enter Aff//
						    	try {
									Thread.sleep(3000);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),aff);
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
								bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),abo);
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
								bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),per);
								               if(bStatus){
								System.out.println("Period-Pass");
								}         
								else{
								System.out.println("Period-Fail");
								}
								 
						//Click submit//
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
						                
						    }
						    
						    @Then("^Close Gamma$")
							public void Close_Gamma() throws Throwable {					    
						    
						    	bStatus = GeneralFunctions.close();
						        if (bStatus) {
						             System.out.println("MAGIC Closed-Pass");
						         } else {
						             System.out.println("Close MAGIC-Fail");
						         }
						  }
						  }					    
						    
						    
						    
						    