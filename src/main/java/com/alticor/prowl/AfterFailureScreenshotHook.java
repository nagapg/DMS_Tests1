package com.alticor.prowl;

import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by harolddost on 4/1/16.
 */
public class AfterFailureScreenshotHook extends RunListener {

    @Override
    public void testFailure(Failure failure) throws Exception {
        saveScreenshot(failure.getTestHeader());
        super.testFailure(failure);
    }

    public void saveScreenshot(String fileName){
        try {
            String screenshotDirectory = System.getenv("SCREENSHOT_DIR");
            if(screenshotDirectory == null){
                screenshotDirectory = "target/screenshots";
            }
            new File(screenshotDirectory).mkdirs();
            FileOutputStream out = new FileOutputStream(getFullPath(fileName, screenshotDirectory));

            out.write(getScreenshot());
            out.close();
        }
        catch ( Exception e ){

        }
    }

    private String getFullPath(String fileName, String screenshotDirectory) {
        return screenshotDirectory
               + "/"
               + getDateString()
               + formatFileName(fileName) + ".png";}

    private String getDateString() {
        Date date = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("yyyymmddhhmmss");

        return dt.format(date);
    }

    private String formatFileName(String fileName) {
        int lastPerIndex = fileName.lastIndexOf('.');
        int openIndex = fileName.indexOf('(');
        int closeIndex = fileName.indexOf(')');
        return fileName.substring(lastPerIndex + 1,closeIndex)
               + "."
               + fileName.substring(0,openIndex);
    }

    private byte[] getScreenshot() {
        String browser = System.getenv("BROWSER");
        if ( browser == null ){
            browser = "firefox";
        }
        WebDriver driver = WebDriverManager.getInstance().getDriver(browser);
        byte[] shot =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        return shot;
    }
}
