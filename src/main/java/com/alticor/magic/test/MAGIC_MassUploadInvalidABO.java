package com.alticor.magic.test;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class MAGIC_MassUploadInvalidABO {

	/** Init variables */
    boolean bStatus=false;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_MassUploadInvalidABO");
		bStatus=GeneralFunctions.openChormeBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
		}

	
	  @AfterMethod
      public void tearDown() throws Exception {
	  Reports.endTest();
	   }
	
		@SuppressWarnings("unused")
		@Test
		public void test() {
			
			
			//Processing//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
			        if(bStatus){
			        	System.out.println("Processing-Pass");
			        }	
			        else{
			        	System.out.println("Processing-Fail");
			        }
					
				
					//Processing-->Mass Upload Adj//
					bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='SubMenu3']/a[7]"));
					
			        if(bStatus){
			        	System.out.println("Mass Upload Adj-Pass");
			        }	
			        else{
			        	System.out.println("Mass Upload Adj-Fail");
			        }
			        
					
			       
			      // bStatus=GeneralFunctions.fileUpload(By.id("uploadFile"),"C:\\Users\\aiudde2\\Desktop\\Data.csv");\\
			        bStatus=GeneralFunctions.fileUpload(By.id("uploadFile"),System.getProperty("user.dir")+"\\"+"drivers\\Data.csv");
					if(bStatus){
			        	System.out.println("Upload file-Pass");
			        }	
			        else{
			        	System.out.println("Upload File-Fail");
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
			        	System.out.println("Submit-Pass");
			        }	
			        else{
			        	System.out.println("Submit-Fail");
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
					
					
					
			//Reporting//	
			if(bStatus){
				Reports.logResults(LogStatus.PASS,"Test Pass","MAGIC_MassUploadInvalidABO");
			}
			else
			{
				Reports.logResults(LogStatus.FAIL,"Test Fail","MAGIC_MassUploadInvalidABO");
			}
			
			com.alticor.magic.GeneralFunctions.close();
			
			
			}

		}







