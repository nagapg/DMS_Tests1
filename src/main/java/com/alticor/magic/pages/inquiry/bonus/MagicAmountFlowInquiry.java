package com.alticor.magic.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicAmountFlowInquiry extends MagicPage {


    public MagicAmountFlowInquiry(WebDriver d, TestReport r) {
        super(d, r, "/EBS_UI_Web/AmountFlowInq");
    }

    @Override public String pageTitle() {
        return "MAGIC - Generator Flow";
    }

    public DynamicElement iblFlowBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AmountFlowExpand']/div"));
    }
}
