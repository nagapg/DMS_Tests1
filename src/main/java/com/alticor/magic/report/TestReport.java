package com.alticor.magic.report;



import java.util.Date;

import com.sun.jna.platform.win32.Guid.GUID;

public class TestReport {
	
	
    public GUID RunID; 
    public GUID ID; 
    public String Name; 
    public Date StartTime ;
    public Date EndTime; 
    public boolean PassFail; 
    
    public String BaseURL; 
    public String Browser; 
    public String TaskID; 
    

    public TestReport(String name, Parms par, GUID TestID)
    {
        BaseURL = par.BaseURL;
        ID = TestID;
        StartTime = new Date();
        
        Name = name;
        
        PassFail = true;
        RunID = par.RunID;
        Browser = par.Browser;
        PreReport(par);
    }

    public TestReport(String name, Parms par)
    {            
        BaseURL = par.BaseURL;
        
         
        StartTime = new Date();
       
        Name = name;
        
        PassFail = true;
        RunID = par.RunID;
        Browser = par.Browser;
        if ((par.TestID == null))
        {
            ID = GUID.newGuid();
        }
        else
        {
            ID = par.TestID;
        }
        PreReport(par);
    }

    public void Close()
    {
        EndTime = new Date();

        // determine if the test was a pass or fail 

        Report();

    }

    private void PreReport(Parms par)
    {
    	//TODO: setup Database connections to write or retrieve test info from prowl
        //DatabaseActions.ProwlDBPreTest(this, par);
    }

    private void Report()
    {
    	//TODO: setup Closure of test if it  was created with in the test if not leave it open for other process to close
        //DatabaseActions.ProwlDBPostTest(this);
    }
	

}


