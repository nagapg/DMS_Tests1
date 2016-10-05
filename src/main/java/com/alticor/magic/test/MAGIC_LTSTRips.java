package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class MAGIC_LTSTRips {

	/** Init variables */
	
	List<String> sPeriod=null;
    boolean bStatus=false;
	
	@Before
	public void setUp() throws Exception {
    	Reports.setTestCaseName("MA 5744");
    	bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("browser launched sucessfully");
        }	
        else{
        	System.out.println("unable to launch browser");
        }
		sPeriod=new ArrayList<String>();
		sPeriod.add("082015");
		sPeriod.add("082016");
		}	  
	
	@After
	 public void tearDown() throws Exception {
		 Reports.endTest();
	 }
	
	  
	
	  @Test
	  public void test() {
			for(String sPeriod:sPeriod){
			GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Entered AFF");
	        }	
	        else{
	        	System.out.println("Unable to enter AFF");
	        }
			
	      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "670");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Unable to enter Abo");
	        }

			
			GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),sPeriod);
			if(bStatus){
	        	System.out.println("Enter Period");
	        }	
	        else{
	        	System.out.println("Cannot enter Period");
	        }
			
			GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on Submit");
	        }	
	        else{
	        	System.out.println("Canot Click on Submit");
	        }
			
	        //Inquiry//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			if(bStatus){
	        	System.out.println("Clicked on Inqiry");
	        }	
	        else{
	        	System.out.println("Cannot Click on Inquiry");
	        }
			
			//Inquiry-->GIP//
			GeneralFunctions.clickElement(By.xpath("//span[text()='GIP']"));
			if(bStatus){
	        	System.out.println("Click on GIP");
	        }	
	        else{
	        	System.out.println("Cannot Click on GIP");
	        }
			
			//Inquiry-->GIP-->LTS//
			bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
	        if(bStatus){
			System.out.println("Clicked on LTS");
	        }	
	        else{
	        	System.out.println("Cannot Click on LTS");
	        }
			
			//Test Case:Validating LTS Trips//
			String sTripNum=GeneralFunctions.getText(By.xpath("//td[contains(text(),'Trip Number:')]/following-sibling::td"));
	        String sTargetNum=GeneralFunctions.getText(By.xpath("//td[contains(text(),'Target Number:')]/following-sibling::td"));
			
			switch(sPeriod.trim()){
			
			case "082015":
				bStatus=sTripNum.contains("0");
		        if(bStatus){
		    		System.out.println("sTripNum '0' validated successfully");
		            }	
		            else{
		            	System.out.println("unable to Capture sTripNum");
		            }
	 			
				 bStatus=sTargetNum.contains("1");
		        if(bStatus){
		    		System.out.println("sTargetNum '1' validated successfully");
		            }	
		            else{
		            	System.out.println("unable to Capture sTargetNum");
		            }
			      break;

			case "082016":
			bStatus=sTripNum.contains("1");
			        if(bStatus){
			    		System.out.println("sTripNum '1' validated successfully");
			            }	
			            else{
			            	System.out.println("unable to Capture sTripNum");
			            }
		 			
					 bStatus=sTargetNum.contains("2");
			        if(bStatus){
			    		System.out.println("sTargetNum '2' validated successfully");
			            }	
			            else{
			            	System.out.println("unable to Capture sTargetNum");
			            }
				      break;

		        }
				}
			
			com.alticor.magic.GeneralFunctions.close();
			
			//Test Results//
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","LTS Trips");
			}
			else{
				Reports.logResults(LogStatus.FAIL,"Test Fail","LTS Trips");
			}
			
		}
		}



