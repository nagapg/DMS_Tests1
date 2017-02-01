package com.alticor.magic.report;



import java.util.ArrayList;
import java.util.Calendar;
import java.sql.Timestamp;

import com.sun.jna.platform.win32.Guid.GUID;



public class TestReport {
	
	
    public String RunID; 
    public String ID; 
    public String Name; 
    public Timestamp StartTime ;
    public Timestamp EndTime; 
    public boolean PassFail; 
    
    public String BaseURL; 
    public String Browser; 
    public String TaskID; 
    
    public ArrayList<StepReport> steps = new ArrayList<StepReport>(); 
    

    public TestReport(String name, Parms par, String TestID)
    {
        BaseURL = par.BaseURL;
        ID = TestID;
        Calendar currenttime = Calendar.getInstance();
        StartTime = new Timestamp((currenttime.getTime()).getTime());

        
        
        Name = name;
        
        PassFail = true;
        RunID = par.RunID;
        Browser = par.Browser;
        PreReport(par);
  
        steps.add(new StepReport("Test Start",ID));
    }

    public TestReport(String name, Parms par)
    {            
        BaseURL = par.BaseURL;
        
         
        Calendar currenttime = Calendar.getInstance();
        StartTime = new Timestamp((currenttime.getTime()).getTime());
       
        Name = name;
        
        PassFail = true;
        RunID = par.RunID;
        Browser = par.Browser;
        if ((par.TestID == null))
        {
            ID = GUID.newGuid().toGuidString();
        }
        else
        {
            ID = par.TestID;
        }
        PreReport(par);
    }

    public void Close()
    {
    	Calendar currenttime = Calendar.getInstance();
        EndTime = new Timestamp((currenttime.getTime()).getTime());

        // determine if the test was a pass or fail 

        Report();

    }

    private void PreReport(Parms par)
    {
    	if(!DatabaseConnect.ProwlDBTestExist(this))
    	{
    		System.out.println("Test Not Found in DB Creating Record for " + this.ID);
    		DatabaseConnect.ProwlDBPreTest(this, par);
    	}
    	else
    	{
    	   System.out.println("Test found in DB.  Using Identified record " + this.ID);
    	}
    	//TODO: setup Database connections to write or retrieve test info from prowl
        //DatabaseActions.ProwlDBPreTest(this, par);
    }

    private void Report()
    {
    	//TODO: setup Closure of test if it  was created with in the test if not leave it open for other process to close
        DatabaseConnect.ProwlDBPostTest(this);
    }
    
    public void AddStep(StepReport testStep)
    {
    	    	
    	try{
    		steps.add(testStep);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    
	

}


