package com.alticor.magic.pages.inquiry.bonus;

import com.alticor.magic.pages.MagicPage;
import com.alticor.magic.report.TestReport;

import io.swarmauto.driverextended.DynamicElement;
import io.swarmauto.driverextended.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MagicTransactionDetail extends MagicPage {

    public MagicTransactionDetail(WebDriver d, TestReport r) {
        super(d, r, "/EBS_UI_Web/TransactionDetail");
    }

    @Override public String pageTitle() {
        return "MAGIC - Transactions";
    }

    public DynamicElement transactionBarLabel() {
        return getDynamicElement()
            .addSearch(By.xpath(".//*[@id='IboTrxDtlExpand']/form/div/span[1]"));
    }
}
