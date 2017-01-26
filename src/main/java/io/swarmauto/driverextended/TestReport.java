package io.swarmauto.driverextended;

import java.util.ArrayList;

import io.swarmauto.driverextended.Reports.CoreReport;

public class TestReport extends CoreReport implements Report {
	
	public StepReport[] TestList;

	private ArrayList<StepReport> internalTestList;
	
	public TestReport(String TestName, String TestDescription)
	{
		super();

		setInternalName(TestName);
		setInternalDescription(TestDescription);
		
	}
	
	public TestReport(String TestName)
	{
		super();

		setInternalName(TestName);
		setInternalDescription("No Description Provided.");
		
	}
	
	public TestReport()
	{
		super();
		setInternalName("NameLessRun" + StartTime.toString());
		setInternalDescription("No Description Provided.");
	
	}
	
	public boolean AddStep(StepReport Step)
	{
		boolean StepAdded = true;
		
		
		try
		{
			if(!internalTestList.contains(Step))
			{
			internalTestList.add(Step);
			
			StepAdded = true;
			}
		
			else
			{
				StepAdded = false;
			
			}
			
		}
		catch(Exception e)
		{
		
		 StepAdded = false;
		}
		
			return StepAdded;
		
		
		
	}
	
	public void CloseRun()
	{
		super.close();
	}

	@Override
	public void prepReporting() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validate(String text, boolean passFail, boolean positiveCheck, byte[] screenShot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validate(String text, boolean passFail, boolean positiveCheck) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validate(String text, boolean passFail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeStep(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeReport() {
		// TODO Auto-generated method stub
		
	}
	
	

}
