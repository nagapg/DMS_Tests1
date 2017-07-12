/* Step 1>Go to Award Board 
 * Step 2>Add the Name
 * Step 3>Confirm Add
 * Step 4>Update the Name
 * Step 5>Confirm Update
 * Step 6>Delete the Name
 * step 7>Confirm Delete
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9731Test {

	/** Declare variables */
	boolean bStatus;
	final private String sExpNote="Testing Notes";
	
	@Given("^user navigates to MAGIC Award board Name Screen$")
	public void user_navigates_to_MAGIC_Award_board_Name_Screen() throws Throwable {
		
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
		  
		  //Enter Abo//
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 bStatus =GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='selectedIboNumber']"),"9995");
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
				 bStatus=GeneralFunctions.enterTextToElement(By.id("selectedPeriod"),"072017");
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
				                
				               //Maintenance//
				                 try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								 
				         		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='topMenu']/div/a[2]"));
				         		if(bStatus){
				                 	System.out.println("Maintanence-Pass");
				                 	}	
				                 else{
				                 	System.out.println("Maintanence-Fail");
				                 }
				         		
				         		//Maintenance-->Award Board//
				         		  try {
										Thread.sleep(3000);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								 
				         		bStatus=GeneralFunctions.clickElement(By.linkText("Award Board"));   
				         	       if(bStatus){
				         			System.out.println("Award Board-Pass");
				         	       }	
				         	       else{
				         	       	System.out.println("Award Board-Fail");
				         	       }
				         	}
				         	
	@When("^add name$")
	public void  add_name() throws Throwable {
		
		/*Add name*/
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    bStatus=GeneralFunctions.enterTextToElement(By.xpath(".//*[@id='commonName']"),"Test1");
			if(bStatus){
	     	System.out.println("Name entered-Pass");
	     	}	
	     else{
	     	System.out.println("Name entered-Fail");
	     }
			
			//Enter the note//
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchBox']/table/tbody/tr[10]/td[3]/img"));
	     if(bStatus){
			System.out.println("Select Reason Code-Pass");
	     }	
	     else{
	     	System.out.println("Select Reason Code-Fail");
	     }
	     
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[1]"));
	     if(bStatus){
	 		System.out.println("Select Notes-Pass");
	        }	
	        else{
	        	System.out.println("Select Notes-Fail");
	        }
	     
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	     if(bStatus){
	 		System.out.println("Entered Notes-Pass");
	        }	
	        else{
	        	System.out.println("Enter Notes-Fail");
	        }
	     
	     //Click on save button//
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	     if(bStatus){
	 		System.out.println("Click Save-Pass");
	        }	
	        else{
	        	System.out.println("Click Save-Fail");
	        }
	     
	     //Click on Add button//
	     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     bStatus=GeneralFunctions.clickElement(By.id("addButton"));
	     if(bStatus){
	 		System.out.println("Click Add-Pass");
	        }	
	        else{
	        	System.out.println("Click Add-Fail");
	        }
}
		@When("^Confirm add$")
	public void  Confirm_add() throws Throwable {
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  String addmessg=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
			  System.out.println("##########Add Response########################"); 
			  System.out.println(addmessg);
			  System.out.println("##################################");
		}  

	@When("^update name$")
	public void  update_name() throws Throwable {
		
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   bStatus=GeneralFunctions.enterTextToElement(By.id("commonName"),"Test2");
					if(bStatus){
			        	System.out.println("Name Update-Pass");
			        	}	
			        else{
			        	System.out.println("Name Update-Fail");
			        }
					
					//Enter the note//
					 try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchBox']/table/tbody/tr[10]/td[3]/img"));
			        if(bStatus){
			 		System.out.println("Reason Code-Pass");
			        }	
			        else{
			        	System.out.println("Reason Code-Fail");
			        }
			        
			        try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		 		bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[1]"));
			        if(bStatus){
			    		System.out.println("Notes-Pass");
			           }	
			           else{
			           	System.out.println("Notes-Fail");
			           }
			        
			        try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
			        if(bStatus){
			    		System.out.println("Entered Notes-Pass");
			           }	
			           else{
			           	System.out.println("Cannot Enter Notes-Fail");
			           }
			        
			        //Click on save button//
			        try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
			        if(bStatus){
			    		System.out.println("Save-Pass");
			           }	
			           else{
			           	System.out.println("Save-Fail");
			           }
			        
			        //Click on Update button//
			        try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			        bStatus=GeneralFunctions.clickElement(By.id("editButton"));
			        if(bStatus){
			    		System.out.println("Update-Pass");
			           }	
			           else{
			           	System.out.println("Update-Fail");
			           }
}

	@When("^Confirm update$")
	public void  Confirm_update() throws Throwable {
		
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  String editmssg=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
		  System.out.println("##########Update Response########################");
		  System.out.println(editmssg);
		  System.out.println("##################################");
		     }


	@Then("^delete name$")
	public void  delete_name() throws Throwable {
		
		//Enter the note//
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus=GeneralFunctions.clickElement(By.xpath(".//*[@id='searchBox']/table/tbody/tr[10]/td[3]/img"));
	        if(bStatus){
	 		System.out.println("Reason Code-Pass");
	        }	
	        else{
	        	System.out.println("Reason Code-Fail");
	        }
	      
	        try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		bStatus= GeneralFunctions.clickElement(By.xpath(".//*[@id='reasonCodeList']/table/tbody/tr/td[1]"));
	    if(bStatus){
			System.out.println("Notes-Pass");
	       }	
	       else{
	       	System.out.println("Notes-Fail");
	       }
	    
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    bStatus= GeneralFunctions.enterTextToElement(By.id("createNoteTextArea"),sExpNote);
	    if(bStatus){
			System.out.println("Entered Notes-Pass");
	       }	
	       else{
	       	System.out.println("Cannot Enter Notes-Fail");
	       }
	    
	    //Click on save button//
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    bStatus=GeneralFunctions.clickElement(By.id("saveButton"));
	    if(bStatus){
			System.out.println("Save-Pass");
	       }	
	       else{
	       	System.out.println("Save-Fail");
	       }
	    
	    //Click on Delete button//
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    bStatus=GeneralFunctions.clickElement(By.id("deleteButton"));
	    if(bStatus){
			System.out.println("Delete-Pass");
	       }	
	       else{
	       	System.out.println("Delete-Fail");
	       }

	    //Accept the Pop Up//
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  GeneralFunctions.driver.switchTo().alert().accept();
	   }

	@Then("^Confirm delete$")
	public void  Confirm_delete() throws Throwable {
		
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   String deletemessg=GeneralFunctions.getText(By.xpath(".//*[@id='messageHeaderExpand']/table/tbody/tr/td/div"));
		   System.out.println("##########Delete Response########################");  
		   System.out.println(deletemessg);
		   System.out.println("##################################");
	}           

@Then("^Close Award board Name Screen$")
public void  Close_Award_board_Name_Screen() throws Throwable {
  
  	bStatus = GeneralFunctions.close();
      if (bStatus) {
           System.out.println("MAGIC Closed-Pass");
       } else {
           System.out.println("Close MAGIC-Fail");
       }
}
}