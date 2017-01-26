package io.swarmauto.driverextended;

import io.swarmauto.driverextended.Reports.CoreReport;

public class StepReport extends CoreReport {

	
	public StepReport(String Text, boolean OutCome)
	{
		super();
		this.Name = Text;
		this.setOutCome(OutCome);
		this.close();
	}
	
	
	
	

}
