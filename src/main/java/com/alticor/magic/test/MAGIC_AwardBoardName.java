/*Open IE 11 and navigate to beta
 * Enter Aff:010/Abo:670 and Click on submit
 * Go to Maintenance-->Award Board
 * Scenario 1>Check the Check box and do not change name Expected:Capture the text
 * Scenario 2>Check the Check box and change the name Expected:Capture the text
 * Scenario 3>Change the name only Expected:Capture the text
 * Scenario 4>Do not change anything Expected:message pops up */

package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class MAGIC_AwardBoardName {
	
	/** Init variables */
	  boolean bStatus=false;
	  final private String sExpNote="Test Note";
	  
	  @Before
		public void setUp() throws Exception {
			Reports.setTestCaseName("MAGIC_AwardBoardName ");
			bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
			if(bStatus){
	      	System.out.println("Navigated to beta");
	      }	
	      else{
	      	System.out.println("Cannot Navigate to beta");
	      }
			}
	  
	  @After
	  public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	  
	  @Test
	  public void test() {
			bStatus= GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
			if(bStatus){
	        	System.out.println("Entered Aff");
	        }	
	        else{
	        	System.out.println("Cannot Enter Aff");
	        }
			
			bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "670");
			if(bStatus){
	        	System.out.println("Entered Abo");
	        }	
	        else{
	        	System.out.println("Cannot Enter Abo");
	        }
			
			bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
			if(bStatus){
	        	System.out.println("Clicked on Submit");
	        }	
	        else{
	        	System.out.println("Cannot Click on Submit");
	        }
		
			//Maintenance//
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
			if(bStatus){
	        	System.out.println("Clicked on Maintanence");
	        	}	
	        else{
	        	System.out.println("Cannot Click on Maintanence");
	        }
			
			//Maintenance-->Award Board//
			bStatus=GeneralFunctions.clickElement(By.linkText("Award Board"));   
		       if(bStatus){
				System.out.println("Clicked on Award Board");
		       }	
		       else{
		       	System.out.println("Cannot Click on Award Board");
		       }
		       
		       //Validating Scenario 1//
		       bStatus=GeneralFunctions.clickElement(By.id("display"));
		        if(bStatus){
		        	System.out.println("Check the Checkbox");
		        }	
		        else{
		        	System.out.println("Cannot Check the Checkbox");
		        }
		         
		     //Capture the name//
		        String val1=GeneralFunctions.getText(By.xpath(".//*[@id='commonName']"));
		        		System.out.println("Display name is present   "  +  val1);
		        		
		        		 bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		 		        if(bStatus){
		 		 		System.out.println("Select Reason Code");
		 		        }	
		 		        else{
		 		        	System.out.println("Cannot Select Reason Code");
		 		        }
		 		        
		        		bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
				        if(bStatus){
				    		System.out.println("Click on Notes");
				           }	
				           else{
				           	System.out.println("Cannot Click on Notes");
				           }
				        
				        bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
				        if(bStatus){
				    		System.out.println("Entered Notes");
				           }	
				           else{
				           	System.out.println("Cannot Enter Notes");
				           }
				        
				        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
				        if(bStatus){
				    		System.out.println("Clicked on Save");
				           }	
				           else{
				           	System.out.println("Cannot Click on Save");
				           }
				        
				        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
				        if(bStatus){
				    		System.out.println("Clicked on Update");
				           }	
				           else{
				           	System.out.println("Cannot Click on Update");
				           }
				        
	              //Capture Expected 1//
				        String exp1=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
		        		System.out.println("Expected 1 is   "  +  exp1);

		        	 //Validating Scenario 2//
		        		bStatus=GeneralFunctions.enterTextToElement(By.id("commonName"),"Test1");
				        if(bStatus){
				    		System.out.println("Enter Name");
				           }	
				           else{
				           	System.out.println("Cannot Enter Name");
				           }	
				        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		 		        if(bStatus){
		 		 		System.out.println("Select Reason Code");
		 		        }	
		 		        else{
		 		        	System.out.println("Cannot Select Reason Code");
		 		        }
		 		        
		        		bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
				        if(bStatus){
				    		System.out.println("Click on Notes");
				           }	
				           else{
				           	System.out.println("Cannot Click on Notes");
				           }
				        
				        bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
				        if(bStatus){
				    		System.out.println("Entered Notes");
				           }	
				           else{
				           	System.out.println("Cannot Enter Notes");
				           }
				        
				        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
				        if(bStatus){
				    		System.out.println("Clicked on Save");
				           }	
				           else{
				           	System.out.println("Cannot Click on Save");
				           }
				        
				        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
				        if(bStatus){
				    		System.out.println("Clicked on Update");
				           }	
				           else{
				           	System.out.println("Cannot Click on Update");
				           }
				        
				        //Capture Expected 2//
				        String exp2=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
		        		System.out.println("Expected 2 is   "  +  exp2);
		        		
		        		//Validating Scenario 3//
		        		bStatus=GeneralFunctions.enterTextToElement(By.id("commonName"),"Test3");
				        if(bStatus){
				    		System.out.println("Enter Name");
				           }	
				           else{
				           	System.out.println("Cannot Enter Name");
				           }	
				        
				        //Uncheck the check box//
				        bStatus=GeneralFunctions.clickElement(By.id("display"));
				        if(bStatus){
				        	System.out.println("Check the Checkbox");
				        }	
				        else{
				        	System.out.println("Cannot Check the Checkbox");
				        }
				        
				        bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
		 		        if(bStatus){
		 		 		System.out.println("Select Reason Code");
		 		        }	
		 		        else{
		 		        	System.out.println("Cannot Select Reason Code");
		 		        }
		 		        
		        	
		        		bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
				        if(bStatus){
				    		System.out.println("Click on Notes");
				           }	
				           else{
				           	System.out.println("Cannot Click on Notes");
				           }
				        
				        
				       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
				        if(bStatus){
				    		System.out.println("Entered Notes");
				           }	
				           else{
				           	System.out.println("Cannot Enter Notes");
				           }
				        
				        
				        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
				        if(bStatus){
				    		System.out.println("Clicked on Save");
				           }	
				           else{
				           	System.out.println("Cannot Click on Save");
				           }
				        
				        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
				        if(bStatus){
				    		System.out.println("Clicked on Update");
				           }	
				           else{
				           	System.out.println("Cannot Click on Update");
				           }
				        
				        //Capture Expected 3//
				        String exp3=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
		        		System.out.println("Expected 3 is   "  +  exp3);
		        		
		        		
		        		//Validating Scenario 4//
		        		 bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Select Reason Code']"));
			 		        if(bStatus){
			 		 		System.out.println("Select Reason Code");
			 		        }	
			 		        else{
			 		        	System.out.println("Cannot Select Reason Code");
			 		        }
			 		        
			        	bStatus= GeneralFunctions.clickElement(By.xpath("//div[@id='reasonCodeList']/table/tbody/tr/td"));
					        if(bStatus){
					    		System.out.println("Click on Notes");
					           }	
					           else{
					           	System.out.println("Cannot Click on Notes");
					           }
					        
					       bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
					        if(bStatus){
					    		System.out.println("Entered Notes");
					           }	
					           else{
					           	System.out.println("Cannot Enter Notes");
					           }
					        
					         bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
					        if(bStatus){
					    		System.out.println("Clicked on Save");
					           }	
					           else{
					           	System.out.println("Cannot Click on Save");
					           }
					        
					        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
					        if(bStatus){
					    		System.out.println("Clicked on Update");
					           }	
					           else{
					           	System.out.println("Cannot Click on Update");
					           }
					        
					        //Validating the expected //
					       GeneralFunctions.driver.switchTo().alert().accept();
					       
					       com.alticor.magic.GeneralFunctions.close();
							
							//Test Reports//
							 if (bStatus) {
						            Reports.logResults(LogStatus.PASS, "Test Pass", "MAGIC_AwardBoardName");

						        } else {
						            Reports.logResults(LogStatus.FAIL, "Test Fail", "MAGIC_AwardBoardName");
						        }
					        	
					        }
	  }


