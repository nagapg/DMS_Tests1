package com.alticor.magic.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicBonusVolume extends MagicPage {

    public MagicBonusVolume(WebDriver d, TestReport r) {
        super(d, r, "/EBS_UI_Web/BonusVolume");
    }

    @Override public String pageTitle() {
        return "MAGIC - Volumes";
    }

    public DynamicElement monthlyVolumeBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='IboBonusDtlExpand']/div[1]"));
    }

    public DynamicElement annualVolumeBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AnnVolumeExpand']/div[1]"));
    }
}
