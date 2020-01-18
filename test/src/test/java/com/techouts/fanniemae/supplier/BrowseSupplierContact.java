package com.techouts.fanniemae.supplier;

import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.SupplierContactElements.model.SupplierContactElements;
import com.fanniemae.automation.SupplierContactElements.model.SupplierContactPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class BrowseSupplierContact extends AbstractTest{
	
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int homePageTitle=FanniemaeConstants.F;
	private int keywords=FanniemaeConstants.J;
	
	{
		SupplierContactElements SCE = new SupplierContactElements();
		SCE.init(DRIVER);
		ElementsFactory EF =new ElementsFactory();
		EF.init(DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(EF, DRIVER);
	}
	
	@Test
	public void supplierContact() {
		String testCaseName="SupplierContact";
		String serialNo="6";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierLink);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.browseSupplierContactLink);
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), SupplierContactPage.supplierContactsKeywords, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierContactsSupplierThreeDots);
		WebElementOperations.park(2);
		WebElementOperations.switchToFrame(getDriver(), 0);
		Evalutions e=new Evalutions();
		e.createsupplier(testCaseName);
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		WebElementOperations.park(2);
		WebElementOperations.dropDownByIndex(getDriver(), SupplierContactPage.supplierContactsContactType, 2);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierContactDeleteRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierContactViewPhotosRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierContactWithoutAScopeRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierContactSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 15);
		WebElementOperations.click(getDriver(), SupplierContactPage.supplierContactReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(), 2);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}
	

}
