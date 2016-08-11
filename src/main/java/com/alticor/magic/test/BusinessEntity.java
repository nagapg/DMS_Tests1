/* Given the user runs the ILB Alt name report,
When the report is run,
Then the Business Entity selector should display the Business Entity and the code should not be displayed in the selector */
package alticor.magic.test;

import alticor.magic.pages.Reports;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class BusinessEntity {
boolean bStatus=false;
	
	
    @Before
	public void setUp() throws Exception {
    	//Report Heading//
    	Reports.setTestCaseName("MA 6233");
	    //Open the Browser and launch the environment//
    	bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		if(bStatus){
        	System.out.println("Browser Launch-Pass");
        }	
        else{
        	System.out.println("Browser Launch-Fail");
        }
        }
	
	

	@After
	public void tearDown() throws Exception {
		Reports.endTest();
	}
	

	
	@Test
	public void test() {
		
		//Reports//
		GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[5]"));
		if(bStatus){
        	System.out.println("Reports click-Pass");
        }	
        else{
        	System.out.println("Reports Click-Fail");
        }
		
		//Reports-->ABO Reports//
		GeneralFunctions.clickElement(By.xpath("//span[text()='ABO Reports']"));
		if(bStatus){
        	System.out.println("ABO Reports-Pass");
        }	
        else{
        	System.out.println("ABO Reports-Fail");
        }
		
		//Reports-->ABO Reports-->ILB bank File//
		GeneralFunctions.clickElement(By.linkText("ILB Alt Name"));
		if(bStatus){
        	System.out.println("ILB Alt name click-Pass");
        }	
        else{
        	System.out.println("ILB bAlt name Click-Fail");
        }
		
		
		//Test Case1:Validating Business Entity Field//
		bStatus=GeneralFunctions.driver.findElement(By.name("searchInputCol2")).getAttribute("value").isEmpty();
		if(bStatus){
        	System.out.println("BE Field is Empty");
        }	
        else{
        	System.out.println("BE is not Empty");
        }
		
		//Test Case2:Validating values on Business Entity Field//
		bStatus=GeneralFunctions.clickElement(By.name("searchButtonCol2"));
		if(bStatus){
        	System.out.println("BE Drop Down list Visible");
        }	
        else{
        System.out.println("BE Drop Down List not Visible");
        }
		
	
	
        //Reporting//
		if(bStatus){
			Reports.logResults(LogStatus.PASS,"Tests Passed","Validating BE Field");
		}
		else{
			Reports.logResults(LogStatus.FAIL,"Tests Failed","Validating BE Field");
		}
		
		com.alticor.magic.GeneralFunctions.close();
	   }

	   }



