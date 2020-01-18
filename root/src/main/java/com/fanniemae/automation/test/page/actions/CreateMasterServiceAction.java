package com.fanniemae.automation.test.page.actions;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.enterByRobot;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.fanniemae.automation.CreateMasterServicesAgreementElements.model.CreateMasterServicesAgreement;
import com.fanniemae.automation.CreateMasterServicesAgreementElements.model.CreateMasterServicesAgreementElements;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.util.Assert;
import com.fanniemae.automation.util.PathProvider;

public class CreateMasterServiceAction {
	private static final Logger LOG = Logger.getLogger(CreateMasterServiceAction.class.getName());
	public static final String ADD_FILES_EXE = PathProvider.getForTestData()+"/AddFiles.exe";
	private CreateMasterServicesAgreementElements CMSAE;
	private WebDriver driver = null;
	
	public CreateMasterServiceAction(CreateMasterServicesAgreementElements CMSAE, WebDriver driver) {
		super();
		this.CMSAE = CMSAE;
		this.driver = driver;
	}
	
	private static int contractTitle =FanniemaeConstants.AZ;
	private static int contractType =FanniemaeConstants.BA;
	private static int supplier=FanniemaeConstants.BC;
	private static int costcenter=FanniemaeConstants.BD;
	private static int pepolesoftproject=FanniemaeConstants.BE;
	private static int primaryCategory=FanniemaeConstants.BF;
	private static int productsServicesDescription=FanniemaeConstants.BG;
	private static int contractStatusIndicator=FanniemaeConstants.BI;
	private static int statusUpdateNextSteps=FanniemaeConstants.BJ;
	private static int thirdPartyData=FanniemaeConstants.BO;
	private static int transactionLegalSME=FanniemaeConstants.BP;
	private static int chargedtheloan=FanniemaeConstants.BQ;
	private static int legal=FanniemaeConstants.BR;
	private static int createdfromPR=FanniemaeConstants.BS;
	private static int getBudgetBUApprovalProvidedinFieldglass=FanniemaeConstants.BU;
	
	
	public boolean createMasterServicesAgreement(String testCaseName,String testCaseNumber, String DEFAULT_SHEET_NAME){
		try {
			park(2);
			click(driver, CreateMasterServicesAgreement.contracts);
			
			Assert.assertTrue(CreateMasterServicesAgreement.createcontract.isEnabled());
			click(driver, CreateMasterServicesAgreement.createcontract);
			
			waitForPageLoad(driver,15);
			captureScreenShotOnPass(driver, testCaseName);
			click(driver, CreateMasterServicesAgreement.cspviolation);
			captureScreenShotOnPass(driver, testCaseName);
			park(2);
			waitForPageLoad(driver,15);
			Assert.assertTrue(CreateMasterServicesAgreement.contractTitleD.isDisplayed());
			sendKeys(driver, CreateMasterServicesAgreement.contractTitle, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractTitle, DEFAULT_SHEET_NAME));
			Assert.assertTrue(CreateMasterServicesAgreement.contractTypeD.isDisplayed());
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.contractType,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractType, DEFAULT_SHEET_NAME));
			park(2);
			waitForPageLoad(driver,15);
			Assert.assertTrue(CreateMasterServicesAgreement.supplierD.isDisplayed());
			sendKeys(driver, CreateMasterServicesAgreement.supplier, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, supplier, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(2);
			waitForPageLoad(driver,15);
			sendKeys(driver, CreateMasterServicesAgreement.costcenter, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, costcenter, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(2);
			waitForPageLoad(driver,15);
			sendKeys(driver, CreateMasterServicesAgreement.pepolesoftproject, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, pepolesoftproject, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(2);
			waitForPageLoad(driver,15);
			click(driver, CreateMasterServicesAgreement.fileattach);
			captureScreenShotOnPass(driver, testCaseName);
			Runtime.getRuntime().exec(ADD_FILES_EXE);
			park(2);
			Assert.assertTrue(CreateMasterServicesAgreement.primaryCategoryD.isDisplayed());
			sendKeys(driver, CreateMasterServicesAgreement.primaryCategory, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, primaryCategory, DEFAULT_SHEET_NAME));
			park(2);
			enterByRobot();
			park(2);
			waitForPageLoad(driver,15);
			
			Assert.assertTrue(CreateMasterServicesAgreement.productDescriptionD.isDisplayed());
			sendKeys(driver, CreateMasterServicesAgreement.productsServicesDescription, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, productsServicesDescription, DEFAULT_SHEET_NAME));			
			
			Assert.assertTrue(CreateMasterServicesAgreement.contractStatusIndicatorD.isDisplayed());
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.contractStatusIndicator,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, contractStatusIndicator, DEFAULT_SHEET_NAME));
			
			Assert.assertTrue(CreateMasterServicesAgreement.statusUpdateD.isDisplayed());
			sendKeys(driver, CreateMasterServicesAgreement.statusUpdateNextSteps, AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, statusUpdateNextSteps, DEFAULT_SHEET_NAME));		
			//Approvals
			park(1);
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.thirdPartyData,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, thirdPartyData, DEFAULT_SHEET_NAME));
			park(1);
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.transactionLegalSME,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, transactionLegalSME, DEFAULT_SHEET_NAME));
			park(1);
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.chargedtheloan,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, chargedtheloan, DEFAULT_SHEET_NAME));
			park(2);
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.legal,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, legal, DEFAULT_SHEET_NAME));
			park(2);
			
			Assert.assertTrue(CreateMasterServicesAgreement.createdFromPRD.isDisplayed());
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.createdfromPR,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, createdfromPR, DEFAULT_SHEET_NAME));		
			park(2);
			
			Assert.assertTrue(CreateMasterServicesAgreement.budgetAndBUApprovalD.isDisplayed());
			dropDownByTextVisibility(driver, CreateMasterServicesAgreement.budgetBUApprovalProvidedinFieldglass,AbstractTest.getExcelRepository().getCellDataOnTestCase(testCaseNumber, getBudgetBUApprovalProvidedinFieldglass, DEFAULT_SHEET_NAME));			
			park(2);
			return true;
		} catch (Exception e) {
			LOG.error("Failed to createMasterServicesAgreement ",e);
			return false;
		}
		
	}

}
