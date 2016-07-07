package com.alticor.magic.test;

import com.alticor.magic.GeneralFunctions;
import com.alticor.magic.report.Reports;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SecurityRoles {
    boolean bStatus;

    @Before public void setUp() throws Exception {
        Reports.setTestCaseName("User Region:ldap-amw-magic-developer");
        bStatus = GeneralFunctions.openIEBrowser("https://magic-beta:9446/EBS_UI_Web/Magic");
        if (bStatus) {
            System.out.println("browser launched sucessfully");
        } else {
            System.out.println("unable to launch browser");
        }
    }



    @Test public void test() {
        GeneralFunctions.clickElement(By.xpath("//span[text()='Naga Prathima Gha']"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        List<WebElement> table =
            GeneralFunctions.driver.findElement(By.xpath("//table[@id='innerUserInfoTable']/tbody"))
                .findElements(By.tagName("tr"));
        String text = table.get(table.size() - 1).findElement(By.xpath("td[2]")).getText();
        System.out.println("The User Region Captured  is:" + text);
        if (bStatus) {
            Reports.logResults(LogStatus.PASS, "Capture the User Region", "Capture is successful");

        } else {
            Reports.logResults(LogStatus.FAIL, "Capture the User Region", "Unable to capture");
        }
        GeneralFunctions.close();
    }


    @After public void afterTest() {
        Reports.endTest();
    }
}

