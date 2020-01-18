package com.techouts.fanniemae.supplier;

import org.testng.annotations.Test;

import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.SupplierPerfomanceElements.model.CreateNewCampaign;
import com.fanniemae.automation.SupplierPerfomanceElements.model.SupplierPerfomanceElements;
import com.fanniemae.automation.SupplierPerfomanceElements.model.SupplierPerformancePage;
import com.fanniemae.automation.SupplierRiskIndicatorElements.model.SupplierRiskIndicatorElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.ConfigureQuestionnairesPageAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.test.page.actions.SupplierPerformancePageAction;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class SupplierPerformance extends AbstractTest{
	
	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingpageTitle=FanniemaeConstants.E;
	private int homepageTitle=FanniemaeConstants.F;
	private int commodity=FanniemaeConstants.H;
	private int keywords=FanniemaeConstants.J;
	private int organisation=FanniemaeConstants.K;
	private int type=FanniemaeConstants.L;
	
	String serialNo="8";
	static SupplierPerformancePageAction SUPPLIERPERFORMANCE_ACTION ;
	
	static {
		SupplierPerfomanceElements SPE=new SupplierPerfomanceElements();
		SPE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		SUPPLIERPERFORMANCE_ACTION = new SupplierPerformancePageAction(SPE,DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	
	@Test
	public void supplierPerformance() {
		String testCaseName="SupplierPerformance";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingpageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homepageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(), SupplierPerformancePage.supplierLink);
		WebElementOperations.click(getDriver(), SupplierPerformancePage.SupplierPerformanceLink);
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),SupplierPerformancePage.SupplierPerformancKeywords, REPOSITORY.getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(),SupplierPerformancePage.SupplierPerformancType, REPOSITORY.getCellDataOnTestCase(serialNo, type, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(),SupplierPerformancePage.supplierPerformancSearch);
		WebElementOperations.park(3);
		WebElementOperations.sendKeys(getDriver(),SupplierPerformancePage.SupplierPerformancOrganistion, REPOSITORY.getCellDataOnTestCase(serialNo, organisation, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(),SupplierPerformancePage.SupplierPerformancCommodity, REPOSITORY.getCellDataOnTestCase(serialNo, commodity, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),SupplierPerformancePage.SupplierPerformancSuppliersDots);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.switchToFrame(getDriver(), 0);
		Evalutions e=new Evalutions();
		e.createsupplier(testCaseName);
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		WebElementOperations.click(getDriver(),SupplierPerformancePage.supplierPerformancReset);
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(),SupplierPerformancePage.SupplierPerformancCampaign);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		SUPPLIERPERFORMANCE_ACTION.createcampaign(serialNo, DEFAULT_SHEET_NAME);
		WebElementOperations.park(3);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}
}
