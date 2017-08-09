/*Step 1>Go to Qualification Maintenance Screen
 * Step 2>Select Region
 * Expected 1:Capture Region Drop down
 * Step 3>Select Territory
 * Expected 2>Capture Territory Drop down
 *  Step 3>Select State
 * Expected 3>Capture State Drop down
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10854Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^MAGIC user goes to Qualification Maintenance Screen$")
	public void magic_user_goes_to_Qualification_Maintenance_Screen() throws Throwable {
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
				    GeneralFunctions.waittime();
				    
				    //Enter Aff//
                   bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"360");
				   if (bStatus) {
		           System.out.println("AFF-Pass");
		           } else {
		         System.out.println("AFF-Fail");
		}
	
		  //Click on submit//
				   GeneralFunctions.waittime();
		    bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		                 if (bStatus) {
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }
		                 
		               //Maintenance//
		                 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
		                 if (bStatus) {
		                System.out.println("Maintenance-Pass");
		                } else {
		                System.out.println("Maintenance-Fail");
		                }
		                 
		                 //Maintenance>Qualification Maintenance//
		                 bStatus =GeneralFunctions.clickElement(By.linkText("Qualification Maintenance"));
		                 if (bStatus) {
		                System.out.println("Qualification Maintanence-Pass");
		                } else {
		                System.out.println("Qualification Maintanence-Fail");
		                }
		                }


	@When("^Region is clicked$")
	public void region_is_clicked() throws Throwable {
	    
		//Click Region//
				bStatus =GeneralFunctions.clickElement(By.xpath("html/body/div[2]/table/tbody/tr/td[2]/div/div[1]/div[13]/form/div[1]/div[2]/table[1]/tbody/tr[3]/td[4]/span/span[3]"));
				if (bStatus) {
				System.out.println("Region-Pass");
				} else {
				System.out.println("Region-Fail");
				}
		}
			


	@Then("^Capture Region drop down$")
	public void capture_Region_drop_down() throws Throwable {
		
		         //Capture Region Screenshot//
				GeneralFunctions.screenShot("MA10854_Region.png");
				}
		
@When("^Territory is clicked$")
	public void territory_is_clicked() throws Throwable {
	   
	  //Click Territory//
	bStatus =GeneralFunctions.clickElement(By.xpath("html/body/div[2]/table/tbody/tr/td[2]/div/div[1]/div[13]/form/div[1]/div[2]/table[1]/tbody/tr[3]/td[5]/span/span[3]"));
	 if (bStatus) {
	System.out.println("Territoy-Pass");
	} else {
	System.out.println("Territoy-Fail");
	}
}
	@Then("^Capture Territoy drop down$")
	public void capture_Territoy_drop_down() throws Throwable {
	   
		 //Capture Territory Screenshot//
		GeneralFunctions.screenShot("MA10854_Territory.png");
}
	

	@When("^State is selected$")
	public void state_is_selected() throws Throwable {
	    
		 //Click State//
		 bStatus =GeneralFunctions.clickElement(By.xpath("html/body/div[2]/table/tbody/tr/td[2]/div/div[1]/div[13]/form/div[1]/div[2]/table[1]/tbody/tr[3]/td[6]/table/tbody/tr[1]/td[3]/button"));
		if (bStatus) {
		System.out.println("State-Pass");
		} else {
		System.out.println("State-Fail");
		}
}

	@Then("^Capture State drop down$")
	public void capture_State_drop_down() throws Throwable {
	  
		 //Capture State Screenshot//
		GeneralFunctions.screenShot("MA10854_State.png");
	}

	@Then("^Close Qualification Maintenance Screen$")
	public void close_Qualification_Maintenance_Screen() throws Throwable {
	  
		bStatus = GeneralFunctions.close();
        if (bStatus) {
             System.out.println("Close Qualification Maintenance Screen-Pass");
         } else {
             System.out.println("Close Qualification Maintenance Screen-Fail");
         }
}
}




