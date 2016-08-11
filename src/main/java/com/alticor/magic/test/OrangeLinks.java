/*Fix the issue with the orange links not working*/

package alticor.magic.test;
import alticor.magic.pages.Reports;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import com.relevantcodes.extentreports.LogStatus;
import com.alticor.magic.GeneralFunctions;

public class OrangeLinks {
boolean bStatus=false;
	
	@Before
	public void setUp() throws Exception {
		Reports.setTestCaseName("Automation Script for  MA 6304");
		
		//Open IE 11 and launch the application//
	bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
		
		if(bStatus){
        	System.out.println("Application-Pass");
        }	
        else{
        	System.out.println("Application-Fail");
        }
}
	
	

	@After
	public void tearDown() throws Exception {
		Reports.endTest();
	}
	

	@Test
	public void test() {
		
		//Processing//
		GeneralFunctions.clickElement(By.xpath("//*[@id='topMenu']/div/a[3]"));
		if(bStatus){
        	System.out.println("Processing-Pass");
        }	
        else{
        	System.out.println("Processing-Fail");
        }
		
		
		//Processing-->payments//
		GeneralFunctions.clickElement(By.xpath("(//span[text()='Payments'])[position()=2]"));
		if(bStatus){
        	System.out.println("Payments-Pass");
        }	
        else{
        	System.out.println("Payments-Fail");
        }
		
		//Processing-->Payments-->ILB bank file//
		GeneralFunctions.clickElement(By.linkText("ILB Bank File"));
		if(bStatus){
        	System.out.println("ILB Bank File-Pass");
        }	
        else{
        	System.out.println("ILB Bank File-Fail");
        }
		
		//Enter Period//
		GeneralFunctions.enterTextToElement(By.id("period"),"022015");
		if(bStatus){
        	System.out.println("Period Enter-Pass");
        }	
        else{
        	System.out.println("Period Enter-Fail");
        }
		
		//click on Go button//
		bStatus=GeneralFunctions.clickElement(By.id("viewButton"));
		if(bStatus){
        	System.out.println("Go-Pass");
        }	
        else{
        System.out.println("Go-Fail");
        }
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		
		bStatus=GeneralFunctions.clickElement(By.linkText("Rejected"));
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
    	  
    	  GeneralFunctions.clickElement(By.id("viewButton"));
    	  if(bStatus){
          	System.out.println("Back Click-Pass");
          }	
          else{
          	System.out.println("Back Click-Fail");
          }
  			
 	//Xtent Reports//
	if(bStatus){
		Reports.logResults(LogStatus.PASS,"Test Pass","Orange Links Clicked");
	}
	else
	{
		Reports.logResults(LogStatus.FAIL,"Test Fail","Orange Links Not Clicked");
	}
	
	//close the browser//
	com.alticor.magic.GeneralFunctions.close();
	
	
	}

}




