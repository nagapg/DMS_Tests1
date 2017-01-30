package com.alticor.magic.report;



import java.util.Date;

import com.sun.jna.platform.win32.Guid.GUID;



public class StepReport {

	
    public GUID ID;// { get; set; }
    public GUID TestID;// { get; set; }
    public Date DateTime; // { get; set; }
    public String StepText; // { get; set; }
    public boolean PassFail; // { get; set; }
    public String AppVersion; // { get; set; }
    public byte[] ScreenShoot; // { get; set; }

    
    //This form of Step Report only outputs to console

    private String RID;
    private String CALLIP;
    private String BURL;
    private String ENV;
    private String TID;

    
    public StepReport(String stepText, GUID testID){
    	this(stepText, testID, true, "0",null);     	 
    }

	public StepReport(String stepText, GUID testID, boolean passFail){
    
		this(stepText,testID,passFail,"0",null);
    }

    public StepReport(String stepText, GUID testID, boolean passFail, String ApplicationVersion){

    	this(stepText,testID,passFail,ApplicationVersion ,null);
    }
    
    public StepReport(String stepText, GUID testID, boolean passFail, String ApplicationVersion, byte[] screenShoot)
    {
        ID = GUID.newGuid();
        DateTime = new Date();
        StepText = stepText;
        PassFail = passFail;
        TestID = testID;
        AppVersion = ApplicationVersion;
        ScreenShoot = screenShoot;
        Report();
    }

    private void Report()
    {
    	System.out.println(StepText + PassFail);
        //TODO: Some how write this object to the data table
    }
	
}
