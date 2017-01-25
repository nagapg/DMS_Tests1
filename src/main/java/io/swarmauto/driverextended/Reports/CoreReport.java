package io.swarmauto.driverextended.Reports;

import java.time.LocalDateTime;

import com.sun.jna.platform.win32.Guid.GUID;

public class CoreReport {
	
	
	
	public String Name;
	public LocalDateTime StartTime; 
	public LocalDateTime EndTime;
	public GUID ID;
	public String Description;
	public boolean OutCome;

	
	private String internalName;
	private LocalDateTime internalStartTime;
	private LocalDateTime internalEndTime;
	private GUID internalID;
	private String internalDescription;
	@SuppressWarnings("unused")
	private boolean reportOpen;
	
	
	
	
	protected CoreReport()
	{
		setInternalStartTime(LocalDateTime.now());
		reportOpen = true;
	}
	protected CoreReport(GUID idToSet)
	{
        setInternalID(idToSet);
		setInternalStartTime(LocalDateTime.now());
		reportOpen = true;
	}
	
	
	public void close()
	{
		setInternalEndTime(LocalDateTime.now());
		reportOpen = false;
	}
	
	/**
	 * @param internalName the internalName to set
	 */
	protected void setInternalName(String internalName) {
		this.internalName = internalName;
	}
	/**
	 * @param internalStartTime the internalStartTime to set
	 */
	protected void setInternalStartTime(LocalDateTime internalStartTime) {
		this.internalStartTime = internalStartTime;
	}
	/**
	 * @param internalEndTime the internalEndTime to set
	 */
	protected void setInternalEndTime(LocalDateTime internalEndTime) {
		this.internalEndTime = internalEndTime;
	}
	/**
	 * @param internalID the internalID to set
	 */
	protected void setInternalID(GUID internalID) {
		this.internalID = internalID;
	}
	/**
	 * @param internalDescription the internalDescription to set
	 */
	protected void setInternalDescription(String internalDescription) {
		this.internalDescription = internalDescription;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return internalName;
	}

	/**
	 * @return the startTime
	 */
	public LocalDateTime getStartTime() {
		return internalStartTime;
	}

	/**
	 * @return the endTime
	 */
	public LocalDateTime getEndTime() {
		return internalEndTime;
	}

	/**
	 * @return the iD
	 */
	public GUID getID() {
		return internalID;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return internalDescription;
	}
	
	public boolean getOutCome(){
		return OutCome;
	}
	
	public void setOutCome(boolean OutComeToSet){
		OutCome = OutComeToSet;		
	}


}
