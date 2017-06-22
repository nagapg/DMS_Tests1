//Validate Business Entity in ILB Alt Name Screen//

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9737Test {

	/** Declare variables */
	boolean bStatus;
	
	@Given("^User is in ILB Alt Name Screen$")
	public void User_is_in_ILB_Alt_Name_Screen() throws Throwable {
		
		//Navigate to Hub//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
		//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","firefox");//
			if (bStatus) {
			    System.out.println("Hub Firefox-Pass");
			     } else {
			     System.out.println("Hub Firefox-Fail");
			     }
				
				//Navigate to MAGIC-Gamma//
			 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
			  if (bStatus) {
			    System.out.println("MAGIC_Gamma-Pass");
			    } else {
			    System.out.println("MAGIC_Gamma-Fail");
			    }
			   // com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();//
			   
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
				  bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedAffLeftContainer']"),"010");
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

					  //Enter Abo//
				bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
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

					   //Enter Period//
				bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"062017");
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
			 
//Reports//
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[4]"));
if(bStatus){
	System.out.println("Reports-Pass");
}	
else{
	System.out.println("Reports-Fail");
}

//Reports-->ABO Reports//
bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[2]/span[1]"));
if(bStatus){
	System.out.println("ABO Reports-Pass");
}	
else{
	System.out.println("ABO Reports-Fail");
}

//Reports-->ABO Reports-->ILB Alt Name//
bStatus=GeneralFunctions.clickElement(By.linkText("ILB Alt Name"));
if(bStatus){
	System.out.println("ILB Alt name-Pass");
}	
else{
	System.out.println("ILB Alt name-Fail");
}

try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
	
	@Then("^BE should be empty$")
	public void BE_should_be_empty() throws Throwable {
		   try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	/*	bStatus=(GeneralFunctions.driver.findElement(By.xpath(".//*[@id='searchInputCol2']")).getAttribute("value").isEmpty());
		if(bStatus)
		{
			System.out.println("BE Field Empty-Pass");
		}
		else
		{
			System.out.println("BE not Empty-Fail");
		}*/
		   
		   //Capture BE Field//
			String ExpVal=GeneralFunctions.getText(By.id(".//*[@id='searchInputCol2']"));
			 System.out.println("##########Expected-Result########################");
			 System.out.println("The BE Field  is empty");
			 System.out.println("###############################################");
		      try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^Drop down in BE$")
	public void Drop_down_in_BE() throws Throwable {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bStatus=GeneralFunctions.clickElement(By.name("searchButtonCol2"));
		if(bStatus){
			System.out.println("BE Drop Down list Visible-Pass");
		}	
		else{
		System.out.println("BE Drop Down List not Visible-Fail");
		}
	}
	
	@Then("^Close ILB Alt Name Screen$")
	public void Close_ILB_Alt_Name_Screen() throws Throwable {
		
		   bStatus = GeneralFunctions.close();
	        if (bStatus) {
	             System.out.println("MAGIC Closed-Pass");
	         } else {
	             System.out.println("Close MAGIC-Fail");
	         }
	}
	}