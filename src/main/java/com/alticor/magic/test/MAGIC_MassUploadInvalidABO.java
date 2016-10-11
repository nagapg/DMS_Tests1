package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.test.pages.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class MAGIC_MassUploadInvalidABO {

	/** Init variables */
    boolean bStatus=false;
	
	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_MassUploadInvalidABO");
		bStatus=GeneralFunctions.openChormeBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Navigated to beta");
        }	
        else{
        	System.out.println("Cannot navigate to beta");
        }
		}

	
	  @After
      public void tearDown() throws Exception {
		  Reports.endTest();
	   }
	
		@SuppressWarnings("unused")
		@Test
		public void test() {
			
			
			//Processing//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
			        if(bStatus){
			        	System.out.println("Click on Processing");
			        }	
			        else{
			        	System.out.println("Cannot Click on Processing");
			        }
					
				
					//Processing-->Mass Upload Adj//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='SubMenu3']/a[7]"));
					if(bStatus){
			        	System.out.println("Click on Mass Upload Adj");
			        }	
			        else{
			        	System.out.println("Cannot Click on Mass Upload Adj");
			        }
			        
					bStatus=GeneralFunctions.fileUpload(By.id("uploadFile"),System.getProperty("user.dir")+"\\"+"drivers\\Data.csv");
					if(bStatus){
			        	System.out.println("Uploaded file");
			        }	
			        else{
			        	System.out.println("Cannot Upload File");
			        }
					
					try {
			    		Thread.sleep(9000);
			    	} catch (InterruptedException e) {
			    		// TODO Auto-generated catch block
			    		e.printStackTrace();
			    	}
					
					//click submit//
					bStatus=GeneralFunctions.clickElement(By.name("submitButton"));
					if(bStatus){
			        	System.out.println("Clicked on Submit");
			        }	
			        else{
			        	System.out.println("Cannot Click on Submit");
			        }
					
				//Validations//
					List<WebElement> failedList=GeneralFunctions.getElemetList(By.xpath("//table[@id='messageTable']/tbody/tr/td/div/font/font"));
						
					for(WebElement list:failedList){
						if(bStatus){
				        	System.out.println("Failed Record details are:");
				        }	
				        else{
				        	System.out.println("No Failed Record details");
				        }
						
						System.out.println(list.getText());
						boolean bStatus=list.getText().trim().equalsIgnoreCase("Invalid ABO Number");
					}	
					
					
					com.alticor.magic.GeneralFunctions.close();
					
			//Test Results//	
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","MAGIC_MassUploadInvalidABO");
			}
			else
			{
				Reports.logResults(LogStatus.FAIL,"Test Fail","MAGIC_MassUploadInvalidABO");
			}
			
		
			
			
			}

		}







