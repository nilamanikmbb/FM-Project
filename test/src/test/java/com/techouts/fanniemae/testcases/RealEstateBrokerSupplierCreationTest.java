package com.techouts.fanniemae.testcases;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.acceptAlertIfPresent;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.captureScreenShotOnPass;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.click;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.dropDownByTextVisibility;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.executeJS;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.getTimeStamp;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.park;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.sendKeys;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToDefaultContentFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.switchToFrame;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.verifyPageTitle;

import static com.techouts.fanniemae.webelement.ops.WebElementOperations.waitForPageLoad;
import static com.techouts.fanniemae.webelement.ops.WebElementOperations.webElementHighlighter;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fanniemae.automation.consts.FanniemaeConstants;
import com.fanniemae.automation.test.AbstractTest;
import com.fanniemae.automation.test.page.actions.CreateRealEstateBrokerAction;
import com.fanniemae.automation.test.page.actions.HomePageActions;
import com.fanniemae.automation.util.Assert;
import com.techouts.fanniemae.webelement.ops.WebElementOperations;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.BankInfoForCreateSupplier;
import com.fanniemae.automation.CorporateSupplierElementsFactory.model.MainInfoDeatilsOfCorporateSupplier;
import com.fanniemae.automation.ElementsFactory.model.ElementsFactory;
import com.fanniemae.automation.RealEstateBrokerElements.model.AdditionalInfoOfRealEstateBroker;
import com.fanniemae.automation.RealEstateBrokerElements.model.ApprovalWorkflowForRealEstateBroker;
import com.fanniemae.automation.RealEstateBrokerElements.model.CreateRealEstateBrokerSupplier;
import com.fanniemae.automation.RealEstateBrokerElements.model.RealEstateBrokerElements;
import com.fanniemae.automation.RealEstateBrokerElements.model.mainInfoDetailsOfRealEstateBroker;
import com.fanniemae.automation.RealEstateBrokerElements.model.SupplierContactManagement;

public class RealEstateBrokerSupplierCreationTest extends AbstractTest {
	
	private static final Logger LOG = Logger.getLogger(RealEstateBrokerSupplierCreationTest.class.getName());
	
	private int  userName = FanniemaeConstants.G;
	private int password = FanniemaeConstants.H;
	private int landingPageTitle = FanniemaeConstants.K;
	private int homePageTitle = FanniemaeConstants.L;
	private int supplierType= FanniemaeConstants.AD;
	private int legalName= FanniemaeConstants.AF;
	private int addressLine1= FanniemaeConstants.AG;
	private int city= FanniemaeConstants.AH;
	private int zip= FanniemaeConstants.AI;
	private int state= FanniemaeConstants.AJ;
	private int country= FanniemaeConstants.AK;
	private static int additional = FanniemaeConstants.AN;
	private int equatorId= FanniemaeConstants.AY;
	CorporateSupplierCreationTest corporateSupplierCreationTest;
	
	protected static CreateRealEstateBrokerAction CREATE_REALESTATE_BROKER ;
	
	
	static {
		RealEstateBrokerElements REBE=new RealEstateBrokerElements();
		REBE.init(DRIVER);
		ElementsFactory elementFactory = new ElementsFactory();
		elementFactory.init(DRIVER);
		CREATE_REALESTATE_BROKER  = new CreateRealEstateBrokerAction(REBE, DRIVER);
		HOMEPAGE_ACTIONS = new HomePageActions(elementFactory, DRIVER);
	} 
	
	@Test(priority = 4)
	public void createRealEstateBrokerSupplier() {
		String testCaseNumber = "4";
		String testCaseName = "CreateRealEstateBrokerSupplier";
		corporateSupplierCreationTest=new CorporateSupplierCreationTest();
		try {
			getFannieMaePage();
			String legalNameUpdate=REPOSITORY.getCellDataOnTestCase(testCaseNumber, legalName, DEFAULT_SHEET_NAME);
			Assert.assertTrue(verifyPageTitle(getDriver(), REPOSITORY.getCellDataOnTestCase(testCaseNumber, landingPageTitle, DEFAULT_SHEET_NAME)));
			captureScreenShotOnPass(getDriver(), testCaseName);
			HOMEPAGE_ACTIONS.login(REPOSITORY.getCellDataOnTestCase(testCaseNumber, userName, DEFAULT_SHEET_NAME),
					REPOSITORY.getCellDataOnTestCase(testCaseNumber, password, DEFAULT_SHEET_NAME), REPOSITORY.getCellDataOnTestCase(testCaseNumber, homePageTitle, DEFAULT_SHEET_NAME));
			captureScreenShotOnPass(getDriver(), testCaseName);

			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker(testCaseName, testCaseNumber, legalNameUpdate),"Fails to add Main Info Details due to issue");
			Assert.assertTrue(additionalInfoOfRealEstateBroker(testCaseName,testCaseNumber),"Fails during add additional information");
			waitForPageLoad(getDriver(),15);
			String email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BPC","Test",email);
			supplierContactManagement(testCaseName,email,"12345");
			dropDownByTextVisibility(getDriver(), CreateRealEstateBrokerSupplier.supplierRole, "Broker Assistant / Backup");
			park(0.5);
			dropDownByTextVisibility(getDriver(), CreateRealEstateBrokerSupplier.supplierRole, "Broker Primary Contact");
			webElementHighlighter(getDriver(), CreateRealEstateBrokerSupplier.saveButton);
			Assert.assertTrue(CreateRealEstateBrokerSupplier.saveButton.isEnabled());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, CreateRealEstateBrokerSupplier.saveButton);
			park(2);
			waitForPageLoad(getDriver(), 15);
			email="test"+getTimeStamp(FanniemaeConstants.DDMMYYHHMMSSSSS)+"@testing.com";;
			corporateSupplierCreationTest.contactInfoForCreateSupplier2(testCaseName,testCaseNumber,"BO","Test",email);
			park(2);
			supplierContactManagement(testCaseName,email,"12345");
			park(0.5);
			dropDownByTextVisibility(getDriver(), CreateRealEstateBrokerSupplier.supplierRole2, "MLA Signer");
			park(0.5);
			dropDownByTextVisibility(getDriver(), CreateRealEstateBrokerSupplier.supplierRole2, "Broker / Owner");
			park(0.5);
			dropDownByTextVisibility(getDriver(), CreateRealEstateBrokerSupplier.supplierRole2, "Main RFx contact");
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), CreateRealEstateBrokerSupplier.saveButton);
			park(2);
			Assert.assertTrue(CreateRealEstateBrokerSupplier.saveButton.isEnabled());
			waitForPageLoad(getDriver(), 15);executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, CreateRealEstateBrokerSupplier.saveButton);
			approvalWorkflowForRealEstateBroker(testCaseName);
			click(getDriver(), CreateRealEstateBrokerSupplier.mainInfoTab);
			park(1);
			waitForPageLoad(getDriver(), 15);
			webElementHighlighter(getDriver(), CreateRealEstateBrokerSupplier.supplierId);
			String supplierId=CreateRealEstateBrokerSupplier.supplierId.getText();
			LOG.info("Supplier ID is "+supplierId);
			park(1);
			//Assert.assertTrue(HOMEPAGE_ACTIONS.searchAndVerifyCreatedOne(testCaseName,testCaseNumber, supplierId, DEFAULT_SHEET_NAME),"After create supplier search and find supplier fails");
			HOMEPAGE_ACTIONS.logout(testCaseName);
			addPassedTestCaseResult(testCaseName);
		} catch (Exception e) {
			String msg = "TestCase["+testCaseName+"] has failed.";
			LOG.error(msg,e);
			performPostExceptionProcess(testCaseName, testCaseNumber, msg, e, getDefaultConfiguredWorkbookSheetName());
		}
	}
	
	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
		try {
			click(getDriver(),button);
			park(2);
			switchToFrame(getDriver(), 0);
			park(2);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(),BankInfoForCreateSupplier.bankInfoSearchBox,searchText);
			click(getDriver(),BankInfoForCreateSupplier.bankInfoSearchBtn);
			park(2);
			click(getDriver(),BankInfoForCreateSupplier.bankInfoClickOnResult);
			switchToDefaultContentFrame(getDriver());
			return true;
		} catch (Exception e) {
			return false;
		}
	}
//	public boolean clickOnThreeDotsAndSelectData(String testCaseName,WebElement button,String searchText){
//		try {
//			click(getDriver(),button);
//			switchToFrame(getDriver(), 0);
//			captureScreenShotOnPass(getDriver(), testCaseName);
//			sendKeys(getDriver(),getWebElementFactory().getCreateSupplierBankInfoSearchBox(),searchText);
//			click(getDriver(),getWebElementFactory().getCreateSupplierBankInfoSearchBtn());
//			click(getDriver(),getWebElementFactory().getCreateSupplierBankInfoClickOnResult());
//			switchToDefaultContentFrame(getDriver());
//			return true;
//		} catch (Exception e) {
//			return false;
//		}
//	}
	private boolean mainInfoDetailsOfRealEstateBroker(String testCaseName, String testCaseNumber, String legalNameUpdate){
		try {
			//Navigate corporate
			click(getDriver(), mainInfoDetailsOfRealEstateBroker.supplierLink);
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.createSupplierLink.isEnabled());
			click(getDriver(), mainInfoDetailsOfRealEstateBroker.createSupplierLink);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			//create Corporate
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.supplierTypeD.isDisplayed());
			dropDownByTextVisibility(getDriver(), mainInfoDetailsOfRealEstateBroker.supplierType, REPOSITORY.getCellDataOnTestCase(testCaseNumber, supplierType, DEFAULT_SHEET_NAME));
			park(4);
			waitForPageLoad(getDriver(), 15);
			park(4);
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.legalNameD.isDisplayed());
			sendKeys(getDriver(),mainInfoDetailsOfRealEstateBroker.legalName,legalNameUpdate);
			
			sendKeys(getDriver(),mainInfoDetailsOfRealEstateBroker.SupplierAddressNameAdditional,"Test Address");
			
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.addressLineD.isDisplayed());
			sendKeys(getDriver(),mainInfoDetailsOfRealEstateBroker.addressLine1,REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.cityD.isDisplayed());
			sendKeys(getDriver(),mainInfoDetailsOfRealEstateBroker.addressCity,REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.zipCodeD.isDisplayed());
			sendKeys(getDriver(),mainInfoDetailsOfRealEstateBroker.addressZipCode,REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.stateD.isDisplayed());
			CREATE_REALESTATE_BROKER.autoSuggestionHandle(mainInfoDetailsOfRealEstateBroker.addressState, REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.countryD.isDisplayed());
			dropDownByTextVisibility(getDriver(), mainInfoDetailsOfRealEstateBroker.addressCountry, REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
			
			sendKeys(getDriver(),mainInfoDetailsOfRealEstateBroker.realEstateBrokerEquatorIdEVID,REPOSITORY.getCellDataOnTestCase(testCaseNumber, equatorId, DEFAULT_SHEET_NAME));
			click(getDriver(), mainInfoDetailsOfRealEstateBroker.realEstateBrokerUsingWeb);
			click(getDriver(), mainInfoDetailsOfRealEstateBroker.realEstateBrokerIsPayable);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			Assert.assertTrue(mainInfoDetailsOfRealEstateBroker.saveButton.isDisplayed());
			webElementHighlighter(getDriver(),mainInfoDetailsOfRealEstateBroker.saveButton);
			executeJS(getDriver(), FanniemaeConstants.JS_CLICK_SCRIPT, mainInfoDetailsOfRealEstateBroker.saveButton);
			return true;
		} catch (Exception e) {
			LOG.error("Fails to add main info details fo Real Estate Broker Suppler");
			return false;
		}
	}
	private boolean approvalWorkflowForRealEstateBroker(String testCaseName){
		try {
			//ApprovalWorkflowTab
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowTab);
			park(3);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			//waitForElementPresence(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowSubmitForDiligence, 15);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowSubmitForDiligence);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowSubmitToWorkflow);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowContinueOnBoarding);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowProfileDocumentUpdate);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowBrokerApprove);
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowBrokerNoFindings);
			park(2);
			
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowBrokerTraxUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowProcureOneUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowACHInformationUpdated);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowApproveFinal);
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			sendKeys(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowBrokerReason, "Test");
			park(2);
			waitForPageLoad(getDriver(), 15);
			captureScreenShotOnPass(getDriver(), testCaseName);
			click(getDriver(), ApprovalWorkflowForRealEstateBroker.approvalWorkflowBrokerReasonConfirm);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean additionalInfoOfRealEstateBroker(String testCaseName,String testCaseNumber){
		try {
			//Additional info
			click(getDriver(), AdditionalInfoOfRealEstateBroker.additionalInfoTab);
			captureScreenShotOnPass(getDriver(), testCaseName);
			
			//Address
			sendKeys(getDriver(),AdditionalInfoOfRealEstateBroker.nameAdditional, REPOSITORY.getCellDataOnTestCase(testCaseNumber, additional, DEFAULT_SHEET_NAME));
			Assert.assertTrue(AdditionalInfoOfRealEstateBroker.addressLineD.isDisplayed());
			sendKeys(getDriver(),AdditionalInfoOfRealEstateBroker.addInfoAddressLine1,REPOSITORY.getCellDataOnTestCase(testCaseNumber, addressLine1, DEFAULT_SHEET_NAME));
			Assert.assertTrue(AdditionalInfoOfRealEstateBroker.cityD.isDisplayed());
			sendKeys(getDriver(),AdditionalInfoOfRealEstateBroker.addInfoCity, REPOSITORY.getCellDataOnTestCase(testCaseNumber, city, DEFAULT_SHEET_NAME));
			Assert.assertTrue(AdditionalInfoOfRealEstateBroker.zipCodeD.isDisplayed());
			sendKeys(getDriver(),AdditionalInfoOfRealEstateBroker.addInfoZip, REPOSITORY.getCellDataOnTestCase(testCaseNumber, zip, DEFAULT_SHEET_NAME));
			Assert.assertTrue(AdditionalInfoOfRealEstateBroker.stateD.isDisplayed());
			CREATE_REALESTATE_BROKER.autoSuggestionHandle(AdditionalInfoOfRealEstateBroker.addInfoState,REPOSITORY.getCellDataOnTestCase(testCaseNumber, state, DEFAULT_SHEET_NAME));
			Assert.assertTrue(AdditionalInfoOfRealEstateBroker.countryD.isDisplayed());
			dropDownByTextVisibility(getDriver(), AdditionalInfoOfRealEstateBroker.addInfoCountry,REPOSITORY.getCellDataOnTestCase(testCaseNumber, country, DEFAULT_SHEET_NAME));
					
			captureScreenShotOnPass(getDriver(), testCaseName);
			webElementHighlighter(getDriver(), AdditionalInfoOfRealEstateBroker.saveButton);
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, AdditionalInfoOfRealEstateBroker.saveButton);
			return true;
		} catch (Exception e) {
			
			return false;
		}
	}
	
	private boolean supplierContactManagement(String testCaseName,String email,String pass){
		try {
//			webElementHighlighter(getDriver(), SupplierContactManagement.saveButton);
//			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, SupplierContactManagement.saveButton);
			park(3);
			Assert.assertTrue(SupplierContactManagement.superLoginIcon.isEnabled());
			click(getDriver(), SupplierContactManagement.superLoginIcon);
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 1);
			Assert.assertTrue(SupplierContactManagement.loginD.isDisplayed());
			sendKeys(getDriver(), SupplierContactManagement.superLoginlogin, email);
			park(2);
			Assert.assertTrue(SupplierContactManagement.passwordD.isDisplayed());
			sendKeys(getDriver(), SupplierContactManagement.superLoginpassword,pass);
			park(2);
			Assert.assertTrue(SupplierContactManagement.lastNameD.isDisplayed());
			Assert.assertTrue(SupplierContactManagement.firstNameD.isDisplayed());
			Assert.assertTrue(SupplierContactManagement.emailD.isDisplayed());
			Assert.assertTrue(SupplierContactManagement.supplierD.isDisplayed());
			webElementHighlighter(getDriver(), SupplierContactManagement.ContactInfoSaveAndClose);
			Assert.assertTrue(SupplierContactManagement.saveD.isDisplayed());
			Assert.assertTrue(SupplierContactManagement.closeD.isDisplayed());
			Assert.assertTrue(SupplierContactManagement.ContactInfoSaveAndClose.isDisplayed());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, SupplierContactManagement.ContactInfoSaveAndClose);
			try {
				acceptAlertIfPresent(getDriver(), 3);
				LOG.info("Alert present");
			} catch (Exception e) {
				LOG.info("Alert is not present");
			}
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			Assert.assertTrue(SupplierContactManagement.regenaratePasswordButton.isEnabled());
			click(getDriver(), SupplierContactManagement.regenaratePasswordButton);
			park(2);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 1);
			Assert.assertTrue(SupplierContactManagement.regenaratepassword.isEnabled());
			click(getDriver(), SupplierContactManagement.regenaratepassword);
			park(2);
			Assert.assertTrue(SupplierContactManagement.saveButtonMarkC.isEnabled());
			WebElementOperations.click(getDriver(), SupplierContactManagement.saveButtonMarkC);
			Assert.assertTrue(SupplierContactManagement.regenaratePasswordClose.isEnabled());
			click(getDriver(), SupplierContactManagement.regenaratePasswordClose);
			park(4);
			switchToDefaultContentFrame(getDriver());
			switchToFrame(getDriver(), 0);
			webElementHighlighter(getDriver(), SupplierContactManagement.ContactInfoSaveAndClose);
			Assert.assertTrue(SupplierContactManagement.ContactInfoSaveAndClose.isEnabled());
			executeJS(getDriver(),FanniemaeConstants.JS_CLICK_SCRIPT, SupplierContactManagement.ContactInfoSaveAndClose);
			park(2);
			switchToDefaultContentFrame(getDriver());			
			park(5);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
