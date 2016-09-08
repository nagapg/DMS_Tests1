package com.alticor.magic.test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class MAGIC_LTSSymbols {

/** Init variables */
boolean bStatus=false;

@BeforeMethod
public void setUp() throws Exception {
	Reports.setTestCaseName("MA 5344");
	//Open Browser and launch application//
bStatus=GeneralFunctions.openIEBrowser("https://magic-lambda/EBS_UI_Web/Magic");
	if(bStatus){
    	System.out.println("browser launched sucessfully");
    }	
    else{
    	System.out.println("unable to launch browser");
    }
}
	
	@AfterMethod
	 public void tearDown() throws Exception {
		 Reports.endTest();
	 }
	
	
	@Test
	  public void test() {
			
		GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "430");
			if(bStatus){
	        	System.out.println("AFF-Pass");
	        }	
	        else{
	        	System.out.println("AFF-Fail");
	        }
			
	      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "22");
			if(bStatus){
	        	System.out.println("Abo-Pass");
	        }	
	        else{
	        	System.out.println("Abo-Fail");
	        }

			
			GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"082016");
			if(bStatus){
	        	System.out.println("Period-Pass");
	        }	
	        else{
	        	System.out.println("Period-Fail");
	        }
			
			GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Submit-Pass");
	        }	
	        else{
	        	System.out.println("Submit-Fail");
	        }
			
	        //Inquiry//
			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
			if(bStatus){
	        	System.out.println("Inqiry-Pass");
	        }	
	        else{
	        	System.out.println("Inquiry-Fail");
	        }
			
			//Inquiry-->GIP//
			GeneralFunctions.clickElement(By.xpath("//span[text()='GIP']"));
			if(bStatus){
	        	System.out.println("GIP-Pass");
	        }	
	        else{
	        	System.out.println("GIP-Fail");
	        }
			
			//Inquiry-->GIP-->LTS//
			bStatus=GeneralFunctions.clickElement(By.linkText("GIP/Events"));
	        if(bStatus){
			System.out.println("LTS-Pass");
	        }	
	        else{
	        	System.out.println("LTS-Fail");
	        }
	        
	        //Entering GIP:766//
	        bStatus=GeneralFunctions.enterTextToElement(By.id("gipCd"),"766");
			if(bStatus){
	        	System.out.println("Enter GIP:766");
	        }	
	        else{
	        	System.out.println("Cannot Enter GIP");
	        }
			
			 bStatus=GeneralFunctions.DropDown(By.id("bnsYear"),"2015");
			 if(bStatus){
		        	System.out.println("PY:Pass");
		        }	
		        else{
		        	System.out.println("PY:Fail");
		        }
				
			 //Wait after Selecting PY//
		         try {
		    		Thread.sleep(9000);
		    	} catch (InterruptedException e) {
		    		// TODO Auto-generated catch block
		    		e.printStackTrace();
		    	}
				
		         //Click on Go//
		         bStatus=GeneralFunctions.clickElement(By.id("goButton"));
				if(bStatus){
		        	System.out.println("Click on Go-Pass");
		        }	
		        else{
		        	System.out.println("Cannot click on Go-Fail");
		        }
				
				 //Wait after  Clicking Go button//
		         try {
		    		Thread.sleep(9000);
		    	} catch (InterruptedException e) {
		    		// TODO Auto-generated catch block
		    		e.printStackTrace();
		    	}

				//Validating that Approved,Tracking and Total are present//
				bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='pfbListTable']/thead/tr[2]/th[7]"));
				if(bStatus){
					System.out.println("Approved is visible");
			       }	
			       else{
			       	System.out.println("Approved is not visible");
			       }
				
				bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='pfbListTable']/thead/tr[2]/th[8]"));
				if(bStatus){
					System.out.println("Tracking is visible");
			       }	
			       else{
			       	System.out.println("Tracking is not visible");
			       }
	
              bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath(".//*[@id='pfbListTable']/thead/tr[2]/th[9]"));
				if(bStatus){
					System.out.println("Total is visible");
			       }	
			       else{
			       	System.out.println("Total is not visible");
			       }
	
				
				 //Wait//
		         try {
		    		Thread.sleep(9000);
		    	} catch (InterruptedException e) {
		    		// TODO Auto-generated catch block
		    		e.printStackTrace();
		    	}
		 
		         //Click on +//
		         GeneralFunctions.clickElement(By.id("iconCue0"));
					if(bStatus){
			        	System.out.println("+ Sysmbol-Clicked");
			        }	
			        else{
			        	System.out.println("+ Sysmbol-Not Clicked");
			        }
		         
					
					 //Wait after + Click//
			         try {
			    		Thread.sleep(9000);
			    	} catch (InterruptedException e) {
			    		// TODO Auto-generated catch block
			    		e.printStackTrace();
			    	}
			         
			         //Click on -//
			         GeneralFunctions.clickElement(By.id("iconCue0"));
						if(bStatus){
				        	System.out.println("-   Sysmbol-Clicked");
				        }	
				        else{
				        	System.out.println("-   Sysmbol-Not Clicked");
				        }
						
						//Reports//
						  if (bStatus) {
					           Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_LSSymbols");

					       } else {
					           Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_LSSymbols");
					       }
						  
						  //Close the browser//
					       com.alticor.magic.GeneralFunctions.close();


	}
	}