package com.alticor.magic.report;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class Reports {

    //File Name
    public static String sResultantFileName;

    // Functionality List
    public static HashMap<String, String> map = new HashMap();
    // Initate object for Xtent reporter
    private static ExtentReports objXtn;
    // External CSS FilePath
    //private static String sCssFilePath =new File("css/bg.css").getAbsolutePath();
    // document tile of report page
    private static String docTitle = "Automation Test Results";
    // Get current Functionality
    private static String sCurFunc;
    // test case
    private static String stest;
    // header title of document
    private static String sTimeStamp;
    private static boolean timeStampCreated = false;
    private static ExtentTest objXTest;
    public static TestReport CurrentTest;

    //public static void setFunctionality(/*String sFunctionality,*/String sTestCaseName) {
    public static void setTestCaseName(/*String sFunctionality,*/String sTestCaseName) {
        if (!timeStampCreated) {
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat formate = new SimpleDateFormat("MMddyyyHHmmss");
            String date = formate.format(cal.getTime());
            sTimeStamp = date;
            timeStampCreated = true;
        }
        stest = sTestCaseName;
        //	sCurFunc = sFunctionality.trim();
        //map.put(sFunctionality, "logs/Results"+sCurFunc+sTimeStamp+".html");
        //map.put(sFunctionality, "Report/Results"+sTimeStamp+".html");
        //Report/
        sResultantFileName = "Report/Results" + sTimeStamp + ".html";
        System.out.println(sResultantFileName);
        Reports.setUpstartTest(stest);
    }

    public static void setUpstartTest(String testName) {
    	
        objXtn = new ExtentReports(sResultantFileName, false);
        //TODO: need to setup new test object but if one isn't in the system environment make new one instead of looking for existing

        objXTest = objXtn.startTest(testName);


    }

    public static void logResults(LogStatus status, String stepName, String StepDes) {
        objXTest.log(status, stepName, StepDes);
    }

    public static void logResults(LogStatus status, String stepName, String StepDes,
        String screenshot) {
        objXTest.log(status, stepName, StepDes);
    }

    public static void endTest() {
        objXtn.endTest(objXTest);
        objXtn.close();
    }



}
