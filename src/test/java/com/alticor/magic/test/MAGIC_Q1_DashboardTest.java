package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_DashboardTest {
	
	/** Declare variables */
	boolean bStatus;
	
@Given("^User navigates to Dashboard$")
	public void User_navigates_to_Dashboard() throws Throwable{
	
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
		  //	com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
		   
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

		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			  //Enter Abo//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"5166282");
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
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062017");
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
         try {
		     				Thread.sleep(3000);
		     			} catch (InterruptedException e) {
		     				// TODO Auto-generated catch block
		     				e.printStackTrace();
		     			}
		                 }
		     		

	@Then("^Navigated to Dashboard$")
    public void Navigated_to_Dashboard() throws Throwable{
		
		//Validating the Expected//

	       //String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id(\"ABOInfo\")/x:table/x:tbody/x:tr[2]/x:td[2]"));//
		String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='iboDashboard_collapsibleAboInformation']/div[1]"));
	       System.out.println("##########Expected-Result########################");
		   System.out.println("The Output is:"  +ExpVal);
		   System.out.println("###############################################");
		   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	@Then("^Close Dashboard Screen")
	  public void Close_Dashboard_Screen() throws Throwable {
	  		
	  	bStatus = GeneralFunctions.close();
	          if (bStatus) {
	               System.out.println("MAGIC Closed-Pass");
	           } else {
	               System.out.println("Close MAGIC-Fail");
	           }
	  }
}


