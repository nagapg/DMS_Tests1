/*Step 1>Go to MAGIC Data Load Screen
 * Click Run ILB Load
 * Expected:Capture Sucess message
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAIC_Q3_MA10850Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^MAGIC User goes to MAGIC Data Load Screen$")
	public void magic_User_goes_to_MAGIC_Data_Load_Screen() throws Throwable {
	
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
				 
				    
				    //Enter Aff//
	  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		  if (bStatus) {
		System.out.println("AFF-Pass");
		} else {
		System.out.println("AFF-Fail");
		}
		  
		  //Enter ABO//
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
		  
		        //Click on submit//
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
		     		 
		                 bStatus =GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='topMenu']/div/a[5]"));
		                 if (bStatus) {
		        System.out.println("Processing-Pass");
		    } else {
		        System.out.println("Processing-Fail");
		    }
		      
		               //Processing -->Admin Processing//
		                
		                 bStatus =GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu5']/a[1]/span[1]"));
		                 if (bStatus) {
		        System.out.println("Admin Processing-Pass");
		    } else {
		        System.out.println("Admin Processing-Fail");
		    }
		                 
		               //Processing -->Admin Processing -->Magic Data Loads//
		                 try {
		     				Thread.sleep(3000);
		     			} catch (InterruptedException e) {
		     				// TODO Auto-generated catch block
		     				e.printStackTrace();
		     			}
		     		 
		                 bStatus =GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("Magic Data Loads"));
		                 if (bStatus) {
		        System.out.println("Magic Data Loads-Pass");
		    } else {
		        System.out.println("Magic Data Loads-Fail");
		    }
		         	}

	@When("^Run ILB Load is clicked$")
	public void run_ILB_Load_is_clicked() throws Throwable {
			
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		
		//Click ILB button//
		 
		  bStatus =GeneralFunctions.clickElementByJavascriptExecutor(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[2]/div[2]/table/tbody/tr/td[4]/button"));
          if (bStatus) {
 System.out.println("ILB button-Pass");
} else {
 System.out.println("ILB button-Fail");
}
          try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
          //Accept//
		    GeneralFunctions.driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
}

	@Then("^Capture the Success message$")
	public void capture_the_Success_message() throws Throwable {
	
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	String mssg=GeneralFunctions.getText(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/div[3]/div[2]"));
	System.out.println("*******************Expected*******************");
	System.out.println(mssg);
	System.out.println("*********************************************");
	
	//Capture Screenshot//
	GeneralFunctions.screenShot("MA10850.png");
	}

	@Then("^Close MAGIC Data Load Screen$")
	public void Close_MAGIC_Data_Load_Screen() throws Throwable {

	bStatus = GeneralFunctions.close();
    if (bStatus) {
         System.out.println("MAGIC Closed-Pass");
     } else {
         System.out.println("Close MAGIC-Fail");
     }
}
}

