package com.alticor.magic.test;
import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.alticor.magic.test.pages.Reports;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;


public class MAGIC_BatchProcessing {

boolean bStatus=false;
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		Reports.setTestCaseName("MAGIC_BatchProcessing");
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
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
			
		
			//Processing-->Batch Processing//
			bStatus=GeneralFunctions.clickElement(By.xpath("//span[text()='Batch Processing']"));
			
	        if(bStatus){
	        	System.out.println("Batch Processing-Pass");
	        }	
	        else{
	        	System.out.println("Batch Processing-Fail");
	        }
	        
	      //Maintenance-->Batch Processing-->Batch Search//
	        bStatus=GeneralFunctions.clickElement(By.linkText("Batch Search"));   
	       if(bStatus){
			System.out.println("Batch Search-Pass");
	       }	
	       else{
	       	System.out.println("Batch Search-Fail");
	       }
	        
	       //Enter Batch Search//
	       bStatus=GeneralFunctions.enterTextToElement(By.name("searchBatchNumber"),"35361");
			if(bStatus){
	        	System.out.println("Enter Batch Search Number-Pass");
	        }	
	        else{
	        	System.out.println("Enter Batch Search Number-Fail");
	        }

		//Click on search button//
			bStatus=GeneralFunctions.clickElement(By.id("viewButton"));   
		       if(bStatus){
				System.out.println("Search-Pass");
		       }	
		       else{
		       	System.out.println("Search-Fail");
		       }
		       
		      
		       bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("35361"));   
		       if(bStatus){
				System.out.println("Click on Batch Search-Pass");
		       }	
		       else{
		       	System.out.println("Click on Batch Search-Fail");
		       }

	  //Select any row//
		       try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		       GeneralFunctions.verifyVisibilityOFElement(By.id("batcTransList"));
		       List<WebElement> rows=GeneralFunctions.driver.findElement(By.xpath("//table[@id='batcTransList']/tbody")).findElements(By.tagName("tr"));
		       WebElement element= rows.get(1).findElements(By.tagName("td")).get(1);
		     //  GeneralFunctions.clickElementByJavascriptExecutor(element);
		       new Actions(GeneralFunctions.driver).moveToElement(element).doubleClick().build().perform();    
		      // bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='rowCounter_1']/td[2]"));   
		       if(bStatus){
				System.out.println("Click on row-Pass");
		       }	
		       else{
		       	System.out.println("Click on row-Fail");
		       }
 
              bStatus=GeneralFunctions.clickElement(By.id("EditButton"));
		    	  if(bStatus){
		          	System.out.println("Edit-Pass");
		          }	
		          else{
		          	System.out.println("Edit-Fail");
		          }
		  		
		    	  bStatus=GeneralFunctions.enterTextToElement(By.id("aboText"),"78514");
		    	  if(bStatus){
		          	System.out.println("Enter New ABO-Pass");
		          }	
		          else{
		          	System.out.println("Enter New ABO-Fail");
		          }
		    	  
		    	  bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Apply changes to Database']"));
		          if(bStatus){
		   		System.out.println("Save-Pass");
		          }	
		          else{
		          	System.out.println("Save-Fail");
		          }
		          
		          try {
			    		Thread.sleep(9000);
			    	} catch (InterruptedException e) {
			    		// TODO Auto-generated catch block
			    		e.printStackTrace();
			    	}
		         
		          System.out.println(GeneralFunctions.driver.switchTo().alert().getText());
		          
		         
		   
		          try {
			      		Thread.sleep(9000);
			      	} catch (InterruptedException e) {
			      		// TODO Auto-generated catch block
			      		e.printStackTrace();
			      	}
		   
		          
		            GeneralFunctions.driver.switchTo().alert().accept();
		         // System.out.println("Alert text is: " +driver.switchTo().alert().getText());//
		         // GeneralFunctions.driver.switchTo().alert().accept();//
		          
		       
		          
		          
		          
		          bStatus=GeneralFunctions.enterTextToElement(By.id("aboText"),"1");
		    	  if(bStatus){
		          	System.out.println("Enter New ABO-Pass");
		          }	
		          else{
		          	System.out.println("Enter New ABO-Fail");
		          }
		    	  
		    	  
		    	  bStatus=GeneralFunctions.clickElement(By.xpath("//img[@tip='Apply changes to Database']"));
		          if(bStatus){
		   		System.out.println("Save-Pass");
		          }	
		          else{
		          	System.out.println("Save-Fail");
		          }
		          if (bStatus) {
		              Reports.logResults(LogStatus.PASS, "Test Passed", "MAGIC_BatchProcessing");

		          } else {
		              Reports.logResults(LogStatus.FAIL, "Test Failed", "MAGIC_BatchProcessing");
		          }
		          com.alticor.magic.GeneralFunctions.close();

		    		

		      }
		    }


