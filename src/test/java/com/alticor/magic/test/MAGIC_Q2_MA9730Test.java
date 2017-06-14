package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9730Test {
	
	/** Declare variables */
	boolean bStatus;
	String ExpVal;
	
@Given("^MAGIC user is in Annual Bonus Screen$")
public void  MAGIC_user_is_in_Annual_Bonus_Screen() throws Throwable{
	
	//Navigate to Server//
bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");//
	if (bStatus) {
	    System.out.println("Server Firefox-Pass");
	     } else {
	     System.out.println("Server Firefox-Fail");
	     }
		
		//Navigate to MAGIC-QA//
	 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
	  if (bStatus) {
	    System.out.println("MAGIC_QA-Pass");
	    } else {
	    System.out.println("MAGIC_QA-Fail");
	    }
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   // com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
	   
    //Okta Login//
	    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-username']"),"cmns559");
	    GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='okta-signin-password']"),"our49pot");
	    GeneralFunctions.clickElement(By.xpath(".//*[@id='okta-signin-submit']"));
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //Enter Aff//
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
	  if (bStatus) {
	System.out.println("AFF-Pass");
	} else {
	System.out.println("AFF-Fail");
	}
	 
	  
	  //Enter Abo//
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"670");
	  if (bStatus) {
	System.out.println("ABO-Pass");
	} else {
	System.out.println("ABO-Fail");
	}
	
	  
	  //Enter Period//
	  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062017");
	               if(bStatus){
	System.out.println("Period-Pass");
	}         
	else{
	System.out.println("Period-Fail");
	}
	              
	               
	               //Click on submit//
	               try {
	   				Thread.sleep(3000);
	   			} catch (InterruptedException e) {
	   				// TODO Auto-generated catch block
	   				e.printStackTrace();
	   			}
	         bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
	                 if (bStatus) {
	        System.out.println("Submit-Pass");
	    } else {
	        System.out.println("Submit-Fail");
	    }
	               
	                 
	                 //Inquiry//
	                 try {
	     				Thread.sleep(3000);
	     			} catch (InterruptedException e) {
	     				// TODO Auto-generated catch block
	     				e.printStackTrace();
	     			}
	         			GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
	         			if(bStatus){
	         	        	System.out.println("Inquiry-Pass");
	         	        }	
	         	        else{
	         	        	System.out.println("Inquiry-Fail");
	         	        }
	         	
	         			
	         			//Inquiry-->Annuals//
	         			 try {
	         				Thread.sleep(3000);
	         			} catch (InterruptedException e) {
	         				// TODO Auto-generated catch block
	         				e.printStackTrace();
	         			}
	         			GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[4]/span[1]"));
	         			if(bStatus){
	         	        	System.out.println("Annuals-Pass");
	         	        }	
	         	        else{
	         	        	System.out.println("Annuals-Fail");
	         	        }
	         			
	         			
	         			//Inquiry-->Annuals-->Annual Bonus//
	         			 try {
	         				Thread.sleep(3000);
	         			} catch (InterruptedException e) {
	         				// TODO Auto-generated catch block
	         				e.printStackTrace();
	         			}
	         			bStatus=GeneralFunctions.clickElement(By.linkText("Annual Bonus"));
	         	        if(bStatus){
	         			System.out.println("Annual Bonus-Pass");
	         	        }	
	         	        else{
	         	        	System.out.println("Annual Bonus-Fail");
	         	        }
	         	  
}

@When("^PY is selected$")
public void  PY_is_selected() throws Throwable{
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	//Select PY:2016//
	bStatus=GeneralFunctions.DropDown(By.xpath(".//*[@id='searchBoxDiv']/form/div[2]/table/tbody/tr/td[2]/select"), "2016");
	if(bStatus){
  	System.out.println("Select PY-Pass");
  }	
  else{
  	System.out.println("Select PY-Fail");
  }

}

@When("^Click on Go$")
public void  Click_on_Go() throws Throwable{
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	//Click on Go button//
    bStatus =GeneralFunctions.clickElement(By.id("goButton"));
    if (bStatus) {
System.out.println("Go Button-Pass");
} else {
System.out.println("Go Button-Fail");
}
}

@When("^Capture Total Bonus$")
public void  Capture_Total_Bonus() throws Throwable{
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 //Capture Total Bonus//
	ExpVal=GeneralFunctions.getText(By.xpath(".//*[@id='searchBoxDiv']/table/tbody/tr[40]/td[8]"));
	
	 System.out.println("##########Expected-Result########################");
	 System.out.println("The Total Bonus  is "+ ExpVal);
	 System.out.println("###############################################");
	
}

	     @And("^Close Annual Bonus Screen$")
	      		   public void Close_Annual_Bonus_Screen() throws Throwable{   
	      			   bStatus = GeneralFunctions.close();
	      		        if (bStatus) {
	      		             System.out.println("MAGIC Closed-Pass");
	      		         } else {
	      		             System.out.println("Close MAGIC-Fail");
	      		         }
	      		}
	      		}
