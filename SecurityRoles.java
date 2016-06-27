package alticor.magic.pages;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import samplefunctions.GeneralFunctions;

public class SecurityRoles {
boolean bStatus;

	//Open Dev url//
	@Before
	public void setUp() throws Exception {
		bStatus=GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
        if(bStatus){
        	System.out.println("browser launched sucessfully");
        }	
        else{
        	System.out.println("unable to launch browser");
        }
	}

	
	@After
	public void tearDown() throws Exception {
		}

	//Test Case:Capture User Region From Home Page//
	@Test
	public void test() {
	GeneralFunctions.clickElement(By.xpath("//span[text()='Naga Prathima Gha']"));
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 List<WebElement> table= GeneralFunctions.driver.findElement(By.xpath("//table[@id='innerUserInfoTable']/tbody")).findElements(By.tagName("tr"));
	  String text=table.get(table.size()-1).findElement(By.xpath("td[2]")).getText(); 
	  
	  if(bStatus){
      	System.out.println("User Region is :"+text);
      }	
      else{
      	System.out.println("Unable to Capture User Region");
      }

	  GeneralFunctions.close();
	
	}

}

