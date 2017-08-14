/*Step 1>Go to Dashboard
 * Expected 1:Top Up volume is present
 * Step 2>Go to Volumes
 * Expected 2>Top up volume is present
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10851Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^MAGIC user goes to MAGIC Dashboard$")
	public void magic_user_goes_to_MAGIC_Dashboard() throws Throwable {
	  
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
				GeneralFunctions.waittime();
				
				//Okta Login//
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-username']"),"cmns559");
				    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-password']"),"our49pot");
				    GeneralFunctions.clickElement(By.xpath(".//*[@id='okta-signin-submit']"));
		
				    GeneralFunctions.waittime();
				    //Enter Aff//
				   bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"430");
		  if (bStatus) {
		System.out.println("AFF-Pass");
		} else {
		System.out.println("AFF-Fail");
		}
		  
		  //Enter ABO//
		   bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"100098");
		  if (bStatus) {
		System.out.println("ABO-Pass");
		} else {
		System.out.println("ABO-Fail");
		}
		  
		   //Enter Period//
		  GeneralFunctions.waittime();
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022017");
		               if(bStatus){
		System.out.println("Period-Pass");
		}         
		else{
		System.out.println("Period-Fail");
		}
		 }

	@When("^Quick Glance is observed$")
	public void quick_Glance_is_observed() throws Throwable {

        //Click on submit//
		GeneralFunctions.waittime();
    
         bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
                 if (bStatus) {
        System.out.println("Submit-Pass");
    } else {
        System.out.println("Submit-Fail");
    }
                 
                 //Click Dashboard//
                 GeneralFunctions.waittime();
                 bStatus =GeneralFunctions.clickElement(By.id("dashboardLinkLabel"));
                 if (bStatus) {
        System.out.println("Dashboard-Pass");
    } else {
        System.out.println("Dashboard-Fail");
    }
	}

	@Then("^Top up is visible$")
	public void top_up_is_visible() throws Throwable {

		GeneralFunctions.waittime();
		   String ExpVal=GeneralFunctions.getText(By.xpath("html/body/div[4]/table/tbody/tr/td[2]/div/div[1]/div[3]/form/div[3]/div[1]/div/div[2]/div[2]/div/table/tbody/tr[2]/td[1]"));
		   System.out.println("##########Expected-Result###");
		   System.out.println(ExpVal);
		   System.out.println("###########################");
		    
		    //Capture the Expected//
			  GeneralFunctions.screenShot("MA10851_Dashboard_Top_UP_Volume.png");
}

	@Given("^MAGIC user navigates to Volumes Screen$")
	public void magic_user_navigates_to_Volumes_Screen() throws Throwable {
	  
		 //Click on Volumes link//
		GeneralFunctions.waittime();
			 bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
			  if (bStatus) {
		          System.out.println("Volumes-Pass");
		      } 
			  else {
		          System.out.println("Volumes-Fail");
		      }
}

	@Then("^Top Up volume is visible$")
	public void top_Up_volume_is_visible() throws Throwable {
	    
		GeneralFunctions.waittime();
		String Vol_Top_Up=GeneralFunctions.getText(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[6]/form/div[2]/div[2]/table/tbody/tr[3]/td[2]/span"));
		 System.out.println("##########Expected-Result###");
		System.out.println(Vol_Top_Up);
		 System.out.println("##########t#################");
	    
	    //Capture the Expected//
		  GeneralFunctions.screenShot("MA10851_Top_UP_Volume.png");
	}

	@Then("^Close Volumes Screen$")
	public void close_Volumes_Screen() throws Throwable {
	    
		bStatus = GeneralFunctions.close();
        if (bStatus) {
             System.out.println("MAGIC Closed-Pass");
         } else {
             System.out.println("Close MAGIC-Fail");
         }
}
}



