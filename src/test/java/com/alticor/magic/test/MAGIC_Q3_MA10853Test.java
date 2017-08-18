/*Step 1>Go to Qualification Maintenance screen
 * Step 2>Select Territory
 * Expected 1>Capture Territory Drop down list
 * Step 3>Select State
 * Expected 2>Capture State Drop down list
 * Step 4>Select Country
 * Expected 3>Capture Country Drop down list
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10853Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^user goes to MAGIC Qualification Maintenance screen$")
	public void user_goes_to_MAGIC_Qualification_Maintenance_screen() throws Throwable {
	
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
						 GeneralFunctions.waittime();
						 
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
				                 bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
				                 if (bStatus) {
				        System.out.println("Submit-Pass");
				    } else {
				        System.out.println("Submit-Fail");
				    }
				             
				                 GeneralFunctions.waittime();
				                 
				                 //Maintenance//
				                 GeneralFunctions.waittime();
				                 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
				                 if (bStatus) {
				                 System.out.println("Maintenance-Pass");
				                   } else {
				                 System.out.println("Maintenance-Fail");
				                  }
				                 
				                 //Maintenance-->Award maintenance//
				                 GeneralFunctions.waittime();
				                 bStatus =GeneralFunctions.clickElement(By.linkText("Award Maintenance"));
				                 if (bStatus) {
				                 System.out.println("Award maintenance-Pass");
				                   } else {
				                 System.out.println("Award maintenance-Fail");
				                  }	                 
				}

	@When("^Territory is selected$")
	public void territory_is_selected() throws Throwable {
	
		  //Click Territory//
				bStatus =GeneralFunctions.clickElement(By.xpath("html/body/div[18]/table/tbody/tr/td[2]/div[1]/div/div[4]/form/div[1]/div[2]/div/span/table/tbody/tr[5]/td[3]/span[2]"));
				 if (bStatus) {
				System.out.println("Territoy-Pass");
				} else {
				System.out.println("Territoy-Fail");
				}
		}

	@Then("^Territory drop down is captured$")
	public void territory_drop_down_is_captured() throws Throwable {
		
		//Capture Drop down//
		GeneralFunctions.screenShot("MA10853_TerritoyCapture.png");
	 }

	@When("^Region field selected$")
	public void region_field_selected() throws Throwable {
		
			 //Click Region//
		bStatus =GeneralFunctions.clickElement(By.xpath("html/body/div[18]/table/tbody/tr/td[2]/div[1]/div/div[4]/form/div[1]/div[2]/div/span/table/tbody/tr[5]/td[1]/span/span[3]"));
		 if (bStatus) {
		System.out.println("Region-Pass");
		} else {
		System.out.println("Region-Fail");
	}
	 }

	@Then("^Region drop down displays$")
	public void region_drop_down_displays() throws Throwable {
	
		//Capture Drop down//
	GeneralFunctions.screenShot("MA10853_RegionCapture.png");
		}

	@When("^state field selected$")
	public void state_field_selected() throws Throwable {
		
		 //Click State//
		bStatus =GeneralFunctions.clickElement(By.xpath("html/body/div[18]/table/tbody/tr/td[2]/div[1]/div/div[4]/form/div[1]/div[2]/div/span/table/tbody/tr[5]/td[4]/table/tbody/tr[1]/td[3]/button"));
		 if (bStatus) {
		System.out.println("State-Pass");
		} else {
		System.out.println("State-Fail");
		}
}

	@Then("^State drop down displays$")
	public void state_drop_down_displays() throws Throwable {
		
		//Capture Drop down//
	GeneralFunctions.screenShot("MA10853_StateCapture.png");
}

	@Then("^Close MAGIC Qualification Maintenance screen$")
	public void close_MAGIC_Qualification_Maintenance_screen() throws Throwable {
		
		bStatus = GeneralFunctions.close();
	    if (bStatus) {
	         System.out.println("Close_Qualification Maintenance screen-Pass");
	     } else {
	         System.out.println("Close_Qualification Maintenance screen-Fail");
	     }
	}
}



