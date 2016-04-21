package com.alticor.magic.pages.inquiry.businfo;

import com.alticor.magic.pages.MagicPage;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicBusinessOwnerInfo extends MagicPage {

    public MagicBusinessOwnerInfo(WebDriver d, Report r){
        super(d,r,"/EBS_UI_Web/BusinessOwnerInfo");
    }

    public DynamicElement uplineInformationBarLabel(){
        return getDynamicElement().addSearch(By.xpath(".//*[@id='IboUplineExpand']/div[1]"));
    }

    public DynamicElement uplineMapBarLabel(){
        return getDynamicElement().addSearch(By.xpath(".//*[@id='IboUplineMapExpand']/div[1]"));
    }

    @Override
    public String pageTitle() {
        return "MAGIC - Upline";
    }
}
