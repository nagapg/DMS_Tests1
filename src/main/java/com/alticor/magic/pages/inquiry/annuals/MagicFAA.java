package com.alticor.magic.pages.inquiry.annuals;


import com.alticor.magic.pages.MagicPage;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.WebDriver;

public class MagicFAA extends MagicPage {

    public MagicFAA(WebDriver d, Report r){
        super(d,r,"/EBS_UI_Web/FAA");
    }

    @Override
    public String pageTitle() {
        return "MAGIC - FAA";
    }
}
