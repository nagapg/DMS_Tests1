package com.alticor.magic.test.pages;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.HashMap;

import io.swarmauto.driverextended.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.Log;

public abstract class Reports implements Report{

	//File Name
	public static String sResultantFileName;
	//Test Result Object (Prowl)
	public static TestReport ResultObject;
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
	private static boolean timeStampCreated=false;
    private static ExtentTest objXTest;
	//public static void setFunctionality(/*String sFunctionality,*/String sTestCaseName) {
    public static void setTestCaseName(/*String sFunctionality,*/String sTestCaseName) {
		if(!timeStampCreated)
		{
			Calendar cal=Calendar.getInstance();
			SimpleDateFormat formate=new SimpleDateFormat("MMddyyyHHmmss");
			String date=formate.format(cal.getTime());
			sTimeStamp=date;
			timeStampCreated=true;
		}
		stest = sTestCaseName;
	//	sCurFunc = sFunctionality.trim();
		//map.put(sFunctionality, "logs/Results"+sCurFunc+sTimeStamp+".html");
		//map.put(sFunctionality, "Report/Results"+sTimeStamp+".html");
		//Report/
		sResultantFileName="Report/Results"+sTimeStamp+".html";
		System.out.println(sResultantFileName);
		Reports.setUpstartTest(stest);
		ResultObject = new TestReport(stest);
		
	}

	public static void  setUpstartTest(String testName) {
		objXtn = new ExtentReports(sResultantFileName, false);
		
	     objXTest=objXtn.startTest(testName);

		
	}

	public static void logResults(LogStatus status, String stepName, String StepDes) {
		
		objXTest.log(status, stepName, StepDes);
		
	}

	public static void logResults(LogStatus status, String stepName, String StepDes, String screenshot) {
		
		objXTest.log(status, stepName, StepDes);

	}

	public static void endTest() {
		objXtn.endTest(objXTest);
		objXtn.close();
	}

	
	public  void prepReporting() {
		// TODO Auto-generated method stub
		Log.startTestCase(stest);
		
	}

	@Override
	public void validate(String text, boolean passFail, boolean positiveCheck, byte[] screenShot) {
		

		validate(text,passFail);
		
	}

	@Override
	public void validate(String text, boolean passFail, boolean positiveCheck) {

		validate(text,passFail);
		
	}

	@Override
	public void validate(String text, boolean passFail) {
		
		ResultObject.AddStep(new StepReport(text,passFail));
		switch (Boolean.toString(passFail)) {
		case "true":				
			Log.info(text);
			this.logResults(LogStatus.PASS, text, Boolean.toString(passFail));
			break;

		case "false":
			Log.error(text);
			this.logResults(LogStatus.FAIL, text, Boolean.toString(passFail));
			break;
		}
		
		
	}

	@Override
	public void writeStep(String text) {
		Log.info(text);
		this.logResults(LogStatus.INFO, text,"");
		ResultObject.AddStep(new StepReport(text,true));
		
	}

	@Override
	public void writeReport() {
		Log.endTestCase(stest);
		ResultObject.CloseRun();
		
	}


	
}
