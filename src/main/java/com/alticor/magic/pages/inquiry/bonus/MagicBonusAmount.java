package com.alticor.magic.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicBonusAmount extends MagicPage {

    public MagicBonusAmount(WebDriver d, Report r) {
        super(d, r, "/EBS_UI_Web/BonusAmount");
    }

    @Override public String pageTitle() {
        return "MAGIC - Amounts";
    }

    public DynamicElement monthlyAmountsBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='IboAmountsDtlExpand']/div[1]"));
    }

    public DynamicElement annualAmountsBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='AnnAmountsExpand']/div[1]"));
    }
}
