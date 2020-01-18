package com.techouts.fanniemae.supplier;

import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.SupplierRiskIndicatorElements.model.SupplierRiskIndicatorElements;
import com.fanniemae.automation.SupplierRiskIndicatorElements.model.SupplierRiskIndicatorPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.SupplierRiskIndicatorAction;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierRiskIndicator extends AbstractTest{
	
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int homePageTitle=FanniemaeConstants.F;
	static SupplierRiskIndicatorAction SUPPLIERRISKINDICATOR_ACTION;
	
	
	static {
		SupplierRiskIndicatorElements SRIE=new SupplierRiskIndicatorElements();
		SRIE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		SUPPLIERRISKINDICATOR_ACTION = new SupplierRiskIndicatorAction(SRIE,DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	@Test
	public void supplierRiskIndicator() {
		String testCaseName="SupplierRiskIndicator";
		String serialNo="7";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(), SupplierRiskIndicatorPage.supplierLink);
		SUPPLIERRISKINDICATOR_ACTION.supplierRiskIndicatorPage(serialNo, DEFAULT_SHEET_NAME);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}


}
