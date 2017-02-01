package com.alticor.magic.report;

import com.sun.jna.platform.win32.Guid.GUID;

public class Parms {

	        
	        public String RunID; 
	        public String TestID;
	        public String CallingIP;
	        public String BaseURL; 
	        public String Browser;
	        public String Env;

	        
	        public Parms(){
	        try{	
	        this.RunID = GUID.fromString(System.getenv("RunID")).toGuidString();
	        }
	        catch(NullPointerException e)
	        {
	        	System.out.println("No Run GUID Detected defaulting to debug Run");
	        	this.RunID = "00000000-0000-0000-0000-000000000000";
	        }
	        try{
	        this.TestID = GUID.fromString(System.getenv("TestID")).toGuidString();
	        
	        }
	        catch(NullPointerException ex){
	        	System.out.println("No Test GUID Detected generating new test GUID");
	        	this.TestID = GUID.newGuid().toGuidString();
	        	System.out.println(this.TestID);
	        	
	        }
	        
	        this.CallingIP = System.getenv("CallingIP");
	        if(this.CallingIP == null){
	        
	        	this.CallingIP = "";
	        
	        }
	        this. BaseURL = System.getenv("BaseURL");
	        if(this.BaseURL == null){
		        
	        	this.BaseURL = "";
	        
	        }
	        this.Env = System.getenv("Environment");
	        if(this.Env == null){
		        
	        	this.Env = "";
	        
	        }
	        this.Browser = System.getenv("Browser");
	        if(this.Browser == null){
		        
	        	this.Browser = "";
	        
	        }
	        
	        }
	        /*
	        public Parms(String Run, String Ip, String BaseUrl, String Browser, String ENV){
	        	this(Run, null, Ip, BaseUrl, Browser, ENV);
	        }*/
	        
	        public Parms(String Run, String Test, String Ip, String BaseUrl, String Browser, String ENV){
		        this.RunID = Run;
		        this.TestID = Test;
		        this.CallingIP = Ip;
		        this. BaseURL = BaseUrl;
		        this.Env = ENV;
		        this.Browser = Browser;
	        }
	        	      

	        
	    }

