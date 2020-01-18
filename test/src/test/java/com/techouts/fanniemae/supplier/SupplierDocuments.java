package com.techouts.fanniemae.supplier;

import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.SupplierDocumentsElements.model.SupplierDocumentsElements;
import com.fanniemae.automation.SupplierDocumentsElements.model.supplierDocumentsPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.EvalutionsAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierDocuments extends AbstractTest{
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingPageTitle=FanniemaeConstants.E;
	private int homePageTitle=FanniemaeConstants.F;
	private int status=FanniemaeConstants.G;
	private int keywords=FanniemaeConstants.J;
	private int documentType=FanniemaeConstants.AS;
	
	
	static {
		SupplierDocumentsElements SRE=new SupplierDocumentsElements();
		SRE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	@Test
	public void supplierDoc() {
		String testCaseName="SupplierDocuments";
		String serialNo="4";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingPageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homePageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), supplierDocumentsPage.supplierLink);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), supplierDocumentsPage.supplierDocument);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), supplierDocumentsPage.supplierDocumentSupplierDots);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.switchToFrame(getDriver(), 0);
		Evalutions e=new Evalutions();
		e.createsupplier(testCaseName);
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), supplierDocumentsPage.supplierDocumentType, REPOSITORY.getCellDataOnTestCase(serialNo, documentType, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), supplierDocumentsPage.supplierDocumentStatus, REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), supplierDocumentsPage.supplierDocumentKeywords, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), supplierDocumentsPage.supplierDocumentDisplayRadioBtn);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), supplierDocumentsPage.supplierDocumentSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), supplierDocumentsPage.supplierDocumentReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}


}
