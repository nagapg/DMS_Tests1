package com.alticor.magic.pages;

import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.alticor.magic.report.TestReport;

public class MagicDashboard extends MagicPage {

    public MagicDashboard(WebDriver d, TestReport r) {
        super(d, r, "/EBS_UI_Web/Magic");
    }

    public DynamicElement aboInfoBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='IboInfoExpand']/div[1]"));
    }

    public DynamicElement aboStatisticsBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='StatsExpand']/div[1]"));
    }

    public DynamicElement quickGlanceBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='IboOverviewExpand']/div[1]"));
    }

    public DynamicElement awardQualificationsBarLabel() {
        return getDynamicElement()
            .addSearch(By.xpath(".//*[@id='IboDashboardAwardsExpand']/div[1]"));
    }

    @Override public String pageTitle() {
        return "MAGIC - Dashboard";
    }
}
