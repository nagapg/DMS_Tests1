package io.swarmauto.driverextended;
import io.swarmauto.driverextended.Reports.*;

/**
 * Created by harolddost on 4/5/16.
 */
public class SafeReport implements Report{

    private Report report;

    private SafeReport(){
        // Requires report to instantiate
    	
    }

    public SafeReport(Report r){
        report = r;
    }

   
    public void prepReporting() {
        if(report != null){
            report.prepReporting();
        }
    }

   
    public void validate(String text, boolean passFail, boolean positiveCheck, byte[] screenShot) {
        if(report != null){
            report.validate(text, passFail, positiveCheck, screenShot);
        }
    }

    
    public void validate(String text, boolean passFail, boolean positiveCheck) {
        if(report != null){
            report.validate(text, passFail, positiveCheck);
        }
    }

   
    public void validate(String text, boolean passFail) {
        if(report != null){
            report.validate(text,passFail);
        }
    }

 
    public void writeStep(String text) {
        if(report != null){
            report.writeStep(text);
        }
    }

  
    public void writeReport() {
        if(report != null){
            report.writeReport();
        }
    }
}
