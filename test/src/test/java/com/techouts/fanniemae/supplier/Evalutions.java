package com.techouts.fanniemae.supplier;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.CorporateSupplierElementsFactory.model.CorporateSupplierElementsFactory;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.EvalutionElements.model.EvalutionElements;
import com.fanniemae.automation.EvalutionElements.model.browseContracts;
import com.fanniemae.automation.EvalutionElements.model.createSupplier;
import com.fanniemae.automation.EvalutionElements.model.evalutionPage;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateRealEstateBrokerAction;
import com.fanniemae.automation.test.page.actions.EvalutionsAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class Evalutions extends AbstractTest{
	private static final Logger LOG = Logger.getLogger(SupplierReg.class.getName());

	private int userName=FanniemaeConstants.C;
	private int password=FanniemaeConstants.D;
	private int landingpageTitle=FanniemaeConstants.E;
	private int homepageTitle=FanniemaeConstants.F;
	
	private int evaluatedPeriod=FanniemaeConstants.P;
	private int evaluator=FanniemaeConstants.Q;
	private int status=FanniemaeConstants.G;
	private int questinnier=FanniemaeConstants.R;
	private int type=FanniemaeConstants.L;
	private int keywords=FanniemaeConstants.J;
	private int state=FanniemaeConstants.U;
	private int supplierOverview=FanniemaeConstants.V;
	private int supplierType=FanniemaeConstants.W;
	private int supplierHierarchy=FanniemaeConstants.AR;
	private int organisation=FanniemaeConstants.K;
	private int regionserved=FanniemaeConstants.X;
	private int userBMSupplier=FanniemaeConstants.Y;
	private int PSID=FanniemaeConstants.Z;
	private int activeSupplier=FanniemaeConstants.AA;
	private int criticality=FanniemaeConstants.AB;
	private int alerts=FanniemaeConstants.I;
	private int taxNumber=FanniemaeConstants.AC;
	private int city=FanniemaeConstants.AD;
	private int zipCode=FanniemaeConstants.AE;
	private int follow=FanniemaeConstants.AF;
	private int reqDocMissing=FanniemaeConstants.AG;
	private int conformity=FanniemaeConstants.AH;
	private int validity=FanniemaeConstants.AI;
	private int folder=FanniemaeConstants.AJ;
	private int contractKeywords=FanniemaeConstants.J;
	private int contractType=FanniemaeConstants.AK;
	private int contractCostCenter__Management=FanniemaeConstants.K;
	private int contractDateFrom=FanniemaeConstants.AL;
	private int contractDateTo=FanniemaeConstants.AM;
	private int contractContact=FanniemaeConstants.Y;
	private int contractProjectCode=FanniemaeConstants.AO;
	private int contractProjectSoftProject=FanniemaeConstants.AP;
	private int contractAlerts=FanniemaeConstants.AQ;
	private int contractPrimaryCategory=FanniemaeConstants.AN;
	
	String serialNo="3";
	
	static {
		EvalutionElements EE=new EvalutionElements();
		EE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	}
	
	@Test
	public void evalutions() {
		String testCaseName="Evalution";
		getFannieMaePage();
		Assert.assertTrue(WebElementOperations.verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(serialNo, landingpageTitle, DEFAULT_SHEET_NAME)));
		HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(serialNo, userName, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(serialNo, homepageTitle, DEFAULT_SHEET_NAME));
		WebElementOperations.click(getDriver(), evalutionPage.supplierLink);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsLink);
		WebElementOperations.sendKeys(getDriver(), evalutionPage.evaluationsPeriod, REPOSITORY.getCellDataOnTestCase(serialNo, evaluatedPeriod, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), evalutionPage.evalutionsEvaluator, REPOSITORY.getCellDataOnTestCase(serialNo, evaluator, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), evalutionPage.evalutionsStatus, REPOSITORY.getCellDataOnTestCase(serialNo, status, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), evalutionPage.evalutionsQuestionaire, REPOSITORY.getCellDataOnTestCase(serialNo, questinnier, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), evalutionPage.evalutionsType, REPOSITORY.getCellDataOnTestCase(serialNo, type, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), createSupplier.createSupplierDots);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.switchToFrame(getDriver(), 0);
		createsupplier(testCaseName);
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), browseContracts.contractDots);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.switchToFrame(getDriver(), 0);
		contract(testCaseName);
		WebElementOperations.switchToDefaultContentFrame(getDriver());
		WebElementOperations.park(2);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		HOMEPAGE_ACTIONS.logout(testCaseName);
	}
	
	
	public void createsupplier(String testCaseName) {
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierKeywords , AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierState, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierOverview, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, supplierOverview, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		String text=createSupplier.createSupplierCheck.getText();
		if(text.contains("Approved Final")){
			identity();
		}else {
			WebElementOperations.click(getDriver(), createSupplier.createSupplieridentity);
			identity();
		}
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierCity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, city, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierZipCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, zipCode, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), createSupplier.createSupplierLimitOrganisation);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), createSupplier.createSupplierFavourite);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), createSupplier.createSupplierLockedSupplier);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsSearch);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsReset);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), createSupplier.createSupplierClose);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
	}
	
	public void identity() {
		
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, supplierType, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierHierarchy, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, supplierHierarchy, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierOrganisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierRegionsServed, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, regionserved, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierUserBookmarkSupplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, userBMSupplier, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.click(getDriver(), createSupplier.createSupplierLimitComodity);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierPSID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, PSID, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByIndex(getDriver(), createSupplier.createSupplierStatus, 1);
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierActiveSupplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, activeSupplier, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierCritically, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, criticality, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierFolder, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, folder, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierFollow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, follow, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierDocsMissing, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, reqDocMissing, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierConfirmity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, conformity, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(getDriver(), createSupplier.createSupplierValidity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, validity, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierAlerts, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, alerts, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierAddressState, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), createSupplier.createSupplierTaxNumber, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, taxNumber, DEFAULT_SHEET_NAME));
	}
	
	public void contract(String testCaseName) {
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractKeywords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractKeywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.dropDownByIndex(getDriver(), browseContracts.contractStatus, 1);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.dropDownByTextVisibility(getDriver(), browseContracts.contractContractType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractType, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractCostCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractCostCenter__Management, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
//		WebElementOperations.click(getDriver(), browseContracts.contractSupplierdots);
//		WebElementOperations.park(2);
//		WebElementOperations.switchToDefaultContentFrame(getDriver());
//		WebElementOperations.park(2);
//		waitForPageLoad(getDriver(),15);
//		WebElementOperations.switchToFrame(getDriver(), 1);
//		createsupplier(testCaseName);
//		WebElementOperations.switchToDefaultContentFrame(getDriver());
//		waitForPageLoad(getDriver(),15);
//		WebElementOperations.switchToFrame(getDriver(), 0);
//		WebElementOperations.park(2);
//		waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractDateFrom, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractDateFrom, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractDateTo, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractDateTo, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractPrimaryCategory, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractPrimaryCategory, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractManagementEntity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractCostCenter__Management, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractContact, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractContact, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractProjectCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractProjectCode, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractPeopleSoftProject, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractProjectSoftProject, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.sendKeys(getDriver(), browseContracts.contractAlerts, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractAlerts, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), browseContracts.contractRenewalTypes);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), evalutionPage.evalutionsReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
		WebElementOperations.click(getDriver(), browseContracts.contractClose);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(getDriver(),15);
	}

	

}
