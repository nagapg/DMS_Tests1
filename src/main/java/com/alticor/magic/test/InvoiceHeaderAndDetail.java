/*When the user clicks on the orange amount on the Invoice ABO Inquiry screen it takes them to the Invoice Header and Detail screen.  */

package alticor.magic.test;
import alticor.magic.pages.Reports;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class InvoiceHeaderAndDetail {
boolean bStatus=false;
	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("MA 5517");
		
		//Open IE 11 and launch the application//
	bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		
		if(bStatus){
        	System.out.println("Application Launch-Pass");
        }	
        else{
        	System.out.println("Application Launch-Fail");
        }
}
	
	

	@After
	public void tearDown() throws Exception {
		Reports.endTest();
	}
	

	@Test
	public void test() {
		
		 //Enter values//
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedAffLeftContainer"), "010");
		if(bStatus){
        	System.out.println("Aff-Pass");
        }	
        else{
        	System.out.println("Aff-Fail");
        }
		
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedIboNumber"), "9995");
		if(bStatus){
        	System.out.println("Abo-Pass");
        }	
        else{
        	System.out.println("Abo-Fail");
        }
		
       bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072016");
		if(bStatus){
        	System.out.println("Period-Pass");
        }	
        else{
        	System.out.println("Period-Fail");
        }
		
		
		bStatus=GeneralFunctions.clickElement(By.id("SubmitButton"));
		if(bStatus){
        	System.out.println("submit-Pass");
        }	
        else{
        	System.out.println("submit-Fail");
        }
		
		
		
		
		        //Payment inquiry//
		bStatus=GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[4]"));
				if(bStatus){
		        	System.out.println("Payment Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Payment Inquiry-Fail");
		        }
				
				//Payment Inquiry-->Invoice Inquiry//
				bStatus=GeneralFunctions.clickElement(By.linkText("Invoice Inquiry"));
				if(bStatus){
		        	System.out.println("Invoice Inquiry-Pass");
		        }	
		        else{
		        	System.out.println("Invoice Inquiry-Fail");
		        }
				
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
				
				
				bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='invoiceABODataTable']/tbody/tr[2]/td[10]/span/b"));
				if(bStatus){
		        	System.out.println("Orange Link click-Pass");
		        }	
		        else{
		        	System.out.println("Orange Link click-Fail");
		        }
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				bStatus=GeneralFunctions.clickElement(By.name("viewButton"));
				if(bStatus){
		        	System.out.println("Back button-Pass");
		        }	
		        else{
		        	System.out.println("Back button-Fail");
		        }
				
				
				//Reporting//
				if (bStatus){
			    	  alticor.magic.pages.Reports.logResults(LogStatus.PASS, "Test Pass","Invoice Header and Detail");
			    	  
			      }
			      else
			      {
			    	  alticor.magic.pages.Reports.logResults(LogStatus.FAIL, "Test Fail","Invoice Header and Detail");
			      }
			      com.alticor.magic.GeneralFunctions.close(); 
}
}

