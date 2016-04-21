package com.alticor.magic.pages.inquiry.award;

import com.alticor.magic.pages.MagicPage;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicAwardInquiry extends MagicPage {

    public MagicAwardInquiry(WebDriver d, Report r) {
            super(d, r, "/EBS_UI_Web/AwardInquiry");
    }

    @Override
    public String pageTitle() {
        return "MAGIC - Award Details";
    }

    public DynamicElement annualFrontLinersBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AwardInfoExpand']/div[1]/span[1]"));
    }

    public DynamicElement awardInformationBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AwdHistExpand']/div[1]"));
    }

    public DynamicElement trackLegsBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='TrackLegsExpand']/div[1]"));
    }

    public DynamicElement highestAwardBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='HighestAwdTrackExpand']/div[1]"));
    }

    public DynamicElement awardTrackingBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AwardTrackExpand']/div[1]"));
    }

    public DynamicElement annualFrontLinersAppError() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AwardInquiry']/tbody/tr[2]/td[1]"));
    }
}
