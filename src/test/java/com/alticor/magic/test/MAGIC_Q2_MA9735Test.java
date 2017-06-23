//Validate Expand All/Collapse All//

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9735Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^User navigates to Server and open FF browser$")
	public void User_navigates_to_Server_and_open_FF_browser() throws Throwable {
		
		//Navigate to Server//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
		//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");//
			if (bStatus) {
			    System.out.println("Server Firefox-Pass");
			     } else {
			     System.out.println("Server Firefox-Fail");
			     }
					}

	@Given("^Opens MAGIC QA$")
	public void opens_MAGIC_QA() throws Throwable {
		
		//Navigate to MAGIC-QA//
		 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
		  if (bStatus) {
		    System.out.println("MAGIC_QA-Pass");
		    } else {
		    System.out.println("MAGIC_QA-Fail");
		    }
		   // com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
		   
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
}

	@When("^\"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" entered$")
	public void entered(String aff, String abo, String per) throws Throwable {
		
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

		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			  //Enter Abo//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),abo);
		  if (bStatus) {
		System.out.println("ABO-Pass");
		} else {
		System.out.println("ABO-Fail");
		}
		  
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			   //Enter Period//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),per);
		               if(bStatus){
		System.out.println("Period-Pass");
		}         
		else{
		System.out.println("Period-Fail");
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
		        System.out.println("Submit-Pass");
		    } else {
		        System.out.println("Submit-Fail");
		    }
}

	@When("^navigates to Region Security Screen$")
	public void navigates_to_Region_Security_Screen() throws Throwable {
		
		  try {
 				Thread.sleep(3000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}

		 //Maintenance//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
		if(bStatus){
        	System.out.println("Maintanence-Pass");
        	}	
        else{
        	System.out.println("Maintanence-Fail ");
        }
   		
     //Maintenance-->Admin//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu2']/a[1]/span[1]"));
		if(bStatus){
        	System.out.println("Admin-Pass");
        }	
        else{
        	System.out.println("Admin-Fail");
        }
		
		 //Maintenance-->Admin-->Region Security//
		bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='SubMenu2_1']/a[2]/span[1]"));
        if(bStatus){
		System.out.println("Region Security-Pass");
        }	
        else{
        	System.out.println("Region Security-Fail");
        }
		
        //Maintenance-->Admin-->Region Security-->Region Security//
        bStatus=GeneralFunctions.clickElement(By.linkText("Region Security"));   
        if(bStatus){
		System.out.println("Region Security-Pass");
        }	
        else{
        	System.out.println("Region Security-Pass");
        }
        }

	@Then("^Validate Expand All and Collapse All$")
	public void validate_Expand_All_and_Collapse_All() throws Throwable {
		
		  try {
 				Thread.sleep(3000);
 			} catch (InterruptedException e) {
 				// TODO Auto-generated catch block
 				e.printStackTrace();
 			}

		//Validating Hierarchy View//
        bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='expandRegionSecurityScreen']/div[1]/img"));   
       if(bStatus){
		System.out.println("Region Enabled UI Screen-Pass");
       }	
       else{
       	System.out.println("Region Enabled UI Screen-Fail");
       }
       
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blsock
			e.printStackTrace();
		}
       
       //Validating Expand All//
       try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='expandAll']"));   
       if(bStatus){
		System.out.println("Expand All-Pass");
       }	
       else{
       	System.out.println("Expand All-Fail");
       }
       
       try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch blsock
			e.printStackTrace();
		}
       
       //Click on any link//
       try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

      bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='rs_33']"));   
       if(bStatus){
		System.out.println("Clicked Link-Pass");
       }	
       else{
       	System.out.println("Clicked Link-Fail");
       }
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       //validating Collapse all//
        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='collapseAll']"));   
       if(bStatus){
		System.out.println("Collapse All-Pass");
       }	
       else{
       	System.out.println("Collapse All-Fail");
       }
       }

	@Then("^Close Region Security Screen$")
	public void close_Region_Security_Screen() throws Throwable {
		
			   bStatus = GeneralFunctions.close();
		        if (bStatus) {
		             System.out.println("MAGIC Closed-Pass");
		         } else {
		             System.out.println("Close MAGIC-Fail");
		         }
		}
		}