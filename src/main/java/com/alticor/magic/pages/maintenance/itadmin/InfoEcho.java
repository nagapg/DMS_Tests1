package com.alticor.magic.pages.maintenance.itadmin;

import com.alticor.magic.pages.MagicPage;
import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfoEcho extends MagicPage {

    public InfoEcho(WebDriver d, Report r){
        super(d,r,"/EBS_UI_Web/InfoEcho");
    }

    @Override
    public String pageTitle() {
        return "MAGIC - Info Echo";
    }

    public DynamicElement getBuildPropertiesPanel(){
        return getDynamicElement().addSearch(By.xpath(".//*[@id='BuildPropsDtlExpand']"));
    }

    public DynamicElement getRevisionNumberField(){
        return getDynamicElement().addSearch(By.xpath(".//*[@id='BuildPropsDtlExpand']/table/tbody/tr[1]/td[2]/b"));
    }

    public DynamicElement getBranchField(){
        return getDynamicElement().addSearch(By.xpath(".//*[@id='BuildPropsDtlExpand']/table/tbody/tr[2]/td[2]/b"));
    }

    public DynamicElement getBuildDateField(){
        return getDynamicElement().addSearch(By.xpath(".//*[@id='BuildPropsDtlExpand']/table/tbody/tr[3]/td[2]/b"));
    }
}
