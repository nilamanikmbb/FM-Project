package com.techouts.fanniemae.supplier;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.SupplierRegistrationElements.model.SupplierRegistrationElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.SupplierRegistrationAction;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;
import com.fanniemae.automation.SupplierRegistrationElements.model.supplierRegistrations;

public class SupplierReg extends AbstractTest {
	
	private static final Logger LOG = Logger.getLogger(SupplierReg.class.getName());

	private int userName = FanniemaeConstants.C;
	private int password = FanniemaeConstants.D;
	private int landingPageTitle = FanniemaeConstants.E;
	private int homePageTitle = FanniemaeConstants.F;
	static SupplierRegistrationAction SUPPLIERREGISTRATION_ACTION;
	
	static {
		SupplierRegistrationElements SRE=new SupplierRegistrationElements();
		SRE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		SUPPLIERREGISTRATION_ACTION = new SupplierRegistrationAction(SRE,DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	@Test
	public void supplierRegistrations(){
		String serialNo="1";
		String testCaseName="Supplier Registration";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(), supplierRegistrations.supplierLink);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		SUPPLIERREGISTRATION_ACTION.supplierRegiPage(serialNo, DEFAULT_SHEET_NAME);
		LOG.info("Supplier Registration completed");
		HOMEPAGE_ACTIONS.logout(testCaseName);
		
	}
}
