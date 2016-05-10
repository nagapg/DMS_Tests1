package com.alticor.magic.pages.inquiry.businfo;

import com.alticor.magic.pages.MagicPage;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicMyBusiness extends MagicPage {

    public MagicMyBusiness(WebDriver d, Report r) {
        super(d, r, "/EBS_UI_Web/MyBusiness");
    }

    @Override public String pageTitle() {
        return "MAGIC - My Business";
    }

    public DynamicElement numberOneBusinessBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='no1BusExpand']/div"));
    }

    public DynamicElement numberTwoBusinessBarLabel() {
        return getDynamicElement().addSearch(By.xpath(".//*[@id='no2BusExpand']/div[1]/span[1]"));
    }

    public DynamicElement globalMultiBusinessBarLabel() {
        return getDynamicElement()
            .addSearch(By.xpath(".//*[@id='globalMultiBusCollapse']/div/span[1]"));
    }

    public DynamicElement internationalSponsoredBusinessBarLabel() {
        return getDynamicElement()
            .addSearch(By.xpath(".//*[@id='intlSponBusExpand']/div[1]/span[1]"));
    }
}
