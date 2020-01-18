package com.fanniemae.automation.test.page.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.EvalutionElements.model.EvalutionElements;
import com.fanniemae.automation.EvalutionElements.model.browseContracts;
import com.fanniemae.automation.EvalutionElements.model.createSupplier;
import com.fanniemae.automation.EvalutionElements.model.evalutionPage;
import com.fanniemae.automation.SupplierDocumentsElements.model.SupplierDocumentsElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.PathProvider;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class EvalutionsAction {
	private static final Logger LOG = Logger.getLogger(EvalutionsAction.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private EvalutionElements EE;
	private SupplierDocumentsElements SRE;
	private WebDriver driver = null;
	
	public EvalutionsAction(EvalutionElements EE, WebDriver driver) {
		super();
		this.EE = EE;
		this.driver = driver;
	}
	
	public EvalutionsAction(SupplierDocumentsElements SRE, WebDriver driver) {
		super();
		this.SRE = SRE;
		this.driver = driver;
	}
	
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
	
	
	public void createsupplier(String serialNo,String DEFAULT_SHEET_NAME) {
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierKeywords , AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, keywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierState, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierOverview, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, supplierOverview, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		String text=createSupplier.createSupplierCheck.getText();
		if(text.contains("Approved Final")){
			identity(serialNo, DEFAULT_SHEET_NAME);
		}else {
			WebElementOperations.click(driver, createSupplier.createSupplieridentity);
			identity(serialNo, DEFAULT_SHEET_NAME);
		}
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierCity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, city, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierZipCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, zipCode, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, createSupplier.createSupplierLimitOrganisation);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, createSupplier.createSupplierFavourite);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, createSupplier.createSupplierLockedSupplier);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, evalutionPage.evalutionsSearch);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, evalutionPage.evalutionsReset);
		WebElementOperations.park(3);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, createSupplier.createSupplierClose);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
	}
	
	public void identity(String serialNo,String DEFAULT_SHEET_NAME) {
		
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, supplierType, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierHierarchy, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, supplierHierarchy, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierOrganisation, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, organisation, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierRegionsServed, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, regionserved, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierUserBookmarkSupplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, userBMSupplier, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.click(driver, createSupplier.createSupplierLimitComodity);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierPSID, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, PSID, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByIndex(driver, createSupplier.createSupplierStatus, 1);
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierActiveSupplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, activeSupplier, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierCritically, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, criticality, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierFolder, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, folder, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierFollow, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, follow, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierDocsMissing, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, reqDocMissing, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierConfirmity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, conformity, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.dropDownByTextVisibility(driver, createSupplier.createSupplierValidity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, validity, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierAlerts, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, alerts, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierAddressState, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, state, DEFAULT_SHEET_NAME));
		WebElementOperations.park(3);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, createSupplier.createSupplierTaxNumber, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, taxNumber, DEFAULT_SHEET_NAME));
	}
	
	public void contract(String serialNo, String DEFAULT_SHEET_NAME) {
		WebElementOperations.park(2);
		WebElementOperations.sendKeys(driver, browseContracts.contractKeywords, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractKeywords, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.dropDownByIndex(driver, browseContracts.contractStatus, 1);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.dropDownByTextVisibility(driver, browseContracts.contractContractType, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractType, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractCostCenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractCostCenter__Management, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
//		WebElementOperations.click(driver, browseContracts.contractSupplierdots);
//		WebElementOperations.park(2);
//		WebElementOperations.switchToDefaultContentFrame(driver);
//		WebElementOperations.park(2);
//		waitForPageLoad(driver,15);
//		WebElementOperations.switchToFrame(driver, 1);
//		createsupplier(testCaseName);
//		WebElementOperations.switchToDefaultContentFrame(driver);
//		waitForPageLoad(driver,15);
//		WebElementOperations.switchToFrame(driver, 0);
//		WebElementOperations.park(2);
//		waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractDateFrom, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractDateFrom, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractDateTo, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractDateTo, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractPrimaryCategory, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractPrimaryCategory, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractManagementEntity, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractCostCenter__Management, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractContact, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractContact, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractProjectCode, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractProjectCode, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractPeopleSoftProject, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractProjectSoftProject, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.sendKeys(driver, browseContracts.contractAlerts, AbstractTest.getExcelRepository().getCellDataOnTestCase(serialNo, contractAlerts, DEFAULT_SHEET_NAME));
		WebElementOperations.park(2);
		WebElementOperations.enterByRobot();
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, browseContracts.contractRenewalTypes);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, evalutionPage.evalutionsSearch);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, evalutionPage.evalutionsReset);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
		WebElementOperations.click(driver, browseContracts.contractClose);
		WebElementOperations.park(2);
		WebElementOperations.waitForPageLoad(driver,15);
	}

}
