package com.alticor.magic.report;

import com.sun.jna.platform.win32.Guid.GUID;

public class Parms {

	        
	        public GUID RunID; 
	        public GUID TestID;
	        public String CallingIP;
	        public String BaseURL; 
	        public String Browser;
	        public String Env;

	        
	        public Parms(){
	        	
	        this.RunID = GUID.fromString(System.getenv("RunID"));
	        this.TestID = GUID.fromString(System.getenv("TestID"));
	        this.CallingIP = System.getenv("CallingIP");
	        this. BaseURL = System.getenv("BaseURL");
	        this.Env = System.getenv("Environment");
	        this.Browser = System.getenv("Browser");
	        
	        }
	        
	        public Parms(GUID Run, String Ip, String BaseUrl, String Browser, String ENV){
	        	this(Run, null, Ip, BaseUrl, Browser, ENV);
	        }
	        
	        public Parms(GUID Run, GUID Test, String Ip, String BaseUrl, String Browser, String ENV){
		        this.RunID = Run;
		        this.TestID = Test;
		        this.CallingIP = Ip;
		        this. BaseURL = BaseUrl;
		        this.Env = ENV;
		        this.Browser = Browser;
	        }
	        	      

	        
	    }

