/*Step 1>Navigate to Invoice Inquiry
 * Step 2>Validate Orange Links
 */
package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9741Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^Goto Invoice Inquiry$")
	public void Goto_Invoice_Inquiry() throws Throwable {
		
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
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"670");
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
		               bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
		                 if (bStatus) {
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }
		              
				//Click on Payment Inquiry//
		                 try {
								Thread.sleep(3000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
				if(bStatus){
		        	System.out.println("Payment Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Payment Inquiry-Fail");
		        }
				
				//Payment Inquiry-->Invoice Inquiry//
				  try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
				if(bStatus){
		        	System.out.println("Invoice Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Invoice Inquiry-Fail");
		        }
				}

	@When("^Click Orange Link$")
	public void click_Orange_Link() throws Throwable {
		
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
		if(bStatus){
        	System.out.println("Orange Link-Pass");
        }	
        else{
        	System.out.println("Orange Link-Fail");
        }
		}

	@When("^Click Amount$")
	public void click_Amount() throws Throwable {
		
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		//Validating the Expected//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[4]/span/b"));
		if(bStatus){
        	System.out.println("Amount Details-Pass");
        }	
        else{
        	System.out.println("Amount Details-Fail");
        }
		}

	@Then("^Bonus amount displays$")
	public void bonus_amount_displays() throws Throwable {
		
		  //Capture the screen//
		bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div"));
			if(bStatus){
			System.out.println("Values present-Pass");
 }
  else{
 System.out.println("Values  present-Fail");
}
}

	@Then("^Click Cross$")
	public void Click_Cross() throws Throwable {
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
		if(bStatus){
        	System.out.println("Click on Cross-Pass");
        }	
        else{
        	System.out.println("Click on Cross-Fail");
        }
		}

	@Then("^Click back$")
	public void Click_back() throws Throwable {
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[13]/td[2]/button"));
		if(bStatus){
        	System.out.println("Back-Pass");
        }	
        else{
        	System.out.println("Back-Fail");
        }
		}

	@Then("^Close Invoice Inquiry Screen$")
	public void  Close_Invoice_Inquiry_Screen() throws Throwable {
	  
	  	bStatus = GeneralFunctions.close();
	      if (bStatus) {
	           System.out.println("MAGIC Closed-Pass");
	       } else {
	           System.out.println("Close MAGIC-Fail");
	       }
	}
	}












