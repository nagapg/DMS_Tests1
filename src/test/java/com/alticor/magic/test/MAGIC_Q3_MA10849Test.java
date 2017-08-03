/*Step 1>Go to Bank Search Screen
 * Step 2>Add New bank
 * Step 3>Enter Postal Code
 * Expected 1:Postal Code is accepted
 * Step 4>Add new bank 
 * Step 5>Do not enter Postal Code
 * Expected 2:Blank Postal code field accepted
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q3_MA10849Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^MAGIC User goes to Bank Search Screen$")
	public void magic_User_goes_to_Bank_Search_Screen() throws Throwable {
	 
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
                   bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
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
		                 
		               //Maintanence//
		                 GeneralFunctions.waittime();
		                 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
		              	if(bStatus){
		               	System.out.println("Maintanence-Pass");
		               	}	
		               else{
		               	System.out.println("Maintanence-Fail");
		               }
		              	
		                 //Maintanence>Bank//
		              	 GeneralFunctions.waittime();
		              	bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu2']/a[2]/span[1]"));
		              	if(bStatus){
		                	System.out.println("Bank-Pass");
		                	}	
		                else{
		                	System.out.println("Bank-Fail");
		                }
		                 
		                 //Maintanence>Bank >Bank Search//
		              	 GeneralFunctions.waittime();
		              	bStatus=GeneralFunctions.clickElement(By.linkText("Bank Search"));   
		                  if(bStatus){
		              		System.out.println("Bank Search-Pass");
		                  }	
		                  else{
		                  	System.out.println("Bank Search-Fail");
		                  }
   }

	@When("^Postal code added$")
	public void postal_code_added() throws Throwable {
		
		 //Enter Country//
		 GeneralFunctions.waittime();
	    bStatus =GeneralFunctions.enterTextToElement(By.id("countryCd"),"010");
	    if (bStatus) {
	   System.out.println("Country-Pass");
	   } else {
	  System.out.println("Country-Fail");
	  }
	    
	    //Enter ABA/Swfit//
	    GeneralFunctions.waittime();
	    bStatus =GeneralFunctions.enterTextToElement(By.name("abaSwiftNumIN"),"PCBC");
	    if (bStatus) {
	   System.out.println("ABA/Swfit-Pass");
	   } else {
	  System.out.println("ABA/Swfit-Fail");
	  }
	    
	    //Click Search//
	    GeneralFunctions.waittime();
	    bStatus =GeneralFunctions.clickElement(By.name("searchBankResultsButton"));
	    if (bStatus) {
	   System.out.println("Search-Pass");
	   } else {
	   System.out.println("Search-Fail");
	  }
	    
	    //Click Add//
	    GeneralFunctions.waittime();
	    bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='addBankInfoButton']/i"));
	    if (bStatus) {
	   System.out.println("Add-Pass");
	   } else {
	   System.out.println("Add-Fail");
	  }
		
	  //Enter Bank Name//
	    GeneralFunctions.waittime();
	bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[3]/td[2]/input"),"Test3");
	   if (bStatus) {
	    System.out.println("Bank Name-Pass");
	  } 
	        else {
	 System.out.println("Bank Name-Fail");
	}
	        
	        //Enter Add 1//
	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[5]/td[2]/input"),"Ada");
	    	  if (bStatus) {
	    	    System.out.println("Add 1-Pass");
	    	  } 
	    	        else {
	    	 System.out.println("Add 1-Fail");
	    	}
	    	        
	               //Enter City//
	    	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[10]/td[2]/input"),"GR");
	    	       if (bStatus) {
	    	    	    System.out.println("City-Pass");
	    	    	  } 
	    	    else {
	    	    	 System.out.println("City-Fail");
	    	    	}
	    	    	        
	                      //Enter State//
	    	    	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[11]/td[2]/input"),"mi");
	    	    	    	  if (bStatus) {
	    	    	    	    System.out.println("State-Pass");
	    	    	    	  } 
	    	    	    	        else {
	    	    	    	 System.out.println("State-Fail");
	    	    	    	}
	    	    	    	        
	                               //Enter Postal code//
	    	    	    	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[12]/td[2]/input"),"1234");
	    	    	    	    	GeneralFunctions.screenShot("MA10849_PostalCode_Entered.png");
	    	    	    	        if (bStatus) {
	    	    	    	    	    System.out.println("Postal code-Pass");
	    	    	    	    	  } 
	    	    	    	    	        else {
	    	    	    	    	 System.out.println("Postal code-Fail");
	    	    	    	    	}
	    	    	    	    	        
	    	    	    	    	        //Click Apply//
	    	    	    	        GeneralFunctions.waittime();
	    	    	    	    	 bStatus =GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='applyBankInfoButton']"));
	    	    	    	    		    if (bStatus) {
	    	    	    	    		   System.out.println("Apply-Pass");
	    	    	    	    		   } else {
	    	    	    	    		   System.out.println("Apply-Fail");
	    	    	    	    		  }
	    	    	    	    		    
	    	    	    	    		    //Accept//
	    	    	    	    		    GeneralFunctions.driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	                                     }

	@Then("^Add is successful$")
	public void add_is_successful() throws Throwable {
	 
		//Click Delete//
		bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='deleteBankInfoButton']/i"));
		if (bStatus) {
	   System.out.println("Delete Bank-Pass");
	   } else {
	   System.out.println("Delete  Bank-Fail");
	  }
}

	@Given("^user is in Bank Search Screen$")
	public void user_is_in_Bank_Search_Screen() throws Throwable {
	  
		//Capture the Title//
		String Title=GeneralFunctions.getTitle(By.xpath(".//*[@id='mapTable']/tbody/tr/td[3]"));
		System.out.println(Title);
		}

	@When("^Postal code is removed$")
	public void postal_code_is_removed() throws Throwable {
	    
		 //Click Add//
		 GeneralFunctions.waittime();
	    bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='addBankInfoButton']/i"));
	    if (bStatus) {
	   System.out.println("Add-Pass");
	   } else {
	   System.out.println("Add-Fail");
	  }
		
	  //Enter Bank Name//
	    GeneralFunctions.waittime();
	    bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[3]/td[2]/input"),"Test4");
	if (bStatus) {
	    System.out.println("Bank Name-Pass");
	  } 
	        else {
	 System.out.println("Bank Name-Fail");
	}
	        
	        //Enter Add 1//
	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[5]/td[2]/input"),"Ada");
	    	     if (bStatus) {
	    	    System.out.println("Add 1-Pass");
	    	  } 
	    	        else {
	    	 System.out.println("Add 1-Fail");
	    	}
	    	        
	               //Enter City//
	    	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[10]/td[2]/input"),"GR");
	    	        if (bStatus) {
	    	    	    System.out.println("City-Pass");
	    	    	  } 
	    	    	        else {
	    	    	 System.out.println("City-Fail");
	    	    	}
	    	    	        
	               //Enter State//
	    	    	        bStatus =GeneralFunctions.enterTextToElement(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[11]/td[2]/input"),"mi");
	    	    	    	  if (bStatus) {
	    	    	    	    System.out.println("State-Pass");
	    	    	    	  } 
	    	    	    	        else {
	    	    	    	 System.out.println("State-Fail");
	    	    	    	}
	
	    	    	    	        //Clear Postal code//
	    	    	    	        bStatus =GeneralFunctions.ClearField(By.xpath("html/body/div[3]/table/tbody/tr/td[2]/div/div[1]/div[3]/form[3]/div[2]/table/tbody/tr[12]/td[2]/input"));
	    	    	    	        GeneralFunctions.screenShot("MA10849_blank_PostalCode.png");
	    	    	    	          if (bStatus) {
	    	    	    	    	    System.out.println("Clear Postal code-Pass");
	    	    	    	    	  } 
	    	    	    	    	        else {
	    	    	    	    	 System.out.println("Clear Postal Code-Fail");
	    	    	    	    	}
	    	
	    	    	    	      //Click Apply//
	    	    	    	          GeneralFunctions.waittime();
	    	    	    	          bStatus =GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='applyBankInfoButton']"));
	    	    	    		    if (bStatus) {
	    	    	    		   System.out.println("Apply-Pass");
	    	    	    		   } else {
	    	    	    		   System.out.println("Apply-Fail");
	    	    	    		  }
	    	    	    		    
	    	    	    		    //Accept//
	    	    	    		    GeneralFunctions.driver.switchTo().activeElement().sendKeys(Keys.ENTER);
	    	    	    		}

	@Then("^remove is successful$")
	public void remove_is_successful() throws Throwable {
	   
			//Click Delete//
			bStatus =GeneralFunctions.clickElement(By.xpath("//*[@id='deleteBankInfoButton']/i"));
			if (bStatus) {
		   System.out.println("Delete Bank-Pass");
		   } else {
		   System.out.println("Delete  Bank-Fail");
		  }
}

	@Then("^Close Bank Search Screen$")
	public void close_Bank_Search_Screen() throws Throwable {
	   
		bStatus = GeneralFunctions.close();
        if (bStatus) {
             System.out.println("Close Bank Search Screen-Pass");
         } else {
             System.out.println("Close Bank Search Screen-Fail");
         }
}
}


