package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9750Test {
	
	/** Declare variables */
	boolean bStatus;

	@Given("^User is in Transaction Reports Screen$")
	public void User_is_in_Transaction_Reports_Screen() throws Throwable {
		
		//Navigate to Server//
	bStatus =GeneralFunctions.openhubBrowser("http://10.72.16.9:32768/wd/hub","firefox");
//bStatus =GeneralFunctions.openhubBrowser("http://usqa9914:4444/wd/hub","chrome");//
			if (bStatus) {
		    System.out.println("Navigated to Server");
		     } else {
		     System.out.println("Cannot Navigate to Server");
		     }
			
			//Navigate to MAGIC-QA//
		 bStatus =GeneralFunctions.openapp("https://magic-gamma/EBS_UI_Web/Magic");
		    if (bStatus) {
		    System.out.println("Navigated to MAGIC");
		    } else {
		    System.out.println("Cannot Navigate to MAGIC");
		    }
		    
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		  com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();
		   
		    try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    //Okta Login//
		  GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input26']"),"cmns559");
		  GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='input33']"),"our49pot");
		  GeneralFunctions.clickElement(By.xpath(".//*[@id='form17']/div[2]/input"));
			
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
		System.out.println("AFF entered");
		} else {
		System.out.println("Cannot enter AFF");
		}

		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			  //Enter Abo:9995//
		bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
		  if (bStatus) {
		System.out.println("ABO entered");
		} else {
		System.out.println("Cannot enter ABO");
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
		System.out.println("Entered Period");
		}         
		else{
		System.out.println("Cannot Enter Period");
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
		        System.out.println("Click on Submit");
		    } else {
		        System.out.println("Cannot click on submit");
		    }

		                 try {
		     				Thread.sleep(3000);
		     			} catch (InterruptedException e) {
		     				// TODO Auto-generated catch block
		     				e.printStackTrace();
		     			}
		                 
		               //Reports//
		         		try {
		         			Thread.sleep(3000);
		         		} catch (InterruptedException e) {
		         			// TODO Auto-generated catch block
		         			e.printStackTrace();
		         		}
		         		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[4]"));
		         	  if(bStatus){
		         	    	System.out.println("Click on Reports");
		         	    }	
		         	    else{
		         	    	System.out.println("Cannot Click on Reports");
		         	    }
		         	    
		         	    //Reports-->Transaction Reports//
		         	  try {
		         			Thread.sleep(3000);
		         		} catch (InterruptedException e) {
		         			// TODO Auto-generated catch block
		         			e.printStackTrace();
		         		}
		         	  bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='SubMenu4']/a[10]"));
		         	    if(bStatus){
		         		System.out.println("Click on Tranaction Reports");
		         	    }	
		         	    else{
		         	    	System.out.println("Cannot Click on Tranaction Reports");
		         	    }
		         	    
		         	    try {
		         			Thread.sleep(3000);
		         		} catch (InterruptedException e) {
		         			// TODO Auto-generated catch block
		         			e.printStackTrace();
		         		}
		         	    
		         	    //Reports-->Transaction Reports-->Transaction Reports//
		         	    bStatus=GeneralFunctions.clickElementByJavascriptExecutor(By.linkText("Transaction Reports"));
		         	   if(bStatus){
		         		System.out.println("Click on Transaction Reports");
		         	   }	
		         	   else{
		         	   	System.out.println("Cannot Click on Transaction Reports");
		         	   }
		         	   
		         	   try {
		         			Thread.sleep(3000);
		         		} catch (InterruptedException e) {
		         			// TODO Auto-generated catch block
		         			e.printStackTrace();
		         		}
	}
		         	
@When("^Clicked view without values$")
	public void Clicked_view_without_values() throws Throwable{
		
		  //Click on View//
		 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='ReportsButton']"));
  if(bStatus){
		    	System.out.println("Click on View button");
		    }	
		    else{
		    	System.out.println("Cannot Click on View button");
		    }
	}  

		     @Then ("^Click on ok button$")
		   public void Click_on_ok_button() throws Throwable{
			   com.alticor.magic.GeneralFunctions.driver.switchTo().alert().accept();
			   System.out.println("Clicked on OK button");
		   }
		     
		     
		   @Given("^User enters From Bonus Period$")
		   public void User_enters_From_Bonus_Period() throws Throwable{
			 //Enter From Bonus Period Field//
			    bStatus=GeneralFunctions.enterTextToElement(By.name("searchInputCol4"),"022015");
				if(bStatus){
		      	System.out.println("Entered From Bonus Period");
		      }	
		      else{
		      	System.out.println("Cannot Enter From Bonus Period");
		      }
				}
		   
		   @When("^User Clicks on Clear$")
		   public void User_Clicks_on_Clear() throws Throwable{
			 
			   //Click on Clear//
				 bStatus=GeneralFunctions.clickElement(By.id("ClearButton"));
				 if(bStatus){
				    	System.out.println("Click on Clear button");
				    }	
				    else{
				    	System.out.println("Cannot Click on Clear button");
				    }
		   }
		   
		   @Then("^Field is Cleared$")
		   public void Field_is_Cleared() throws Throwable{
			   
			 //Field is cleared//
			   bStatus=GeneralFunctions.verifyVisibilityOFElement(By.xpath("//*[@id='searchTable']/tbody/tr[2]/td[2]/input"));
			 if(bStatus){
				System.out.println("Field Cleared");
	   }
	    else{
	      System.out.println("Field Not Cleared");
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
		      	System.out.println("Check email");
		      }	
		      else{
		      	System.out.println("Cannot check email");
		      }     
		   }
		   
		   @Then("^User email is populated$")
		   public void User_email_is_populated() throws Throwable{
			 //Capture User email//
				String ExpVal=GeneralFunctions.getText(By.id(".//*[@id='emailingList']"));
				 System.out.println("The User email  is "+ ExpVal);
			      try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		   }
		   
		  @Given("^User Selects To Bonus Period$")
		  public void User_Selects_To_Bonus_Period() throws Throwable{
			  
			  //Select To Bonus Period//
		      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[2]/td[4]/button/img"));
		        if(bStatus){
		 		System.out.println("Select To Bonus Period");
		        }	
		        else{
		        	System.out.println("Cannot To Bonus Period");
		        }
		        
		  }   
		        @Given("^Check Original ABO$")
		        public void Check_Original_ABO() throws Throwable{
		        	
		        	  //Check Original ABO//
			        bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[1]/td[2]/input"));
					if(bStatus){
			      	System.out.println("Check Original ABO Checkbox");
			      }	
			      else{
			      	System.out.println("Cannot Check Original ABO Checkbox");
			      }
			      
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		  }
		        
		        @Given("^Select Order Number$")
		        public void Select_Order_Number() throws Throwable{
		        	
		        	//Select Order Number//
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[5]/td[2]/input"));
					if(bStatus){
			      	System.out.println("Check Order Number Radio button");
			      }	
			      else{
			      	System.out.println("Cannot Check Order Number Radio button");
			      }
		        }

		        @When("^Select Report View Excel$")
		        public void Select_Report_View_Excel() throws Throwable{
		        	
		        	//Select Report View Excel//
					bStatus=GeneralFunctions.DropDown(By.xpath(".//*[@id='searchInputCol17']"), "EXCEL");
					if(bStatus){
			      	System.out.println("Select Report view as Excel");
			      }	
			      else{
			      	System.out.println("Cannot Select Report view as Excel");
			      }
					  }
		        
		        @When("^Select Business Entity$")
		        public void Select_Business_Entity() throws Throwable{
		        	
		        	//Select Business Entity//
				      bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchTable']/tbody/tr[1]/td[4]/button[1]/img"));
				        if(bStatus){
				 		System.out.println("Select Business Entity");
				        }	
				        else{
				        	System.out.println("Cannot Select Business Entity");
				        }
				    
				        //Select First Row in BE//
		    		bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='multiSelDiv1']/table/tbody/tr[1]/td[1]"));
				        if(bStatus){
				    		System.out.println("Select BE10");
				           }	
				           else{
				           	System.out.println("Cannot Select BE10");
				           }
		        }
		        
		        @Then("^Click on View$")
		        public void Click_on_View() throws Throwable{
		        	
		        	 bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='ReportsButton']"));    
		        	if(bStatus){
					    	System.out.println("Click on View button");
					    }	
					    else{
					    	System.out.println("Cannot Click on View button");
					    }
		        }
					  
		        	@Then("^Close$")
		      	  public void Close() throws Throwable {
		      	  		
		      	  	bStatus = GeneralFunctions.close();
		      	          if (bStatus) {
		      	               System.out.println("MAGIC Closed");
		      	           } else {
		      	               System.out.println("Cannot Close MAGIC");
		      	           }
		      	  }
}


