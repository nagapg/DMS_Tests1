/*Step 1>Navigate to Transaction Reports
 * Step 2>Validate Fields
 */
package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9750Test {
	
	/** Declare variables */
	boolean bStatus;

	@Given("^user navigates to Transaction Reports$")
	public void user_navigates_to_Transaction_Reports() throws Throwable {
		
		//Navigate to Server//
		bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
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
		bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072017");
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
		         	    
		         	  GeneralFunctions.waittime();
		         	  
		         	    //Reports-->Transaction Reports//
		         	   bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[10]"));
		         	    if(bStatus){
		         		System.out.println("Tranaction Reports-Pass");
		         	    }	
		         	    else{
		         	    	System.out.println("Tranaction Reports-Fail");
		         	    }
		         	    
		         	   
		         	    //Reports-->Transaction Reports-->Transaction Reports//
		         	    bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("Transaction Reports"));
		         	   if(bStatus){
		         		System.out.println("Transaction Reports-Pass");
		         	   }	
		         	   else{
		         	   	System.out.println("Transaction Reports-Fail");
		         	   }
		         	   }
		         	
@When("^Click View$")
	public void Click_View() throws Throwable{
		
		  //Click on View//
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='ReportsButton']"));
         if(bStatus){
		    	System.out.println("View button-Pass");
		    }	
		    else{
		    	System.out.println("View button-Fail");
		    }
	}  


		  @Then ("^Click Ok$")
		   public void Click_ok() throws Throwable{
			  
			   com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();
			   System.out.println("OK button-Pass");
		   }
		     
		    @Given("^User enters From Bonus Period$")
		   public void User_enters_From_Bonus_Period() throws Throwable{
		    	
		    	//Enter From Bonus Period Field//
			    bStatus=GeneralFunctions.enterTextToElement(By.name("searchInputCol4"),"022015");
				if(bStatus){
		      	System.out.println("From Bonus Period-Pass");
		      }	
		      else{
		      	System.out.println("From Bonus Period-Fail");
		      }
				}
		   
		   @When("^User Clicks on Clear$")
		   public void User_Clicks_on_Clear() throws Throwable{
			 
			   //Click on Clear//
				 bStatus=GeneralFunctions.clickElement(By.id("ClearButton"));
				 if(bStatus){
				    	System.out.println("Clear button-Pass");
				    }	
				    else{
				    	System.out.println("Clear button-Fail");
				    }
		   }
		   
		   @Then("^Field is Cleared$")
		   public void Field_is_Cleared() throws Throwable{
			   
			 //Field is cleared//
			   bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath("//*[@id='searchTable']/tbody/tr[2]/td[2]/input"));
			 if(bStatus){
				System.out.println("Field Cleared-Pass");
	   }
	    else{
	      System.out.println("Field Cleared-Fail");
	}
				}
		   
  @Given("^User again enters From Bonus Period$")
		   public void User_again_enters_From_Bonus_Period() throws Throwable{
			   }
		   
		   @When("^email check box is checked$")
		   public void email_check_box_is_checked() throws Throwable{
			   
			 //Click on Schedule report//
			   bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='scheduleReport']"));
				if(bStatus){
		      	System.out.println("Check email-Pass");
		      }	
		      else{
		      	System.out.println("Check email-Fail");
		      }     
		   }
		   
		   @Then("^User email is populated$")
		   public void User_email_is_populated() throws Throwable{
			 
		       //Capture User email//
				String ExpVal=GeneralFunctions.getText(By.id(".//*[@id='emailingList']"));
				System.out.println("##################################");
				 System.out.println("The User email  is "+ ExpVal);
				 System.out.println("##################################");
			     }
			     
@Given("^User Selects To Bonus Period$")
		  public void User_Selects_To_Bonus_Period() throws Throwable{
			  
			  //Select To Bonus Period//
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[2]/td[4]/button/img"));
		        if(bStatus){
		 		System.out.println("To Bonus Period-Pass");
		        }	
		        else{
		        	System.out.println("To Bonus Period-Fail");
		        }
		        
		  }   
		        @Given("^Check Original ABO$")
		        public void Check_Original_ABO() throws Throwable{
		        	
		        	  //Check Original ABO//
			        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[1]/td[2]/input"));
					if(bStatus){
			      	System.out.println("Original ABO Checkbox-Pass");
			      }	
			      else{
			      	System.out.println("Original ABO Checkbox-Fail");
			      }
			        }
		        
		        @Given("^Select Order Number$")
		        public void Select_Order_Number() throws Throwable{
		        	
		        	//Select Order Number//
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[5]/td[2]/input"));
					if(bStatus){
			      	System.out.println("Order Number Radio button-Pass");
			      }	
			      else{
			      	System.out.println("Order Number Radio button-Fail");
			      }
		        }

		        @When("^Select Report View Excel$")
		        public void Select_Report_View_Excel() throws Throwable{
		        	
		        	//Select Report View Excel//
					bStatus=GeneralFunctions.DropDown(By.xpath(".//*[@id='searchInputCol17']"), "EXCEL");
					if(bStatus){
			      	System.out.println("Report view as Excel-Pass");
			      }	
			      else{
			      	System.out.println("Report view as Excel-Fail");
			      }
					  }
		        
		        @When("^Select Business Entity$")
		        public void Select_Business_Entity() throws Throwable{
		        	
		        	//Select Business Entity//
				    bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='doNotIncludeInParams']/img"));
				    	if(bStatus){
				 		System.out.println("Business Entity-Pass");
				        }	
				        else{
				        	System.out.println("Business Entity-Fail");
				        }
				    
				        //Select First Row in BE//
				    	bStatus= GeneralFunctions.clickElementByJavascriptExecutor(By.xpath(".//*[@id='multiSelDiv1']/table/tbody/tr[1]/td[2]"));
				        if(bStatus){
				    		System.out.println("BE10-Pass");
				           }	
				           else{
				           	System.out.println("BE10-Fail");
				           }
		        }
		        
		        @Then("^Click on View$")
		        public void Click_on_View() throws Throwable{
		        	
		        	 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='ReportsButton']"));    
		        	if(bStatus){
					    	System.out.println("View-Pass");
					    }	
					    else{
					    	System.out.println("View-Fail");
					    }
		        }


		        @Then("^Close Transaction Reports$")
		    	public void  Close_Transaction_Reports() throws Throwable {
		    	  
		    	  	bStatus = GeneralFunctions.close();
		    	      if (bStatus) {
		    	           System.out.println("MAGIC Closed-Pass");
		    	       } else {
		    	           System.out.println("Close MAGIC-Fail");
		    	       }
		    	}
		    	}







