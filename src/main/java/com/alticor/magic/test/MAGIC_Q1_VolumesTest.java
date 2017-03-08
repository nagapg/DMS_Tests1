//Expected:Navigate to  MAGIC Volumes Screen//

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

 public class MAGIC_Q1_VolumesTest {
 /** Declare variables */
	    private boolean bStatus=false;
	    
	    @Before public void setUp() throws Exception {
	        Reports.setTestCaseName("MAGIC_Q1_VolumesTest ");
	        //Open Browser and Navigate to Gamma//
	       bStatus = GeneralFunctions.openIEBrowser("https://magic-gamma/EBS_UI_Web/Magic");
	    if (bStatus) {
	            System.out.println("Navigated to Environment");
	        } else {
	            System.out.println("Cannot navigate to Environment");
	        }
	    }
	  
		    @After public void afterTest() {
		        Reports.endTest();
		    }
		
		  
	@Test
	public void test() {
		
		//Enter Aff:010//
		  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
		  if (bStatus) {
	    System.out.println("AFF entered");
	     } else {
	    System.out.println("Cannot enter AFF");
	     }
		  
		//Enter Abo:9995//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
		  if (bStatus) {
	      System.out.println("ABO entered");
	     } else {
	      System.out.println("Cannot enter ABO");
	     }
		  
		  //Enter Period:012017//
		  bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"022017");
			if(bStatus){
	      	System.out.println("Entered Period");
	      }	
	      else{
	      	System.out.println("Cannot Enter Period");
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
			
			//Click on Volumes link//
		  bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='collapsibleQuickGlanceContent']/div[3]/a[2]"));
		 // bStatus =GeneralFunctions.clickElement(By.xpath(".//*[@id='quickglancediv']/div[2]/a[1]"));//
		  if (bStatus) {
	          System.out.println("Navigated to Volumes");
	      } 
		  else {
	          System.out.println("Cannot Navigate to Volumes");
	      }


			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  
			  //Validating the Expected//
		       String ExpVal=GeneralFunctions.getTitle(By.xpath(".//*[@id='IboBonusDtlBar']"));
			   System.out.println("The Output is:"  +ExpVal);
			  
		com.alticor.magic.GeneralFunctions.close();

				//Reports//
	          if (bStatus) {
		            Reports.logResults(LogStatus.PASS, "Test Pass", "VolumesTest");
               } 
			 else {
		            Reports.logResults(LogStatus.FAIL, "Test Fail", "VolumesTest");
		        } 
		   
	}
	}

		  
