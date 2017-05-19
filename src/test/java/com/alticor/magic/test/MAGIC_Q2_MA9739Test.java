package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9739Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^User in Invoice Inquiry Screen$")
	public void User_in_Invoice_Inquiry_Screen() throws Throwable {
		//Navigate to Server//
		// bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");//
			bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");
			if (bStatus) {
		    System.out.println("Navigated to Server");
		     } else {
		     System.out.println("Cannot Navigate to Server");
		     }
			
			//Navigate to MAGIC-QA//
		 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
		    if (bStatus) {
		    System.out.println("Navigated to MAGIC");
		    } else {
		    System.out.println("Cannot Navigate to MAGIC");
		    }
		    
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		  com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();
		   
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    //Okta Login//
		  GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
		  GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
		  GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
			
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//Enter Aff//
		  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		  if (bStatus) {
		System.out.println("AFF entered");
		} else {
		System.out.println("Cannot enter AFF");
		}

		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			  //Enter Abo:9995//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
		  if (bStatus) {
		System.out.println("ABO entered");
		} else {
		System.out.println("Cannot enter ABO");
		}
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			   //Enter Period:052017//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"052017");
		               if(bStatus){
		System.out.println("Entered Period");
		}         
		else{
		System.out.println("Cannot Enter Period");
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
		        System.out.println("Click on Submit");
		    } else {
		        System.out.println("Cannot click on submit");
		    }

		                 try {
		     				Thread.sleep(3000);
		     			} catch (InterruptedException e) {
		     				// TODO Auto-generated catch block
		     				e.printStackTrace();
		     			}
		     		
		//Click on Payment Inquiry//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[3]"));
				if(bStatus){
		        	System.out.println("Clicked on Payment Inquiry");
		        }	
		        else{
		        	System.out.println("Cannot Click on Payment Inquiry");
		        }
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				//Payment Inquiry-->Invoice Inquiry//
				bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
				if(bStatus){
		        	System.out.println("Click on Invoice Inquiry");
		        }	
		        else{
		        	System.out.println("Cannot Click on Invoice Inquiry");
		        }
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}

@When("^Orange link is clicked$")
	public void orange_link_is_clicked() throws Throwable {
	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
	if(bStatus){
    	System.out.println("Clicked on Orange Link");
    }	
    else{
    	System.out.println("Cannot Click on Orange Link click");
    }
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	@Then("^view bonus amount details$")
	public void view_bonus_amount_details() throws Throwable {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Validating the Expected//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='viewTableDiv']/table/tbody/tr[2]/td[4]/span/b"));
		if(bStatus){
        	System.out.println("Amount Details are displayed");
        }	
        else{
        	System.out.println("Cannot display Amount Details");
        }
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	@Then("^Close browser$")
	public void close_browser() throws Throwable {
		bStatus = GeneralFunctions.close();
          if (bStatus) {
               System.out.println("Browser Closed");
           } else {
               System.out.println("Cannot Close Browser");
           }
  }
}





