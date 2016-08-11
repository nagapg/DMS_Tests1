
/*Given The user is looking at the LTS Screen for PY2015
When We are in the Current PY (using 2015 as an example) 
Then The Trip Number and Target Trip should not pick up that PY in the Trip Number
Given The user is looking at the LTS Screen for PY2016
When We are in the Next PY (using 2016 as an example) 
Then The Trip Number and Target Trip should include the trip count from the previous PY*/

package alticor.magic.test;
import java.util.ArrayList;
import java.util.List;

import alticor.magic.pages.Reports;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class LTSTrips {
	
	/** Init variables */
	List<String> sPeriod=null;
    boolean bStatus=false;
	
	
    @Before
	public void setUp() throws Exception {
    	Reports.setTestCaseName("MA 5744");
    	
    	//Open Browser an dlaunch application//
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
        	System.out.println("AFF-Pass");
        }	
        else{
        	System.out.println("AFF-Fail");
        }
		
      GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "670");
		if(bStatus){
        	System.out.println("Abo-Pass");
        }	
        else{
        	System.out.println("Abo-Fail");
        }

		
		GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),sPeriod);
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
		bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
        if(bStatus){
		System.out.println("LTS-Pass");
        }	
        else{
        	System.out.println("LTS-Fail");
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
		if(bStatus){
			Reports.logResults(LogStatus.PASS,"Test Pass","LTS Trips");
		}
		else{
			Reports.logResults(LogStatus.FAIL,"Test Fail","LTS Trips");
		}
		com.alticor.magic.GeneralFunctions.close();
	}
	}



