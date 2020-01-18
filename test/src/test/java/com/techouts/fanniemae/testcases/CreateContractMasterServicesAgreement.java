package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.fanniemae.automation.CreateMasterServicesAgreementElements.model.Approval;
import com.fanniemae.automation.CreateMasterServicesAgreementElements.model.CreateMasterServicesAgreementElements;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateMasterServiceAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;

public class CreateContractMasterServicesAgreement extends AbstractTest {
	private static final Logger LOG = Logger.getLogger(CreateContractMasterServicesAgreement.class.getName());
	
	private int userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	
	protected static CreateMasterServiceAction CREATE_MASTERSERVICE ;
	
	
	static {
		CreateMasterServicesAgreementElements CMSAE=new CreateMasterServicesAgreementElements();
		CMSAE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		CREATE_MASTERSERVICE  = new CreateMasterServiceAction(CMSAE, DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	} 
	
	
	@Test(priority = 0)
	public void createContractMasterServicesAgreement() {
		String testCaseNumber = "5";
		String testCaseName = "createContractMasterServicesAgreement";
		try {
			getFannieMaePage();
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseNumber);
			Assert.assertTrue(HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME)),"Login to the application failed");
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			CREATE_MASTERSERVICE.createMasterServicesAgreement(testCaseName, testCaseNumber,DEFAULT_SHEET_NAME);
			
			webElementHighlighter(getDriver(), Approval.saveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,Approval.saveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			
			webElementHighlighter(getDriver(), Approval.contractTeamSet);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT,Approval.contractTeamSet);
			park(2);
			waitForPageLoad(getDriver(), 15);
			WebElementOperations.click(getDriver(), Approval.saveButtonMarkC);
			click(getDriver(), Approval.approveButton);
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
			LOG.info("Successfully create contract Master services Agreement");
		} catch (Exception e) {
			performPostExceptionProcess(testCaseName, testCaseNumber, "contractMasterServicesAgreement has failed", e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
}
