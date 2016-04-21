package com.alticor.magic.test.suite;

import com.alticor.magic.test.pages.MagicPageTest;
import com.alticor.magic.test.pages.inquiry.bonus.MagicAmountFlowInquiryTest;
import com.alticor.magic.test.pages.inquiry.bonus.MagicBonusAmountTest;
import com.alticor.magic.test.pages.inquiry.bonus.MagicBonusVolumeTest;
import com.alticor.magic.test.pages.inquiry.bonus.MagicTransactionDetailTest;
import com.alticor.magic.test.pages.inquiry.businfo.MagicBusinessOwnerInfoTest;
import com.alticor.prowl.categories.SmokeTests;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Created by harolddost on 3/31/16.
 */
@RunWith( Categories.class )
@IncludeCategory( SmokeTests.class )
@SuiteClasses( { MagicPageTest.class, MagicAmountFlowInquiryTest.class, MagicBonusAmountTest.class,
                 MagicBonusVolumeTest.class, MagicTransactionDetailTest.class, MagicBusinessOwnerInfoTest.class})
public class AllSmokeTests {}
