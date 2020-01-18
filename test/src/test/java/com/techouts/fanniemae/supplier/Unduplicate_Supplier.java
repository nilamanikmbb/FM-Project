package com.techouts.fanniemae.supplier;

import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.UnduplicateSupplierElements.model.UnduplicateSupplierElements;
import com.fanniemae.automation.UnduplicateSupplierElements.model.UnduplicateSupplierPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.UnduplicateSupplierAction;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class Unduplicate_Supplier extends AbstractTest{
	
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int homePageTitle=FanniemaeConstants.F;
	static UnduplicateSupplierAction UNDUPLICATESUPPLIER_ACTION;
	
	
	static {
		UnduplicateSupplierElements USE=new UnduplicateSupplierElements();
		USE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		UNDUPLICATESUPPLIER_ACTION = new UnduplicateSupplierAction(USE,DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	@Test
	public void unduplicateSupplier() {
		String testCaseName="UnduplicateSupplier";
		String serialNo="5";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME));  
		WebElementOperations.click(getDriver(), UnduplicateSupplierPage.supplierLink);
		UNDUPLICATESUPPLIER_ACTION.unduplicateSupplierPage(serialNo, DEFAULT_SHEET_NAME);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}

}
