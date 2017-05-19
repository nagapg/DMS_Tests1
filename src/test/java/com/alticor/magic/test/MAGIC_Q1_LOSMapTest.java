package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MAGIC_Q1_LOSMapTest {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^User Selects LOS Map$")
	public void User_Selects_LOS_Map() throws Throwable{
		
		//Navigate to Server//
	      bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
	      //bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","chrome");//
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
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			                 

		//Reports//
		bStatus=GeneralFunctions.clickElement(By.xpath(".//[@id='topMenu']/div/a[4]")); 
		  if(bStatus){
	        	System.out.println("Click on Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on Reports");
	        }
		    
		 //Reports-->ABO Reports//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[2]/span[1]"));
	        if(bStatus){
			System.out.println("Click on ABO Reports");
	        }	
	        else{
	        	System.out.println("Cannot Click on ABO Reports");
	        }
	        
	         //Reports-->ABO Reports-->Line Of Spon Maps Rpts//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Line of Sponsorship Maps"));   
	       if(bStatus){
			System.out.println("Click on Line Of Spon Maps Rpts");
	       }	
	       else{
	       	System.out.println("Cannot Click on Line Of Spon Maps Rpts");
	       }
	       try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       }

@Then("^Navigated to LOS Map$")
public void Navigated_to_LOS_Map() throws Throwable{
	
	String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='searchBoxDiv']/div[1]"));
    System.out.println("##########Expected-Result########################");
	   System.out.println("The Output is:"  +ExpVal);
	   System.out.println("##############################################");
	   try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

@Then("^Close LOS Map$")
public void Close_LOS_Map() throws Throwable {
		
	bStatus = GeneralFunctions.close();
        if (bStatus) {
             System.out.println("MAGIC Closed");
         } else {
             System.out.println("Cannot Close MAGIC");
         }
}
}

