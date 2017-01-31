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
	if(par.BaseURL.isEmpty()){ 
		par.BaseURL = "";
		}
	
	
	CallableStatement call = null;
	
	try{
		call = connect().prepareCall("{call QTB19000_SELENIUM_TST_RSULT_APP.dbo.QTP19010_TST_RSULT_DTL_ISRT(?,?,?,?,?,?,?,?,?,?,?,?)}");
		
		call.setString("@pc_TEST_ID", REPORT.ID);
		call.setString("@pc_RUN_ID", REPORT.RunID);
		call.setString("@pc_TEST_NM", REPORT.Name);
		call.setString("@pc_TEST_STRT_DTM",REPORT.StartTime.toString());
		call.setString("@pc_HOST_ADDR_IP_TXT", par.CallingIP);
		call.setString("@pc_TEST_BASE_URL_TXT", par.BaseURL);
		call.setString("@pc_LANG_URL_PARM_TXT", "NA");
		call.setString("@pc_PAGE_LOAD_TIME_OUT_MS_QTY", "0");
		call.setString("@pc_DEBUG_MOD_FLG", "false");
		call.setString("@pc_HARNS_RLSE_VERSN_ID", "0");
		call.setString("@pc_Browser", REPORT.Browser);
		if(REPORT.TaskID.isEmpty())
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


 
 


