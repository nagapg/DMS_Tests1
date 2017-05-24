package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9740Test{
	
/** Declare variables */
boolean bStatus;
String trip;
String target;

@Given("^User is in LTS Screen$")
	public void User_is_in_LTS_Screen() throws Throwable {
		
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
 //com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
   
    try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

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

  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"430");
  if (bStatus) {
System.out.println("AFF-Pass");
} else {
System.out.println("AFF-Fail");
}

  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  //Enter Abo:9995//
bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"46");
  if (bStatus) {
System.out.println("ABO-Pass");
} else {
System.out.println("ABO-Fail");
}
  
  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	   //Enter Period:052017//
bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"052017");
               if(bStatus){
System.out.println("Period-Pass");
}         
else{
System.out.println("Period-Fail");
}
 
  try {
   				Thread.sleep(3000);
   			} catch (InterruptedException e) {
   				// TODO Auto-generated catch block
   				e.printStackTrace();
   			}
   		
       //Click on submit//
                 bStatus =GeneralFunctions.clickElement(By.id("SubmitButton"));
                 if (bStatus) {
        System.out.println("Submit-Pass");
    } else {
        System.out.println("Submit-Fail");
    }

                 try {
     				Thread.sleep(3000);
     			} catch (InterruptedException e) {
     				// TODO Auto-generated catch block
     				e.printStackTrace();
     			}
     		
            	 	//Navigate to Screens//
              GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[1]"));
     			if(bStatus){
     	        	System.out.println("Inqiry-Pass");
     	        }	
     	        else{
     	        	System.out.println("Inquiry-Fail");
     	        }
     			
     			//Inquiry-->GIP//
     			GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu1']/a[6]/span[1]"));
     			if(bStatus){
     	        	System.out.println("GIP-Pass");
     	        }	
     	        else{
     	        	System.out.println("GIP-Fail");
     	        }
     			
     			 try {
     				Thread.sleep(3000);
     			} catch (InterruptedException e) {
     				// TODO Auto-generated catch block
     				e.printStackTrace();
     			}
     		
     			 	 //Inquiry-->GIP-->LTS//
     			bStatus=GeneralFunctions.clickElement(By.linkText("LTS"));
     	        if(bStatus){
     			System.out.println("LTS-Pass");
     	        }	
     	        else{
     	        	System.out.println("LTS-Fail");
     	        }
     	        
     	       try {
   				Thread.sleep(3000);
   			} catch (InterruptedException e) {
   				// TODO Auto-generated catch block
   				e.printStackTrace();
   			}
   		 }
	
@ When("^Capture Trip Number and Target Number$")
	public void Capture_Trip_Number_and_Target_Number() throws Throwable {
		
	trip=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[1]/td[6]"));
	 try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 target=GeneralFunctions.getText(By.xpath(".//*[@id='detailHeaderTable']/tbody/tr[2]/td[6]"));
		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
	}

@When("^Compare Values$")
public void compare_Values() throws Throwable {
	if (trip==target){
System.out.println("Trip and Target are equal");
 }
	else{
		System.out.println("Trip is less than Target");
	 }
	}

@Then("^Display the values$")
		 public void Display_the_values() throws Throwable {
			 System.out.println("The  Trip value is  : "  +  trip);
			 System.out.println("The Target Value  is  :  "  +  target);
}

@Then("^Close LTS Screen$")
public void Close_LTS_Screen() throws Throwable {
		
	bStatus = GeneralFunctions.close();
        if (bStatus) {
             System.out.println("Browser Closed-Pass");
         } else {
             System.out.println("Browser Closed-Fail");
         }
}
}