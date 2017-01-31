package com.alticor.magic.pages.inquiry.award;


import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicAwardQualifications extends MagicPage {

    public MagicAwardQualifications(WebDriver d, TestReport r) {
        super(d, r, "/EBS_UI_Web/Qualifications");
    }

    @Override public String pageTitle() {
        return "MAGIC - Qualifications";
    }

    public DynamicElement qualificationsBarLabel() {
        return getDynamicElement()
            .addSearch(By.xpath(".//*[@id='IboDashboardAwardsExpand']/div[1]"));
    }
}
