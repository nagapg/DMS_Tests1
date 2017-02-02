package com.alticor.magic.report;
import java.sql.*;
public class DatabaseConnect {

private static final String ProwlDBServer = "jdbc:jtds:sqlserver://DB-AMW-QA-PROWL-PRD:1433";
private static final String ProwlDBUser = "CMNUY13";
private static final String ProwlDBpass = "i9KwxjGYVqcT6x";
   

public  static void main(String[] args)
    {        
	        //connection.dbConnect(ProwlDBServer, ProwlDBUser, ProwlDBpass);
		try
		{
			connect();
			System.out.println("connected");
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
    }



public static boolean ProwlDBPreTest(TestReport REPORT, Parms par){
	
	 
	
	try{
		CallableStatement call = connect().prepareCall("{call QTB19000_SELENIUM_TST_RSULT_APP.dbo.QTP19010_TST_RSULT_DTL_ISRT(?,?,?,?,?,?,?,?,?,?,?,?)}");
		//@pc_DEBUG_MODE_FLG
		call.setString("@pc_TEST_ID", REPORT.ID);
		call.setString("@pc_RUN_ID", REPORT.RunID);
		call.setString("@pc_TEST_NM", REPORT.Name);
		call.setTimestamp("@pc_TEST_STRT_DTM",REPORT.StartTime);
		call.setString("@pc_HOST_ADDR_IP_TXT", par.CallingIP);
		call.setString("@pc_TEST_BASE_URL_TXT", par.BaseURL);
		call.setString("@pc_LANG_URL_PARM_TXT", "NA");
		call.setString("@pc_PAGE_LOAD_TIME_OUT_MS_QTY", "0");
		call.setString("@pc_DEBUG_MODE_FLG", "false");
		call.setString("@pc_HARNS_RLSE_VERSN_ID", "0");
		call.setString("@pc_Browser", REPORT.Browser);
		if(REPORT.TaskID == null)
		{
			call.setString("@pc_Work_Item_Id", "0");
			
		}
		else
		{
			call.setString("@pc_Work_Item_Id", REPORT.TaskID);
		}	
		
		return call.execute();		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
		return false;
	}
}

public static boolean ProwlDBTestExist(TestReport Report)
{
	int results = 0;
	try
	{
	CallableStatement call = connect().prepareCall("{call QTB19000_SELENIUM_TST_RSULT_APP.dbo.QTP19010_TST_RSULT_DTL_GET(?)}");
	call.setString("@pc_TST_ID", Report.ID);
	
    call.execute();
	results = call.getMaxRows();
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
	
	if (results > 0 )
	{
		return true;}
	else{ return false;}
	}

public static boolean ProwlDBPostTest(TestReport report)
{
   
	try
	{
		CallableStatement call = connect().prepareCall("{call QTB19000_SELENIUM_TST_RSULT_APP.dbo.QTP19010_TST_RSULT_DTL_UPD(?,?,?,?)}");
        

		call.setString("@pc_TEST_ID", report.ID);
		call.setString("@pc_TEST_END_DTM", report.EndTime.toString());
		if(report.PassFail)
		{
			call.setString("@pc_TEST_RSULT_CD", "0");
		}
		else
		{
			call.setString("@pc_TEST_RSULT_CD", "1");
		}
		
		call.setString("@pc_Work_Item_Id", report.TaskID);
		
		return call.execute();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
		return false;
	}
       
    
}

public static boolean ProwlDBStoreStep(StepReport report){
	boolean CallSuccessful = false;
	try{
		CallableStatement call = connect().prepareCall("{call QTB19000_SELENIUM_TST_RSULT_APP.dbo.QTP19020_STEP_RSULT_DTL_ISRT(?,?,?,?,?,?,?,?,?,?,?)}");
        
        call.setString("@pc_TEST_STEP_ID", report.ID);
        call.setString("@pc_TEST_ID", report.TestID);
        call.setTimestamp("@pc_STEP_STRT_DTM", report.DateTime);
        call.setTimestamp("@pc_STEP_END_DTM",  report.DateTime);
        call.setString("@pc_STEP_NM", report.StepText);
        call.setBoolean("@pc_STEP_RSULT_CD", report.PassFail);
        call.setString("@pc_ERR_ID", report.StepText);
        call.setString("@pc_INPUT_DATA_TXT", "");
        call.setString("@pc_WFE_SERVR_NM", "");
        call.setString("@pc_AGENT_IP_ADR_TXT", ""); // needs to be implemented in the future
        call.setString("@pc_APP_RLSE_VERSN_ID", "null");
        
        CallSuccessful =  call.execute();
        
        if(report.ScreenShoot != null){
        	
        	CallableStatement StoreCsreenShot = connect().prepareCall("{call QTB19000_SELENIUM_TST_RSULT_APP.dbo.QTP19021_TEST_STEP_IMG_INS(?,?,?)}");
        	StoreCsreenShot.setString("@pcTEST_STEP_ID", report.ID);
        	StoreCsreenShot.setString("@pcPAGE_IMG_ID", report.ID + "_ScreenShot");
        	StoreCsreenShot.setBytes("@pcPage_IMG_TXT", report.ScreenShoot);
        	
        	CallSuccessful = StoreCsreenShot.execute();
        	
        }
        
        return CallSuccessful;
        	
	}
	catch(Exception e){
		e.printStackTrace();
		return false;
	}
		
	
	
}

private static Connection connect() throws Exception{	
		try
		{
	    Class.forName("net.sourceforge.jtds.jdbc.Driver");
	    return DriverManager.getConnection(ProwlDBServer, ProwlDBUser, ProwlDBpass);
		}
		catch(Exception e)
		{
			throw e;
		}
	}


}


 
 


