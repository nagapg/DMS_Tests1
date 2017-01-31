package com.alticor.magic.report;



import java.util.Date;



public class StepReport {

	
    public String ID;// { get; set; }
    public String TestID;// { get; set; }
    public Date DateTime; // { get; set; }
    public String StepText; // { get; set; }
    public boolean PassFail; // { get; set; }
    public String AppVersion; // { get; set; }
    public byte[] ScreenShoot; // { get; set; }


    
    public StepReport(String stepText, String testID){
    	this(stepText, testID, true, "0",null);     	 
    }

	public StepReport(String stepText, String testID, boolean passFail){
    
		this(stepText,testID,passFail,"0",null);
    }

    public StepReport(String stepText, String testID, boolean passFail, String ApplicationVersion){

    	this(stepText,testID,passFail,ApplicationVersion ,null);
    }
    
    public StepReport(String stepText, String testID, boolean passFail, String ApplicationVersion, byte[] screenShoot)
    {
       
        DateTime = new Date();
        StepText = stepText;
        PassFail = passFail;
        TestID = testID;
        int StepNumber = Reports.CurrentTest.steps.size() + 1;
    	
    	this.ID = TestID+ "." + StepNumber;
        AppVersion = ApplicationVersion;
        ScreenShoot = screenShoot;
        Report();
    }

    private void Report()
    {
    
    	System.out.println(ID + " : " + StepText +" : " +  PassFail  );
    	//System.out.println("TestID:" + TestID);

    }
	
}
