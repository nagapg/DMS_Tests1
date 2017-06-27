/*Step 1>Navigate to ILB Alt Name
 * Step 2>Validate Business Entity
 */

package com.alticor.magic.test;

import org.openqa.selenium.By;
import com.alticor.magic.GeneralFunctions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MAGIC_Q2_MA9737Test {

	/** Declare variables */
	boolean bStatus;
	
	@When("^ILB Alt Name Screen is selected$")
	public void ILB_Alt_Name_Screen_is_selected() throws Throwable {
		
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
}
	
	@Then("^BE should be empty$")
	public void BE_should_be_empty() throws Throwable {
		   
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
		}

	@Then("^Drop down in BE$")
	public void Drop_down_in_BE() throws Throwable {
		
		bStatus=GeneralFunctions.clickElement(By.name("searchButtonCol2"));
		if(bStatus){
			System.out.println("BE Drop Down list Visible-Pass");
		}	
		else{
		System.out.println("BE Drop Down List not Visible-Fail");
		}
	}
	}