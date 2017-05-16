package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9741Test {
	
	/** Declare variables */
	boolean bStatus;
	
	@Given("^User is in Invoice Inquiry Screen$")
	public void User_is_in_Invoice_Inquiry_Screen() throws Throwable {
		
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

	@When("^Click on Orange Link$")
	public void click_on_Orange_Link() throws Throwable {
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

	@When("^Click on Amount$")
	public void click_on_Amount() throws Throwable {
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

	@Then("^Bonus amount displays$")
	public void bonus_amount_displays() throws Throwable {
		
		  //Capture the screen//
		bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div"));
			if(bStatus){
			System.out.println("Values present");
 }
  else{
 System.out.println("Values not present");
}
		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }

	@Then("^Click on Cross to close$")
	public void click_on_Cross_to_close() throws Throwable {
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='div0']/table/tbody/tr[1]/td/table/tbody/tr/td[2]/img"));
		if(bStatus){
        	System.out.println("Clicked on Cross");
        }	
        else{
        	System.out.println("Cannot Click on Cross");
        }
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }

	@Then("^Click on back button$")
	public void click_on_back_button() throws Throwable {
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[13]/td[2]/button"));
		if(bStatus){
        	System.out.println("Clicked on back");
        }	
        else{
        	System.out.println("Cannot Click on Back");
        }
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^Close Invoice Screen$")
	public void Close_Invoice_Screen() throws Throwable {
		bStatus = GeneralFunctions.close();
          if (bStatus) {
               System.out.println("MAGIC Closed");
           } else {
               System.out.println("Cannot Close MAGIC");
           }
  }
}







